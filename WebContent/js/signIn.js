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
				alert("success！");
				window.open("hall.html")
			}
		}
		/*判断1 ： 像服务器发送请求，判断输入的邮箱密码是否成立*/
	 }
	 else{
		 alert("Wrong input, please enter again!");
	 }
}