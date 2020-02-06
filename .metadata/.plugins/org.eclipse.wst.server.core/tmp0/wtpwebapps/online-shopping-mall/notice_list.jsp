<!-- list.jsp -->
<%@page import="admin.NoticeBean"%>
<%@page import="admin.UtilMgr"%>
<%@page import="java.util.Vector"%>
<%@page contentType="text/html; charset=EUC-KR" %>
<jsp:useBean id="mgr" class="admin.AdminMgr"/>

	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/admin/css/admin_style.css">
	<link rel="stylesheet" type="text/css" href="admin/css/notice_list.css">

<%
		request.setCharacterEncoding("EUC-KR");
		String cpath = request.getContextPath();		

		int totalRecord = 0;//�ѰԽù� ����
		int numPerPage = 10;//�������� ���ڵ� ���� (5,10,15,30)
		int pagePerBlock = 15;//���� ������ ����
		int totalPage = 0;//�� ������ ����
		int totalBlock = 0;//�� �� ����
		int nowPage = 1;//���� ������
		int nowBlock = 1;//���� ��
		
		//page�� ������ �Խù� ���� ��
		if(request.getParameter("numPerPage")!=null&&
				!request.getParameter("numPerPage").equals("null")){
			numPerPage = UtilMgr.parseInt(request, "numPerPage");
		}
		
		int start = 0;//���̺� ���� ��ȣ
		int cnt = numPerPage;
		
		//�˻��� �ʿ��� ����
		String keyField = "" , keyWord = "";
		
		//�˻��϶� 
		if(request.getParameter("keyWord")!=null){
			keyField = request.getParameter("keyField");
			keyWord = request.getParameter("keyWord");
		}
		
		//�˻� �Ŀ� �ٽ� ó��ȭ������ ��û
		if(request.getParameter("reload")!=null&&
				request.getParameter("reload").equals("true")){
			keyField = "";  keyWord = "";
		}
		
		totalRecord = mgr.getTotalCount(keyField, keyWord);
		//out.print(totalRecord);
		
		//nowPage�� ��û�� ���
		if(request.getParameter("nowPage")!=null){
			nowPage = UtilMgr.parseInt(request, "nowPage");
		}
		//���̺� ���� ��ȣ
		start = (nowPage*numPerPage)-numPerPage;
		
		//��ü�������� (��ü���ڵ尳��/�������� ���ڵ� ����) �ø�.
		 totalPage = (int)Math.ceil((double)totalRecord/numPerPage);
		//��ü���� (��ü��������/���� ������ ����) �ø�.
		 totalBlock = (int)Math.ceil((double)totalPage/pagePerBlock);
		//����� (������������/���� ������ ����) �ø�.
		nowBlock = (int)Math.ceil((double)nowPage/pagePerBlock);
 %>

<script type="text/javascript">
	function check() {
		if(document.searchFrm.keyWord.value==""){
			alert("�˻�� �Է��ϼ���.");
			document.searchFrm.keyWord.focus();
			return;
		}
		document.searchFrm.submit();
	}
	
	function list() {
		document.listFrm.action = "notice_list.jsp";
		document.listFrm.submit();
	}
	
	function numPerFn(numPerPage) {
		document.readFrm.numPerPage.value=numPerPage;
		document.readFrm.submit();
	}
	
	function read(num) {
		document.readFrm.num.value = num;
		document.readFrm.action = "notice_view.jsp";
		document.readFrm.submit();
	}
	
	function block(block) {
		document.readFrm.nowPage.value = 
			<%=pagePerBlock%>*(block-1)+1;
		document.readFrm.submit();	
	}
	
	function pageing(page) {
		document.readFrm.nowPage.value = page;
		document.readFrm.submit();	
	}
</script>

