function check_login(){
	var pass = $("#password").val();
    var email = $("#email").val();
	
	if(email!="" && pass!="" ){
		var reg = new RegExp("^[a-z0-9]+([._\\-]*[a-z0-9])*@([a-z0-9]+[-a-z0-9]*[a-z0-9]+.){1,63}[a-z0-9]+$");
		if(!reg.test(email)){
			alert("Invalid email address");
		}else{
			var uid = "test@qq.com";
			var upass = "testtest";
			
			if(uid == email && upass==pass){
				alert("success��");
				window.open("hall.html")
			}
		}
		/*�ж�1 �� ����������������ж���������������Ƿ����*/
	 }
	 else{
		 alert("Wrong input, please enter again!");
	 }
}