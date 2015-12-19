<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
  <head>
  	<link rel="stylesheet" href="css/basic.css" type="text/css" />
  	<link rel="stylesheet" href="css/index.css" type="text/css" />
	<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
    <script type="text/javascript" src="js/index.js"></script>
    
  </head>
  
  <body>
  	<div id="loginDiv">
  		<div align="right">
  			<label class="fontLabel" id="registerLabel">
	  			注册&gt;
  			</label>
  		</div>
	    <div align="center">
  			<label class="title1Label">登  录</label>
  		</div>
	    <div class="bodyDiv">
		  	<s:form action="myUser!login" method="post" id="loginForm">
		  		<s:textfield name="username" id="username" label="用户名" onfocus="initCss(this)"></s:textfield><br>
		  		<s:password name="password" id="password" label="密     码" showPassword="true" onfocus="initCss(this)"></s:password>
		  	</s:form>
		  	<div class="btnDiv">
		  		<input type="button" value="登录" id="loginBtn" class="btn"/>&nbsp;&nbsp;&nbsp;
		  		<input type="button" value="取消" id="cancelBtn" class="btn"/>
		  	</div>
	  	</div>
  	</div>
  	<div id="registerDiv">
  		<div align="right">
  			<label class="fontLabel" id="loginLabel">
	  			登录&gt;
  			</label>
  		</div>
	    <div align="center">
  			<label class="title1Label">注  册</label>
  		</div>
	    <div class="bodyDiv">
		  	<s:form action="myUser!register" method="post" id="registerForm">
		  		<s:textfield name="usernameR" id="usernameR" label="用户名" onfocus="initCss(this)"></s:textfield><br>
		  		<s:password name="passwordR" id="passwordR" label="密     码" showPassword="true" onfocus="initCss(this)"></s:password>
		  		<s:password name="passwordRA" id="passwordRA" label="确认密码" showPassword="true" onfocus="initCss(this)"></s:password>
		  	</s:form>
		  	<div class="btnDiv">
		  		<input type="button" value="注册" id="registerBtn" class="btn"/>&nbsp;&nbsp;&nbsp;
		  		<input type="button" value="取消" id="cancelBtn" class="btn"/>
		  	</div>
	  	</div>
  	</div>
  </body>
</html>
