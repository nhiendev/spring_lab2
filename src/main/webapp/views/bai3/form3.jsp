<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%-- <%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/product/save" method="post">
		 <input name="name" type="text">
		 <input name="price" type="text">
		 <button>Save</button>
		</form>
		<ul>
		 <li>${sp.name}</li>
		 <li>${sp.price}</li>
		</ul>
</body>
</html>