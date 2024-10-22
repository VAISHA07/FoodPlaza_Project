

function LoginValidation(){
	type1=document.getElementById('type').value;
if(type1==""){
	document.getElementById('selecterror').innerHTML="Please enter Email";
	return false;
}
email=document.getElementById('email').value;
	if(email==""){
		document.getElementById('emailerror').innerHTML="Field should not be blank";
     return false;	}
	pass=document.getElementById('pass').value;
	if(pass==""){
		document.getElementById('passerror').innerHTML="Field should not be blank";
		return false;
	}
	return true;
	}

function ChangePassValidation(){
type=document.getElementById('type').value;
if(type.selectedIndex<0){
	document.getElementById('selecterror').innerHTML="Please select type";
	return false;
}
email=document.getElementById('email').value;
	if(email==""){
		document.getElementById('emailerror').innerHTML="Field should not be blank";
		return false;
	}
	pass=document.getElementById('pass').value;
	if(pass==""){
		document.getElementById('passerror').innerHTML="Field should not be blank";
		return false;
	}
	npass=document.getElementById('npass').value;
	if(npass==""){
		document.getElementById('npasserror').innerHTML="Field should not be blank";
		return false;
	}
	cpass=document.getElementById('cpass').value;
	if(cpass==""){
		document.getElementById('cpasserror').innerHTML="Field should not be blank";
		return false;
	}
	return true;
}
function AddCustValidation(){
	Name=document.getElementById('cname').value;
	if(Name==""){
		document.getElementById('cnameerror').innerHTML="Field should not be blank";
		return false;
	}
	
	email=document.getElementById('email').value;
	if(email==""){
		document.getElementById('emailerror').innerHTML="Field should not be blank";
		return false;
	}
	
	pass=document.getElementById('pass').value;
	if(pass==""){
		document.getElementById('passerror').innerHTML="Field should not be blank";
		return false;
	}
	
	adr=document.getElementById('addr').value;
	if(adr==""){
		document.getElementById('addrerror').innerHTML="Field should not be blank";
		return false;
	}

    con=document.getElementById('cNo').value;
	if(con==""){
		document.getElementById('cNOerror').innerHTML="Field should not be blank";
		return false;
	}
 
	if(con.length>=10){
		document.getElementById('cNOerror').innerHTML="Number should be 10";
		return false;
	}
return true;
}


function UpdateCustomer(){
	Name=document.getElementById('cname').value;
	if(Name==""){
		document.getElementById('cnameerror').innerHTML="Field should not be blank";
		return false;
	}
	adr=document.getElementById('adr').value;
	if(email==""){
		document.getElementById('emailerror').innerHTML="Field should not be blank";
		return false;
	}
	con=document.getElementById('cNo').value;
	if(con==""){
		document.getElementById('cNoerror').innerHTML="Field should not be blank";
		return false;
	}
	return true;
}

function UpdateFoodValidation(){
	id=document.getElementById('fid').value;
	if(fid==""){
	document.getElementById('fiderror').innerHTML="Please Enter the FoodID";
	  return false;
	}
	
	Name=document.getElementById('fname').value;
	if(Name==""){
	document.getElementById('fnameerror').innerHTML="Please enter the foodname";
	  return false;
	}
	type=document.getElementById('ftype').value;
	if(type==""){
		document.getElementById('ftypeerror').innerHTML="Please enter type";
	      return false;
	}
	quan=document.getElementById('fquan').value;
	if(quan==""){
		document.getElementById('fquanerror').innerHTML="Please enter quantity";
	      return false;
	}
	price=document.getElementById('fprice').value;
	if(price==""){
		document.getElementById("fpriceerror").innerHTML="Please enter price";
	    return false;
	}
	return true;
}

