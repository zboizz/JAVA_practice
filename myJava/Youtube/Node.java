package Youtube;

public class Node {
//node: 위치를 나타내는 말
//
		private int x;
		private int y; //private: 외부에서 바꿀 수 없는 형태로 
		
		public int getX() { //public: 외부에서 접근 가능
			return x;
		}
		public void setX(int x) {  //x의 값을 설정하기 위하여
			this.x=x; // 자신이 가지고 있는 고유의 값인 x를 변경하고자할때 this 활용
			          //private x; 로 설정되어있는 값을 this.x를 통해 setX(int x)로
					  //x값을 변경해 줌
		}
		
		public int getY() { 
			return y;
		}
				
		public void setY(int y) {  
			this.y=y;
		}
		
		public Node(int x, int y) { //생성자: 객체를 만들어줄 때 자동으로 값을 초기화해주는 것 
		this.x=x;                   //클래스와 이름이 같음
		this.y=y;
		}
		public Node getCenter(Node other) { //다른 노드와 비교하여 정중앙값을 가져옴
			return new Node((this.x + other.getX()) /2, (this.y+other.getY())/2);
		}
		
		
		
		
		
		
}