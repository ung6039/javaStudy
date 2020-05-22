<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="https://cdnjs.cloudflare.com/ajax/libs/react/0.14.0/react.js"></script> 
<script src="https://cdnjs.cloudflare.com/ajax/libs/react/0.14.0/react-dom.js"></script> 
<script src="https://cdnjs.cloudflare.com/ajax/libs/babel-core/5.8.23/browser.min.js"></script> 
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script> 
</head>
<body>
	<div id="root"></div>
	<!-- javascript version 6 -->
	<script type="text/babel">
		class MovieList extends React.Component{
			render(){
				return (
					<div className="row">
						<c:forEach var="vo" items="${list}">
							<div className="col-md-4">
								<div className="thumbnail">
									<a href="detail.do?mno=${vo.mno }"> 
										<img src="${vo.poster }"
									alt="Lights" style={{"width": "100%"}}/>
							<div className="caption">
								<p>${vo.title }</p>
							</div>
									</a>
							</div>
							</div>
						</c:forEach>
					</div>
				)
			}
		}
		ReactDOM.render(<MovieList />,document.getElementById('root'))
	</script>
</body>
</html>