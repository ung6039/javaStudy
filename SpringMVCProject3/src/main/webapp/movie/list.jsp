<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
	<body>
		<div class="row">
			<h1 class="text-center">${title }</h1>
			<c:forEach var="vo" items="${list}">
			<div class="col-md-4">
				<div class="thumbnail">
					<a href="detail.do?mno=${vo.mno }"> 
					<img src="${vo.poster }"
						alt="Lights" style="width: 100%">
						<div class="caption">
							<a href="movie/detail.do?no=${vo.mno }">
								<p>${vo.title }</p>
							</a>
						</div>
						</a>
					</div>
				</div>
			</c:forEach>
		</div>
		<div class="row text-center">
			<a href="../movie/list.do?page=${curpage>1?curpage-1:curpage }" class="btn btn-sm btn-primary">이전</a>
				${curpage } page ${totalpage } pages
			<a href="../movie/list.do?page=${curpage<totalpage?curpage+1:curpage }" class="btn btn-sm btn-primary">다음</a>
		</div>
</body>
</html>