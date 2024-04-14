<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
	
	<style>

#box{
background : lightblue;
margin : 50px auto;
width : 40%;
text-align : center;
border-radius : 10px;
}


body {
	background-color: lightgreen;
	color:red ;
	font-weight:bold;
	font-family: arial;
	font-size: 22px;
	border: 2px solid green;
	padding:30px;
	margin-left:70px;
}
</style>
</head>
<body>
	<c:set var="emp" value="${emp}"></c:set>
	
	
	<div class="container">
		<div class="row">
			<div class="col-md-3"></div>
			<div class="col-md-6">

				<h1>Registration Form</h1>
				<br>
				<br>
			
				<form  action="/sandip_project/update" method="post" >
				 <h2>Registration Form</h2>
                <div class="form-group">
                    <label for="firstName" class="col-sm-3 control-label">Full Name</label>
                    <div class="col-sm-9">
                        <input type="text" id="firstName" name="fullname" placeholder="Full Name" class="form-control" autofocus>
                       
                    </div>
                </div>
                <div class="form-group">
                    <label for="email" class="col-sm-3 control-label">Email</label>
                    <div class="col-sm-9">
                        <input type="text" id="email" name="email" placeholder="Email" class="form-control">
                    </div>
                </div>
                <div class="form-group">
                    <label for="password" class="col-sm-3 control-label">Password</label>
                    <div class="col-sm-9">
                        <input type="password" name="password" id="password" placeholder="Password" class="form-control">
                    </div>
                </div>
                 <div class="form-group">
                    <label for="phone" class="col-sm-3 control-label">Phone</label>
                    <div class="col-sm-9">
					<select id="phone" name="phone" class="form-control">
                          <option>Select PhoneNo</option>
							<option>534432</option>
							<option>8834324323</option>
							<option>8732478443</option>
							<option>9032432134</option>
							<option>7834342344</option>
                        </select>                   
                      </div>
                </div>
                 <div class="form-group">
                    <label for="address" class="col-sm-3 control-label">Address</label>
                    <div class="col-sm-9">
                        <input type="text" id="address" name="address" placeholder="Address" class="form-control">
                    </div>
                </div>
                <div class="form-group">
                    <label for="birthDate" class="col-sm-3 control-label">Date of Birth</label>
                    <div class="col-sm-9">
                        <input type="date" id="birthDate" name="dob" class="form-control">
                    </div>
                </div>
               
                <div class="form-group">
                    <label class="control-label col-sm-3">Gender</label>
                    <div class="col-sm-6">
                        <div class="row">
                            <div class="col-sm-4">
                                <label class="radio-inline">
                                    <input type="radio" id="femaleRadio"  name="gender" value="Female">Female
                                </label>
                            </div>
                            <div class="col-sm-4">
                                <label class="radio-inline">
                                    <input type="radio" id="maleRadio"  name="gender" value="Male">Male
                                </label>
                            </div>
                            
                        </div>
                    </div>
                </div>
                 <div class="form-group">
                    <label for="city"  class="col-sm-3 control-label">City</label>
                    <div class="col-sm-9">
                        <select id="city" name="city" class="form-control">
                          <option>Select city</option>
							<option>Nagpur</option>
							<option>Pune</option>
							<option>Nashik</option>
							<option>Hyderabad</option>
							<option>Mumbai</option>
                        </select>
                    </div>
                </div> 
                <div class="form-group">
                    <label for="state" class="col-sm-3 control-label">State</label>
                    <div class="col-sm-9">
                        <select id="state" name="state"class="form-control">
                          <option>Select state</option>
							<option>Maharashtra</option>
							<option>Gujarat</option>
							<option>Rajastan</option>
							<option>Kerla</option>
							<option>UttarPradesh</option>
                        </select>
                    </div>
                </div> 
                
               
                <div class="form-group">
                    <div class="col-sm-9 col-sm-offset-3">
						<button type="submit">Register</button>                    
                    </div>
                </div>
						</form>
					
					<div class="col-md-3"></div>
			</div>
		</div>
	</div>
		
		<!-- Optional JavaScript -->
		<!-- jQuery first, then Popper.js, then Bootstrap JS -->
		<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
			integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
			crossorigin="anonymous"></script>
		<script
			src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
			integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
			crossorigin="anonymous"></script>
		<script
			src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
			integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
			crossorigin="anonymous"></script>
</body>
</html>