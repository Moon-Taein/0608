import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;

public class PizzaFrame extends JFrame implements ItemListener {

	// 피자 프레임의 마지막 선택을 프로그램 재실행시에도 그대로 유지
	// 정보의 파일 저장과 읽기를 어떤 형태로 할 것인가?
	// 정보의 파일 저장과 읽기를 언제 수행할 것인가?

	private JPanel contentPane;
	private JPanel panelCenter;
	private JRadioButton rdbPepperoni;
	private JRadioButton rdbCheese;
	private JRadioButton rdbGogi;
	private JCheckBox chkPickle;
	private JCheckBox chkCheese;
	private JCheckBox chkHotSource;
	private JLabel lblPrice;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PizzaFrame frame = new PizzaFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PizzaFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panelSouth = new JPanel();
		contentPane.add(panelSouth, BorderLayout.SOUTH);

		lblPrice = new JLabel("가격 : ");
		panelSouth.add(lblPrice);

		panelCenter = new JPanel();
		contentPane.add(panelCenter, BorderLayout.CENTER);
		panelCenter.setLayout(new GridLayout(0, 2, 0, 0));

		라디오버튼만들기();
		체크박스만들기();

		JPanel pnl = new JPanel();
		JButton btn = new JButton("선택 취소");
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				체크박스취소();
			}
		});
		pnl.add(btn);
		add(pnl, "North");

		JPanel pnl2 = new JPanel();
		JButton btnSave = new JButton("저장");
		btnSave.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				saveSelectionToFile();
			}
		});
		pnl2.add(btnSave);
		add(pnl2, "West");

		readLastSelection();
	}

	private void 체크박스취소() {
		chkCheese.setSelected(false);
		chkHotSource.setSelected(false);
		chkPickle.setSelected(false);
	}

	private void 체크박스만들기() {
		JPanel panelRightOption = new JPanel();
		panelCenter.add(panelRightOption);
		panelRightOption.setLayout(new BoxLayout(panelRightOption, BoxLayout.Y_AXIS));

		panelRightOption.add(Box.createVerticalGlue());

		chkPickle = new JCheckBox("피클 추가 (500원)");
		chkPickle.setAlignmentX(Component.CENTER_ALIGNMENT);
		panelRightOption.add(chkPickle);

		panelRightOption.add(Box.createVerticalGlue());

		chkCheese = new JCheckBox("치즈 추가 (2000원)");
		chkCheese.setAlignmentX(Component.CENTER_ALIGNMENT);
		panelRightOption.add(chkCheese);

		panelRightOption.add(Box.createVerticalGlue());

		chkHotSource = new JCheckBox("핫소스 추가 (100원)");
		chkHotSource.setAlignmentX(Component.CENTER_ALIGNMENT);
		panelRightOption.add(chkHotSource);

		panelRightOption.add(Box.createVerticalGlue());

		체크박스이벤트리스너등록하기();
	}

	private void 체크박스이벤트리스너등록하기() {
		chkPickle.addItemListener(this);
		chkCheese.addItemListener(this);
		chkHotSource.addItemListener(this);
	}

	private int getOptionPrice() {
		int sum = 0;

		if (chkPickle.isSelected()) {
			sum += 500;
		}
		if (chkCheese.isSelected()) {
			sum += 2000;
		}
		if (chkHotSource.isSelected()) {
			sum += 100;
		}
		return sum;
	}

	private void 라디오버튼만들기() {
		JPanel panelLeftMenu = new JPanel();
		panelCenter.add(panelLeftMenu);
		panelLeftMenu.setLayout(new BoxLayout(panelLeftMenu, BoxLayout.Y_AXIS));

		panelLeftMenu.add(Box.createVerticalGlue());

		rdbPepperoni = new JRadioButton("페퍼로니 피자 (11000원)");
		rdbPepperoni.setAlignmentX(Component.CENTER_ALIGNMENT);
		panelLeftMenu.add(rdbPepperoni);

		panelLeftMenu.add(Box.createVerticalGlue());

		rdbCheese = new JRadioButton("치즈 피자 (10000원)");
		rdbCheese.setAlignmentX(Component.CENTER_ALIGNMENT);
		panelLeftMenu.add(rdbCheese);

		panelLeftMenu.add(Box.createVerticalGlue());

		rdbGogi = new JRadioButton("불고기 피자 (12000원)");
		rdbGogi.setAlignmentX(Component.CENTER_ALIGNMENT);
		panelLeftMenu.add(rdbGogi);

		panelLeftMenu.add(Box.createVerticalGlue());

		라디오버튼그룹만들기();
		라디오버튼이벤트리스너등록하기();
	}

	private void 라디오버튼그룹만들기() {
		ButtonGroup group = new ButtonGroup();
		group.add(rdbPepperoni);
		group.add(rdbCheese);
		group.add(rdbGogi);
	}

	private void 라디오버튼이벤트리스너등록하기() {
		rdbPepperoni.addItemListener(this);
		rdbCheese.addItemListener(this);
		rdbGogi.addItemListener(this);
	}

	private int getPizzaPrice() {
		if (rdbPepperoni.isSelected()) {
			return 11000;
		} else if (rdbCheese.isSelected()) {
			return 10000;
		} else {
			return 12000;
		}
	}

	private void readLastSelection() {
		File file = new File("D:\\filetest\\selection.txt");
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(file));
			String str = reader.readLine();
			selectedLastPizza(str);
			while ((str = reader.readLine()) != null) {
				selectedLastOptions(str);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	private void saveSelectionToFile() {
		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new FileWriter("d:\\filetest\\selection.txt"));
			// 사용자의 선택 정보를 파일에 저장
			if (rdbPepperoni.isSelected()) {
				writer.write("1\n");
			} else if (rdbCheese.isSelected()) {
				writer.write("2\n");
			} else if (rdbGogi.isSelected()) {
				writer.write("3\n");
			}

			if (chkPickle.isSelected()) {
				writer.write("피클추가\n");
			}
			if (chkCheese.isSelected()) {
				writer.write("치즈추가\n");
			}
			if (chkHotSource.isSelected()) {
				writer.write("핫소스추가\n");
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private boolean selectedLastPizza(String str) {
		if (str.equals("1")) {
			rdbPepperoni.setSelected(true);
			return true;
		} else if (str.equals("2")) {
			rdbCheese.setSelected(true);
			return true;
		} else if (str.equals("3")) {
			rdbGogi.setSelected(true);
			return true;
		}
		return false;
	}

	private boolean selectedLastOptions(String str) {
		if (str.equals("피클추가")) {
			chkPickle.setSelected(true);
			return true;
		} else if (str.equals("치즈추가")) {
			chkCheese.setSelected(true);
			return true;
		} else if (str.equals("핫소스추가")) {
			chkHotSource.setSelected(true);
			return true;
		}
		return false;
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		int price = getPizzaPrice() + getOptionPrice();
		lblPrice.setText("총 가격: " + price);
	}
}
