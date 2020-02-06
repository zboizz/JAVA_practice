<!-- ������ order view ������ -->
<%@page import="order.UtilMgr"%>
<%@page import="order.OrderDetailBean"%>
<%@page contentType="text/html; charset=EUC-KR"%>
<%@page import="order.OrderBean"%>
<%@page import="member.MemberBean"%>
<%@page import="product.ProductBean"%>
<%@page import="order.CartMgr"%>
<%@page import="order.CartBean"%>
<%@page import="java.util.Vector"%>
<%-- <jsp:useBean id="mMgr" class="member.MemberMgr"/> --%>
<jsp:useBean id="pMgr" class="product.ProductMgr"/>
<jsp:useBean id="cMgr" class="order.CartMgr"/>
<jsp:useBean id="oMgr2" class="order.OrderMgr"/>

<%
		request.setCharacterEncoding("EUC-KR");
		int o_index = Integer.parseInt(request.getParameter("o_index"));	
		int usedPoint = oMgr2.usedpoint(o_index);			
		//int o_index = 18; //Ȯ�ο� ������ 
		String nowPage = request.getParameter("nowPage");
		String keyField = request.getParameter("keyField");
		String keyWord = request.getParameter("keyWord");
		String keyDate1 = request.getParameter("keyDate1");
		String keyDate2 = request.getParameter("keyDate2");
		String numPerPage = request.getParameter("numPerPage");
		
		
		
%>

