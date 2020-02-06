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
    
    Connection con = null; //con�� �ʵ�ȭ ��Ŵ���� bean�� ����
    
    public MySQLConnection() {
    	try {
			Class.forName(_driver);
			con = DriverManager.getConnection(_url,_user,_password);
			// public static Connection getConnection(String url, String user, String password)
			System.out.println("���Ἲ��");
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
    		
    		pstmt = con.prepareStatement(sql);//sql�� �������
    		
    		rs = pstmt.executeQuery(); //�������� sql�� ����
    		//rs: ����� �������� ��ü, ���̺� 
    		
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
			//������ ���ڸ� �Է��Ϸ��� ''���̿� ����Ѵ�, �����ٳ� �ڹٿ����� ""�ȿ� ����ϹǷ�
			//'"����"' �� ���� ����ϴ� �������� �ִ�. �̸� ����ȭ�ϱ� ���Ͽ� preparedStatement�� ���
			
			//"values(?,?,?)"
			//?�� ������ ��ȣ, ��ȣ�� ��� ǥ������ �ؿ��� ����
			
			PreparedStatement pstmt = null;
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, name); //ù ��° ����ǥ�� '��ȣ��'
			pstmt.setString(2, phone);//�� ��° ����ǥ�� '010-7777-8888'
			pstmt.setString(3, team);//�� ��° ����ǥ��
			
			//executeQuery() -> select
			int cnt = pstmt.executeUpdate(); //insert, update, delete
			System.out.println("cnt : " + cnt);
			//cnt: �� ����� �������� ����
			
			
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
    	
    	//mc.insert("��ȣ��", "010-7777-8888", "MC"); //����
    	
    	mc.update(1, "�̼���");
    	
    	mc.select(); //���
    	
    	mc.delete(31);
	}
}