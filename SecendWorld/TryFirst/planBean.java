package TryFirst;

//���̺��+Bean
//���� : ���̺� ���ڵ�(����)�� �����Ų Data ��� 
public class planBean {
	//�÷��� Ÿ�Կ� �°� private ���� ����
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
