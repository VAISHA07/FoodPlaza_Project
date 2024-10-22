

function total(){
	fname=document.getElementById('fname').value;
	quan=document.getElementById('fquan').value;
	price=document.getElementById('price').value;
	total=price*quan;
	document.getElementById('tprice').value=total;
}

function searchdata(a){
	
	var fname1 = document.getElementById('fname').value;
	var price1 = document.getElementById('price').value;
	
	
	let xhr=new XMLHttpRequest();
	
	   xhr.onreadystatechange = () =>{
		if(xhr.status ==200 && xhr.readyState == 4){
			console.log("Data Send Successfully");
		}
	   }
	   xhr.open("POST","AddData.jsp?q="+a+"&fname="+fname1+"&price="+price1,true);
	   xhr.send();
}