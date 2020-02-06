package member;

//테이블명+Bean
//빈즈 : 테이블에 레코드(한줄)를 저장시킨 Data 덩어리 
public class MemberBean {
	//컬럼을 타입에 맞게 private 변수 선언
	private int idx;
	private String name;
	private String phone;
	private String team;
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	
	
}

