<html>

	<title>用户列表展示</title>
	<meta chartset="utf-8" />
	<body>
		<h3>用户列表展示</h3>
		<table>
			<tr>
				<th>编号</th>
				<th>姓名</th>
				<th>年龄</th>
			</tr>
			<#list list as user>
			<tr>
				<th>${user.id}</th>
				<th>${user.name}</th>
				<th>${user.age}</th>
			</tr>	
		   </#list>
		</table>
	</body>
</html>