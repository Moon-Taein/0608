import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Main11 {
	public static void main(String[] args) {
		// 이전 회차의 보너스 번호를 파일에 기록하고자 함.

		Random r = new Random();
		int bonusNumber = r.nextInt(45) + 1;
		System.out.println("생성 번호: " + bonusNumber);

		// 1바이트
//		FileOutputStream fos = null;
		// 사람이 읽을 수 없으나, byte 단위
//		try {
//			fos = new FileOutputStream(new File("d:\\filetest\\bonus.bin"));
//			fos.write(bonusNumber);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				fos.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}

		// 2바이트
		// 사람이 읽을 수 있는 문자 단위
		String strValue = String.valueOf(bonusNumber);
		FileWriter fw = null;
		try {
			fw = new FileWriter(new File("d:\\filetest\\bonus.txt"));
			fw.write(strValue);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}
}
