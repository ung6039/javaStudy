<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<h2>내용보기</h2>
		<div class="row">
			<table class="table table-hover">
				<tr>
					<th width=20% class="text-center success">번호</th>
					<td width=30% class="text-center">${vo.getNo() }</td>
					<th width=20% class="text-center success">작성일</th>
					<td width=30% class="text-center"><fmt:formatDate value="${vo.regdate }" pattern="yyyy-MM-dd"/> </td>
				</tr>
				<tr>
					<th width=20% class="text-center success">이름</th>
					<td width=30% class="text-center">${vo.name }</td>
					<th width=20% class="text-center success">조회수</th>
					<td width=30% class="text-center">${vo.hit }</td>
				</tr>
				<tr>
					<th width=20% class="text-center success">제목</th>
					<td colspan="3" class="text-left">${vo.subject }</td>
				</tr>
				<tr>
					<td class="text-left" colspan="4" valign="top" height="200">${vo.content }</td>
				</tr>

				<tr>
					<td class="text-right" colspan="4">
					<a href="update.do?no=${vo.no}" class="btn btn-xs btn-success">수정</a>
						<a href="delete.do?no=${vo.no }" class="btn btn-xs btn-info">삭제</a> 
						<a href="list.do" class="btn btn-xs btn-danger">목록</a>
						</td>
				</tr>
			</table>
		</div>
	</div>

</body>
</html>