<!-- goods_view.jsp -->
<%@page import="product.ProductBean"%>
<%@page import="java.util.Vector"%>
<%@page import="java.sql.Date"%>
<%@ page contentType="text/html; charset=EUC-KR"%>
<jsp:useBean id="mgr" class="product.ProductMgr"/>
<%
	request.setCharacterEncoding("EUC-KR");
	int p_code = Integer.parseInt(request.getParameter("p_code"));
	ProductBean bean = mgr.getProduct(p_code);
%>
<html>
<head>
<!-- <title>-관리자-제품 등록</title>  -->



</head>
<body topmargin="100">	

<link rel="stylesheet" type="text/css" href="./css/goods_view.css">
<!-- <title>-관리자-제품 등록</title> -->
<!-- <link rel="stylesheet" type="text/css" href="./css/mypage_orderlist.css"> -->
<%@ include file="../top.jsp" %>

	<%@ include file="./admin_side.jsp"%> 

<!--------------->
<!--  작업 영역  -->
<!--------------->
	
        <div id="manager">  
        
            <h1 class="title">제품 상세보기</h1>

            <form name="frm" method="post" action="goods_Proc.jsp?flag=update"
                enctype="multipart/form-data" >
                <!-- enctype="multipart/form-data" 일때에는 post방식으로 보낸다. 
            대신에 action을 통해서 action="productProc.jsp?flag=insert" 를 해줘야한다.-->        
        
        		<!--  input hidden 으로 flag 값 넘기면 flag=update 전달 가능 
        		<input type="hidden" value="update" name="flag">	-->
        
        
        
                <h3 class="inner_title">기본정보</h3>
                
                <input id="chgread1" class="btn" type="button" value="수정">
                
                            <table class="mgr_table verHead">
        
                                <tr>
                                    <th>제품코드</th>
                                    <td><input name="p_code" value="<%=bean.getP_code()%>" readonly></td>                                                         	
                                    <th>제품명</th>
                                    <td><input class="1 readChange" name="p_name" value="<%=bean.getP_name()%>" disabled></td>
                                </tr>
                                <tr>
                                    <th>제품가격</th>
                                    <td><input class="2 readChange" name="p_price" value="<%=bean.getP_price()%>" disabled>원</td>
                                    
                                    <th>판매여부</th>
                                    <td>
                                    	<%if(bean.getP_on_sale()==1){%>
                                    	<input  class="3 readChange radio" type="radio" name="p_on_sale" value="1"checked disabled>판매
                                        <input  class="4 readChange radio" type="radio" name="p_on_sale" value="0" disabled>숨기기
                                        <%}else{%>
                                        <input  class="3 readChange radio" type="radio" name="p_on_sale" value="1" disabled>판매
                                        <input  class="4 readChange radio" type="radio" name="p_on_sale" value="0" checked disabled>숨기기
                                        <%} %>
                                    </td>
                                </tr>						
                                <tr>
                                    <th>원재료(1)</th>
                                    <td>
                                        <select name="rm_code1" class="5a readChange"disabled>
                                            <option value="" disabled selected>원재료명</option>
                                            <option value=""></option>
                                        </select>
                                        <input class="5b readChange rm_pct" name="rm_percentage1" placeholder="함유율" disabled>%
                                    
                                    </td>
                                    
                                    <th>원재료(2)</th>
                                    <td>
                                        <select name="rm_code2" class="6a readChange" disabled>
                                                <option value="" disabled selected>원재료명</option>
                                                <option value=""></option>
                                        </select>
                                        <input class="6b readChange rm_pct" name="rm_percentage2" placeholder="함유율" disabled>%
                                    </td>
                                </tr>
                                <tr>
                                    <th>원재료(3)</th>
                                    <td>
                                        <select name="rm_code3" class="7a readChange" disabled>
                                                <option value="" disabled selected>원재료명</option>
                                                <option value=""></option>
                                        </select>
                                        <input class="7b readChange rm_pct" name="rm_percentage3" placeholder="함유율" disabled>%
                                    </td>                                
                                    <th>원재료(4)</th>
                                    <td>
                                        <select class="8a readChange"name="rm_code4" disabled>
                                                <option value="" disabled selected>원재료명</option>
                                                <option value=""></option>
                                        </select>
                                        <input class="8b readChange rm_pct" name="rm_percentage4" placeholder="함유율" disabled>%
                                    </td>
                                </tr>
                            </table>
        
                <h3 class="inner_title">사진정보</h3>
                            <table class="mgr_table verHead" id="pht_table">
                                <tr>
                                    <th>메인이미지</th>
                                    <td>
                                    <div class="filebox">				
                                    <span id="main_img_name"><%=bean.getP_main_pht_name()%></span>						                                    
										 <label for="main_img_btn">업로드</label>
                                    	<input class="9 readChange" type="file" name="upFile1" id="main_img_btn" disabled></td>
                                	</div>
                                    </td>
                                    </tr>
                                <tr>
                                    <th>설명이미지</th>                                                                    
                                    <td> 
                                    <div class="filebox">
                                    <span id="ex_img_name"><%=bean.getP_detail_pht_name()%></span>
										  <label for="ex_img_btn">업로드</label>
                                    	 <input class="10 readChange" type="file" name="upFile2" id="ex_img_btn" disabled></td>
                              		</div>
                                    </td>
                                     </tr>
                                <tr>
                                    <th>상세이미지</th>
                                    <td> 
                                    <div class="filebox">										                                    
                                    <span id="detail_img_name"><%=bean.getP_info_pht_name()%></span>
										  <label for="detail_img_btn">업로드</label>
                                    	<input class="11 readChange" type="file" name="upFile3" id="detail_img_btn" disabled></td>
                                    </div>
                                    </td>
                                </tr>
                            </table>
                            

            <div class="submit_wrapper">
            
                <input class="btn" type="button" value="목록으로" onclick="location.href='goods_master.jsp'">
                <input class="btn readChange" type="submit" value="수정완료" disabled>                
                <input class="btn" type="reset" value="다시쓰기">
                <input class="btn" id="delete" type="button" value="삭제하기" onclick="location.href='javascript:confirmDel(<%=bean.getP_code()%>)'">
                <input type="hidden"  value="<%=bean.getP_code()%>" name="pcode">
                
            </div>
            </form>        
        </div>		
