<%@page import="order.UtilMgr"%>
<%@page import="product.ProductBean"%>
<%@page import="order.OrderDetailBean"%>
<%@page import="order.OrderBean"%>
<%@page import="java.util.Vector"%>
<%@page contentType="text/html; charset=EUC-KR"%>
<jsp:useBean id="orderMgr" class="order.OrderMgr"/>
<jsp:useBean id="pMgr" class="product.ProductMgr"/>

<%
		request.setCharacterEncoding("EUC-KR");
		int totalRecord = 0;//�� �Խù� ����
		int numPerPage=10;//�������� ���ڵ� ����(5,10,15,30 �ɼ��߰�)
		int pagePerBlock = 15;//�������� ���� ����
		int totalPage = 0;//�� ������ ����
		int totalBlock = 0;//�� ���� ����
		int nowPage = 1;//���� ������ 
		int nowBlock = 1;//���� ���� 
		
		//page�� ������ �Խù� ���� �� 
		if(request.getParameter("numPerPage")!=null&&
		!request.getParameter("numPerPage").equals("null")){
		numPerPage = UtilMgr.parseInt(request, "numPerPage");
		//numPerPage = Integer.parseInt(request.getParameter("numPerPage")); ��밡�� 
		}

		int start = 0;//���̺��� �Խù� ���� ��ȣ 
		int cnt = numPerPage;
		
		//�˻��� �ʿ��� ���� 
		String keyField = "";
		String keyWord = "";
		String keyDate1 = "";
		String keyDate2 = "";
		
		//�˻��� �˻��϶� 
		if(request.getParameter("keyWord")!=null){
			keyField = request.getParameter("keyField");
			keyWord = request.getParameter("keyWord");
		}
		
		//�˻��Ⱓ �˻��϶� 
		if(request.getParameter("keyDate1")!=null||
				request.getParameter("keyDate2")!=null){
			keyDate1 = request.getParameter("keyDate1");
			keyDate2 = request.getParameter("keyDate2");
				}
				
		//�˻� �Ŀ� �ٽ� ó�� ȭ������ 
		if(request.getParameter("reload")!=null&&
		request.getParameter("reload").equals("true")){
		keyField = "";  keyWord = "";
		}
		
		totalRecord = orderMgr.getTotalCount(keyField, keyWord, 
				keyDate1, keyDate2);
		//out.print(totalRecord);
		
		//nowPage�� ��û�� ���
		if(request.getParameter("nowPage")!=null){
			nowPage = UtilMgr.parseInt(request, "nowPage");
		}
		
		//���̺��� �Խù� ���� ��ȣ 
		start = (nowPage*numPerPage) - numPerPage;

		//��ü������ ��(��ü���ڵ� ����/�������� ���ڵ� ����) �ø�. 
		totalPage = (int)Math.ceil((double)totalRecord/numPerPage);
		//��ü ������ (��ü������ ����/������ ������ ����) �ø�.
		totalBlock = (int)Math.ceil((double)totalPage/pagePerBlock);
		//���� ���� (������������/ ������ ������ ����)�ø�. 
		nowBlock = (int)Math.ceil((double)nowPage/pagePerBlock);
%>

<script type="text/javascript">
	
	function block(block) {//prev...or ...next�� nowPage���� ����
		document.readFrm.nowPage.value = 
			<%=pagePerBlock%>*(block-1)+1;
		document.readFrm.submit();
	}

</script>

