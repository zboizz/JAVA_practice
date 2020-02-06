package ch03;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Arrays;
import java.util.Random;


public class LottoFrame extends Frame 
implements ActionListener{
	
	Button btn;
	int lotto[] = new int[6];
	
	public LottoFrame() {
		setSize(400, 200);
		setBackground(Color.pink);
		setVisible(true);
		btn = new Button("로또");
		btn.addActionListener(this);
		add(btn,BorderLayout.SOUTH);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}
	
	public static void main(String[] args) {
		new LottoFrame();
	}

	public void paint(Graphics g){
		g.setColor(Color.white);
		Font f = new Font("D2Coding",Font.BOLD,25);
		g.setFont(f);
		if(lotto[0]==0){
			g.drawString("로또 버튼을 클릭하세요.", 50, 100);
			return;
		}
		for (int i = 0, x =50; i < lotto.length; i++, x+=50) {
			g.drawString(lotto[i]+"", x , 100);
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		lotto = getLotto();
		repaint();
	}

	public int[] getLotto(){
		int lotto[] = new int[6];
		Random r = new Random(); //random 활용
		
		for (int i = 0; i < lotto.length; i++) {
			lotto[i]=r.nextInt(45)+1;
			for (int j = 0; j < i; j++) {
				if(lotto[j]==lotto[i]) { //i와 j값을 비교하여 중복을 확인한다.
					i--; //다시 for문을 돌리게 하기 위하여 i값을 '1'감소시킨다.
					break; 
				}
			}
			//System.out.print(lotto[i]+ "\t");
		}
		
		Arrays.sort(lotto);
		return lotto;
	}
}
