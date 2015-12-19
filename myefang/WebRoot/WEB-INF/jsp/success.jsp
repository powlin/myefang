<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>登录成功</title>
		<SCRIPT type="text/javascript" src="js/jquery-1.8.3.min.js"></SCRIPT>
		<SCRIPT type="text/javascript" src="js/success.js"></SCRIPT>

		<link rel="stylesheet" href="css/success.css" type="text/css" />
	</head>

	<body>
		<div align="center" class="allDiv">
			<div class="titleDiv" align="right">
				<span class="userSpan"> 欢迎，${sessionScope.username} <a href="javascript:void(0)" id="logoutA" title="注销">注销</a> </span>
			</div>
			<div class="advertisementTopDiv">
				<canvas id="myCanvas" title="点击展开"></canvas>
			</div>
			<div class="advertisementDiv">
				<div class="advertisementMainDiv"></div>
				<div class="advertisementFontDiv">
					关 闭
				</div>
			</div>
			<div class="topDiv radiusNomal" title="易房网">
				<span class="topSpan"> 易 房 网 </span>
			</div>
			<div class="mainDivAll radiusNomal" align="left">
				<div class="leftDiv">
					<s:iterator value="menuList" id="menu">
						<div class="leftMenu">
							<input type="hidden" value="<s:property value='#menu.menulink'/>">
							<s:property value="#menu.menuname" />
						</div>
					</s:iterator>
				</div>
				<div class="mainDiv">
					<iframe class="mainIframe" src="myLocation!firstPage"></iframe>
				</div>
			</div>
			<div class="bottomDiv">
				<span class="bottomSpan"> ©<%=Calendar.getInstance().get(Calendar.YEAR)%>
					EFang <a href="javascript:void(0)" class="grayA">使用前必读</a>
					浙ICP证XXXXXX号 </span>
			</div>
			
			<div class="toolsDiv">
				<canvas id="contactCanvas"></canvas>
				<div class="toolsTipsDiv">
					<span>偷偷告诉你 
					<a href="javascript:void(0)">点击</a>
					可以切换哦</span>
				</div>
			</div>
			
			<div class="tipDiv radiusSmall">
				<div class="tipTitleDiv radiusSmall">
					<span class="tipTitleSpan">消息！</span>
					<span class="closeSpan radiusSmall">×</span>
				</div>
				<div>
					<div class="tipContentDiv">
						&nbsp;&nbsp;&nbsp;&nbsp;小二发送的消息在这里哦~
					</div>
					<div align="right">
						<label class="detailLabel">
							详情
						</label>
					</div>
				</div>
			</div>
		</div>
		<div class="allDiv hideDiv indexGTDiv" id="indexGTDiv" title="关闭"></div>
		<div class="hideDiv overDiv" id="overDiv"></div>
		<div class="lastDiv">
			<div align="right" class="lastClickDiv">
				<img id="lastImg" src="img/up_small.png"/>
			</div>
		</div>
	</body>
</html>
