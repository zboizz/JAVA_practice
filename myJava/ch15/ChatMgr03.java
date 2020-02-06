package ch15;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import member.DBConnectionMgr;

public class ChatMgr03 {
	
	private DBConnectionMgr pool;
	
	public ChatMgr03() {
		pool = DBConnectionMgr.getInstance();
	}
	
	public boolean loginChk(String id, String pwd) {
		Connection con = null;
		PreparedStatement pstmt = null;		
		ResultSet rs = null;
		String sql = null;
		boolean flag = false;
		try {
			con = pool.getConnection();
			sql = "select count(id) from tblChat ";
			sql+="where id=? and pwd=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pwd);
			rs = pstmt.executeQuery();
			if(rs.next()&&rs.getInt(1)==1)
				flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
		return flag;
	}
}








