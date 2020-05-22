<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<style type="text/css">
	.row{
		margin:0px auto;
		width :600px;
	}
</style>

</head>
<body>
	<div class="container">
		<h2 class="text-center">수정하기</h2>
		<div class="row">
			<form method=post action="update_ok.do">
				<table class="table table-hover">
					<tr>
						<th width=20% class="text-right success">이름</th>
						<td width=80%>
							<input type=text name=name size=15 value="#{vo.name}">
							<input type=hidden name=no value="#{vo.no }">
						</td>
					</tr>

					<tr>
						<th width=20% class="text-right success">제목</th>
						<td width=80%><input type=text name=subject size=50 value="#{vo.subject}">
						</td>
					</tr>
					<tr>
						<th width=20% class="text-right success">내용</th>
						<td width=80%>
							<textarea rows="8" cols="55" name=content >
								#{vo.content}
							</textarea>
						</td>
					</tr>
					<tr>
						<th width=20% class="text-right success">비밀번호</th>
						<td width=80%><input type="password" name=pwd size=10
							"></td>
					</tr>
					<tr>
						<td class="text-center" colspan="2">
						<input type="submit" value="수정" class="btn btn-sm btn-primary"> 
						<input type="button" value="취소" class="btn btn-sm btn-danger"
							onclick="javascript:history.back()">
						</td>
					</tr>
				</table>
			</form>
		</div>
	</div>
</body>
</html>