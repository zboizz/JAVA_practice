package ch15;

public class ChatProtocol02 {

	public static final String ID = "ID";
	//(C-->S) ID:aaa 
	//Ŭ���̾�Ʈ�� ������ ���´�.
	//(S-->C) CHATLIST:aaa;bbb;ccc;

	public static final String CHAT = "CHAT";
	//(C-->S) CHAT: �޴� ���̵�;ä�ó��� ex)CHAT:bbb,�����
	//(S-->C) CHAT: ������ ���̵�;ä�ó��� ex)CHAT:aaa,�����
	
	public static final String MESSAGE = "MESSAGE";
	//(C->S)CHAT:�޴¾��̵�;�������� ex)MESSAGE:bbb,�����
	//(S->C)CHAT:�����¾��̵�;�������� ex)MESSAGE:aaa,�����
	
	public static final String CHATALL = "CHATALL";
	//(C->S)CHATALL:���ó��� 
	//(S->C)CHATALL:[�����¾��̵�]���ó���
	
	public static final String CHATLIST = "CHATLIST";

}
