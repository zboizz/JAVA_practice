<!-- goods_view���� cart�� �߰���Ű�� -->
<%@page contentType="text/html; charset=EUC-KR"%>
<jsp:useBean id="cbean" class="order.CartBean"/>
<jsp:useBean id="cmgr" class="order.CartMgr"/>
<%
		request.setCharacterEncoding("EUC-KR");
		String id = request.getParameter("id_goods");
		int p_code = Integer.parseInt(request.getParameter("p_code"));
		int c_qty = Integer.parseInt(request.getParameter("c_qty"));
		boolean result = cmgr.addCart(id, p_code, c_qty);
		String msg = "";
		if(result){
			msg = "��ٱ��Ͽ� �߰� �Ǿ����ϴ�.";
			response.sendRedirect("../order/cart.jsp");
		}else{
			msg = "��ٱ��� ��⿡ �����Ͽ����ϴ�.";
			response.sendRedirect("goods_view.jsp");
		}
%>
<script>
	alert("<%=msg%>");
</script>