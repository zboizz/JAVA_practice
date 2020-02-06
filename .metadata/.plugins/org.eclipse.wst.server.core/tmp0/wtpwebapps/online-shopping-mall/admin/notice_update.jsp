<%@page import="admin.NoticeBean"%>
<%@page import="admin.UtilMgr"%>
<%@page contentType="text/html; charset=EUC-KR"%>
<jsp:useBean id="mgr" class="admin.AdminMgr"/>

<%@ include file="../top.jsp" %>

	<%@ include file="./admin_side.jsp"%>
	
	<link rel="stylesheet" type="text/css" href="./css/notice_list.css"> 

<%
	request.setCharacterEncoding("EUC-KR");
	int num = UtilMgr.parseInt(request, "num");
	NoticeBean bean = mgr.getNotice(num);	
	String n_id = bean.getN_id();
	int n_index=bean.getN_index();
%>

	<div id="manager">
		<h1 class="title">��������</h1>

		<form name="Frm" method="post" action ="notice_Proc.jsp?flag=update" enctype="multipart/form-data">
			<input type= "hidden" name = "n_index" value="<%=bean.getN_index()%>">
			<input type= "hidden" name = "n_id" value="<%=bean.getN_id()%>">
			<input type= "hidden" name = "n_category" value="<%=bean.getN_category()%>">
			<input type= "hidden" name =" n_file_size" value="<%=bean.getN_file_size()%>">
				
			<h3 class="inner_title">�������� ����</h3>	
			<table class="mgr_table verHead notice_view_table" > 				
					<tr>
						<th>�� ��</th>
						<%if(n_id.equals("m1") || n_id.equals("m2")|| n_id.equals("m3")){ %>
						<td>������</td><%}else{%><td>�����ھƴ�</td><%}%>					
					</tr>
					
					<tr>
						<th>�ۼ���</th>
						<td><%=bean.getN_date() %></td>
					</tr>
					
					<tr>
						 <th> �� ��</th>
						 <td><input  id="notice_write_title" name=n_title  value="<%=bean.getN_title() %>"></td>
					</tr>
					<tr>
						<th>ī�װ�</th>
						<td>
						<select name="n_category">
							<option><%=bean.getN_category()%></option>
							<option value="�ֹ�/����">�ֹ�/����</option>
							<option value="ȸ������">ȸ��</option>
							<option value="���/��ȯ/��ǰ">���/��ȯ/��ǰ</option>
							<option value="��۹���">���</option>
							<option value="��Ÿ">��Ÿ</option>
						</select>
						</td>
					<tr>
						  <th>÷������</th>
						  <td>
						  	<div class="filebox">
						  	<span id="img_file_name"><%=bean.getN_file_name()%></span>
					  	<label for="img_upload">���ε�</label>
		     				<input type="file" name="noticeFile" id="img_upload">
                    </div>
						  </td>
					</tr>				
					<tr>
						<td id="input_td" colspan="2">
							<textarea name="n_content" ><%=bean.getN_content()%></textarea>
						</td>
					</tr>
			</table>
								
			<div class="submit_wrapper">
					<input class="btn" type="submit" value="�����ϱ�">
					<input class="btn" type="button" value="�������" onClick="javascript:location.href='notice_list.jsp'">				
			</div>
				
		</form>



	</div>

	
<!----------------->
<!--  �۾� ���� �� -->
<!----------------->
	
</div> <!--  #btn_manager_wrapper (��ư�޴� + manager) : admin_side.jsp ���� ����-->
</div> <!-- #main (��ܿ�� + ��ư + manager) : admin_side.jsp ���� ����-->
	<%@ include file="../bottom.jsp" %>
	<script>
	window.onload = function(){
		function btnInit(){
			document.getElementById('img_upload').addEventListener('change',function(){
			    var fileValue = $("#img_upload").val().split("\\");
			    var fileName = fileValue[fileValue.length-1]; // ���ϸ�
				document.getElementById('img_file_name').innerHTML = fileName;
			});
		}
		btnInit();
	}
	</script>
</body>
</html>