<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="gbk"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script>
		function createAjaxObj(){
			var req;
			if(window.XMLHttpRequest){
				req = new XMLHttpRequest();
			}else{
				req = new ActiveXObject("Msxml2.XMLHTTP");  //ie
			}
			return req;
		}
		
		function sendAjaxReq(){
			var req = createAjaxObj();
			req.open("get","myajax.do?method=test1&uname=уехЩ");
			req.setRequestHeader("accept","application/json"); 
			req.onreadystatechange  = function(){
				eval("var result="+req.responseText);
				document.getElementById("div1").innerHTML=result[0].userName
				document.getElementById("div2").innerHTML=result[1].userName;
			}
			req.send(null);
		}
	</script>
</head>

<body onload="sendAjaxReq()">
</body>
    <div id="div1"></div>
    <div id="div2"></div>
</html>