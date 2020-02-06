package ch04;




public class TestBean {
	
		
		
		// 빈즈 : 자바와 DB연동을 위해 만드는 클래스 
		int num; //회원번호
		String name; //회원이름
		int age; //회원나이
		String team; //회원이 속한 팀
	
		public int getNum() {
			return num;
		}
		public void setNum(int num) {
			this.num = num;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getTeam() {
			return team;
		}
		public void setTeam(String team) {
			this.team = team;
		}
		
	}

