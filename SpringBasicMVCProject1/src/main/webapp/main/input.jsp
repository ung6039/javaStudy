<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<form method="post" action="output2.do">
			이름 : <input type="text" name=name size=15><br> 
			성별 : <input type="radio" value="남자" name=sex checked>남자 
			<input  type="radio" value="여자" name=sex>여자<br>
			 주소 : <input type="text" name="addr" size=15><br>
			 전화 : <input type="text" name="tel" size=25><br /> 
			 소개 : <textarea rows="2" cols="30" name=content></textarea><br> 
			<input type="submit" value="click">
		</form>
	</center>
</body>
</html>