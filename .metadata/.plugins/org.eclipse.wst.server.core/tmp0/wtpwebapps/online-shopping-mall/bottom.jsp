<%@ page contentType="text/html; charset=EUC-KR"%>
<%
		request.setCharacterEncoding("EUC-KR");
		
%>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bottom.css">
<footer>
	<div id="footer_wrapper">
	    <ul>
	        <li id="footer_first">
	            <span id="title">������</span>
	            <span id="middle">1600-1234</span>
	            <button onclick="location.href='#'" id="bottom">1:1����</button>
	        </li>
	        <li id="footer_second">
	            <div class="second" id="phone">
	                365���ݼ���
	                <span>���� 8�� - ���� 6��</span>
	            </div>
	            <div class="second" id="qnaboard">
	                24�ð� QnA �Խ���
	                <span>������ ��ð��� ���������� �亯�ص帮�ڽ��ϴ�.</span>
	            </div>
	        </li>
	        <li id="footer_third">
	            <div id="business_info">
	                <span>���θ� (��ȣ) : �н��� ��Ѱ�</span>
	                <span>����ڵ�Ϲ�ȣ : 111-11-11111</span>
	                <span>�ּ� : �λ걤���� �λ����� �߾Ӵ�� 708 �λ����̳������� 4F, 5F</span>
	                <span>�ѽ� : 070-111-1111 | �̸��� : xxx@xxxxx.com</span>
	                <a href="https://www.facebook.com/"><img src="${pageContext.request.contextPath}/img/index/footer/ico_fb.webp"></a>
	                <a href="https://www.instagram.com/?hl=ko"><img src="${pageContext.request.contextPath}/img/index/footer/ico_instagram.webp"></a>
	                <a href="https://section.blog.naver.com/BlogHome.nhn?directoryNo=0&currentPage=1&groupId=0"><img src="${pageContext.request.contextPath}/img/index/footer/ico_blog.webp"></a>
	                <a href="https://www.youtube.com/"><img src="${pageContext.request.contextPath}/img/index/footer/ico_youtube.webp"></a>
	            </div>
	        </li>
	    </ul>
	</div>
</footer>