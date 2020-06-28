<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Delete Student</title>
<jsp:include page="menu.jsp" />
<body>
	<h3 style="color: red;">Delete Student</h3>

	<div id="deleteStudent">
		<form:form action="/deleteStudent" method="get" modelAttribute="stu1">
			<p>
				<label>Enter Student Id</label>
				<form:input path="USN" />
			</p>
			
		<input type="SUBMIT" value="Submit" />
		</form:form>
	</div>
</body>
</html>