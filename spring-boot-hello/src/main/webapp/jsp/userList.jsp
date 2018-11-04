<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html> 
<html> 
<head> 
<meta charset="UTF-8"> 
<title>用户列表展示</title> 
</head> 
<body> 
 	<h3>用户列表展示</h3>
		<table border="1">
			<tr>
				<th>编号</th>
				<th>姓名</th>
				<th>年龄</th>
			</tr>
			<c:forEach items="${list}" var="user">
			<tr>
				<th>${user.id}</th>
				<th>${user.name}</th>
				<th>${user.age}</th>
			</tr>
			</c:forEach>	
		</table>
</body> 
</html> 