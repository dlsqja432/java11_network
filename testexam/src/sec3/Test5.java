package sec3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test5 {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "1234");
			
//			preparedStatement에는 db를 작동할 String타입의 query를 넣어야 하는데, query가 선언되어있지않음
//			결과값을 보면 db에 저장된 값을 불러와 출력하는 코드이므로, query에는 select구문이 들어가야함
			String query = "select * from tableName";
			PreparedStatement pst = con.prepareStatement(query);
			
//			ResultSet은 db로부터 query결과를 담는 인터페이스이므로, db의 데이터를 바꾸는 것이 아니기 때문에
//			excuteUpdate를 사용하는 것은 잘못됨.
			ResultSet rs = pst.executeQuery();
			
//			rs는 db로부터 값을 저장한 것일 뿐, 조건문이 아니기 때문에, while뒤에 괄화에 rs만 오는 것은 오류가 발생한다.
			while(rs != null) {
				System.out.println(rs.getString("empId") + " / " + rs.getString("empName"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
//		동작이 끝난 객체들을 close해주어야 하는데, 빠져있으므로 에러가 생길 수 있음.
	}
}
