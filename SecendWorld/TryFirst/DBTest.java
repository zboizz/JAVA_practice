package TryFirst;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class DBTest {
	private String _driver = "org.gjt.mm.mysql.Driver", 
	_url = "jdbc:mysql://localhost:3306/mydb?useUnicode=true&characterEncoding=EUC_KR",
    _user = "root",
    _password = "root";
	
	Connection con = null;
	
	public DBTest() {
		try {
			Class.forName(_driver);
			con = DriverManager.getConnection(_url,_user,_password);
			
			System.out.println("연결성공");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}	
	}
	
	public void select() {
		try {
			String sql = "select * from plan";
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			
			pstmt = con.prepareStatement(sql);
			
			rs = pstmt.executeQuery(); //실질적인 sql문실행
			
			while(rs.next()) {								
				int postIdx = rs.getInt("postIdx");
				String title = rs.getString("title");
				String planningDate = rs.getString("planningDate");
				String hashTag = rs.getString("hashTag");				
				
				System.out.println(postIdx+title+planningDate+hashTag);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void insert(String postIdx, String title, String planningDate,String hashTag) {
		try {
			String sql = "insert plan(postIdx, title, planningDate, hashTag)+\"values(?,?,?,?)";
			PreparedStatement pstmt = null;
			pstmt = con.prepareStatement(sql);
						
			pstmt.setString(1, postIdx);
			pstmt.setString(2, title);
			pstmt.setString(3, planningDate);
			pstmt.setString(4, hashTag);		
			
			
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void update(int postIdx, String title) {
		try {
			PreparedStatement pstmt = null;
			String sql = "Update plan set title = ? where postIdx = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, title);
			pstmt.setInt(2, postIdx);
			int cnt = pstmt.executeUpdate();
			System.out.println("update cnt :"+cnt);
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void delete(int postIdx) {
		try {
			PreparedStatement pstmt = null;
			String sql = "delete from plan where postIdx=?";
			pstmt =con.prepareStatement(sql);
			pstmt.setInt(1, postIdx);
			int cnt = pstmt.executeUpdate();
			System.out.println("delte cnt : "+cnt);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	public static void main(String[] args) {
		DBTest dbt = new DBTest();		
		
		dbt.update(1, "밥먹기");
		dbt.select();
		
	}		
	}

