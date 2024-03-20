package sec3;

import java.io.BufferedWriter;
import java.io.IOException;

public class Test3 {

	public static void main(String[] args) {
		output1();
	}

	public static void output1() {
		BufferedWriter fos = null;
		try {
//			FileOutputStream 은 바이트 단위로 데이터를 쓰기 때문에, 문자열을 바이트로  변환할 때 특정 인코딩을
//			지정하지 않으면 기본적으로 시스템의 기본 문자 인코딩을 사용한다. 따라서 기본 문자 인코딩이 UTF-8이 아니면
//			한글이 깨질 수 있다.
//
//			fos = new BufferedWriter("test.txt");
			String str = "kH정보교육원!";
			for(int i=0; i<str.length(); i++) {
				fos.write(str.charAt(i));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
