<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<style type="text/css">
	.row {
		margin:0px auto;
		width :300px;
	}
	h1{
		text-align: center;
	}
</style>
</head>
<body>
	<div class="container">
		<h1>삭.제.하.기</h1>
		<div class="row">
			<form method="post" action="delete_ok.do">
				<table class="table">
					<tr>
						<td width="30%" class="text-right">
							비밀번호
						</td>
						<td width="70%">
							<input type="password" name=pwd size=15>
							<input type="hidden" name="no" value="${no }">
						</td>
					</tr>
					
					<tr>
						<td colspan="2" class="text-center">
							<button class="btn btn-sm btn-danger">삭제</button>
							<input type="button" value="취소" onclick="javascript:history.back()">
						</td>
					</tr>
					
				</table>
			</form>
		</div>
	</div>
</body>
</html>