package oracleConn;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class testMgr {
	private DBConnectionMgr pool;
	
public testMgr() {
pool = DBConnectionMgr.getInstance();
}
	public void insertTest() {
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = null;
		try {
			con = pool.getConnection();
			sql="insert into tblTest(no)values(seq02.nextval)";
			pstmt = con.prepareStatement(sql);
			for(int i = 0; i<Integer.MAX_VALUE; i++) {
			pstmt.executeQuery();					
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			pool.freeConnection(con,pstmt);
		}
	}	
	public static void main(String[] args) {
		testMgr m =new testMgr();
		m.insertTest();
	}
}
