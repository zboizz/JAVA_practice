package TryFirst;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

public class DBMgr {

	DBConnectionMgr pool;
	DBMgr() {
		pool = DBConnectionMgr.getInstance();
	}
	
	//List
	public Vector<planBean> listplan() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		Vector<planBean> vlist = new Vector<planBean>();
		
		try {
			con = pool.getConnection();
			sql = "select * from plan";
			pstmt = con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				planBean bean = new planBean();
				rs.getInt(1);
				bean.setpostIdx(rs.getInt(1));
				bean.settitle(rs.getString(2));
				bean.setplanningDate(rs.getString(3));				
				bean.sethashTag(rs.getString(4));
				vlist.addElement(bean);
			}
		} catch (Exception e) {
			e.printStackTrace();			
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
		return vlist;
	}
	public planBean getplan(int idx) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		planBean bean = new planBean();
		try {
			con = pool.getConnection();
			sql = "select * from plan where idx=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, idx);
			rs = pstmt.executeQuery();
			
			
			if(rs.next()) {
				bean.setpostIdx(rs.getInt(1));
				bean.settitle(rs.getString(2));
				bean.setplanningDate(rs.getString(3));
				bean.sethashTag(rs.getString(4));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
		return bean;
	}
//	public static void main(String[] args) {
//		planMgr mc = new planMgr();
//		mc.getplan(1);
//		planBean bean1 = new planBean();
//		bean1 = mc.getplan(1);
//		System.out.println(bean1.getName());
//		
//	}

	//Insert
	public boolean insertplan(planBean bean) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = null;
		boolean flag = false;
		try {
			con = pool.getConnection();
			sql = "insert into plan(title, planningDate, hashTag)" + "values(?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, bean.gettitle());
			pstmt.setString(2, bean.getplanningDate());
			pstmt.setString(3, bean.gethashTag());
			int cnt = pstmt.executeUpdate();
			if(cnt==1)
				flag = true;
			System.out.println(flag);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt);
		}
		return flag;		
	}
	//Update
	//update plan set name=?, phone=?,team=?
	public boolean updateplan(planBean bean) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = null;
		boolean flag = false;
		try {
			con = pool.getConnection();
			sql = "update plan set title=?, planningDate=?, hashTag=? where posetIdx=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, bean.gettitle());
			pstmt.setString(2, bean.getplanningDate());
			pstmt.setString(3, bean.gethashTag());
			pstmt.setInt(4, bean.getpostIdx());
			int cnt = pstmt.executeUpdate();
			if(cnt==1)
				flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt);
		}
		return flag;
	}
	//Delete
	public boolean deleteplan(String title) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = null;
		boolean flag = false;
		try {
			con = pool.getConnection();
			sql = "delete from plan where title=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, title);
			if(pstmt.executeUpdate()==1)		
				flag=true;
			System.out.println(flag);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt);
		}
		return flag;
	}
	
}
