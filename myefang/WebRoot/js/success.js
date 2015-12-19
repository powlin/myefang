var oldcss=20, 
	moveFlag, 
	clickLabelColor="#84C1FF",
	normalLabelColor="white",
	winWid, winHei, overDivWid=400, overDivHei=300,
	sLeft, sTop, oldHei=180;
$(document).ready(function(){
	init();//初始化数据
	//注销
	$("#logoutA").click(function(){
		if(confirm("是否确认退出？")){
			location.href="myUser!logout";
		}else{
			return;
		}
	});
	//点击导航栏
	$("div.leftMenu").click(function(){
		$("div.leftMenu").css({"background-color":normalLabelColor});
		$(this).css({"background-color":clickLabelColor});
		$("iframe.mainIframe").attr("src", $(this).children("input").val());
	});
	//鼠标悬停导航栏标签上
//	$("div.leftMenu").hover(function(){
//		var selector=$(this);
//		var shift=0;
//		moveFlag=0;
//		setInterval(function(){
//			if(moveFlag===0){
//				$(selector).css({"margin-top":oldcss+3*Math.sin(shift)+"px"});
//				shift=shift+Math.PI/2;
//			}else{
//				return false;
//			}
//		},100);
//	}, function(){
//		$(this).css({"margin-top":oldcss+"px"});
//		moveFlag=1;
//	});
	//点击广告框上的关闭
	$("div.advertisementFontDiv").click(function(){
		$(this).hide();
		var par=$(this).parent();
		var heig=$(par).height();
		oldHei=heig;
		var time=setInterval(function(){
			if(parseInt(heig)<=0){
				$(par).height(oldHei);
				$(par).hide();
				clearInterval(time);//取消
			}else{
				heig=heig-5;
				$(par).height(heig);
			}
		},20);
	});
	//点击广告头部div
	$("div.advertisementTopDiv").click(function(){
		$("div.advertisementDiv").show();
		$("div.advertisementFontDiv").show();
	});
	//点击“使用前必读”
	$(".grayA").click(function(){
		sLeft=document.body.scrollLeft+document.documentElement.scrollLeft;
		sTop=document.body.scrollTop+document.documentElement.scrollTop;
		$(".indexGTDiv").width($(document).width()+sLeft+"px");
		$(".indexGTDiv").height($(document).height()+sTop+"px");
		$("#indexGTDiv").show();
		var myWid=(winWid-overDivWid)/2;
		var myHei=(winHei-overDivHei)/2;
		$("#overDiv").css({"width":overDivWid+"px","heigth":overDivHei+"px","top":myHei+"px","left":myWid+"px","background-color":"white"});
		$("#overDiv").show();
	});
	//点击遮罩层
	$("#indexGTDiv").click(function(){
		$("#indexGTDiv").hide();
		$("#overDiv").hide();
	});
	//点击提示框的关闭
	$(".closeSpan").click(function(){
		var tip=$(this).parent().parent();
		var hei=$(tip).height();
		oldHei=hei;
		var time=setInterval(function(){
			if(parseInt(hei)<=0){
				$(tip).height(oldHei).hide();
				clearInterval(time);//取消interval
			}else{
				hei=hei-5;
				$(tip).height(hei);
			}
		},20);
	});
	
	$("#lastImg").click(function(){
		var dis=$("div.tipDiv").css("display");
		if(dis==="none"){
			$(this).attr("src","img/up_small.png");
			tipDivUp();
		}else{
			$(".closeSpan").click();
			$(this).attr("src","img/down_small.png");
		}
	});
	//
	$("div.toolsDiv").hover(function(){
		$(this).css({"background-color":"#9D9D9D"});
		$("div.toolsTipsDiv").show();
	},function(){
		$(this).css({"background-color":"#BEBEBE"});
		$("div.toolsTipsDiv").hide();
	});
	//改变topDiv中的文字样式，最好做成gif格式的...
	var op=0;
	setInterval(function(){
		if(parseInt(op)<1){
			$(".topSpan").css("-webkit-mask-image","-webkit-gradient(linear, left top, left bottom, from(rgba(0,0,0,"+op+")), to(rgba(0,0,0,"+(1-op)+")))");
			op=op+0.1;
		}
		if(parseInt(op)>=1){
			op=0;
		}
	},90);
});

