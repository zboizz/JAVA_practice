package member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;



public class MemberMgr {
	
	DBConnectionMgr pool;
	MemberMgr(){
			pool = DBConnectionMgr.getInstance();
	}
	
	//List
	public Vector<MemberBean> listMember() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		Vector <MemberBean> vlist = new Vector<MemberBean>();
		
		try {
			//pool �뿉�꽌 Connection 鍮뚮젮�샂
			con = pool.getConnection();
			sql = "select * from tblMember";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				MemberBean bean = new MemberBean();		// bean 媛앹껜 �깮�꽦(idx, name, phone, team Getter and Setter)
				rs.getInt(1);					//�닽�옄 : idx �닚�꽌��濡� count�빐�꽌 諛섑솚  臾몄옄 1 : idx�쓽 �뜲�씠�꽣媛� 1�씤 �뜲�씠�꽣�뱾�쓣 諛섑솚
				bean.setIdx(rs.getInt(1));									//rs�뿉 �엳�뒗 泥ル쾲吏� row�쓽 泥� 移몄뿉 �엳�뒗 �뜲�씠�꽣瑜� bean�쓽 idx�뿉 set				
				bean.setName(rs.getString(2));						//rs�뿉 �엳�뒗 泥ル쾲吏� row�쓽 �몢踰덉㎏ 移몄뿉�엳�뒗 String ���엯 �씠由꾩쓣 bean�뿉 name�뿉 set
				bean.setPhone(rs.getString(3));						//rs�뿉 �엳�뒗 泥ル쾲吏� row�쓽 �꽭踰덉㎏ 移몄뿉�엳�뒗 String ���엯 踰덊샇瑜� bean�뿉 name�뿉 set
				bean.setTeam(rs.getString(4));							//rs�뿉 �엳�뒗 泥ル쾲吏� row�쓽 �꽕踰덉㎏ 移몄뿉�엳�뒗 String ���엯 ��紐낆쓣 bean�뿉 name�뿉 set
				vlist.addElement(bean);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);					// null濡� �쟾遺� 諛섑솚�빐以�
		}
		return vlist;
	}
	//Read(�젅肄붾뱶 1媛� select)
	public MemberBean getMember(int idx) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		MemberBean bean = new MemberBean();
		try {
			con = pool.getConnection();
			sql = "select * from tblMember where idx=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, idx);
			rs = pstmt.executeQuery();
			//idx 媛� primary key �씠湲� �븣臾몄뿉 �젅�� 2媛� �씠�긽�쓽 媛믪� �삱 �닔 �뾾�떎.
			if(rs.next()) {
				bean.setIdx(rs.getInt(1));
				bean.setName(rs.getString(2));
				bean.setPhone(rs.getString(3));
				bean.setTeam(rs.getString(4));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
		return bean;
	}
//	public static void main(String[] args) {
//		MemberMgr mc = new MemberMgr();
//		mc.getMember(1);
//		MemberBean bean1 = new MemberBean();
//		bean1 = mc.getMember(1);
//		System.out.println(bean1.getName());
//		
//	}

	//Insert
	public boolean insertMember(MemberBean bean) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = null;
		boolean flag = false;
		try {
			con = pool.getConnection();
			sql = "insert into tblMember(name, phone, team)" + "values(?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, bean.getName());
			pstmt.setString(2, bean.getPhone());
			pstmt.setString(3, bean.getTeam());
			int cnt = pstmt.executeUpdate();
			if(cnt==1)
				flag = true;
			System.out.println(flag);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt);
		}
		return flag;		//flag : �젣�뼱沅�
	}
	//Update
	//update tblMember set name=?, phone=?,team=?
	public boolean updateMember(MemberBean bean) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = null;
		boolean flag = false;
		try {
			con = pool.getConnection();
			sql = "update tblMember set name=?, phone=?, team=? where idx=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, bean.getName());
			pstmt.setString(2, bean.getPhone());
			pstmt.setString(3, bean.getTeam());
			pstmt.setInt(4, bean.getIdx());
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
	public boolean deleteMember(int idx) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = null;
		boolean flag = false;
		try {
			con = pool.getConnection();
			sql = "delete from tblMember where idx=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, idx);
			if(pstmt.executeUpdate()==1)		//�젙�긽�젒�냽寃쎌슦
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
