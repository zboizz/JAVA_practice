<!-- member list -->
<%@ page contentType="text/html; charset=EUC-KR"%>
<link rel="stylesheet" type="text/css" href="css/index.css">
<!-- <title>-������-��ǰ ���</title> -->

<!-- <link rel="stylesheet" type="text/css" href="./css/mypage_orderlist.css"> -->
<%@ include file="../top.jsp" %>

<%@ include file="./admin_side.jsp"%> 

<!--------------->
<!--  �۾� ����  -->
<!--------------->
    <div id="manager">  
    
        <h1 class="title">ȸ�� ����</h1>
       
       	<div class="form_wrapper">
            <h3 class="inner_title">ȸ������ �˻�</h3>
	             <table class="mgr_table verHead" id="search_table">
	                 <tr>
	                     <th>�˻���</th>
                         <td>
	                         <select id="select_type">
	                             <option>ID</option>
	                             <option>�̸�</option>
	                             <option>Email</option>
	                    	 </select>
	                         <input  placeholder="������ �Է����ּ���" id="select_value">
	                         <input type="button" value="�˻�" id="member_search_btn">
                     </td>
                 </tr>
             </table>
       	</div>
    
    	<div class="form_wrapper">
            <h3 class="inner_title">ȸ�� ���� ����Ʈ</h3>
                        <table  class="mgr_table horHead" id="result_table">
                            <tr id="judgeRow">
                                <th>ID</th>
                                <th>�̸�</th>
                                <th>�������</th>
                                <th>ȸ��������</th>
                                <th>�̸���</th>
                                <th>����ó</th>
                                <!-- <th>�ּ�</th> -->
                            </tr>
                        </table>
          </div>
    </div>	
    
    
<!----------------->
<!--  �۾� ���� �� -->
<!----------------->
	
</div> <!--  #btn_manager_wrapper (��ư�޴� + manager) : admin_side.jsp ���� ����-->
</div> <!-- #main (��ܿ�� + ��ư + manager) : admin_side.jsp ���� ����-->
	<%@ include file="../bottom.jsp" %>
<script src="js/member_list.js"></script>
</body>
</html>