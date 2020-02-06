<!-- member connect -->
<%@page import="admin.UtilMgr"%>
<%@page import="java.util.Vector"%>
<%@ page contentType="text/html; charset=EUC-KR"%>
	<jsp:useBean id="bean" class="admin.StockBean"/>
	<jsp:useBean id="amgr" class="admin.ProductMgr"/>
	<jsp:useBean id="smgr" class ="admin.StockMgr"/>
<%
	request.setCharacterEncoding("EUC-KR");
	
	int p_code = bean.getP_code();
	int st_enter_qty = bean.getSt_enter_qty	();
	String st_exp_date = bean.getSt_exp_date();				
%>
<%@ include file="../top.jsp" %>

<%@ include file="./admin_side.jsp"%> 
<link rel="stylesheet" type="text/css" href="./css/goods_stock.css">
<link rel="stylesheet" type="text/css" href="../css/util_btn.css">

<!--------------->
<!--  �۾� ����  -->
<!--------------->
	<div id="manage_wrap">
 <!-- ��� -->
 <div id="modalDiv2">
    <div id="modalInnerFrame2">
      <div id="modal_elements_wrapper2">
      	<div id="modal_title">
      		<span id="modal_title_span">��ǰ����</span>
      	</div>
	     <div id="modal__div">
	     	<input type="hidden" id="modal_code">
      		<span>��ǰ�� :</span>
      		<input type="text" class="signup_input signup_long_input" id="modal_name" readonly="readonly">
	     </div>
	     <div id="modal_enter_div">
      		<span>�԰���� :</span>
      		<input type="text" class="signup_input signup_long_input" id="modal_enter">
	      </div>
	      <div id="modal_ava_div">
      		<span>������ :</span>
      		<input type="text" class="signup_input signup_long_input" id="modal_ava">
	      </div>
	      <div id="modal_waste_div">
      		<span>������ :</span>
      		<input type="text" class="signup_input signup_long_input" id="modal_waste">
	      </div>
	      <div id="modal_date_div">
      		<span>������� :</span>
      		<input type="date" class="signup_input signup_long_input" id="modal_date" readonly="readonly">
	      </div>
	      <div id="modal_button_wrapper">
	      	<button class ="btn-gradient maincolor small button_items" type="button" id="modal_update_btn">��ǰ����</button>
	      	<button class="btn-gradient red small button_items" type="button" id="modal_close_btn">�������</button>
	      </div>
   	</div>
   </div>
</div>
 <!-- ���� ������ -->
    <div id="main_wrapping">
 <h2 class="title">������</h2>
 <div>
 	<div id="toggle_order_wrap">
 		<p>
			 <label class="checkbox" id="toggle_older">
				 <input type="checkbox" id="waste_qty_include">
				 <span class="icon"></span>
				 <span class="text">������� ���� ��ǰ �����</span>
		 	</label>
	 	</p>
 	</div>
	<form name="search_result_frm" id="stock_form">
		<table id="stock_table" class="cell-border hover nowrap order-column cell-border ">
			<thead>
				<tr id="judgeRow">
		 			<th>��ȣ</th>
		 			<th>��ǰ�ڵ�</th>
		 			<th>��ǰ�̸�</th>
		 			<th>�԰����</th>
		 			<th>������</th>
		 			<th>������</th>
		 			<th>�����ϼ�</th>
		 			<th>�������</th>
	 			</tr> 		
			</thead>
		</table>
	</form>
 

 </div>
 <div id="options_wrapper">
	<input class="btn-gradient maincolor small button_items" id="display_addstock" type="button" value="�԰���">		
	<input class="btn-gradient maincolor small button_items" type="button" id="stock_update_btn" value="��ǰ ����">
	<input class="btn-gradient red small button_items" type="button" id="stock_delete_btn" value="���� ���">
	<input type="hidden" id="selected_data" value="">
 </div>
  	
 <div id="add_stock_wrapper">
		<h2 class="title">�԰���</h2>
 		<form name="searchfrm">
	      			<p>
		      			<select name="keyField" id="search_type" >	
			      			<option value="code">��ǰ�ڵ�</option>
			      			<option value="name">��ǰ�̸�</option>
		      			</select>
		      			<input name="keyWord"  id="product_search" autocomplete=��off��> 
		      			<input type ="hidden" name = "nowpage" value="1">
	      			</p>
   	  	</form>
	  	<form name="stfrm" id="stfrm" method="get"  action="goods_stockProc.jsp">
		  	<div id="stfrm_wrapper">
		  		<table class="default_table left_margin10">
			  		<tr>
						<th>��ǰ��</th>
						<td><input class="input_full disabled" name ="p_name" id="stfrm_name" ></td>
						<th>��ǰ�ڵ�</th>
						<td><input class="input_full disabled" name ="p_code" id="stfrm_code" ></td>
					</tr>
					<tr>
			            <th>����</th>
			            <td><input class="input_full" name ="st_enter_qty"></td>
			            <th>�������</th>
			            <td><input class="input_full" type="date" name ="st_exp_date"></td>
			         </tr>
	            </table>
		     </div>
		     <div id="save_btn_wrap">
	     	<p>
	     		<input type="button" class="btn-gradient maincolor small button_items" value="����" onClick="submitStock();"> 
	     	</p>
     		</div>
	 </form>
   </div>
 </div>
 
 <script src="./js/goods_stock.js"></script>
    <script type="text/javascript">      
	function submitStock() {
       	f=document.stfrm;
       	alert("����Ǿ����ϴ�.");
       	f.submit();
        };      
     function opSelect(){
    	 f=document.stfrm;
    	 pl = f.opList;
    	 f.sname.name=pl.options[pl.selectedIndex].value;    		 
     }
     function check() {
 		if(document.searchFrm.keyWord.value==""){
 			alert("�˻�� �Է��ϼ���.");
 			document.searchFrm.keyWord.focus();
 			return;
 		}
 		document.searchFrm.submit();
 	}    
      </script>
<!----------------->
<!--  �۾� ���� �� -->
<!----------------->
	
</div> <!--  #btn_manager_wrapper (��ư�޴� + manager) : admin_side.jsp ���� ����-->
</div> <!-- #main (��ܿ�� + ��ư + manager) : admin_side.jsp ���� ����-->
	<%@ include file="../bottom.jsp" %>
<script src="js/member_connect.js"></script>
</body>
</html>
