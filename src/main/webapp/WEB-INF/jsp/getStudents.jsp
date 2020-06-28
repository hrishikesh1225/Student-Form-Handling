<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page session="false"%>
<html>
<head>
<title>Show Students</title>
</head>
<body>
	<jsp:include page="menu.jsp" />
	      
	<h3 style="color: red;">Show All Students</h3>
	<ul>
		<c:forEach var="listValue" items="${students}">
			<li>${listValue}</li>
		</c:forEach>
	</ul>
</body>
</html>