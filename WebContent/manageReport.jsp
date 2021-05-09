<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>




<head>
<title>Report Managements</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
	
	<jsp:include page="header.jsp"></jsp:include>
</head>
<body>
	
	<div class="row">
		<!-- <div class="alert alert-success" *ngIf='message'>{{message}}</div> -->

		<div class="container">
			<h3 class="head3">List of Reports</h3>
			<hr>
			
			<br>
			<table class="table table-bordered">
				<thead>
					<tr>
						<th>ID</th>
						<th>From Account</th>
						<th>Benificial Account</th>
						<th>Context</th>
						<th>Amount</th>
						
					</tr>
				</thead>
				<tbody>
				
					<c:forEach var="report" items="${listReport}">

						<tr>
							<td><c:out value="${report.id}" /></td>
							<td><c:out value="${report.f_acc}" /></td>
							<td><c:out value="${report.t_acc}" /></td>
							<td><c:out value="${report.context}" /></td>
							<td><c:out value="${report.amount}" /></td>
							
							
						</tr>
					</c:forEach>
		
				</tbody>

			</table>
		</div>
	</div>
	
	

</body>
</html>