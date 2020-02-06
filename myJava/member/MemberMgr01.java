package member;

public class MemberMgr01 {
	
	private DBConnectionMgr pool;
	
	public MemberMgr01() {
		try {
			pool = DBConnectionMgr.getInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new MemberMgr01();
	}
}