$(document).ready(function(){
	//登录按钮
	$("#loginBtn").click(function(){
		var str=judgeEmpty();
		if(str!==''){
			changeCss(str);
		}else{
			$("#loginForm").submit();
		}
	});
	//注册按钮
	$("#registerBtn").click(function(){
		var str=judgeREmpty();
		if(str!==''){
			changeCss(str);
		}else{
			if(judgeRPassword()){
				$("#registerForm").submit();
			}else{
				changeCss("passwordR");
				changeCss("passwordRA");
			}
		}
	});
	//取消按钮
	$("#cancelBtn").click(function(){
		$("#username").val('');
		$("#password").val('');
	});
	//注册标签
	$("#registerLabel").click(function(){
		$("#registerDiv").show();
		$("#loginDiv").hide();
	});
	//登录标签
	$("#loginLabel").click(function(){
		$("#registerDiv").hide();
		$("#loginDiv").show();
	});
});
//判断是否为空  返回''表示都不为空
function judgeEmpty(){
	var str="username";
	if($("#"+str).val()===''){
		return str;
	}
	str="password";
	if($("#"+str).val()===''){
		return str;
	}
	return '';
}
//判断注册是否为空  返回''表示都不为空
function judgeREmpty(){
	var str="usernameR";
	if($("#"+str).val()===''){
		return str;
	}
	str="passwordR";
	if($("#"+str).val()===''){
		return str;
	}
	str="passwordRA";
	if($("#"+str).val()===''){
		return str;
	}
	return '';
}
//改变样式
function changeCss(str){
	$("#"+str).css({"border-color": "red"});
}
//初始化样式
function initCss(e){
	$(e).css({"border-color":"white"});
}
//判断密码框是否相同 true表示相同
function judgeRPassword(){
	var pas=$("#passwordR").val();
	var pasA=$("#passwordRA").val();
	if(pas==pasA){
		return true;
	}
	return false;
}