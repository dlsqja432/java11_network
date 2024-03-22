package sec3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test5 {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
//			url을 나타내는 "jdbc:mysql://localhost:3306" 문장에서 데이터베이스 이름이 지정되지 않았으므로
//			해당 데이터베이스에 연걸되지 못한다.
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kh", "root", "1234");
			
//			Application 클래스의 PreparedStatement pst = con.prepareStatement(query);
//			의 문장에서 아직 query의 sql 구문이 지정되지 않았으므로 해당 쿼리를 실행할 수 없다.
			String query = "select * from employee";
			PreparedStatement pst = con.prepareStatement(query);
			
//			Application 클래스의 ResultSet rs = pst.executeUpdate(); 문장에서 executeUpdate()
//			메소드는 int를 반환하므로 해당 검색 결과인 ResultSet을 반환받을 수 없다.
			ResultSet rs = pst.executeQuery();
			
//			Application 클래스의 while(rs) 문장에서 rs는 다음 레코드를 지칭해야 레코드가 끝날 때 까지 반복수행
//			할 수 없으므로 진행되지 못한다.
			while(rs.next()) {
//				Application 클래스의 System.out.println(rs.getString("empId") + " / " + rs.getString("empName"));
//				문장에서 empId와 empName 컬럼이 존재하지 않으므로 해당 컬럼에 접근할 수 없다.
				System.out.println(rs.getString("emp_id") + " / " + rs.getString("emp_name"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
//		동작이 끝난 객체들을 close해주어야 하는데, 빠져있으므로 에러가 생길 수 있음.
	}
}
