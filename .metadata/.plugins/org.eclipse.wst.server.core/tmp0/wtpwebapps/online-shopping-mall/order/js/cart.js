
let submitflag = '';
function init(){	
	const cart_rows = document.getElementById("cart_table").rows;
	const delete_btn = document.querySelector('#delete_product');
	const order_btn = document.querySelector('#order_product');
	const allCheckbox = cart_rows[0].childNodes[1].childNodes[0].childNodes[0];
	const sumtext = document.querySelector('#sumtext');
	const sumtotaltext = document.querySelector('#sumtotaltext');
	let id = '';
	order_btn.addEventListener('click', function(){
		goOrder();
	});
	
	window.onload = function(){
		id = document.querySelector('#user_id').value;
		setTimeout(call_qty, 1000);
	}
	
	if (window.attachEvent) {
	    /*IE and Opera*/
	    window.attachEvent("onunload", function() {
			if(!submitflag){
				update_qty();
				console.log('������Ʈ ����1');
			}
	    });

	} else if (document.addEventListener) {
	    /*Chrome, FireFox*/
	    window.onbeforeunload = function() {
			if(!submitflag){
				update_qty();
				console.log('������Ʈ ����2');
			}
	    };
	    /*IE 6, Mobile Safari, Chrome Mobile*/
	    window.addEventListener("unload", function() {
			if(!submitflag){
				update_qty();
				console.log('������Ʈ ����3');
			}
	    }, false);
	} else {
	    /*etc*/
	    document.addEventListener("unload", function() {
			if(!submitflag){
				update_qty();
				console.log('������Ʈ ����4');
			}
	    }, false);
	}


    
	
	delete_btn.addEventListener('click',confirmDel);
	let trArray = [];
	let sum = 0;
	//tr Array�� tr �迭 �־���(ù�� ����)
	for(let i=0; i<cart_rows.length; i++){
	    if(i!==0)  {
	    	trArray.push(cart_rows[i]);
	    }
	    cart_rows[i].childNodes[1].childNodes[0].childNodes[0].checked = false;
	}
    console.log('üũ�ڽ� ��ü ���� �Ϸ�');
  
	for(let j=0; j<trArray.length; j++){
		const tr7 = trArray[j].childNodes[7];
		const down_btn = tr7.childNodes[0];
		let qty_input = tr7.childNodes[2];
		const up_btn = tr7.childNodes[4];
		let product_cash = parseInt(uncomma(trArray[j].childNodes[5].childNodes[2].innerHTML));
		let total_cash = trArray[j].childNodes[9];	
		
		//üũ�ڽ� �̺�Ʈ��
			//�� �ʱ�ȭ ����
			trArray[j].childNodes[9].innerHTML = numberFormat(uncomma(trArray[j].childNodes[7].childNodes[2].value) * parseInt(uncomma(trArray[j].childNodes[5].childNodes[2].innerHTML))) ;
			//�̺�Ʈ������
			trArray[j].childNodes[1].childNodes[0].childNodes[0].addEventListener('click', function(){
			if(trArray[j].childNodes[1].childNodes[0].childNodes[0].checked){
				sum += parseInt(uncomma(trArray[j].childNodes[9].innerHTML));
				sumtext.innerHTML = numberFormat(sum);
				sumtotaltext.innerHTML = numberFormat(sum+2500);
				undisableFunction(delete_btn);
				undisableFunction(order_btn);
				let judge_sum = 0;
					for(let j=0; j<trArray.length; j++){
						judge_sum+= parseInt(uncomma(trArray[j].childNodes[9].innerHTML));
					}
				if(sum===judge_sum){
					allCheckbox.checked = true;
				}
				
			}else{
				sum -= parseInt(uncomma(trArray[j].childNodes[9].innerHTML));
				sumtext.innerHTML = numberFormat(sum);
				sumtotaltext.innerHTML = numberFormat(sum+2500);
				if(sum==0)
					allCheckbox.checked = false;
			}
			
			zeroCheck();
		});
			
		//7��° tr get
			
	
		//��ư�̺�Ʈ
		down_btn.addEventListener('click', function(){
			if(parseInt(qty_input.value)>1){
				let innerData = parseInt(uncomma(qty_input.value))-1;
				console.log("innerData: " + innerData);
				console.log("product_cash: " +product_cash);
				console.log("totalcash : " + innerData * product_cash);
				qty_input.value = innerData;
				total_cash.innerHTML = numberFormat(innerData * product_cash);
				if(trArray[j].childNodes[1].childNodes[0].childNodes[0].checked){
					sumtext.innerHTML = numberFormat(parseInt(uncomma(sumtext.innerHTML)) - product_cash);
					sumtotaltext.innerHTML = numberFormat(parseInt(uncomma(sumtotaltext.innerHTML)) - product_cash);
					sum -= product_cash;
				}
			zeroCheck();
			}
		});
		
		
		up_btn.addEventListener('click', function(){
			if(parseInt(qty_input.value)<99){
			let innerData = parseInt(uncomma(qty_input.value))+1;
			console.log("innerData: " + innerData);
			console.log("product_cash: " +product_cash);
			console.log("totalcash : " + innerData * product_cash);
			qty_input.value = innerData;
			total_cash.innerHTML = numberFormat(innerData * product_cash);
			if(trArray[j].childNodes[1].childNodes[0].childNodes[0].checked){
				sumtext.innerHTML = numberFormat(parseInt(uncomma(sumtext.innerHTML)) + product_cash);
				sumtotaltext.innerHTML = numberFormat(parseInt(uncomma(sumtotaltext.innerHTML)) + product_cash); 
				sum += product_cash;
			}
				zeroCheck();
			}
		});
	}

	//��ü �����϶�
	allCheckbox.addEventListener('change', function(){
	if(allCheckbox.checked){
		undisableFunction(delete_btn);
		undisableFunction(order_btn);
		sum = 0;
		for(let i = 0; i<trArray.length; i++){
			trArray[i].childNodes[1].childNodes[0].childNodes[0].checked = true;
			sum += parseInt(uncomma(trArray[i].childNodes[9].innerHTML));
			sumtext.innerHTML = numberFormat(sum);
			sumtotaltext.innerHTML = numberFormat(sum + 2500); 
		}
		
	}else{
		disableFunction(delete_btn);
		disableFunction(order_btn);
		for(let i = 0; i<trArray.length; i++){
			trArray[i].childNodes[1].childNodes[0].childNodes[0].checked = false;
		}
		sum = 0;
		sumtext.innerHTML = 0;
		sumtotaltext.innerHTML = numberFormat(2500); 
	}
});	// ��ü üũ�ڽ�
	
  function confirmDel(){
		if(confirm("���û�ǰ�� �����Ͻðڽ��ϱ�?")==true){
			document.frm.action = "cartDelProc.jsp";
			document.frm.submit();
		}else{ //���
			return;
		}
	}
  
  	function numberFormat(inputNumber) {
	   return inputNumber.toString().replace(/\B(?=(\d{3})+(?!\d))/g, ",");
	}
  	function uncomma(str) {
  	    str = String(str);
  	    return str.replace(/[^\d]+/g, '');
  	}
	function disableFunction(element) {
		element.disabled = true;
		
		}

	function undisableFunction(element) {
			element.disabled = false;
	}
	
	function zeroCheck(){
		const total_cash_value = parseInt(document.querySelector('#sumtext').innerHTML);
		if(total_cash_value===0){
			for(let i=0; i<cart_rows.length; i++){
			    cart_rows[i].childNodes[1].childNodes[0].childNodes[0].checked = false;
				disableFunction(delete_btn);
				disableFunction(order_btn);
			}
		}
	}
	
	
	//�ֹ�����
	delete_btn.addEventListener('click', confirmDel);
	
	//������Ʈ 
	function update_qty(){
		let p_code = new Array();
		let c_qty = new Array();
		for(let i=0; i<trArray.length; i++){
			p_code.push(trArray[i].childNodes[1].childNodes[0].childNodes[0].value);
			c_qty.push(trArray[i].childNodes[7].childNodes[2].value);
		}
  	  //������ �ε� �̺�Ʈ
  	    $.ajax({
  	        type: 'POST',                   //post or get
  	        url:ctx+'/order/qtychange',   //servlet mapping addr
  	        data: {
  	        	p_code : p_code,
  	        	c_qty : c_qty,
  	        	id : id
  	            },                              //key value
  	        success : function(data) {
  	        	alert('������Ʈ �Ϸ�');
  			 }, error : function(){
  	            //�������
  	            console.log('����');
  	        }
  	    })
	}
	
	//������Ʈ 
	function call_qty(){
		console.log(id);
  	  //������ �ε� �̺�Ʈ
  	    $.ajax({
  	        type: 'POST',                   //post or get
  	        url:ctx+'/order/qtycall',   //servlet mapping addr
  	        data: {
  	        	id : id
  	            },                              //key value
  	        success : function(data) {
    	 	const result = [];
    	 	const resultParse = JSON.parse(data);
    	 	if(result.length!==0){
	  	  		for(let i=0; i<trArray.length; i++){
	  	  			trArray[i].childNodes[7].childNodes[2].value = parseInt(resultParse[i].c_qty);
	  	  			trArray[i].childNodes[7].childNodes[2].max =  parseInt(resultParse[i].s_ava);
	  	  			trArray[i].childNodes[9].innerHTML = numberFormat(parseInt(trArray[i].childNodes[5].childNodes[2].innerHTML) * parseInt(resultParse[i].c_qty));
	  	  		}
    	 	}
  	         }, error : function(){
  	            //�������
  	            console.log('����');
  	        }
  	    })
	}
	//�ֹ������� �̵� ��
	function goOrder(){
		let p_code2 = new Array();
		let c_qty2 = new Array();
		for(let i=0; i<trArray.length; i++){
			p_code2.push(trArray[i].childNodes[1].childNodes[0].childNodes[0].value);
			c_qty2.push(trArray[i].childNodes[7].childNodes[2].value);
		}
  	  //������ �ε� �̺�Ʈ
  	    $.ajax({
  	        type: 'POST',                   //post or get
  	        url:ctx+'/order/goorder',   //servlet mapping addr
  	        data: {
  	        	p_code : p_code2,
  	        	c_qty : c_qty2,
  	        	id : id
  	            },                              //key value
  	        success : function(data) {
  	        	if(parseInt(data)===1){
  	        		const go_order_form = document.getElementById('go_order_form');
  	        		go_order_form.submit();
  	        	}else{
  	        		console.log("������Ʈ ����");
  	        	}
  			 }, error : function(){
  	            //�������
  	            console.log('����');
  	        }
  	    })
	}
	
}
init();