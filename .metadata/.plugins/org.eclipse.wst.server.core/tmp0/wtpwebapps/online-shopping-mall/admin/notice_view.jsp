<%@page import="admin.NoticeBean"%>
<%@page import="admin.UtilMgr"%>
<%@page contentType="text/html; charset=EUC-KR"%>
<jsp:useBean id="mgr" class="admin.AdminMgr"/>

<%@ include file="../top.jsp" %>

	<%@ include file="./admin_side.jsp"%>
	
	<link rel="stylesheet" type="text/css" href="./css/notice_list.css"> 
	
<%
		request.setCharacterEncoding("EUC-KR");
		int n_index = UtilMgr.parseInt(request, "n_index");
		String nowPage = request.getParameter("nowPage");
		String keyField = request.getParameter("keyField");
		String keyWord = request.getParameter("keyWord");
		String numPerPage = request.getParameter("numPerPage");	
		NoticeBean bean = mgr.getNotice(n_index);
		String n_id = bean.getN_id();
		String n_file_name = bean.getN_file_name();
		int n_file_size = bean.getN_file_size();
		//���ǿ� �о�� �Խù��� ���� : ����, ����, �亯
		session.setAttribute("bean", bean);
%>


<script type="text/javascript">
	function down(n_file_name) {
		document.downFrm.n_file_name.value=n_file_name;
		document.downFrm.submit();
	}
	
	function list() {
		document.listFrm.action="notice_list.jsp";
		document.listFrm.submit();
		
	}
</script>

	<div id="manager">
		<h1 class="title">��������</h1>
			<form name="Frm" method="post" action="notice_update.jsp" enctype="multipart/form=data">			
				<input type= "hidden" name="num" value=<%=bean.getN_index()%>>
				
				<h3 class="inner_title"></h3>	
				
				
					<table class="mgr_table verHead notice_view_table" > 
						<tr> 
							<th>�ۼ���</th>
							<%if(n_id.equals("m1") || n_id.equals("m2") || n_id.equals("m3")){ %>
							<td>������</td><%}else{%>
							<td>�����ھƴ�</td><%} %>					
						</tr>
						<tr>
							<th>�ۼ���</th>
							<td><%=bean.getN_date()%></td>
						</tr>		
						<tr> 
							<th> �� ��</th>
						    <td><%=bean.getN_title()%></td>
						</tr>
						<tr> 
							<th> ī�װ�</th>
						    <td><%=bean.getN_category()%></td>
						</tr>
						
						 <tr>
							<td id="input_td" colspan="2">
								<%
									if(!n_file_name.equals("")){
								%>
									<img src="../img/notice/<%=n_file_name%>">
								<%
									}if(!bean.getN_content().equals("")){
								%>
									<textarea rows="10" cols="90" wrap="hard"><%=bean.getN_content()%></textarea>
								<%	
									}
								%>
							</td>
						</tr>
					</table>								 
				
						
				
				<div class="submit_wrapper">
					<input class="btn" type="button" value="���" onclick="location.href ='notice_list.jsp'">
					<input class="btn" type="submit" value="����" >
					<input class="btn" id="delete" type="button" value="�� ����" onclick="location.href='notice_Proc.jsp?flag=delete&n_index=<%=n_index%>'">
				</div>						  
										
			</form>
		
			<form name="downFrm" action="download.jsp" method="post">
				<input type="hidden" name="n_file_name">
			</form>
			<form name="listFrm" >
				<input type="hidden" name="nowPage" value="<%=nowPage%>">
				<input type="hidden" name="numPerPage" value="<%=numPerPage%>">
				<%if(!(keyWord==null||keyWord.equals(""))){ %>
				<input type="hidden" name="keyWord" value="<%=keyWord%>">
				<input type="hidden" name="keyField" value="<%=keyField%>">
				<%} %>
			</form>	
	
	</div>

	
<!----------------->
<!--  �۾� ���� �� -->
<!----------------->
	
</div> <!--  #btn_manager_wrapper (��ư�޴� + manager) : admin_side.jsp ���� ����-->
</div> <!-- #main (��ܿ�� + ��ư + manager) : admin_side.jsp ���� ����-->
	<%@ include file="../bottom.jsp" %>

</body>
</html>

