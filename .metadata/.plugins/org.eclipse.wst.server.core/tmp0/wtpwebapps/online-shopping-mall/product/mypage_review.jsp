<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ page import="product.ReviewBean"%>
<%@ page import="java.util.Vector"%>

<jsp:useBean id="reviewMgr" class="product.ReviewMgr" />

<link rel="stylesheet" type="text/css" href="./css/review.css">



<!-- �۾��� : ���� ���� -->
<!-- <link rel="stylesheet" type="text/css"	href="../vscode__utf8/product/css/review.css"> -->
<!-- �۾��� : ���� ���� -->



<%@include file="../top.jsp"%>

<%@ include file="../order/mypage_side.jsp"%>

<div id="mypage">

	<div id="review_btn_wrapper">

		<h1 class="review_title">�������</h1>

		<input type="radio" name="list_name" id="avaList" value="avaList" checked>
		<label for="avaList"> <span class="btn" id="avabtn">�ۼ� ���� ����</span>
		</label> <input type="radio" name="list_name" id="myReList" value="myList">
		<label for="myReList"> <span class="btn" id="mybtn">���� ���� ���</span>
		</label>
	</div>


	<div class="mypage_wrapper">


		<h3 class="inner_title" id="review_inner_title">�ۼ� ������ ����</h3>
		<span class="review_detail">* ���� �� 31�� �̳��� ��ǰ�� ���ؼ��� ���� �ۼ���
			�����մϴ�.</span>


		<table class="horHead review_table" id="avaReview_table">
			<tr class="column_tr">
				<th>�ֹ���ȣ</th>
				<th colspan="2">��ǰ����</th>
				<th>������</th>
				<th>�ֹ�����</th>
			</tr>

			<%
				// �ۼ� ���� ���� ��� �������� 
				Vector<ReviewBean> reBeanList = reviewMgr.getAvaReview(id);

				if (reBeanList.isEmpty()) {
			%>

			<tr>
				<td colspan="5">�ۼ� ������ ���䰡 �����ϴ�.</td>
			</tr>

			<%
				} // --if 
				else {

					for (ReviewBean reBean : reBeanList) {

						int o_index = reBean.getO_index();
						String p_main_pht_name = reBean.getP_main_pht_name();
						String p_name = reBean.getP_name();
						String o_date = reBean.getO_date();
						String o_status = reBean.getO_status();
						int p_code = reBean.getP_code();
			%>

			<tr class="pointer_tr">
				<td class="btn_td"><a
					href="${pageContext.request.contextPath}/order/mypage_order_view.jsp?order=<%=o_index%>">
						<%=o_index%>
				</a></td>
				<td><img alt="��ǰ����"
					src="${pageContext.request.contextPath}/img/product/<%=p_main_pht_name%>">
				</td>
				<td class="btn_td"><a
					href="${pageContext.request.contextPath}/product/goods_view.jsp?p_code=<%=p_code%>">
						<%=p_name%>
				</a></td>
				<td><%=o_date%></td>
				<td><%=o_status%></td>
			</tr>
			<!--  �ۼ� ĭ -->
			<tr>
				<td class="rateField view_hide" colspan="5">
					<form name="reviewWriteFrm" method="post" action="./reviewProc.jsp">

						<div class="rate_star_wrapper">
							<%
								for (int i = 0; i < 5; i++) {
							%>
							<input type="radio" class="rate_star"
								id="rate_star<%=i + 1%>_<%=o_index%>_<%=p_code%>" name="r_rate"
								value="<%=i + 1%>">

							<script>
											const rate_star<%=i + 1%>_<%=o_index%>_<%=p_code%> = document.getElementById('rate_star<%=i + 1%>_<%=o_index%>_<%=p_code%>');
							</script>

							<label for="rate_star<%=i + 1%>_<%=o_index%>_<%=p_code%>"
								id="lable_star<%=i + 1%>_<%=o_index%>_<%=p_code%>"> <i
								class="nStar far fa-star"></i>
							</label>
							<%
								}
							%>
							<input type="hidden" name="o_index" value="<%=o_index%>">
							<input type="hidden" name="p_code" value="<%=p_code%>"> <input
								type="hidden" name="id" value="<%=id%>">
						</div>

						<div class="r_content_wrapper">
							<textarea name="r_content" id="reviewText" style="resize: none;"></textarea>
						</div>
						<script>
										const reviewText_<%=o_index%>_<%=p_code%> = document.getElementById('reviewText_<%=o_index%>_<%=p_code%>');
						</script>
						<input type="button" class="btn" value="�ۼ�">
					</form>
				</td>
			</tr>

			<%
				} // -- for
				} // -- else
			%>

		</table>


	</div>


	<form name="reviewReadFrm" method="post" action="">

		<h3 class="inner_title">���� �ۼ��� ����</h3>
		
		<div class="my_page_rieview_wrapper" >
			<%
				String reviewList = "mypage";
				int p_code = 0; // mypage ���� �Ѿ �� ���� ������ �ʵ��� ���� �� �ο��ؾ���
			%>
			<%@include file="review.jsp"%>
		
		</div>


	</form>


</div>

</div>
<!--  #btn_mypage_wrapper (��ư�޴� + mypage) : mypage_side.jsp ���� ����-->
</div>
<!-- #main (��ܿ�� + ��ư + mypage) : mypage_side.jsp ���� ����-->
<%@ include file="../bottom.jsp"%>
<script src="js/mypage_review.js"></script>
<script type="text/javascript" charset="EUC-KR" src="js/review.js"></script>

<!-- �۾��� : ���� ���� -->
<script type="text/javascript" charset="EUC-KR"
	src="../vscode__utf8/product/js/review.js"></script>
<!-- �۾��� : ���� ���� -->

</body>
</html>