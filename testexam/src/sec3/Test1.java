package sec3;

import java.io.FileWriter;
import java.io.IOException;

public class Test1 {

	public static void main(String[] args) {
		output1();
	}
	
	public static void output1() {
		FileWriter fos = null;
		try {
//			11행과 13행에서 1byte만 다루는 OutputStream을 사용하기 때문에 2byte인 한글은 정상적으로 출력되지 않는다.
			fos = new FileWriter("test.txt");
			String str = "안녕하세요!";
			fos.write(str);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
//		finally 구문의 예외 발생 유무와 관계 없이 자원 반환을 해야하는 close()구문을 작성하지 않았으므로
//		반환 의무 위배가 발생한다.
	}
}
