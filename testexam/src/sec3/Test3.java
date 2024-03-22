package sec3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Test3 {

	public static void main(String[] args) {
		output1();
	}

	public static void output1() {
		FileWriter fos = null;
		try {
//			FileOutputStream는 byte단위 전송이므로 저장되는 데이터는 byte단위 전송을 하므로 
//			한글이 정상적으로 인코딩되지 못하므로 글씨가 손상되어 나타난다.
//			전송에 적합하지 않은 클래스 사용.
//			FileWriter 클래스로 교체해야함.
			fos = new FileWriter("test.txt");
			String str = "kh정보교육원";
			for(int i=0; i<str.length(); i++) {
				fos.write(str.charAt(i));
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
//		예외 발생 유무와 상관없이 사용한 자원은 항상 반환해야 하므로 반환 의무를 위배했다.
//		finally구문을 추가하여 닫아줘야함
	}
}
