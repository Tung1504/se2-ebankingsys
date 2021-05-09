<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Login</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>
<body>

	<header>
		<nav class="navbar navbar-expand-md navbar-dark"
			style="background-color: gray">
			<div>
				<a href="#" class="navbar-brand"> E-Banking Application </a>
			</div>

			
		</nav>
	</header>
	<br>
	<div class="container col-md-5">
		<div class="card">
			<div class="card-body">
					<form action="login" method="post">
				<caption>
					<h2>
            			Login to the system
					</h2>
				</caption>

				
					<p class = 'text-danger'>${mess}</p>
					
				
				
				<fieldset class="form-group">
					<label>Phone Number</label> <input type="text"
						value="<c:out value='${user.phone}' />" class="form-control"
						name="phone" required="required">
				</fieldset>

				<fieldset class="form-group">
					<label>Password</label> <input type="password" id ="myInput"
						value="<c:out value='${user.password}' />" class="form-control"
						name="password">
				</fieldset>
				
				<fieldset class="form-group">
					<input type = "checkbox" onclick="myFunction()">  Show Password
				</fieldset>

				

				<button type="submit" class="btn btn-success">Login</button>
				</form>
			</div>
		</div>
	</div>



	<script>
		function myFunction() {
  		var x = document.getElementById("myInput");
  		if (x.type === "password") {
    		x.type = "text";
  		} else {
    		x.type = "password";
  			}
		}
</script>
</body>
</html>