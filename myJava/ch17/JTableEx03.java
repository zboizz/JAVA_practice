package ch17;

import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;

public class JTableEx03 extends JFrame 
implements TableModelListener, ListSelectionListener{
	//ListSelectionListener을 통하여 값이 다시 돌아오는 이벤트를 구현
	String colName[] ={"이름","주소","나이","가입여부"};
	String citys[] = {"서울","인천","대전","대구","부산","광주"};
	Object data[][] = {
			{"이연희 ","서울",28, false},
			{"문채원  ","인천",30, false},
			{"리지 ","부산",24, true}};
	JTable jt;
	
	Object age; //커서가 갔을때 있었던 값들을 저장하는 공간

	public JTableEx03() {
		setTitle("JTable 예제3");
		setSize(400, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jt = new JTable(data, colName);
		
		jt.getModel().addTableModelListener(this);
		
		jt.getSelectionModel().addListSelectionListener(this); 
		//getSelectionModel()에 있는, 셀이 선택 될때 호출되는 이벤트 연결
		
		jt.setAutoCreateRowSorter(true); //sorter:정렬, 오름차순/내림차순으로 정렬이 가능함
		
		//표내에 있는 도시를 편집 가능
		JComboBox combo = new JComboBox(citys);
		TableColumn city = jt.getColumnModel().getColumn(1); //콜름의 첫번째 값을 가져온다.
		city.setCellEditor(new DefaultCellEditor(combo));
		
		JScrollPane jc = new JScrollPane(jt);
		add(jc);
		setVisible(true);
	}
	
	
	
	@Override
	public void valueChanged(ListSelectionEvent e) {
	age = jt.getValueAt(jt.getSelectedRow(), 2).toString();
	//System.out.println("age: " + age); //클릭했던 셀의 숫자가 콘솔창에 출력됨
	}
	
	
	
	@Override
	public void tableChanged(TableModelEvent e) {
		int row = e.getFirstRow();
		int column = e.getColumn(); 	//값을 가져오기위한 도구
		//System.out.println(row + ":" + column);
		
		if(column==2) {
			TableModel md = (TableModel)e.getSource(); //TableModel swing 추가						
			String data = (String)md.getValueAt(row,column); //값을 가져옴
			if(Integer.parseInt(data)>100) {
				JOptionPane.showMessageDialog(this, "범위를 초과하셨습니다." + data,"경고", JOptionPane.WARNING_MESSAGE);				
				//하지만 경고만 주고 숫자는 그대로 입력이 됨
				md.setValueAt(age, row, column);
				//100보다 큰 값이 입력되면 그 전의 값으로 돌아가기 위한
				
				
			}
		}
	}
	
	public static void main(String[] args) {
		new JTableEx03();
	}

	
}