var first_x1=30,first_x2=80,first_x3=130,
	first_y1=32,first_y2=0,first_y3=32,
	arc_x=80,arc_y=4,arc_r=4,
	rect_x1=10,rect_x2=10,rect_x3=150,rect_x4=150,
	rect_y1=32,rect_y2=100,rect_y3=100,rect_y4=32,
	flag=1;//方向
//初始化数据
function init(){
	$("div.leftMenu").first().css({"background-color":clickLabelColor});
	winWid=$(document).width();
	winHei=$(document).height();
	drawMyAdver();
	tipDivUp();
	var ctx=document.getElementById("contactCanvas").getContext('2d');
	ctx.width="160px";
	ctx.height="160px";
	setInterval(function(){
		drawContact(ctx);
		//动画效果
		if(flag===1){
			first_x1=first_x1+2;
			first_y1=first_y1+4;
			first_x3=first_x3+2;
			first_y3=first_y3-4;
			rect_x1=rect_x1+3;
			rect_y1=rect_y1+6;
			rect_x2=rect_x2+6;
			rect_y2=rect_y2+6;
			rect_x3=rect_x3+9;
			rect_y3=rect_y3-6;
			rect_x4=rect_x4+6;
			rect_y4=rect_y4-6;
		}else if(parseInt(first_x1)>=30){
			first_x1=first_x1-2;
			first_y1=first_y1-4;
			first_x3=first_x3-2;
			first_y3=first_y3+4;
			rect_x1=rect_x1-3;
			rect_y1=rect_y1-6;
			rect_x2=rect_x2-6;
			rect_y2=rect_y2-6;
			rect_x3=rect_x3-9;
			rect_y3=rect_y3+6;
			rect_x4=rect_x4-6;
			rect_y4=rect_y4+6;
		}
		if(parseInt(first_x1)>=32||parseInt(first_x1)<=28){
			flag=-flag;
		}
	},600);
}
function drawMyAdver(){
	var ctx=document.getElementById("myCanvas").getContext('2d');
	ctx.width="127px";
	ctx.height="28px";
	ctx.beginPath();
	var color="#FFFF37";
	ctx.strokeStyle=color;
	ctx.moveTo(0, 27);
	ctx.lineTo(63.5,0);
	ctx.lineTo(127,27);
	ctx.closePath();
	ctx.stroke();
	
	ctx.beginPath();
	ctx.arc(63.5,5,4,0,Math.PI*2,true);
	ctx.closePath();
	ctx.fill();
}
function drawContact(ctx){
	ctx.clearRect(0,0,160,190);//清除矩形
	ctx.beginPath();
	var color="#FFFF37";
	ctx.strokeStyle=color;
	ctx.moveTo(first_x1, first_y1);
	ctx.lineTo(first_x2,first_y2);
	ctx.lineTo(first_x3,first_y3);
	ctx.closePath();
	ctx.stroke();
	
	color="black";
	ctx.fillStyle=color;
	ctx.beginPath();
	ctx.arc(arc_x,arc_y,arc_r,0,Math.PI*2,true);
	ctx.closePath();
	ctx.fill();
	
	color="#BB5E00";
	ctx.strokeStyle=color;
	ctx.fillStyle=color;
	ctx.beginPath();
	ctx.lineTo(rect_x1, rect_y1);
	ctx.lineTo(rect_x2, rect_y2);
	ctx.lineTo(rect_x3, rect_y3);
	ctx.lineTo(rect_x4, rect_y4);
	ctx.closePath();
	ctx.stroke();
	
	color="#FF0000";
	ctx.fillStyle=color;
	var txt = "联 系 我 们"; 
	ctx.font = "bold 20px 幼圆";
	ctx.fillText(txt, 20, 70); 
}
function tipDivUp(){
	var tip=$("div.tipDiv");
	var hei=0;
	var time=setInterval(function(){
		if(parseInt(hei)>=parseInt(oldHei)){
			clearInterval(time);//取消interval
		}else{
			hei=hei+5;
			$(tip).height(hei).show();
		}
	},20);
}