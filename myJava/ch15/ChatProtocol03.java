package ch15;

public class ChatProtocol03 {
	
	public static final String ID = "ID";
	//(C->S) ID:aaa
	//(S->C) CHATLIST:aaa;bbb;ccc;ddd;
	
	public static final String CHAT = "CHAT"; 
	//(C->S)CHAT:�޴¾��̵�;ê�ó��� ex)CHAT:bbb,�乬��
	//(S->C)CHAT:�����¾��̵�;ê�ó��� ex)CHAT:aaa,�乬��
	
	public static final String CHATALL = "CHATALL";
	//(C->S)CHATALL:ê�ó���
	//(S->C)CHATALL:[�����¾��̵�]ê�ó���
	
	public static final String MESSAGE = "MESSAGE"; 
	//(C->S)MESSAGE:�޴¾��̵�;��������
	//(S->C)MESSAGE:�����¾��̵�;�������� 
	
	public static final String CHATLIST = "CHATLIST";
	
}







