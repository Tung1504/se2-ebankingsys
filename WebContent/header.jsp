<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>




<head>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
	
<style>
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

.head3{
	margin-top: 50px;
	text-align: center;
}


</style>	
	
	
	
</head>
<body>

	<header>
		<nav class="navbar navbar-expand-md navbar-dark" 
			style="background-color: gray">
			
			
			
			
			<div>
				<a href="login.jsp" class="navbar-brand"> E-Banking Application </a>
			</div>
			
			<div class = "dropdown">
				<div style="margin-right: 0px;">
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
				<li><a href="<%=request.getContextPath()%>/balance" class="nav-link">Account Balance</a></li>
			</ul>
			
			<ul class="navbar-nav">
				<li><a href="transfer.jsp" class="nav-link">Fund Transaction</a></li>
			</ul>
			
					
			
			
			
			
			<ul class="navbar-nav">
				<c:if test="${sessionScope.acc.role == 'admin'}">
					<li><a href="<%=request.getContextPath()%>/list" class="nav-link">Manage Account</a></li>
				</c:if>
			</ul>
			
			<ul class="navbar-nav">
				<c:if test="${sessionScope.acc.role == 'admin'}">
					<li><a href="manageReport.jsp" class="nav-link">Manage Reports</a></li>
				</c:if>
			</ul>
			
			<ul class="navbar-nav">
				<c:if test="${sessionScope.acc.role == 'admin'}">
					<li><a href="addUser.jsp" class="nav-link">Add Account</a></li>
				</c:if>
			</ul>
			
			
		
			
			
		</nav>
	</header>
</body>
</html>