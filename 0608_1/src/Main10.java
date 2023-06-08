import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main10 {
	public static void main(String[] args) {
		File target = new File("d:\\filetest\\testoutput2.txt");
		String data = "이 노래는 it's about you baby\r\n" + "Only you\r\n" + "You, you, you\r\n" + "You, you, you, you\r\n"
				+ "내가 힘들 때, 울 것 같을 때\r\n" + "기운도 이젠 나지 않을 때\r\n" + "It's you 날 걱정하네\r\n" + "It's you 날 웃게하네\r\n"
				+ "말 안 해도 돼\r\n" + "Boy, what do you say?\r\n" + "멀리든 언제든지 달려와\r\n"
				+ "(They keep on asking me, \"Who is he?\")\r\n" + "바쁜 척도 없이 넌 나타나\r\n"
				+ "(They keep on asking me, \"Who is he?\")\r\n" + "이게 말이 되니? 난 물어봐\r\n"
				+ "(They keep on asking me, \"Who is he?\")\r\n" + "너는 말야\r\n"
				+ "He's the one that's living in my system, baby\r\n" + "Oh my, oh my God 예상했어 나\r\n"
				+ "I was really hoping that he will come through\r\n" + "Oh my, oh my God 단 너뿐이야\r\n"
				+ "Asking all the time about what I should do\r\n" + "No, I can never let him go\r\n"
				+ "너만 생각나 twenty-four\r\n" + "난 행운아야 정말로 I know, I know\r\n" + "널 알기 전까지는 나 의미 없었어 전부 다\r\n"
				+ "내 맘이 끝이 없는 걸 I know, I know\r\n" + "I'm going crazy, right?\r\n" + "어디서든, 몇 번이든\r\n"
				+ "There ain't nothing else that I would hold on to\r\n" + "I hear his voice through all the noise\r\n"
				+ "잠시라도 내 손 놓지 마 no, no\r\n" + "걱정 없잖아 'cause I got someone\r\n" + "혼자라도 괜찮아 'cause I love someone\r\n"
				+ "멀리든 언제든지 달려와\r\n" + "(They keep on asking me, \"Who is he?\")\r\n" + "바쁜 척도 없이 넌 나타나\r\n"
				+ "(They keep on asking me, \"Who is he?\")\r\n" + "이게 말이 되니? 난 물어봐\r\n"
				+ "(They keep on asking me, \"Who is he?\")\r\n" + "너는 말야\r\n"
				+ "He's the one that's living in my system, baby\r\n" + "Oh my, oh my God 예상했어 나\r\n"
				+ "I was really hoping that he will come through\r\n" + "Oh my, oh my God 단 너뿐이야\r\n"
				+ "Asking all the time about what I should do\r\n" + "No, I can never let him go\r\n"
				+ "너만 생각나 twenty-four\r\n" + "난 행운아야 정말로 I know, I know\r\n" + "널 알기 전까지는 나 의미 없었어 전부 다\r\n"
				+ "내 맘이 끝이 없는 걸 I know, I know\r\n" + "He's the one that's living in my system baby\r\n" + "Baby\r\n"
				+ "Baby\r\n" + "Babe, baby\r\n" + "I'm going crazy, right?\r\n" + "Baby\r\n"
				+ "Baby, I'm going crazy, right?\r\n" + "Babe, baby\r\n" + "너와 나\r\n"
				+ "My heart is glowing, it's glowing up (glow, glow)\r\n" + "너랑만 있으면 무서울 게 없어 (no, no)\r\n"
				+ "가득 메워진, 다 메워진 (붉어진)\r\n" + "My heart is glowing, it'd be glowing\r\n" + "'Cause he\r\n"
				+ "Oh my, oh my God 예상했어 나\r\n" + "I was really hoping that he will come through\r\n"
				+ "Oh my, oh my God 단 너뿐이야\r\n" + "Asking all the time about what I should do (너와 나)\r\n"
				+ "No, I can never let him go\r\n" + "He's right there for me twenty-four\r\n"
				+ "난 행운아야 정말로 I know, I know (너와 나)\r\n" + "널 알기 전까지는 나 의미 없었어 전부 다\r\n" + "어떡해?\r\n"
				+ "My heart is glowing, it's glowing\r\n" + "My heart is glowing up\r\n" + "So I can't sleep at night";

		FileWriter fw = null;
		try {
			fw = new FileWriter(target);
			fw.write(data);
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
