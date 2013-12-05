<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<script LANGUAGE="javascript">     
	
function printReview() {
	window.open('http:\/\/localhost:8080\/PdfPrintWeb\/MyServlet', 'newwindow', 'height=600,width=600,top=0,left=0,toolbar=no,menubar=no,scrollbars=no,resizable=no,location=no, status=no');
}
</script>
<body>



  
  <h2>Hello World!</h2>
	<br>
	<a href="http://localhost:8080/PdfPrintWeb/MyServlet">Print Review</a>
	<input type="button" value="Print Review" onclick="printReview();"></input>
</body>
</html>