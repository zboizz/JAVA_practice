const myinfo_name = document.getElementById('myinfo_name');
const myinfo_pwd1 = document.getElementById('myinfo_pwd1');
const myinfo_pwd2 = document.getElementById('myinfo_pwd2');
const myinfo_birthday = document.getElementById('myinfo_birthday');
const myinfo_email = document.getElementById('myinfo_email');
const myinfo_contact = document.getElementById('myinfo_contact');
const myinfo_zipcode = document.getElementById('myinfo_zipcode');
const myinfo_addr = document.getElementById('myinfo_addr');
const myinfo_detail_addr = document.getElementById('myinfo_detail_addr');
const pwd_alert = document.getElementById('pwd_alert');
const zip_btn = document.getElementById('zip_btn');


function init(){
	//form ��ư �̺�Ʈ
	document.getElementById('adrress_submit').addEventListener('click', info_check);
	//pwd1 �̺�Ʈ
	myinfo_pwd1.addEventListener('focusout', pwd_check);
	myinfo_pwd2.addEventListener('focusout', pwd_check);
	
	openDaumZipAddress();
	
	zip_btn.addEventListener('click', openDaumZipAddress);

	function pwd_check(){
		console.log('�н�����üũ ��')
		//���� �Ѵ� �ԷµǾ����� and focus out ��
		if(myinfo_pwd1.value && myinfo_pwd2.value){
			//���� ������
			if(myinfo_pwd1.value !== myinfo_pwd2.value){
				myinfo_pwd1.value = '';
				myinfo_pwd2.value = '';
				myinfo_pwd1.focus();
				pwd_alert.innerHTML = '��й�ȣ�� ��ġ���� �ʽ��ϴ�.';
			}else{
				pwd_alert.innerHTML = '';
			}
		}
	}
	
	function openDaumZipAddress() {
	    // �����ȣ ã�� ȭ���� ���� element�� ����
	    const element_wrap = document.getElementById("daumWrap3");

		element_wrap.style.position  = "absolute";
	    // wrap ���̾ off�� ���¶�� ���� �����ȣ ���̾ open �Ѵ�.
	    if($("#daumWrap3").css("display") == "none") {
	        new daum.Postcode({
	            oncomplete:function(data) {
	                $("#myinfo_zipcode").val(data.zonecode);
	                $("#myinfo_addr").val(data.address);
	                $("#myinfo_detail_addr").focus();
	            }
	            // ����ڰ� ���� �ּҸ� �����ؼ� ���̾ ���� ���
	            // ���� �ּҷ� ���̾ ������ ���� ��Ų��.
	            , onclose:function(state) {
	                if(state === "COMPLETE_CLOSE") {
	                    // �ݹ��Լ��� �����Ͽ� �����̵� �� ����� ���� �Ϸ��� �۾��� �����Ѵ�.
	                    offDaumZipAddress(function() {
	                        element_wrap.style.display = "none";
	                    });
	                }
	            }
	        }).embed(element_wrap);

	        // �����̵� �ٿ� ����� �̿��� ���̾� â�� �����Ѵ�.
	        $("#daumWrap3").slideDown();
	    }
	    
	    // warp ���̾ open�� ���¶�� ���� �����ȣ ���̾ off ���·� �����Ѵ�.
	    else {
	        // �ݹ��Լ��� �����Ͽ� �����̵� �� ����� ���� �Ϸ��� �۾��� �����Ѵ�.
	        offDaumZipAddress(function() {
	            element_wrap.style.display = "none";
	            return false;
	        });
	    }
	}
	function offDaumZipAddress() {
		// �����̵� �� ����� �̿��� ���̾� â�� �ݴ´�.
	    $("#daumWrap3").slideUp();
	}
	
	function info_check(){
	    if(myinfo_name.value){
	    	myinfo_form.submit();
	    }else{
	    	alert('�̸��� �Է����ּ���.');
	    	myinfo_name.focus();
	    }	    
	}
}




init();