<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/ctrl/ok" method="post">
		 <button>OK 1</button>
		 <button formmethod="get">OK 2</button>
		 <button formaction="/ctrl/ok?x">OK 3</button>
 	</form>
 		<h2>${method}</h2>
</body>
</html>