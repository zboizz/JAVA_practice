<%@page import="admin.AdminMgr"%>
<%@ page contentType="text/html; charset=EUC-KR"%>
<jsp:useBean id="aMgr" class="admin.AdminMgr"/>
<jsp:useBean id="bean" class="admin.NoticeBean"/>
<%
	request.setCharacterEncoding("EUC-KR");

 	String flag = request.getParameter("flag");
 	String msg = "�����߻�"; 	
 	boolean result = false; 	
 	
 	if(flag.equals("delete")){ 	 
 	 	int n_index = Integer.parseInt(request.getParameter("n_index"));
 		aMgr.deleteNotice(n_index);
 		msg = "���� �Ǿ����ϴ�.";
 	}else if(flag.equals("update")){
 		result=aMgr.updateNotice(request);
 		msg="���� �Ǿ����ϴ�.";
 	}else if (flag.equals("insert")){
 		result = aMgr.insertNotice(request);
 		msg="��� �Ǿ����ϴ�.";
 	}
 	
%>
<script>
	alert("<%=msg%>");
	location.href="notice_list.jsp";
</script>
