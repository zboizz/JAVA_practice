<%@ page contentType="text/html; charset=EUC-KR" %>

<%
		request.setCharacterEncoding("EUC-KR");
		String n_id = request.getParameter("n_id");
%>
<%@ include file="../top.jsp" %>

	<%@ include file="./admin_side.jsp"%>
	
	<link rel="stylesheet" type="text/css" href="./css/notice_list.css"> 

	<div id="manager">
		<h1 class="title">��������</h1>
		
		<form name="postFrm" method="post" action="notice_Proc.jsp?flag=insert" enctype="multipart/form-data">		
			<h3 class="inner_title">�������� �ۼ��ϱ�</h3>	

			<input type="hidden" name ="n_id" value="<%=n_id%>">		
			<table class="mgr_table verHead notice_view_table" > 	
				<tr>
					<th>�ۼ���</th>
					<td><%=n_id%></td>
				</tr>
				
				<tr>
					<th>�� ��</th>
					<td>
						<input id="notice_write_title" name="n_title">
					</td>
				</tr>
				<tr>
					<th>ī�װ�</th>
					<td>
						<select name="n_category">
						<option>����</option>
						<option value="�ֹ�/����">�ֹ�/����</option>
						<option value="ȸ������">ȸ��</option>
						<option value="���/��ȯ/��ǰ">���/��ȯ/��ǰ</option>
						<option value="��۹���">���</option>
						<option value="��Ÿ">��Ÿ</option>
						</select>
					</td>
				</tr>
				
				 <tr>
	     			<th>÷������</th> 
	     			<td>
	     			<div class="filebox">
	     				<span id="img_file_name"></span>
					  	<label for="img_upload">���ε�</label>
		     				<input type="file" name="noticeFile" id="img_upload">
                    </div>
	     			</td>
				</tr>				
				
				<tr>
					<td id="input_td" colspan="2">
						<textarea name="n_content" rows="10" cols="20" wrap="hard"></textarea>
					</td>
				</tr>
				
			</table>	
			
			<div class="submit_wrapper">
				<input class="btn" type="submit" value="���">
				<input class="btn" type="button" value="�ۼ����" onClick="javascript:location.href='notice_list.jsp'">	
			</div>
				
		<input type="hidden" name="ip" value="<%=request.getRemoteAddr()%>">
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