<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>계산 결과</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

  <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</head>
<body>

<%
	int number1 = Integer.parseInt(request.getParameter("number1"));
	int number2 = Integer.parseInt(request.getParameter("number2"));
	
	String operatorString = request.getParameter("operator");
	
	// 더하기 빼기 곱하기 나누기 
	// plus, minus, muliple, divide
	double result = 0;
	String operator = "";
	if(operatorString.equals("plus")) {
		result = number1 + number2;
		
		operator = "+";
	} else if(operatorString.equals("minus")) {
		result = number1 - number2;
		operator = "-";
	} else if(operatorString.equals("multiple")) {
		result = number1 * number2;
		operator = "X";
	} else {
		result = number1 / (double)number2;
		operator = "/";
	}


%>
	<div class="container">
		<h1>계산결과</h1>
		<div class="display-4"><%= number1 %> <%= operator %> <%= number2 %> = <span class="text-primary"><%= result %></span></div>
	</div>
	

</body>
</html>