<%@ include file="../top.jsp"%>

	<main>
	
		<div id="manager">
		<h1 class="title">��������</h1>
		
			<div class="notice_list_wrapper">
			
				<div id="btn_frm">
					<input class="btn" type="button" value="ó������" onclick="location.href='javascript:list()'">
				</div>
			
				<table class="mgr_table horHead notice_list">
					<tr>
						<th>�� ȣ</th>
						<th>ī�װ�</th>
						<th>�� ��</th>
						<th>�ۼ���</th>
						<th>�ۼ���</th>				
					</tr>
	
				<%
						Vector<NoticeBean> vlist = mgr.getNoticeList(keyField, keyWord, start, cnt);
						int listSize = vlist.size();//������ ȭ�鿡 ǥ�õ� �Խù� ��ȣ
						if(vlist.isEmpty()){
							
				%>
					<tr>
						<td colspan="5">
							��ϵ� �Խù��� �����ϴ�.
						</td>
					</tr>
				<%			
						}else{
							
							for(int i=0;i<numPerPage;i++){
								if(i==listSize) break; //���� ������ �������� 10�� �ƴ� ���
								NoticeBean bean = vlist.get(i);
								int n_index = bean.getN_index ();
								String n_id = bean.getN_id();
								String n_category = bean.getN_category ();
								String n_title = bean.getN_title();
								String n_content = bean.getN_content ();
								String n_date = bean.getN_date();
								String n_file_name = bean.getN_file_name ();
								int n_file_size = bean.getN_file_size();
						%>
						<tr>
							<td><%=totalRecord-start-i%></td>
							<td><%=n_category%></td>
							<td><a href="notice_view.jsp?n_index=<%=n_index%>"><%=n_title%></a></td>
							<%if(n_id.equals("m1") || n_id.equals("m2") || n_id.equals("m3") ){ %>
							<td>������</td><%}else{%>
							<td>�����ھƴ�</td><%} %>
							<td><%=n_date%></td>
						</tr>
						<%}//---for%>	
					<%}//----if-else%>		
					</table>
					
			</div>
		
			<table  class="pagination_tb">
				<tr>
					<td>		
				
					<%if(totalPage>0){ %>
						<!-- ���� �� -->
						<%if(nowBlock>1){%>
							<a href="javascript:block('<%=nowBlock-1%>')">prev...</a>
						<%}%>
						<!-- ����¡ -->
						<% 
								int pageStart = (nowBlock-1)*pagePerBlock+1;
								int pageEnd = (pageStart+pagePerBlock)<totalPage?
										pageStart+pagePerBlock:totalPage+1;
								for(;pageStart<pageEnd;pageStart++){
						%>
							<a href="javascript:pageing('<%=pageStart%>')">
								<span class="page_btn">
									<%if(pageStart==nowPage){%><span id="nowPage_btn"><%}%>
										<%=pageStart%>
									<%if(pageStart==nowPage){%></span><%}%>
								</span>
							</a>
						<%}//---for%>
						<!-- ���� �� -->
						<%if(totalBlock>nowBlock){%>
							<a href="javascript:block('<%=nowBlock+1%>')">...next</a>
						<%}%>
					<%}%>		
				</td>
			</tr>
		</table>
	
		
		<form name="searchFrm" id="notice_searchFrm">
					
							
			<table class="mgr_table verHead notice_searchTable">
		 		<tr>
		  			<td>
		   				<select id="notice_search_select" name="keyField" size="1" >
		    				<option value="n_title"> �� ��</option>
		    				<option value="n_content"> �� ��</option>
		   				</select>
		   				<input id="notice_search_input" name="keyWord">
		   				<input id="search_btn" type="button"  value="�˻�" onClick="javascript:check()">
		   				<input type="hidden" name="nowPage" value="1">
		  			</td>
		 		</tr>
			</table>
		</form>
			
			
		<form name="listFrm" method="post">
			<input type="hidden" name="reload" value="true">
			<input type="hidden" name="nowPage" value="1">
		</form>
			
		<form name="readFrm">
			<input type="hidden" name="num">
			<input type="hidden" name="nowPage" value="<%=nowPage%>">
			<input type="hidden" name="keyField" value="<%=keyField%>">
			<input type="hidden" name="keyWord" value="<%=keyWord%>">
			<input type="hidden" name="numPerPage" value="<%=numPerPage%>">
		</form>
	</div>
			
	</main>


</div>
<!--  #btn_mypage_wrapper (��ư�޴� + mypage) : mypage_side.jsp ���� ����-->
</div>
<!-- #main (��ܿ�� + ��ư + mypage) : mypage_side.jsp ���� ����-->
<%@ include file="../bottom.jsp"%>

</body>
</html>

