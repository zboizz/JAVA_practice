const hidden_order_date = document.getElementById('hidden_order_date');
const hidden_order_number = document.getElementById('hidden_order_number');
const order_number_input = document.getElementById('order_number_input');
const order_id_input=document.getElementById('order_id_input');
const order_date_input  = document.getElementById('order_date_input');
const hidden_pay_method = document.getElementById('hidden_pay_method');
const pay_method_select = document.getElementById('pay_method_select');

window.onload = function(){
	order_number_input.innerHTML = hidden_order_number.value;
	order_date_input.innerHTML = hidden_order_date.value;
	order_id_input.innerHTML =hidden_order_id.value;
	if(hidden_pay_method.value==="�ſ�ī��"){
		pay_method_select.selectedIndex = "0"; 
	}else if(hidden_pay_method.value==="�޴���"){
		pay_method_select.selectedIndex = "1"; 
	}else if(hidden_pay_method.value==="���̹�����"){
		pay_method_select.selectedIndex = "2"; 
	}else{
		console.log("������Ʈ ����");
	}
}

window.addEventListener('click', (event) =>{
	if(event.target.innerHTML=="�޴���" || event.target.innerHTML=="���̹�����" || event.target.innerHTML=="�ſ�ī��"){
		if(event.target.innerHTML=="�޴���")
			hidden_pay_method.value = "�޴���";
		else if(event.target.innerHTML=="���̹�����")
			hidden_pay_method.value = "���̹�����";
		else if(event.target.innerHTML=="�ſ�ī��")
			hidden_pay_method.value = "�ſ�ī��";
	}
});
function list() {//nowPage�� NumPerPage������ list.jsp�� �̵� 
	//������ action���� ������ �Ǿ��־ ���� ���� 
	document.listFrm.action = "order_list.jsp";
	document.listFrm.submit();
}

function confirmDel(){
	if(confirm("�����Ͻðڽ��ϱ�?")==true){
		document.listFrm.action = "orderDelProc.jsp";
		document.listFrm.submit();
	}else{ //���
		return;
	}
}

function init(){
	
}
init();