function UpdateCustValidation(){
	Name=document.getElementById('fname').value;
	if(Name==""){
	document.getElementById('fnameerror').innerHTML="Please enter the foodname";
	  return false;
	}
	
	email=document.getElementById('email').value;
	if(email==""){
		document.getElementById('emailerror').innerHTML="Field should not be blank";
		return false;
	}
	pass=document.getElementById('pass').value;
	if(pass==""){
		document.getElementById('passerror').innerHTML="Field should not be blank";
		return false;
	}
	adr=document.getElementById('addr').value;
	if(adr==""){
		document.getElementById('addrerror').innerHTML="Field should not be blank";
		return false;
	}

    con=document.getElementById('cNo').value;
	if(con==""){
		document.getElementById('cNOerror').innerHTML="Field should not be blank";
		return false;
	}
 
	if(con.length>=10){
		document.getElementById('cNOerror').innerHTML="Number should be 10";
		return false;
	}
return true;
}
function AddFeedValidation() {
    // Get form elements
    var cname = document.getElementById("cname").value.trim();
    var review = document.getElementById("review").value.trim();
    var rank = document.getElementById("rank").value.trim();
    var sug = document.getElementById("sug").value.trim();

    // Initialize error flags
    var isValid = true;

    // Clear previous error messages
    document.getElementById("cnameerror").innerText = "";
    document.getElementById("reviewerror").innerText = "";
    document.getElementById("rankerror").innerText = "";
    document.getElementById("sugerror").innerText = "";

    // Validate name
    if (cname === "") {
        document.getElementById("cnameerror").innerText = "Name is required.";
        isValid = false;
    }

    // Validate review
    if (review === "") {
        document.getElementById("reviewerror").innerText = "Review is required.";
        isValid = false;
    }

    // Validate rank
    if (rank === "") {
        document.getElementById("rankerror").innerText = "Rate is required.";
        isValid = false;
    } else if (isNaN(rank) || rank < 1 || rank > 5) {
        document.getElementById("rankerror").innerText = "Rate must be a number between 1 and 5.";
        isValid = false;
    }

    // Validate suggestion
    if (sug === "") {
        document.getElementById("sugerror").innerText = "Suggestion is required.";
        isValid = false;
    }

    return isValid;
}
function AddCartValidation() {
    // Get form elements
    var email = document.getElementById("email").value.trim();
    var fname = document.getElementById("fname").value.trim();
    var fquan = document.getElementById("fquan").value.trim();
    var price = document.getElementById("price").value.trim();
    var tprice = document.getElementById("tprice").value.trim();

    // Initialize error flags
    var isValid = true;

    // Clear previous error messages
    document.getElementById("emailerror").innerText = "";
    document.getElementById("fnameerror").innerText = "";
    document.getElementById("fquanerror").innerText = "";
    document.getElementById("priceerror").innerText = "";
    document.getElementById("tpriceerror").innerText = "";

    // Validate email
    var emailPattern = /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/;
    if (email === "") {
        document.getElementById("emailerror").innerText = "Email is required.";
        isValid = false;
    } else if (!emailPattern.test(email)) {
        document.getElementById("emailerror").innerText = "Invalid email format.";
        isValid = false;
    }

    // Validate food name
    if (fname === "") {
        document.getElementById("fnameerror").innerText = "Food name is required.";
        isValid = false;
    }

    // Validate quantity
    if (fquan === "") {
        document.getElementById("fquanerror").innerText = "Quantity is required.";
        isValid = false;
    } else if (isNaN(fquan) || fquan <= 0) {
        document.getElementById("fquanerror").innerText = "Quantity must be a positive number.";
        isValid = false;
    }

    // Validate price
    if (price === "") {
        document.getElementById("priceerror").innerText = "Price is required.";
        isValid = false;
    } else if (isNaN(price) || price <= 0) {
        document.getElementById("priceerror").innerText = "Price must be a positive number.";
        isValid = false;
    }

    // Validate total price
    if (tprice === "") {
        document.getElementById("tpriceerror").innerText = "Total price is required.";
        isValid = false;
    } else if (isNaN(tprice) || tprice <= 0) {
        document.getElementById("tpriceerror").innerText = "Total price must be a positive number.";
        isValid = false;
    }

    return isValid;
}

