<!-- member view -->
<%@ page contentType="text/html; charset=EUC-KR"%>
<link rel="stylesheet" type="text/css" href="css/index.css">
<!-- <title>-������-��ǰ ���</title> -->

<%@ include file="../top.jsp" %>

	<%@ include file="./admin_side.jsp"%> 
<!--------------->
<!--  �۾� ����  -->
<!--------------->
<link rel="stylesheet" type="text/css" href="./css/member_view.css">
<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/v/ju/dt-1.10.20/datatables.min.css"/>
<!-- 
<script type="text/javascript" src="https://cdn.datatables.net/v/ju/dt-1.10.20/datatables.min.js"></script>
<link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.3/css/bootstrap.css"/>
<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.20/css/dataTables.bootstrap4.min.css"/>
 <link rel="stylesheet" type="text/css" href="./css/datatable.css"> -->



	
	<div id="daumWrap2"></div>
	
	
	  <div id="manager">   
	  
       <h1 class="title">ȸ�� ����</h1>
       
       <div class="form_wrapper">
       
			<table class="verHead memInfo_table" id="search_table">
				<tr >
					<th>���̵�</th>
					<td><input class="disabled" id="member_id" value=<%=request.getParameter("id")%> readonly></td>
				</tr>
				<tr>
					<th>�̸�</th>
					<td><input class="disabled" id="member_name" readonly></td>
				</tr>
				<tr>
					<th>�������</th>
					<td><input class="member_inputs disabled" id="member_birthday"  readonly></td>
				</tr>
				<tr>
					<th>������</th>
					<td><input class="member_inputs disabled" id="member_joindate" readonly></td>
				</tr>
				<tr>
					<th>����ó</th>
					<td><input class="member_inputs disabled" id="member_contact" readonly></td>
				</tr>
				<tr>
					<th>�̸���</th>
					<td><input class="member_inputs disabled" id="member_email" readonly></td>
				</tr>
				<tr>
					<th>��������Ʈ</th>
					<td><input class="disabled" id="member_point" readonly></td>
				</tr>
				<tr>
					<th rowspan="4">�ּ�</th>
					<td>
						<input class="btn" id="addr_btn" name="zip_btn" type="button" value="�ּ� ã��" onclick="openDaumZipAddress();"/>
					</td>
				</tr>
				<tr>
					<td><input class="disabled input_zipcode" id="member_zipcode" readonly></td>
				</tr>
				<tr>
					<td>
						<input class="disabled input_zipcode" id="member_address" readonly>
					</td>
				</tr>	
				<tr>		
					<td>
						<input class="member_inputs disabled input_zipcode" id="member_address_detail" readonly>
					</td>
				</tr>
			</table>
       
       
       </div>
		<div id="view_btn_wrapper" class="submit_wrapper">
			<input class="btn" id="update" type="button" value="�����ϱ�"> 
			<input class="btn" id="search_order" type="button" onclick="location.href='order_list.jsp?keyField=o_id&keyWord=<%=request.getParameter("id")%>&nowPage=1'" value="�ֹ�����">
			<input class="btn" id="delete" type="button" value="ȸ�� ���� ����">
		</div>
		<!--
	<h3 class="inner_title">���ų���</h3>
		<table class="table table-striped table-bordered" id="order_table">
			<thead>
			<tr id="judgeRow">
				<th>��ȣ</th>
				<th>�ֹ��Ͻ�</th>
				<th>�ֹ���ȣ</th>
				<th>��ǰ��</th>
				<th>�ֹ��ݾ�</th>
				<th>�ֹ�����</th>
				<th>��ǰ����</th>
			</tr>
			</thead>
			<tbody>
			
			</tbody>
		</table>
		  -->
		  </div>
		<script src="js/member_view.js"></script>
		
		
</div> <!--  #btn_manager_wrapper (��ư�޴� + manager) : admin_side.jsp ���� ����-->
</div> <!-- #main (��ܿ�� + ��ư + manager) : admin_side.jsp ���� ����-->

	<%@ include file="../bottom.jsp" %>
	
	
</body>
</html>