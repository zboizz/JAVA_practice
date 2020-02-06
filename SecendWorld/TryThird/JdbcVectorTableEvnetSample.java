package TryThird;

import java.awt.BorderLayout;

import java.awt.Container;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import java.awt.event.MouseAdapter;

import java.awt.event.MouseEvent;

import java.awt.event.WindowAdapter;

import java.awt.event.WindowEvent;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.PreparedStatement;

import java.sql.ResultSet;

import java.sql.Statement;

import java.util.Vector;



import javax.swing.JButton;

import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JPanel;

import javax.swing.JScrollPane;

import javax.swing.JTable;

import javax.swing.JTextField;

import javax.swing.table.DefaultTableModel;



public class JdbcVectorTableEvnetSample extends JFrame {



	/**

	 * @������ : serialVersionUID

	 * @���� : ����ȭ�� �ʿ��� ���� ����

	 */

	private static final long serialVersionUID = 1L;



	/**

	 * @������ : data

	 * @���� : ���̺� ǥ�õ� �����͸� �����ϴ� ���� ���� ����

	 */

	@SuppressWarnings("rawtypes")

	private Vector data 			= null;

	

	/**

	 * @������ : title

	 * @���� : ���̺� ǥ�õ� Ÿ��Ʋ�� �����ϴ� ���� ���� ����

	 */

	@SuppressWarnings("rawtypes")

	private Vector title 			= null;

	

	private JTable table 			= null;

	

	/**

	 * @������ : model

	 * @���� : ���̺� ǥ�õ� Ÿ��Ʋ�� �����͸� �����ϴ� �� ��ü ���� ����

	 */

	private DefaultTableModel model = null;

	

	/**

	 * @������ : btnAdd

	 * @���� : �߰� ��ư ��ü ���� ����

	 */

	private JButton btnAdd 			= null;

	

	/**

	 * @������ : btnDel

	 * @���� : ���� ��ư ��ü ���� ����

	 */

	private JButton btnDel 			= null;

	

	/**

	 * @������ : btnUpdate

	 * @���� : ���� ��ư ��ü ���� ����

	 */

	private JButton btnUpdate		= null;

	

	/**

	 * @������ : btnClear

	 * @���� : �ʱ�ȭ ��ư ��ü ���� ����

	 */

	private JButton btnClear		= null;

	

	/**

	 * @������ : tfNum

	 * @���� : ��ȣ�� ǥ���ϴ� TextField  ���� ����

	 */

	private JTextField tfNum		= null;

	

	/**

	 * @������ : tfName

	 * @���� : �̸��� ǥ���ϴ� TextField ���� ����

	 */

	private JTextField tfName		= null;

	

	/**

	 * @������ : tfAddress

	 * @���� : �ּҸ� ǥ���ϴ� TextField ���� ����

	 */

	private JTextField tfAddress	= null;

	

//	���̺� ���� ����

	private JLabel	lblNum			= null;

	private JLabel	lblName			= null;

	private JLabel	lblAddress		= null;

	

	/**

	 * @������ : Url

	 * @���� : �����ͺ��̽� ������ �ʿ��� URL �����ϴ� ������ ���� ����

	 */

	private String Url 				= "jdbc:mysql://127.0.0.1:3306/mydb?useUnicode=true&characterEncoding=EUC_KR"; // URL ���� ���� ����

	private String user 			= "root"; // user ���� ���� ���� -> hr

	private String password 		= "root"; // password ���� ���� ���� -> hr

	

	/**

	 * @������ : conn

	 * @���� : �����ͺ��̽� ���� Connection ��ü ���� ����

	 */

	private Connection conn 		= null;

	

	/**

	 * @������ : stmt

	 * @���� : �����ͺ��̽� ���� �� ���� ����� ���ϴ� Statement ��ü ���� ����

	 */

	private Statement stmt			= null;

	

	/**

	 * @������ : pstmtAdd

	 * @���� : �߰�(insert) ���� �����ϴ� PreparedStatement ��ü ���� ����

	 */

	private PreparedStatement pstmtAdd    = null;

	

	/**

	 * @������ : pstmtDel

	 * @���� : ����(delete) ���� �����ϴ� PreparedStatement ��ü ���� ����

	 */

	private PreparedStatement pstmtDel    = null;

	

	/**

	 * @������ : pstmtUpdate

	 * @���� : ����(update) ���� �����ϴ� PreparedStatement ��ü ���� ����

	 */

	private PreparedStatement pstmtUpdate = null;

	

	/**

	 * @�����ڸ� : JdbcVectorTableEvnetSample

	 * @���� : Frame �ʱ�ȭ, �г� ����, ���̺� ����, �� ����, ȭ�鿡 �ʿ��� ������Ʈ ���� �� 

	 *        �ʱ�ȭ 

	 */

