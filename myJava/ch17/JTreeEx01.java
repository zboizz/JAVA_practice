package ch17;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class JTreeEx01 extends JFrame {
	
	String list[] = {"편지","음악","한국","전통","힙팝","외국","소설","추리"};
	JTree tree; // JTree swing 추가	
	JLabel label; //JLabel swing 추가
	DefaultTreeModel model; //DefaultTreeModel swing 추가
	
	
	public JTreeEx01() {
	setTitle("JTree 예제1");
	setSize(400,300);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	DefaultMutableTreeNode root = 
			new DefaultMutableTreeNode("나의 문서함");
	DefaultMutableTreeNode ch1 = 
			new DefaultMutableTreeNode("편지");
	DefaultMutableTreeNode ch2 = 
			new DefaultMutableTreeNode("음악");
	DefaultMutableTreeNode ch3 = 
			new DefaultMutableTreeNode("소설");
	root.add(ch1);
	
	root.add(ch2);
	ch2.add(new DefaultMutableTreeNode("한국"));
	ch2.add(new DefaultMutableTreeNode("외국"));
	root.add(ch3);
	ch3.add(new DefaultMutableTreeNode("한국"));
	ch3.add(new DefaultMutableTreeNode("외국"));
	
	
	
	tree = new JTree(root);
	//보여지는 행의 개수가 10
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
