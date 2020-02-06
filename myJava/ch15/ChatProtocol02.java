package ch15;

public class ChatProtocol02 {

	public static final String ID = "ID";
	//(C-->S) ID:aaa 
	//클라이언트가 서버로 들어온다.
	//(S-->C) CHATLIST:aaa;bbb;ccc;

	public static final String CHAT = "CHAT";
	//(C-->S) CHAT: 받는 아이디;채팅내용 ex)CHAT:bbb,밥먹자
	//(S-->C) CHAT: 보내는 아이디;채팅내용 ex)CHAT:aaa,밥먹자
	
	public static final String MESSAGE = "MESSAGE";
	//(C->S)CHAT:받는아이디;쪽지내용 ex)MESSAGE:bbb,밥먹자
	//(S->C)CHAT:보내는아이디;쪽지내용 ex)MESSAGE:aaa,밥먹자
	
	public static final String CHATALL = "CHATALL";
	//(C->S)CHATALL:쳇팅내용 
	//(S->C)CHATALL:[보내는아이디]쳇팅내용
	
	public static final String CHATLIST = "CHATLIST";

}