	public JdbcVectorTableEvnetSample() {

		super("JdbcTable ���� Sample");

		

//		�����ͺ��̽� ���� Connection, Statement, 

//		������ PreparedStatement ����, �ʱ�ȭ �޼ҵ� , �߿� Ȯ�� �ʿ�
		preDbTreatment();

//		���̺� ǥ�õ� ������ ���� ����

		data = new Vector<>();
		

//		���̺� ǥ�õ� Ÿ��Ʋ ���� ����, �ʱ�ȭ 

		title = new Vector<>();

		title.add("��ȣ");

		title.add("�̸�");

		title.add("�ּ�");

		

//		���̺� ǥ�õ� �� ��ü ����

		model = new DefaultTableModel();

		

//		selectAll() : �����ͺ��̽�  Member ���̺� �ִ� ��� �����͸� ������ ���� �޼ҵ�

//		���� result�� ����

		Vector result = selectAll();

		

//		�𵨿� ����� ������(result)�� ���� ����

		model.setDataVector(result, title);

		

//		���� ���� ���̺� ����

		table = new JTable(model);

		

//		���̺� ��ũ���� ���� 

		JScrollPane sp = new JScrollPane(table);
		

//		���̺� ���콺 Ŭ��(mouseClicked)�� ó���� �̺�Ʈ ���

		table.addMouseListener(new MouseAdapter() {
			

//			���콺 Ŭ���� ó���� ����ϴ� �޼ҵ� ������

			@Override

			public void mouseClicked(MouseEvent e) {

//				getSelectedRow() : ���̺��� ���õ� ���� ���� ������ ���� �޼ҵ�(0���� ���۵�) 

				int index = table.getSelectedRow();

				

//				���� ���̺� ǥ�õǰ� �ִ� data(��)���� index(���� ���õ� �ٰ�)�� 

//				1���� ���ڵ�(��) ��ü�� ���ͷ� �����ؼ� in ���� ������ ����

				Vector in = (Vector) data.get(index);

				

//				in ���Ϳ� ����ִ� ���� ������ String ������ ���� 

				String num = (String)in.get(0);

				String name = (String)in.get(1);

				String address = (String)in.get(2);

				

//				ȭ�鿡 ǥ�õ� ������ TextField(��ȣ, �̸�, �ּ�)�� 

//				�� setting

				tfNum.setText(num);

				tfName.setText(name);

				tfAddress.setText(address);

				

//				��ȣ�� setEditable(false)�� ���� ���� ó��

				//tfNum.setEditable(false);

//				tfName.setEditable(false);

//				tfAddress.setEditable(false);

				

			}

		});

		

//		ȭ�鿡 ǥ�õ� �г� ����

		JPanel panel = new JPanel();

		

//		���� �Է¹ްų� ǥ���� �ؽ�Ʈ�ʵ�(��ȣ, �̸�, �ּ�) ����

		tfNum = new JTextField(8);

		tfName = new JTextField(10);

		tfAddress = new JTextField(20);

		

//		���̺� ����

		lblNum = new JLabel("��ȣ");

		lblName = new JLabel("�̸�");

		lblAddress = new JLabel("�ּ�");

		

//		��ư(�߰�, ����, ����, �ʱ�ȭ) ����

		btnAdd = new JButton("�߰�");

		btnDel = new JButton("����");

		btnUpdate = new JButton("����");

		btnClear = new JButton("�ʱ�ȭ");

		

//		�߰���ư�� �̺�Ʈ(Ŭ����) ó�� -> �ؽ�Ʈ�ʵ忡 �Էµ� ������ �����ͺ��̽��� 

//		����(Insert)�ϴ� ����

		btnAdd.addActionListener(new ActionListener() {

			

//			actionPerformed(ActionEvent e) : �߰� ��ư Ŭ���� ȣ��� �޼ҵ�

//			�߰���ư�� Ŭ���ϸ� ó���� ���� �ۼ�

			@Override

			public void actionPerformed(ActionEvent e) {

//				���� �ؽ�Ʈ �ʵ忡 �ִ� ���� ������ ������ ���� 

				String num = tfNum.getText(); // ��ȣ

				String name = tfName.getText(); // �̸�

				String address = tfAddress.getText(); // �ּ�

				

//				������ ������ ����� ���� �����ͺ��̽��� Insert�ϴ� �޼ҵ�

				insert(num, name, address);

				

//				�ű� ����� �����͸� �����ͺ��̽����� �ٽ� �о�ͼ� result ���Ϳ� ���� 

				Vector result = selectAll();

				

//				����� ������(����)�� �� ���� -> ���̺� ǥ�� ���ŵ� 

				model.setDataVector(result, title);

			}

		});

		

//		���� ��ư�� �̺�Ʈ(Ŭ����) ó�� -> �ؽ�Ʈ �ʵ忡 �Էµ� ��ȣ������ �����ͺ��̽��� 

//		�ش� ��ȣ�� ���ڵ带 ����(Delete) �ϴ� ����

		btnDel.addActionListener(new ActionListener() {

			

			@Override

			public void actionPerformed(ActionEvent e) {

//				�ؽ�Ʈ�ʵ忡 �ִ� ��ȣ�� ������ ����

				String num = tfNum.getText();

				

//				��ȣ������ �����ͺ��̽����� �ش� ��ũ�带 �����ϴ� �޼ҵ�

				delete(num);

				

//				����ó�� �����͸� �����ͺ��̽����� �ٽ� �о�ͼ� result ���Ϳ� ���� 

				Vector result = selectAll();

				

//				����� ������(����)�� �� ���� -> ���̺� ǥ�� ���ŵ�

				model.setDataVector(result, title);

			}

		});

		

//		������ư�� �̺�Ʈ(Ŭ����) ó�� -> �ؽ�Ʈ �ʵ忡 �Էµ� ��ȣ������ �����ͺ��̽���

//		�ش� ��ȣ�� ��ũ�带 ����(Update) �ϴ� ���� 

		btnUpdate.addActionListener(new ActionListener() {

			

			@Override

			public void actionPerformed(ActionEvent e) {

//				�ؽ�Ʈ�ʵ忡 �ִ� ������ ������ ����

				String num = tfNum.getText();

				String name = tfName.getText();

				String address = tfAddress.getText();

				

//				��ȣ�� �������� ������ �̸��� �ּҸ� �����ϴ� �޼ҵ� 

				update(name, address, num);

				

//				����ó�� �����͸� �����ͺ��̽����� �ٽ� �о�ͼ� result ���Ϳ� ���� 

				Vector result = selectAll();

				

//				����� ������(����)�� �� ���� -> ���̺� ǥ�� ���ŵ�

				model.setDataVector(result, title);

			}

		});

		

//		�ʱ�ȭ ��ư �̺�Ʈ(Ŭ����) ó�� -> �ؽ�Ʈ�ʵ� �ʱ�ȭ, ��ȣ�ؽ�Ʈ�ʵ忡 Ŀ�� ��ġ

		btnClear.addActionListener(new ActionListener() {

			

			@Override

			public void actionPerformed(ActionEvent e) {

//				�ʱ�ȭ

				tfNum.setText("");

				tfName.setText("");

				tfAddress.setText("");

//				���������ϰ� ����

				tfNum.setEditable(true);

				tfName.setEditable(true);

				tfAddress.setEditable(true);

//				��ȣ�ؽ�Ʈ�ʵ忡 Ŀ�� ��ġ

				tfNum.requestFocus();

			}

		});

		

//		�гο� ������ ���̺�� �ؽ�Ʈ�ʵ� �߰�

		panel.add(lblNum);

		panel.add(tfNum);

		panel.add(lblName);

		panel.add(tfName);

		panel.add(lblAddress);

		panel.add(tfAddress);

		

//		�гο� ��ư �߰�

		panel.add(btnAdd);

		panel.add(btnDel);

		panel.add(btnUpdate);

		panel.add(btnClear);

		

//		Frame�� ContentPane �����̳� ��������

		Container c = getContentPane();

		

//		�����̳ʿ� ���̺�, �г�(�ؽ�Ʈ�ʵ�, ��Ʈ�� ���Ե� �г�) �߰�

		c.add(new JLabel("JDBC Table Demo", JLabel.CENTER),"North");

		c.add(sp,BorderLayout.CENTER);

		c.add(panel, BorderLayout.SOUTH);

		

//		������ ����� ó���� �̺�Ʈ ó�� 

		addWindowListener(new WindowAdapter(){

			@Override

			public void windowClosing(WindowEvent w) {

				try{

					stmt.close(); // Statement ��ü �ݱ�

					conn.close(); // Connection ��ü �ݱ�

					

					setVisible(false); // ȭ�� �ݱ�

					dispose(); // �ڿ� �ݳ�

					System.exit(0); // ���� ó��

				}catch(Exception e){

					

				}

			}

		});

		

	}

	

