<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>




<head>
<title>User Management</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
	
<style>
.dropdown {
  position: relative;
  display: inline-block;
}

.dropdown-content {
  display: none;
  position: absolute;
  background-color: #808080;
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  padding: 12px 16px;
  z-index: 1;
}

.dropdown:hover .dropdown-content {
  display: block;
}

table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 50%;
  margin-left: 40px;
  margin-top: 40px;
  margin-right: 40px;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #dddddd;
}


.head3{
	margin-top: 50px;
	text-align: center;
}

.prof{
	margin-right: 10px;
	align-content: right;
}

</style>	
	
	
	
</head>
<body>

	<header>
		<nav class="navbar navbar-expand-md navbar-dark" 
			style="background-color: gray">
			
			
			
			<div>
				<a href="#" class="navbar-brand"> E-Banking Application </a>
			</div>
			
			<div class = "dropdown">
				<div class = "prof">
					<c:if test="${sessionScope.acc != null }">
						<span class="navbar-nav">
							<a href="#" class="nav-link">Hello ${sessionScope.acc.name} !</a>
						</span>
			
						<div class = "dropdown-content">
							<p class="navbar-nav"><a href="logout" class="nav-link">Logout</a></p>
							
						</div>
					</c:if>
					
				</div>
			</div>
			
			
			
			<ul class="navbar-nav">
				<li><a href="balance" class="nav-link">Account Balance</a></li>
			</ul>
			
			<ul class="navbar-nav">
				<li><a href="trans" class="nav-link">Fund Transaction</a></li>
			</ul>
			
			<ul class="navbar-nav">
				<li><a href="detailReport" class="nav-link">Report</a></li>
			</ul>
					
			
			
			
			
			<ul class="navbar-nav">
				<c:if test="${sessionScope.acc.role == 'admin'}">
					<li><a href="<%=request.getContextPath()%>/list" class="nav-link">Manage Users</a></li>
				</c:if>
			</ul>
			
			<ul class="navbar-nav">
				<c:if test="${sessionScope.acc.role == 'admin'}">
					<li><a href="<%=request.getContextPath()%>/report" class="nav-link">Manage Reports</a></li>
				</c:if>
			</ul>
			
			<ul class="navbar-nav">
				<c:if test="${sessionScope.acc.role == 'admin'}">
					<li><a href="new" class="nav-link">Add Users</a></li>
				</c:if>
			</ul>
			
			
			
		
			
			
		</nav>
	</header>
	
	<div class="row">
		<!-- <div class="alert alert-success" *ngIf='message'>{{message}}</div> -->

		<div class="container">
			<h3 class="head3" >Fund Transaction</h3>
			<hr>
			
			<p style="display: flex; justify-content: space-between;">
          		<label >Transfer money to account</label>
          		<input type="add" id="add" name="add" placeholder=" Enter Your Address"  value="<c:out value='${user.address}' /> " required>
        	</p>
			
			
	

</body>
</html>