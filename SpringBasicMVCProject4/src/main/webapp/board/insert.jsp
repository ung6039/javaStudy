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
<script type="text/javascript"
src=http://code.jquery.com/jquery.js></script>
<script type="text/javascript">
	// 	'<tr id="f'+(fileIndex)+'">'
	// ==> <tr id=f1>
	var fileIndex=0;
	$(function(){
		$('#addBtn').click(function(){
			$('#user-table').append(
				'<tr id="f'+(fileIndex)+'">'
				+'<td width=20%>파일'+(fileIndex+1)+'</td>'
				+'<td width=80%><input type=file name=files['+(fileIndex)+'] size=25>'
				+'</td></tr>'
			);
			fileIndex++;
		});
		$('#canBtn').click(function(){
			if(fileIndex>0){
				$('#f'+(fileIndex-1)).remove();
				fileIndex--;
			}
		});
		
	})
</script>
</head>
<body>
	<div class="container">
		<h2 class="text-center">글쓰기</h2>
		<div class="row">
			<form method=post action="insert_ok.do" enctype="multipart/form-data">
				<table class="table table-hover">
					<tr>
						<th width=20% class="text-right success">이름</th>
						<td width=80%><input type=text name=name size=15 required>
						</td>
					</tr>

					<tr>
						<th width=20% class="text-right success">제목</th>
						<td width=80%><input type=text name=subject size=50 required>
						</td>
					</tr>
					<tr>
						<th width=20% class="text-right success">내용</th>
						<td width=80%><textarea rows="8" cols="55" name=content
								required></textarea></td>
					</tr>
					
					<tr>
						<th width="20%" class="text-right success">
							첨부파일
						</th>
						<td width="80%">
							<table class="table">
								<tr>
									<td class="text-right">
										<input type=button value="추가" class="btn btn-xs btn-danger" id="addBtn">
										<input type=button value="취소" class="btn btn-xs btn-info" id="canBtn">
									</td>
								</tr>
							</table>
							<table class="table" id="user-table">
								
							</table>
						</td>
					</tr>
					
					<tr>
						<th width=20% class="text-right success">비밀번호</th>
						<td width=80%><input type="password" name=pwd size=10
							required></td>
					</tr>
					<tr>
						<td class="text-center" colspan="2">
						<input type="submit" value="글쓰기" class="btn btn-sm btn-primary"> 
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