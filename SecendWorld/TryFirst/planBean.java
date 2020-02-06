package TryFirst;

//테이블명+Bean
//빈즈 : 테이블에 레코드(한줄)를 저장시킨 Data 덩어리 
public class planBean {
	//컬럼을 타입에 맞게 private 변수 선언
	private int postIdx;
	private String title;
	private String planningDate;
	private String hashTag;
	
	public int getpostIdx() {
		return postIdx;
	}
	public void setpostIdx(int postIdx) {
		this.postIdx = postIdx;
	}
	public String gettitle() {
		return title;
	}
	public void settitle(String title) {
		this.title = title;
	}
	public String getplanningDate() {
		return planningDate;
	}
	public void setplanningDate(String planningDate) {
		this.planningDate = planningDate;
	}
	public String gethashTag() {
		return hashTag;
	}
	public void sethashTag(String hashTag) {
		this.hashTag = hashTag;
	}
	
	
}
