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
		<h1 class="text-center">영화 뉴스</h1>
		<table class="table">
			<tr>
				<td>
					<c:forEach var="vo" items="${list }">
						<table class="table">
							<tr>
								<td rowspan="3" width="30%">
									<img src="${vo.poster }" width="100%"/>
								</td>
								<td width="70%">
									<a href="${vo.link }" target="blank">
									<b>${vo.title }</b>
									</a>
								</td>
							</tr>
							<tr>
								<td width="70%">${vo.content }</td>
							</tr>
							<tr>
								<td width="70%">${vo.author }</td>
							</tr>
						</table>
					</c:forEach>
				</td>
			</tr>
		</table>
	</div>
	
</body>
</html>