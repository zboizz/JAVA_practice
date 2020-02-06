package member;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MySQLConnection {
    private String _driver = "org.gjt.mm.mysql.Driver",
    _url = "jdbc:mysql://127.0.0.1:3306/mydb?useUnicode=true&characterEncoding=EUC_KR",
    _user = "root",
    _password = "root";
    
    Connection con = null; //con을 필드화 시킴으로 bean과 연결
    
    public MySQLConnection() {
    	try {
			Class.forName(_driver);
			con = DriverManager.getConnection(_url,_user,_password);
			// public static Connection getConnection(String url, String user, String password)
			System.out.println("연결성공");
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    
    public void select() {
    	try {
    		String sql = "select * from tblMember";
    		PreparedStatement pstmt = null;
    		ResultSet rs = null;
    		///////////////////////////////////////////////////
    		
    		pstmt = con.prepareStatement(sql);//sql을 가지고옴
    		
    		rs = pstmt.executeQuery(); //실질적인 sql문 실행
    		//rs: 결과를 가져오는 실체, 테이블 
    		
    		while(rs.next()) {
    			int idx = rs.getInt("idx");
    			String name = rs.getString("name");
    			String phone = rs.getString("phone");
    			String team = rs.getString("team");
    			System.out.println(idx+"\t"+name+"\t"+phone+"\t"+team);
    		}
    		
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    }    
    
    public void insert(String name, String phone, String team) {
    	try {
			String sql = "insert tblmember(name, phone, team)" +"values(?,?,?)";
			//본래는 문자를 입력하려면 ''사이에 써야한다, 더군다나 자바에서는 ""안에 써야하므로
			//'"문자"' 와 같이 써야하는 불편함이 있다. 이를 간편화하기 위하여 preparedStatement를 사용
			
			//"values(?,?,?)"
			//?는 일종의 암호, 암호가 어떻게 표현될지 밑에서 설정
			
			PreparedStatement pstmt = null;
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, name); //첫 번째 물음표는 '강호동'
			pstmt.setString(2, phone);//두 번째 물음표는 '010-7777-8888'
			pstmt.setString(3, team);//세 번째 물음표는
			
			//executeQuery() -> select
			int cnt = pstmt.executeUpdate(); //insert, update, delete
			System.out.println("cnt : " + cnt);
			//cnt: 잘 적용된 데이터의 개수
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}   	
    	
    	
    }

    public void update(int idx, String name) {
    	try {
			PreparedStatement pstmt = null;
			String sql = "Update tblMember set name = ?"
					+ "where idx = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setInt(2, idx);
			int cnt = pstmt.executeUpdate();
			System.out.println("cnt : " + cnt);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    
    public void delete(int idx) {
    	try {
			PreparedStatement pstmt = null;
			String sql = "delete from tblMember where idx=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, idx);
			int cnt = pstmt.executeUpdate();
			System.out.println("cnt : " + cnt);
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    
    public static void main(String[] args) {
    	MySQLConnection mc = new MySQLConnection();
    	
    	//mc.insert("강호동", "010-7777-8888", "MC"); //삽입
    	
    	mc.update(1, "이수석");
    	
    	mc.select(); //출력
    	
    	mc.delete(31);
	}
}