<%@ include file="../top.jsp" %>

	<%@ include file="./admin_side.jsp"%> 


	<div id="manager">
		<h1 class="title">�ֹ�����</h1>
		
		<form  name="searchFrm">
		
		<h3 class="inner_title">�ֹ����� �˻�</h3>
		
		<table class="mgr_table verHead">
 			<tr>
 				<th>
 					�з��� �˻�
 				</th>
	  			<td>
	   				<select id="m_select" name="keyField">
	    				<option value="o_id"> �ֹ��� ID</option>
	    				<option value="o_index">�ֹ���ȣ</option>
	    				<option value="o_status"> �ֹ�����</option>
	   				</select>
	   				<input name="keyWord">
	   				<input id="search_btn" type="button"  value="�˻�" onClick="javascript:check()">
	   				<input type="hidden" name="nowPage" value="1">
	  			</td>
	  		</tr>
	  		<tr>
	  			<th>�Ⱓ�˻�</th>
				<td>
					<input name ="keyDate1" placeholder="20190101"> &nbsp; ~ &nbsp;
					<input name ="keyDate2" placeholder="20191231">			
					<input id="search_btn" type="button" value="�˻�" onClick="javascript:dateCheck()">
					<input type="hidden" name="nowPage" value="1">
				</td>
	  		</tr>
  	</table>
  </form>
  	

	<form id="order_number_frm" name="npFrm" method="post">
			<select name="numPerPage"
			onchange="javascript:numPerFn(this.form.numPerPage.value)">
					<option value="5">5�� ����</option>
					<option value="10" selected>10�� ����</option>
					<option value="15">15�� ����</option>
					<option value="30">30�� ����</option>
			</select>
	</form>
	<!-- "10"���� fix �� ���� ���õ� numPerPage������ ���� -->
	<script>document.npFrm.numPerPage.value=
		"<%=numPerPage%>"</script>

	<div>
		<h3 id="order_list_title" class="inner_title" >�ֹ� ����Ʈ</h3>
		<table class="mgr_table horHead">
			 <tr>
			 		<th>��ȣ</th>
		          <th>�ֹ���ȣ</th>
		          <th>�ֹ��� ID</th>
		          <th>�ֹ��Ͻ�</th>
		          <th>�ֹ��ݾ�</th>
		          <th>�ֹ�����</th>
		           <th>��ǰ����</th>
		     </tr>
				<%
					Vector<OrderBean> vlist = 
					orderMgr.getOrderList(keyField, keyWord, 
							keyDate1, keyDate2, start, cnt);
					if(vlist.isEmpty()){
				%>
			<tr>
				<td colspan="7">
					�˻������ �����ϴ�.
				</td>
			</tr>
				<%} else{
					for(int i=0;i<vlist.size();i++){
					OrderBean order = vlist.get(i);
					int o_total_amount = order.getO_total_amount();
				%>
			<tr>
				<td><%=totalRecord-start-i %></td>
				<td class="btn_td"><a class="order_num_btn" href="javascript:read('<%=order.getO_index()%>')">
				<%=order.getO_index()%></a></td>
				<td><%=order.getO_id()%></td>
				<td><%=order.getO_date()%></td>
				<td><%=UtilMgr.monFormat(o_total_amount)%>��</td>
				<td><%=order.getO_status()%></td>
				<td></td>
			</tr>
				<%
					}//---for
				}//---else
						%>
		</table>
	</div>	
		<table  class="pagination_tb">
			<tr>
				<td>
				<%if(totalPage>0){ %>
						<!-- ���� ���� -->
						<%if(nowBlock>1){ %>
							<a href="javascript:block('<%=nowBlock-1%>')">prev...</a>
						<%} %>
		
						<!-- ����¡(������ ����) -->
						<%
							//block���۹�ȣ ���
							int pageStart = (nowBlock-1)*pagePerBlock+1; 
							//block�� ��ȣ ���
							int pageEnd = (pageStart+pagePerBlock)<totalPage? 
									pageStart+pagePerBlock:totalPage+1;
							for(;pageStart<pageEnd;pageStart++){
						%>
							<a href="javascript:pageing('<%=pageStart%>')">
								<span class="page_btn">
									<%if(pageStart==nowPage){ %><span id="nowPage_btn"><%} %>
									
									<%=pageStart %>
									
									<%if(pageStart==nowPage){ %></span><%} %>
								</span>
							</a>
						<%}//---for %>	
						<!-- �������� -->
						<%if(totalBlock>nowBlock){ %>
							<a href="javascript:block('<%=nowBlock+1%>')">...next</a>
						<%} %>
					<%} %>
				</td>
			</tr>
		</table>

		<form name="listFrm" method="post">
			<input type="hidden" name="reload" value="true">
			<input type="hidden" name="nowPage" value="1">
		</form>

		<form name="readFrm">
			<input type="hidden" name="o_index">
			<input type="hidden" name="nowPage" value="<%=nowPage%>">
			<input type="hidden" name="keyField" value="<%=keyField%>">
			<input type="hidden" name="keyWord" value="<%=keyWord%>">
			<input type="hidden" name="keyDate1" value="<%=keyDate1%>">
			<input type="hidden" name="keyDate2" value="<%=keyDate2%>">
			<input type="hidden" name="numPerPage" value="<%=numPerPage%>">
		</form>


</div>

</div> <!--  #btn_manager_wrapper (��ư�޴� + manager) : admin_side.jsp ���� ����-->
</div> <!-- #main (��ܿ�� + ��ư + manager) : admin_side.jsp ���� ����-->
	<%@ include file="../bottom.jsp" %>

<script type="text/javascript" src="./js/order_list.js"></script>

</body>
</html>