package oracleConn;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EmpMgr {
	private DBConnectionMgr pool;
	
public EmpMgr() {
pool = DBConnectionMgr.getInstance();
}
	public void printEmp() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		try {
			con = pool.getConnection();
			sql="select ename from emp";
			pstmt = con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString(1));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			pool.freeConnection(con,pstmt,rs);
		}
	}	
	public static void main(String[] args) {
		EmpMgr m =new EmpMgr();
		m.printEmp();
	}
}
