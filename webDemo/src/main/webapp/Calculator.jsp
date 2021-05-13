<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
       
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Result</h1>
    <form action="/Calculator"  modelAttribute="authentification"  th:action="@{/Calculator}"    method="POST">
		<div class="form-group">
		<label for="name">Please Enter 1st Number</label>
			<input type="text" id="num1" name="num1" required="required">		
		</div>
		
		<div class="form-group">
		<label for="name">Please Enter 2nd Number</label>
			<input type="text" id="num2" name="num2" required="required">		
		</div>
		
		<button type="submit" class="btn btn-primary">Addition</button>
		
	</form>
			<h3>Addition of two number is ${addition}</h3>
</body>
</html>