<!----------------->
<!--  작업 영역 끝 -->
<!----------------->
	
</div> <!--  #btn_manager_wrapper (버튼메뉴 + manager) : admin_side.jsp 에서 열림-->
</div> <!-- #main (상단요약 + 버튼 + manager) : admin_side.jsp 에서 열림-->
	<%@ include file="../bottom.jsp" %>
</body>

<script>
	window.onload = function(){
		function btnInit(){
			const button = document.querySelector('#chgread1');
			let flag = 0;
			button.addEventListener('click', function(){
				const reads = document.querySelectorAll('.readChange');
				if(flag===0){
					console.log("DDD");
					reads.forEach(function(items){
						items.disabled = false;
					});
					flag = 1;
					button.value = '해제';
					console.log(button);
				}else{
					reads.forEach(function(items){
						items.disabled = true;
					});
					flag = 0;
					console.log("FFF");
					button.value = '수정';
					console.log(button);
				}
			});
			
			document.getElementById('main_img_btn').addEventListener('change',function(){
			    var fileValue = $("#main_img_btn").val().split("\\");
			    var fileName = fileValue[fileValue.length-1]; // 파일명
				document.getElementById('main_img_name').innerHTML = fileName;
			});
			document.getElementById('ex_img_btn').addEventListener('change',function(){
			    var fileValue = $("#ex_img_btn").val().split("\\");
			    var fileName = fileValue[fileValue.length-1]; // 파일명
				document.getElementById('ex_img_name').innerHTML = fileName;
			});
			document.getElementById('detail_img_btn').addEventListener('change',function(){
			    var fileValue = $("#detail_img_btn").val().split("\\");
			    var fileName = fileValue[fileValue.length-1]; // 파일명
				document.getElementById('detail_img_name').innerHTML = fileName;
			});
				
				
		}
		btnInit();
	}
	
	function confirmDel(p_code){
		if(confirm("삭제하시겠습니까?")==true){
			location.href="goods_Proc.jsp?flag=delete&pcode="+p_code;
		}else{
			return;
		}
	}
</script>
</html>