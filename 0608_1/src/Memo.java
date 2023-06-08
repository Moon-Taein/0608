
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Memo extends JFrame {
	public Memo() {
		JTextArea ta = new JTextArea();
		JScrollPane scroll = new JScrollPane(ta);

		JButton btn = new JButton("파일 저장");
		add(btn, "South");

		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				JFileChooser chooser = new JFileChooser();
				int result = chooser.showSaveDialog(Memo.this);
				if (result != JFileChooser.APPROVE_OPTION) {
					return;
				}

				// 경로, 이름 다 반환해주나봐요
				File selectedFile = chooser.getSelectedFile();

				String text = ta.getText();
				try {
					fileSave(text, selectedFile);
				} catch (IOException e1) {
					JOptionPane.showMessageDialog(Memo.this, "파일 저장을 할 수 없습니다. 나중에 다시 시도해주세요");
				}
//				PrintWriter pw = null;
//
//				try {
//					pw = new PrintWriter(new File("d:\\filetest\\memo.txt"));
//					pw.println(text);
//				} catch (FileNotFoundException e1) {
//					e1.printStackTrace();
//				} finally {
//					if (pw != null) {
//						pw.close();
//					}
//				}
			}
		});

		add(scroll);
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	// 메소드 내에서 예외가 생기면 그걸 던지는건가?
	private void fileSave(String text, File selectedFile) throws IOException {
		PrintWriter pw = null;
		// try/finally
		try {
			pw = new PrintWriter(selectedFile);
			pw.println(text);
		} finally {
			if (pw != null) {
				pw.close();
			}
		}
	}

	public static void main(String[] args) {
		new Memo();
	}
}
