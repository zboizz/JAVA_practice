
	window.onload = function(){
		function typeCheck(){
			const update_btn = document.querySelector('#update_btn');
			const delete_btn = document.querySelector('#delete_btn');
			
			function deletecompelete(){
				$('#buffer').val('delete');
				$('#rFrame').submit();
			}
			update_btn.addEventListener('click', function(){
				const inputdata = 
				$('#buffer').val('update');
				$('#rFrame').submit();
			});
			delete_btn.addEventListener('click',function(){
				if(confirm("�����Ͻðڽ��ϱ�?")==true){
					console.log("�����߾��");
					deletecompelete();
				}else{
					return;
				}
			});
		}
		typeCheck();
	}

function check() {	
	console.log(!document.getElementById('p_date1').value);
	if(!document.getElementById('p_date1').value && !document.getElementById('p_date2').value){
		document.getElementById('p_date1').value = 0;
		document.getElementById('p_date2').value = 0;
	}
	submit();
}

function submit(){
	f = document.SearchFrm;
	if(f.p_date1.value.length!=8 && f.p_date2.value.length==8){
		alert("�Ⱓ�� �ùٸ��� �Է����ּ��� ex) 20191217")
		f.p_date1.focus();
		return;
	}	
	if(f.p_date1.value.length==8 && f.p_date2.value.length!=8){
		alert("�Ⱓ�� �ùٸ��� �Է����ּ��� ex) 20191217")
		f.p_date2.focus();
		return;
	}	
	function list() {
		document.listFrm.action = "goods_master.jsp";
		document.listFrm.submit();
	}	
	f.submit();
}

function listSelect() {
	f = document.SearchFrm;
	pl = f.pnameList;
	f.p_name.value = pl.options[pl.selectedIndex].value;
}
 
/* checkbox javascript */
 
 function allChk() {
	f= document.rFrm;
	if(f.allCh.checked){
		for(i=0;i<f.fch.length;i++){
				/*�׸��� üũ��ư(fch)���� �迭�̱⿡*/
			f.fch[i].checked = true;
		}
		f.delete.disabled = false;//��ư�� Ȱ��ȭ
		f.update.disabled = false;//��ư�� Ȱ��ȭ
	}else{
		for(i=0;i<f.fch.length;i++){
			f.fch[i].checked = false;
		}
		f.delete.disabled = true;//��ư�� ��Ȱ��ȭ	
		f.update.disabled = true;//��ư�� Ȱ��ȭ
	}
}
 function chk(){
		f=document.rFrm;
		for(i=0; i<f.fch.length;i++){
			//alert(f.fch[i].value);
			if(f.fch[i].checked){ //fch üũ�ڽ��� üũ�� �� ���
				f.delete.disabled = false;
				f.update.disabled = false;//��ư�� Ȱ��ȭ
			return; //�ؿ� �ִ� üũ�ڽ��� üũ ������ ���ǹ�
			}
		}
		f.allCh.checked= false; //��üüũ�ڽ� ����
		f.delete.disabled = true; //��ư ��Ȱ��ȭ
		f.update.disabled = true;//��ư�� Ȱ��ȭ
	} 
