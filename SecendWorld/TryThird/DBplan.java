package TryThird;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Calendar;
import java.util.Date;
import java.util.Vector;

import com.sun.org.apache.bcel.internal.generic.Select;


public class DBplan {
	private String url = "jdbc:mysql://127.0.0.1:3306/mydb?useUnicode=true&characterEncoding=EUC_KR";
	private String user = "root";
	private String password = "root";
	
	private Connection conn = null;
	private Statement stmt = null;
	private PreparedStatement pstmtAdd, pstmtDel, pstmtUpdate = null;
	private Vector data, title = null;
	
	public DBplan() {
		try{
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url,user,password);
			stmt = conn.createStatement();
			System.out.println("연결성공");
		}catch(Exception e){			
			e.printStackTrace();
			System.out.println("실패");
		}
	}
	public void preDbTreatment() {
		try{
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url,user,password);
			stmt = conn.createStatement();
			System.out.println("연결성공");
		}catch(Exception e){			
			e.printStackTrace();
			System.out.println("실패");
		}
	}	
	public void insertplan(String pidx, String ptitle, String pdate, String pdetail, String cdate) {
		try {			
			//preparedStatement 생성 -> conn은 preDBTreatment() 메소드를 통해 생성되어 있음
			pstmtAdd = conn.prepareStatement("insert into planpro(pidx,ptitle,pdate,pdetail,cdate) values(?,?,?,?,now())");
			pstmtAdd.setString(1, pidx);
			pstmtAdd.setString(2, ptitle);
			pstmtAdd.setString(3, pdate);
			pstmtAdd.setString(4, pdetail);
			//pstmtAdd.setString(4, cdate);			
			//대입받은 쿼리를 실행 => 입력(insert)
			pstmtAdd.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}		
	public void deleteplan(String pidx) {
		try {
			pstmtDel = conn.prepareStatement("delete from planpro where pidx =?");			
			//title 값을 비교해서 삭제함
			pstmtDel.setString(1, pidx);
			pstmtDel.executeUpdate();			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void updateplan(String pidx, String ptitle, String pdate, String pdetail) {
		try {
			pstmtUpdate = conn.prepareStatement("update member set pidx=?, ptitle=?, pdate=?, pdetail=?");			
			pstmtUpdate.setString(1,pidx);
			pstmtUpdate.setString(2,ptitle);		
			pstmtUpdate.setString(3,pdate);
			pstmtUpdate.setString(4,pdetail);
			pstmtUpdate.executeUpdate();						
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
	public Vector<String> selectAll(Vector data) {
					
		data.clear();
		
		try {
			ResultSet rs = stmt.executeQuery("select pidx, ptitle, pdate, pdetail, cdate from planpro order by pidx");
			//ResultSet rs = stmt.executeQuery("select * from planpro where pidx=?");
			
			while(rs.next()) {
				Vector in = new Vector<String>();
				String pidx = rs.getString(1);
				String ptitle = rs.getString(2);
				String pdate = rs.getString(3);
				String pdetail = rs.getString(4);
				//System.out.println(pdetail);				
				String cdate = rs.getString(5);
				//System.out.println(cdate);
				
				in.add(pidx); in.add(ptitle);	in.add(pdate); in.add(pdetail); in.add(cdate);
				
				data.add(in);
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}return data;		
	}
	
		public Vector<String> selectAll() {
			data.clear();		
			Vector<String> in = new Vector<String>();			
			try {
				ResultSet rs = stmt.executeQuery("select pidx, ptitle, pdate, pdetail, cdate from planpro order by pidx");
				//ResultSet rs = stmt.executeQuery("select * from planpro where pidx=?");
				while(rs.next()) {
					String pidx = rs.getString(1);
					String ptitle = rs.getString(2);
					String pdate = rs.getString(3);
					String pdetail = rs.getString(4);
					//System.out.println(pdetail);				
					String cdate = rs.getString(5);
					//System.out.println(cdate);
					in.add(pidx); in.add(ptitle);	in.add(pdate); in.add(pdetail); in.add(cdate);
				}			
			} catch (Exception e) {
				e.printStackTrace();
			}
			return in;		
		}	
		
	public static void main(String[] args) {
		new DBplan();		
	}
}
	
	
	

