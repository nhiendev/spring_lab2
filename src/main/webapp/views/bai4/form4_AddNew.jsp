<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">	
<title>Product Bai 4</title>
			<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
			<script src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
</head>
<body>
			<div class="container col-8 mt-5">
			<form action="${pageContext.request.contextPath}/product/save4" >
				<input type="text" name="name"> <br>
				<input type="text" name="price">
				<button class="btn btn-danger" type="submit" formmethod="get">Save</button>
				<button class="btn btn-danger" type="submit" formmethod="get" formaction="${pageContext.request.contextPath}/product/form4">Back</button>
			</form>
    <div class="row col-md-12 col-md-offset-2 custyle mt-5">
    <table class="table table-striped custab border">
    <thead>
  

        <tr>
            <th>Name</th>
            <th>Product</th>
        
            <th class="text-center">Action</th>
        </tr>
    </thead>
		
    		<c:forEach var="items" items="${sp}">
            <tr>
                <td>${items.name}</td>          
              <td>${items.price}</td>    
                <td class="text-center"><a class='btn btn-info btn-xs' href="#"><span class="glyphicon glyphicon-edit"></span> Edit</a> <a href="#" class="btn btn-danger btn-xs"><span class="glyphicon glyphicon-remove"></span> Del</a></td>
            </tr>
		</c:forEach>
    </table>
    
    </div>
</div>
</body>
</html>