<%@ include file="../top.jsp" %>

	<%@ include file="./admin_side.jsp"%> 
	<link rel="stylesheet" type="text/css" href="./css/order_view.css">
	<link rel="stylesheet" type="text/css" href="../css/util_btn.css">

	<div id="viewmanager">
		<h2 class="title">�ֹ� �� ����</h2>
		<div id="order_date_no_view">
			<span id="span_start">�ֹ���ȣ : <span class="input_to_span" id="order_number_input"></span>	
			�ֹ���ID : <span class="input_to_span" id="order_id_input"></span>		
			<span>�ֹ����� : <span class="input_to_span" id="order_date_input"></span>
		</div>
		<form name="updateFrm" method="post" action="orderUpProc.jsp">
		<table class="default_table">
			<%
				Vector<OrderBean> olist = oMgr.getOrderDetail(o_index);
				for(int i =0; i<olist.size(); i++){
					OrderBean order = olist.get(i);
					String orderView_id = order.getO_id();
					MemberBean mbean = mMgr.getMember(orderView_id);
					int o_prod_amount = order.getO_prod_amount();
					int o_del_fee =order.getO_del_fee();
					int o_total_amount=order.getO_total_amount();
			%>
			<input type="hidden" id="hidden_order_date" name="o_date" value="<%=order.getO_date() %>">
			<input type="hidden" id="hidden_order_id" name="o_id" value="<%=order.getO_id() %>">
			<input type="hidden" id="hidden_order_number" name="o_index" readonly value="<%=o_index%>">
			<input type="hidden" id="hidden_pay_method" name="o_pay_method" readonly value="<%=order.getO_pay_method() %>">
			<tr>
				<th>�ֹ��ڸ�</th>
				<td><input class="input_full" name="NEME" readonly value="<%=mbean.getNAME()%>"></td>
				<th>��ȭ��ȣ(�ֹ���)</th>
				<td><input class="input_full" name="o_id" readonly value="<%=mbean.getContact()%>"></td>
			</tr>
			<tr>
				
				<th>�����ڸ�</th>
				<td><input class="input_full" name="o_recpt_name" value="<%=order.getO_recpt_name()%>"></td>
				<th>��ȭ��ȣ(������)</th>
				<td><input class="input_full" name="o_recpt_contact" value="<%=order.getO_recpt_contact()%>"></td>
			</tr>
			<tr>				
				<th>�ּ�</th>
				<td colspan="3"><input class="input_full" name="o_recpt_add" readonly="readonly" value="<%=order.getO_recpt_add()%>"></td>
			</tr>
			<tr>
				<th>���ּ�</th>
				<td colspan="3"><input class="input_full" name="o_recpt_add_det" value="<%=order.getO_recpt_add_det()%>"></td>
			</tr>
			<tr>
				<th>��ۿ�û����</th>
				<td colspan="3"><input class="input_full" name="o_del_msg" value="<%=order.getO_del_msg() %>"></td>
			</tr>
			<tr>
				<th>��ǰ�ݾ�</th>
				<td>
					<input class="input_full" value="<%=UtilMgr.monFormat(o_prod_amount)%>">
					<input type="hidden" class="input_full" name="o_prod_amount" value="<%=o_prod_amount%>">
				</td>
				<th>��ۺ�</th>
				<td>
					<input class="input_full" value="<%=UtilMgr.monFormat(o_del_fee)%>">
					<input type="hidden" class="input_full" name="o_del_fee" value="<%=o_del_fee%>">
				</td>
			</tr>
			<tr>
				<th>�������Ʈ</th>
				<td>
					<input class="input_full" value="<%=UtilMgr.monFormat(usedPoint*-1)%>">
					<input type="hidden" class="input_full" name="pt_point" value="<%=usedPoint%>">				
				</td>
				<th>�������</th>
				<td>
				<select id="pay_method_select">
					<option value="�ſ�ī��">�ſ�ī��</option>
					<option value="�޴���">�޴���</option>
					<option value="���̹�����">���̹�����</option>
				</select>
				</td>
			</tr>
			<tr>
			<th>�����ݾ�</th>
				<td>
					<input class="input_full" value="<%=UtilMgr.monFormat(o_total_amount)%>">
					<input type="hidden" class="input_full" name="o_total_amount" value="<%=o_total_amount%>">					
				</td>
				<th>�����ȣ</th>
				<td>
					<input class="input_full" name="o_del_num" value="<%=order.getO_del_num() %>">
				</td>
			</tr>
			<tr>
				<th>�ֹ�����</th>
				<td><input class="input_full" name="o_status"  value="<%=order.getO_status() %>"></td>
				<th>������</th>
				<td><input class="input_full" name="o_del_date"  value="<%=order.getO_date() %>"></td>
			</tr>
			
			
		</table>
		
		<h3 class="title">�ֹ�����</h3>
		<div id="order_detail_wrapper">
			<table class="bottom_13 default_table" id="order_detail_table">
				<tr>
					<th class="min_remove">��ȣ</th>
					<th class="min_remove" id="ordered_product">�ֹ���ǰ</th>
					<th class="min_remove">����</th>
				</tr>
				<%					
					Vector<OrderDetailBean> dvlist = oMgr.getOrderCode(o_index);
					for(int j=0; j<dvlist.size(); j++){
						OrderDetailBean detailOrder = dvlist.get(j);
						int p_code[] = detailOrder.getP_code();
						int o_qtys[] = detailOrder.getO_qty();
						ProductBean pbean = pMgr.getProduct(p_code[j]);
						int o_qty = o_qtys[j];
				%>
				<input type="hidden" name="o_mgr_note"  value="<%=order.getO_mgr_note() %>">
				<tr>
					<td><%=j+1 %></td>
					<td><input class="input_full padding-left-none" name="p_name"  value="<%=pbean.getP_name() %>"></td>
					<td><input class="input_full padding-left-none" name="o_qyt"  value="<%=o_qty %>"></td>
				</tr>
				<%	}//---for
				}//---for %>
				</table>
			</div>
			<div id="order_button_wrapper">
				<input type="button" class="btn-gradient maincolor small button_items" value="����Ʈ" onclick="location.href = 'javascript:list()'">
				<input type="submit" class="btn-gradient maincolor small button_items" value="����">
				<input type="button" class="btn-gradient red small button_items" value="����" onclick="location.href = 'javascript:confirmDel()'">
			</div>
			</form>
		<form name="listFrm">
			<input type="hidden" name="o_index" value="<%=o_index%>">
			<input type="hidden" name="nowPage" value="<%=nowPage%>">
			<input type="hidden" name="numPerPage" value="<%=numPerPage%>">
			<%if(!(keyWord==null||keyWord.equals(""))){ %>
			<input type="hidden" name="keyWord" value="<%=keyWord%>">
			<input type="hidden" name="keyField" value="<%=keyField%>">
			<%}%>
			<%if((!(keyDate1==null||keyDate1.equals("")))&&
					(!(keyDate2==null||keyDate2.equals("")))){ %>
			<input type="hidden" name="keyDate1" value="<%=keyDate1%>">
			<input type="hidden" name="keyDate2" value="<%=keyDate2%>">
			<%}%>
		</form>
	
	
	</div>
																


</div> <!--  #btn_manager_wrapper (��ư�޴� + manager) : admin_side.jsp ���� ����-->
</div> <!-- #main (��ܿ�� + ��ư + manager) : admin_side.jsp ���� ����-->
	<%@ include file="../bottom.jsp" %>

	<script src="./js/order_view.js"></script>

</body>
</html>








