function init(){
	const star_wrapper = document.getElementsByClassName('rate_star_wrapper');
	const r_content_wrapper = document.getElementsByClassName('r_content_wrapper');
	const reviewWriteFrm = document.getElementsByName('reviewWriteFrm');
	const avaList = document.getElementById('avaList');
	const myReList = document.getElementById('myReList');
	const avabtn = document.getElementById('avabtn');
	const mybtn = document.getElementById('mybtn');
	const t  =document.getElementsByName('list_name');
	const pointer_tr = document.getElementsByClassName('pointer_tr');
	const rateField = document.getElementsByClassName('rateField');
	//������ư üũ���� Ȯ���ϴ°�
	
	for(let i=0; i<t.length; i++){
		console.log();
	    if(t[i].checked){
	    	if(t[i].value === "avaList"){
	    		avabtn.classList.remove('btn');
	    		avabtn.classList.add('active_btn');
	    		document.getElementsByClassName('mypage_wrapper')[0].style.display = "block";
	    		document.getElementsByName('reviewReadFrm')[0].style.display = "none";
	    	}else{
	    		mybtn.classList.remove('btn');
	    		mybtn.classList.add('active_btn');
	    		document.getElementsByClassName('mypage_wrapper')[0].style.display = "none";
	    		document.getElementsByName('reviewReadFrm')[0].style.display = "block";
	    	}
	    }
	}
	
	//�ۼ������� ����
	avabtn.addEventListener('click', function(){
		avabtn.classList.remove('btn');
		avabtn.classList.add('active_btn');
		mybtn.classList.remove('active_btn');
		mybtn.classList.add('btn');
		document.getElementsByClassName('mypage_wrapper')[0].style.display = "block";
		document.getElementsByName('reviewReadFrm')[0].style.display = "none";
		
	})
	//���� �ۼ��� ����
	
	mybtn.addEventListener('click', function(){
		avabtn.classList.remove('active_btn');
		avabtn.classList.add('btn');
		mybtn.classList.remove('btn');
		mybtn.classList.add('active_btn');
		document.getElementsByClassName('mypage_wrapper')[0].style.display = "none";
		document.getElementsByName('reviewReadFrm')[0].style.display = "block";
	})
	
	//�ʱ�ȭ
	for(let i=0; i<star_wrapper.length; i++){
		star_wrapper[i].childNodes[5].childNodes[1].classList.add('fas');
		star_wrapper[i].childNodes[5].childNodes[1].classList.remove('far');
		star_wrapper[i].childNodes[5].childNodes[1].classList.remove('nStar');
		star_wrapper[i].childNodes[5].childNodes[1].classList.add('yStar');
	}
	
	for(let j=0; j<reviewWriteFrm.length; j++){
		reviewWriteFrm[j].childNodes[7].addEventListener('click',function(){
			console.log(reviewWriteFrm[j]);
			if(!r_content_wrapper[j].childNodes[1].value){
				alert('���並 �Է����ּ���!');
				r_content_wrapper[j].childNodes[1].focus();
			}else{
				reviewWriteFrm[j].submit();
			}
		});
	}
	for(let i=0; i<star_wrapper.length; i++){
		/*����Ʈ hide view*/
		pointer_tr[i].addEventListener('click', function(){
			rateField[i].classList.toggle('view_hide');
		});
		
		star_wrapper[i].childNodes[5].addEventListener('click', function(){
			star_wrapper[i].childNodes[5].childNodes[1].classList.remove('far');
			star_wrapper[i].childNodes[11].childNodes[1].classList.remove('fas');
			star_wrapper[i].childNodes[17].childNodes[1].classList.remove('fas');
			star_wrapper[i].childNodes[23].childNodes[1].classList.remove('fas');
			star_wrapper[i].childNodes[29].childNodes[1].classList.remove('fas');
			star_wrapper[i].childNodes[5].childNodes[1].classList.add('fas');
			star_wrapper[i].childNodes[11].childNodes[1].classList.add('far');
			star_wrapper[i].childNodes[17].childNodes[1].classList.add('far');
			star_wrapper[i].childNodes[23].childNodes[1].classList.add('far');
			star_wrapper[i].childNodes[29].childNodes[1].classList.add('far');
			
			star_wrapper[i].childNodes[5].childNodes[1].classList.remove('nStar');
			star_wrapper[i].childNodes[11].childNodes[1].classList.remove('yStar');
			star_wrapper[i].childNodes[17].childNodes[1].classList.remove('yStar');
			star_wrapper[i].childNodes[23].childNodes[1].classList.remove('yStar');
			star_wrapper[i].childNodes[29].childNodes[1].classList.remove('yStar');
			star_wrapper[i].childNodes[5].childNodes[1].classList.add('yStar');
			star_wrapper[i].childNodes[11].childNodes[1].classList.add('nStar');
			star_wrapper[i].childNodes[17].childNodes[1].classList.add('nStar');
			star_wrapper[i].childNodes[23].childNodes[1].classList.add('nStar');
			star_wrapper[i].childNodes[29].childNodes[1].classList.add('nStar');
		});
		star_wrapper[i].childNodes[11].addEventListener('click', function(){
			star_wrapper[i].childNodes[5].childNodes[1].classList.remove('far');
			star_wrapper[i].childNodes[11].childNodes[1].classList.remove('far');
			star_wrapper[i].childNodes[17].childNodes[1].classList.remove('fas');
			star_wrapper[i].childNodes[23].childNodes[1].classList.remove('fas');
			star_wrapper[i].childNodes[29].childNodes[1].classList.remove('fas');
			star_wrapper[i].childNodes[5].childNodes[1].classList.add('fas');
			star_wrapper[i].childNodes[11].childNodes[1].classList.add('fas');
			star_wrapper[i].childNodes[17].childNodes[1].classList.add('far');
			star_wrapper[i].childNodes[23].childNodes[1].classList.add('far');
			star_wrapper[i].childNodes[29].childNodes[1].classList.add('far');
	
			star_wrapper[i].childNodes[5].childNodes[1].classList.remove('nStar');
			star_wrapper[i].childNodes[11].childNodes[1].classList.remove('nStar');
			star_wrapper[i].childNodes[17].childNodes[1].classList.remove('yStar');
			star_wrapper[i].childNodes[23].childNodes[1].classList.remove('yStar');
			star_wrapper[i].childNodes[29].childNodes[1].classList.remove('yStar');
			star_wrapper[i].childNodes[5].childNodes[1].classList.add('yStar');
			star_wrapper[i].childNodes[11].childNodes[1].classList.add('yStar');
			star_wrapper[i].childNodes[17].childNodes[1].classList.add('nStar');
			star_wrapper[i].childNodes[23].childNodes[1].classList.add('nStar');
			star_wrapper[i].childNodes[29].childNodes[1].classList.add('nStar');
		});
		star_wrapper[i].childNodes[17].addEventListener('click', function(){
			star_wrapper[i].childNodes[5].childNodes[1].classList.remove('far');
			star_wrapper[i].childNodes[11].childNodes[1].classList.remove('far');
			star_wrapper[i].childNodes[17].childNodes[1].classList.remove('far');
			star_wrapper[i].childNodes[23].childNodes[1].classList.remove('fas');
			star_wrapper[i].childNodes[29].childNodes[1].classList.remove('fas');
			star_wrapper[i].childNodes[5].childNodes[1].classList.add('fas');
			star_wrapper[i].childNodes[11].childNodes[1].classList.add('fas');
			star_wrapper[i].childNodes[17].childNodes[1].classList.add('fas');
			star_wrapper[i].childNodes[23].childNodes[1].classList.add('far');
			star_wrapper[i].childNodes[29].childNodes[1].classList.add('far');
			
	
			star_wrapper[i].childNodes[5].childNodes[1].classList.remove('nStar');
			star_wrapper[i].childNodes[11].childNodes[1].classList.remove('nStar');
			star_wrapper[i].childNodes[17].childNodes[1].classList.remove('nStar');
			star_wrapper[i].childNodes[23].childNodes[1].classList.remove('yStar');
			star_wrapper[i].childNodes[29].childNodes[1].classList.remove('yStar');
			star_wrapper[i].childNodes[5].childNodes[1].classList.add('yStar');
			star_wrapper[i].childNodes[11].childNodes[1].classList.add('yStar');
			star_wrapper[i].childNodes[17].childNodes[1].classList.add('yStar');
			star_wrapper[i].childNodes[23].childNodes[1].classList.add('nStar');
			star_wrapper[i].childNodes[29].childNodes[1].classList.add('nStar');
		});
		star_wrapper[i].childNodes[23].addEventListener('click', function(){
			star_wrapper[i].childNodes[5].childNodes[1].classList.remove('far');
			star_wrapper[i].childNodes[11].childNodes[1].classList.remove('far');
			star_wrapper[i].childNodes[17].childNodes[1].classList.remove('far');
			star_wrapper[i].childNodes[23].childNodes[1].classList.remove('far');
			star_wrapper[i].childNodes[29].childNodes[1].classList.remove('fas');
			star_wrapper[i].childNodes[5].childNodes[1].classList.add('fas');
			star_wrapper[i].childNodes[11].childNodes[1].classList.add('fas');
			star_wrapper[i].childNodes[17].childNodes[1].classList.add('fas');
			star_wrapper[i].childNodes[23].childNodes[1].classList.add('fas');
			star_wrapper[i].childNodes[29].childNodes[1].classList.add('far');		
			

			star_wrapper[i].childNodes[5].childNodes[1].classList.remove('nStar');
			star_wrapper[i].childNodes[11].childNodes[1].classList.remove('nStar');
			star_wrapper[i].childNodes[17].childNodes[1].classList.remove('nStar');
			star_wrapper[i].childNodes[23].childNodes[1].classList.remove('nStar');
			star_wrapper[i].childNodes[29].childNodes[1].classList.remove('yStar');
			star_wrapper[i].childNodes[5].childNodes[1].classList.add('yStar');
			star_wrapper[i].childNodes[11].childNodes[1].classList.add('yStar');
			star_wrapper[i].childNodes[17].childNodes[1].classList.add('yStar');
			star_wrapper[i].childNodes[23].childNodes[1].classList.add('yStar');
			star_wrapper[i].childNodes[29].childNodes[1].classList.add('nStar');
		});
		star_wrapper[i].childNodes[29].addEventListener('click', function(){
			star_wrapper[i].childNodes[5].childNodes[1].classList.remove('far');
			star_wrapper[i].childNodes[11].childNodes[1].classList.remove('far');
			star_wrapper[i].childNodes[17].childNodes[1].classList.remove('far');
			star_wrapper[i].childNodes[23].childNodes[1].classList.remove('far');
			star_wrapper[i].childNodes[29].childNodes[1].classList.remove('far');
			star_wrapper[i].childNodes[5].childNodes[1].classList.add('fas');
			star_wrapper[i].childNodes[11].childNodes[1].classList.add('fas');
			star_wrapper[i].childNodes[17].childNodes[1].classList.add('fas');
			star_wrapper[i].childNodes[23].childNodes[1].classList.add('fas');
			star_wrapper[i].childNodes[29].childNodes[1].classList.add('fas');		

			star_wrapper[i].childNodes[5].childNodes[1].classList.remove('nStar');
			star_wrapper[i].childNodes[11].childNodes[1].classList.remove('nStar');
			star_wrapper[i].childNodes[17].childNodes[1].classList.remove('nStar');
			star_wrapper[i].childNodes[23].childNodes[1].classList.remove('nStar');
			star_wrapper[i].childNodes[29].childNodes[1].classList.remove('nStar');
			star_wrapper[i].childNodes[5].childNodes[1].classList.add('yStar');
			star_wrapper[i].childNodes[11].childNodes[1].classList.add('yStar');
			star_wrapper[i].childNodes[17].childNodes[1].classList.add('yStar');
			star_wrapper[i].childNodes[23].childNodes[1].classList.add('yStar');
			star_wrapper[i].childNodes[29].childNodes[1].classList.add('yStar');
		});
	}
	
	function consolelog(){
		console.log("�̺�Ʈ1");
	}
}
init();