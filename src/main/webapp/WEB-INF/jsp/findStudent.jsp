<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Find Student</title>
<jsp:include page="menu.jsp" />
<body>
	<h3 style="color: red;">Delete Student</h3>

	<div id="findStudent">
		<form:form action="/findStudent" method="get" modelAttribute="stu">
			<p>
				<label>Enter Student Id</label>
				<form:input path="USN" />
			</p>
			
		<input type="SUBMIT" value="Submit" />
		</form:form>
	<ul>
		<c:forEach var="listValue" items="${students}">
			<li>${listValue}</li>
		</c:forEach>
	</ul>
	</div>
</body>
</html>