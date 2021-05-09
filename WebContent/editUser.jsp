<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>




<head>
<title>Edit User</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
	
	<jsp:include page="header.jsp"></jsp:include>
</head>
<body>
	
	<section
      style="max-width: 50%; margin: 20px auto; border: 1px solid #000000; border-radius: 3px; padding: 10px;">
      <h1 style="background-color: #9dd7ef; text-indent: 30px; margin: -10px; border: 1px solid #000000; line-height: 50px;">Edit User</h1>
      <form action="edit" method="post">
      
       <hr  width="90%" align="center" />        
        <p style="font-weight: bold" >Bank Detail</p>
        
        <p style="display: flex; justify-content: space-between;">
          <label>Type Of Account*</label>
          <select name="acc_type" id="acc_type" value="<c:out value='${user.acc_type}' /> " required>
            <option value="">---Select---</option>
            <option value="debit">Debit</option>
            <option value="credit">Credit</option>
            
          </select>
        </p>
  
        <p style="display: flex; justify-content: space-between;">
          <label>Balance*</label>
          <input type="text" id="amount" name="amount" value="<c:out value='${user.acc_amount}' /> "  required>
        </p>
        
        
        
		<hr  width="90%" align="center" />
        <p style="font-weight: bold">User detail</p>
        
        <p style="display: flex; justify-content: space-between;">
          <label>Role*</label>
          <select name="role" id="role" value="<c:out value='${user.role}' /> " required>
            <option value="">---Select---</option>
            <option value="admin">Admin</option>
            <option value="user">User</option>
            
          </select>
        </p>
        
        
        
		<hr  width="90%" align="center" />        
        <p style="font-weight: bold">Personal detail</p>
        
        
        <p style="display: flex; justify-content: space-between;">
          <label >Address*</label>
          <input type="add" id="add" name="add" placeholder=" Enter Your Address"  value="<c:out value='${user.address}' /> " required>
        </p>
		
		<p style="display: flex; justify-content: space-between;">
          <label >City*</label>
          <input type="text" id="city" name="city" placeholder="Enter City" value="<c:out value='${user.city}' />"  >
        </p>

        <p style="display: flex; justify-content: space-between;">
          <label >Nationality*</label>
          <input type="text" id="country" name="country" placeholder="Enter Nationality" value="<c:out value='${user.country}' /> " >
        </p>

		<p style="display: flex; justify-content: space-between;">
          <label >Zip Code*</label>
          <input type="text" id="zip" name="zip" placeholder="Enter Zip Code" value="<c:out value='${user.zip}' /> " >
        </p>
		


        <p style="text-align: center;">
          <input type="submit" value="Save"> or <input type="reset" value="Reset">
        </p>
      </form>
    </section>
	
	
	
</body>
</html>