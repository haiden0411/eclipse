<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>测试ajax</title>
<script type="text/javascript" charset="utf-8">
	 function test() {
        var req;
		if (window.XMLHttpRequest) {
            req = new XMLHttpRequest();
		} else {
            req = new ActiveXObject("Msxml2.XMLHTTP");

		}
        req.open("get","testAjax","true");
        req.onreadystatechange = function(){
            if (4==req.readyState) {
                document.getElementById("div1").innerHTML = req.responseText;
            };
        }
        req.send(null);
	}
</script>
</head>
<body>
	<div id="div1"></div>
	<input type="button" value="测试" onclick="test()" />
</body>
</html>
