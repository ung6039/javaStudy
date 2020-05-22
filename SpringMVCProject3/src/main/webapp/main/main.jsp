<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

	<nav class="navbar navbar-inverse">
	  <div class="container-fluid">
	    <div class="navbar-header">
	      <a class="navbar-brand" href="../main/main.do">MovieCenter</a>
	    </div>
	    <ul class="nav navbar-nav">
	      <li class="active"><a href="../movie/list.do">상영영화</a></li>
	      <li><a href="../movie/shc.do">개봉 예정작</a></li>
	      <li><a href="../movie/box.do">박스 오피스</a></li>
	      <li><a href="../movie/news.do">영화 뉴스</a></li>
	    </ul>
	  </div>
	</nav>
  
	<div class="container">
	  	<jsp:include page="${main_jsp}"></jsp:include>
	</div>

</body>
</html>