	/**

	 * @Method Name : selectAll

	 * @return : data  

	 * @���� : �����ͺ��̽����� �˻��� �����͸� data Vector�� ��� ����

	 */

	private Vector selectAll() {

		data.clear();

		

		try{

			ResultSet rs = stmt.executeQuery("select * from member order by num");

			

			while(rs.next()){

				Vector in = new Vector<String>(); // 1���� ���ڵ� �����ϴ� ���� ����

				

				String num = rs.getString(1); // �����ͺ��̽����� ��ȣ�� ������ �ͼ� num ������ ����

//				String num = rs.getString("num");

				

				String name = rs.getString(2); // �����ͺ��̽����� �̸��� ������ �ͼ� name ������ ����

//				String name = rs.getString("name");

				

				String address = rs.getString(3); // �����ͺ��̽����� �ּҰ� ������ �ͼ� address ������ ����

//				String address = rs.getString("address");

				

//				���Ϳ� ������ �� �߰�

				in.add(num);

				in.add(name);

				in.add(address);

				

//				��ü �����͸� �����ϴ� ���Ϳ� in(1���� ������ ����) ���� �߰�

				data.add(in);

			}

		}catch(Exception e){

			e.printStackTrace();

		}

		return data; // ��ü ������ �����ϴ� data ���� ����

	}



