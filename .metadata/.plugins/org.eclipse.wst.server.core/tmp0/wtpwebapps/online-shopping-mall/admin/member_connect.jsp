<!-- member connect -->
<%@ page contentType="text/html; charset=EUC-KR"%>
<!-- <title>-������-��ǰ ���</title> -->



<%@ include file="../top.jsp" %>

<%@ include file="./admin_side.jsp"%> 
<link rel="stylesheet" type="text/css" href="./css/member_connect.css">
<!--------------->
<!--  �۾� ����  -->
<!--------------->
    <div id="manager">  
   		<div class="form_wrapper">
            <h3 class="title">���Ӱ���</h3>
            <table id="connect_table" class="cell-border hover nowrap order-column cell-border ">
            	<thead>
	            <tr id="judgeRow">
	                <th>����</th>
	                <th>ID</th>
	                <th>���ӽð�</th>
	                <th>IP</th>
	            </tr>
	            </thead>
        	</table>
     	</div>
    </div>	
    
    
<!----------------->
<!--  �۾� ���� �� -->
<!----------------->
	
</div> <!--  #btn_manager_wrapper (��ư�޴� + manager) : admin_side.jsp ���� ����-->
</div> <!-- #main (��ܿ�� + ��ư + manager) : admin_side.jsp ���� ����-->
	<%@ include file="../bottom.jsp" %>
<script src="js/member_connect.js"></script>
</body>
</html>