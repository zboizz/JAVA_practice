package Youtube;

public class Node {
//node: ��ġ�� ��Ÿ���� ��
//
		private int x;
		private int y; //private: �ܺο��� �ٲ� �� ���� ���·� 
		
		public int getX() { //public: �ܺο��� ���� ����
			return x;
		}
		public void setX(int x) {  //x�� ���� �����ϱ� ���Ͽ�
			this.x=x; // �ڽ��� ������ �ִ� ������ ���� x�� �����ϰ����Ҷ� this Ȱ��
			          //private x; �� �����Ǿ��ִ� ���� this.x�� ���� setX(int x)��
					  //x���� ������ ��
		}
		
		public int getY() { 
			return y;
		}
				
		public void setY(int y) {  
			this.y=y;
		}
		
		public Node(int x, int y) { //������: ��ü�� ������� �� �ڵ����� ���� �ʱ�ȭ���ִ� �� 
		this.x=x;                   //Ŭ������ �̸��� ����
		this.y=y;
		}
		public Node getCenter(Node other) { //�ٸ� ���� ���Ͽ� ���߾Ӱ��� ������
			return new Node((this.x + other.getX()) /2, (this.y+other.getY())/2);
		}
		
		
		
		
		
		
}