	/**

	 * @Method Name : insert

	 * @param num :��ȣ �ؽ�Ʈ�ʵ忡 �Է¹��� �� 

	 * @param name : �̸� �ؽ�Ʈ�ʵ忡 �Է¹��� ��

	 * @param address : �ּ� �ؽ�Ʈ�ʵ忡 �Է¹��� ��

	 * @���� : ������ �ؽ�Ʈ�ʵ忡 �Էµ� ���� �Ķ���ͷ� �޾Ƽ� �����ͺ��̽��� 

	 *        insert ó���ϴ� �޼ҵ�

	 */

	private void insert(String num, String name, String address){

		try{

//			PreparedStatement ����-> conn�� preDbTreatment() �޼ҵ带 ���� �����Ǿ� ����

			pstmtAdd = conn.prepareStatement("insert into member values(?,?,?)");

			

//			insert into member values(? -> 1 ,? -> 2, ? -> 3)" ������ ? �� �� ����

			pstmtAdd.setString(1, num);

			pstmtAdd.setString(2, name);

			pstmtAdd.setString(3, address);

			

//			���Թ��� ������ ���� -> �Է� (insert)

			pstmtAdd.executeUpdate();

		}catch(Exception e){

			e.printStackTrace();

		}

	}

	

	/**

	 * @Method Name : delete

	 * @param num : ��ȣ �ؽ�Ʈ�ʵ忡 �Է¹��� ��

	 * @���� : ��ȣ���� �Ķ���͸� �޾� �ش� ��ȣ�� �����͸� ��񿡼� ����(delete) �ϴ� �޼ҵ� 

	 */

	private void delete(String num){

		try{

//			PreparedStatement ����-> conn�� preDbTreatment() �޼ҵ带 ���� �����Ǿ� ����

			pstmtDel = conn.prepareStatement("delete from member where num = ?");

			

//			num ���� ���ؼ� ������

 			pstmtDel.setString(1, num);

 			

// 			���Թ��� ������ ����-> ���� (delete)

			pstmtDel.executeUpdate();

			

		}catch(Exception e){

			e.printStackTrace();

		}

	}

	

	/**

	 * @Method Name : update

	 * @param name : �̸� �ؽ�Ʈ�ʵ忡 �Է¹��� ��

	 * @param address : �ּ� �ؽ�Ʈ�ʵ忡 �Է¹��� ��

	 * @param num : ��ȣ �ؽ�Ʈ�ʵ忡 �Է¹��� ��

	 * @���� : ������ �ؽ�Ʈ�ʵ忡 �Էµ� ���� �Ķ���ͷ� �޾Ƽ� �����ͺ��̽��� 

	 *        �ش� ��ȣ������ �̸��� �ּҸ� �����ϴ� �޼ҵ� 

	 */

	private void update(String name, String address, String num){

		try{

//			PreparedStatement ����-> conn�� preDbTreatment() �޼ҵ带 ���� �����Ǿ� ����

			pstmtUpdate = conn.prepareStatement("update member set name = ?, address = ? where num = ?");

//			�� ����

			pstmtUpdate.setString(1, name);

			pstmtUpdate.setString(2, address);

//			? ���� �߿� Ȯ�� �ʿ���

			pstmtUpdate.setString(3, num);

//			���� ����

			pstmtUpdate.executeUpdate();

			

		}catch(Exception e){

			e.printStackTrace();

		}

	}

	

	/**

	 * @Method Name : preDbTreatment

	 * @���� : �����ͺ��̽� ���� �� Connection, Statement ����

	 */

	private void preDbTreatment() {

		try{

			//Class.forName("oracle.jdbc.driver.OracleDriver");

			conn = DriverManager.getConnection(Url,user,password);

			stmt = conn.createStatement();

		}catch(Exception e){

			e.printStackTrace();

		}

	}

	

	public static void main(String[] args) {

		JdbcVectorTableEvnetSample frame = new JdbcVectorTableEvnetSample();

//		���� ������Ʈ�� ũ��� ���� ���¿� ���� �������� ũ�⸦ ����

		frame.pack();

		

		frame.setVisible(true);

	}

}



