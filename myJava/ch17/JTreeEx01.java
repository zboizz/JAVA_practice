package ch17;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class JTreeEx01 extends JFrame {
	
	String list[] = {"����","����","�ѱ�","����","����","�ܱ�","�Ҽ�","�߸�"};
	JTree tree; // JTree swing �߰�	
	JLabel label; //JLabel swing �߰�
	DefaultTreeModel model; //DefaultTreeModel swing �߰�
	
	
	public JTreeEx01() {
	setTitle("JTree ����1");
	setSize(400,300);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	DefaultMutableTreeNode root = 
			new DefaultMutableTreeNode("���� ������");
	DefaultMutableTreeNode ch1 = 
			new DefaultMutableTreeNode("����");
	DefaultMutableTreeNode ch2 = 
			new DefaultMutableTreeNode("����");
	DefaultMutableTreeNode ch3 = 
			new DefaultMutableTreeNode("�Ҽ�");
	root.add(ch1);
	
	root.add(ch2);
	ch2.add(new DefaultMutableTreeNode("�ѱ�"));
	ch2.add(new DefaultMutableTreeNode("�ܱ�"));
	root.add(ch3);
	ch3.add(new DefaultMutableTreeNode("�ѱ�"));
	ch3.add(new DefaultMutableTreeNode("�ܱ�"));
	
	
	
	tree = new JTree(root);
	//�������� ���� ������ 10
	tree.setVisibleRowCount(10);
	
	JPanel p = new JPanel();
	JScrollPane jc = new JScrollPane(tree);
	p.add(jc);
	p.add(label = new JLabel());
	add(p);
	setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		new JTreeEx01();
	}
}
