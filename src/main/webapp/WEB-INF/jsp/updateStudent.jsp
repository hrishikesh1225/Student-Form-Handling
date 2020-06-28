<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Student</title>
<jsp:include page="menu.jsp" />
<body>
	<h3 style="color: red;">Update Student Details</h3>

	<div id="updateStudent">
		<form:form action="/updateStudent" method="get" modelAttribute="stu2">
			<p>
				<label>Enter Student Id</label>
				<form:input path="USN" />
			</p>
			<p>
				<label>Enter Email</label>
				<form:input path="Email" />
			</p>
			<p>
				<label>Enter Phone</label>
				<form:input path="Phone" />
			</p>
			<p>
				<label>Enter Address</label>
				<form:input path="Address" />
			</p>
			<input type="SUBMIT" value="Submit" />
		</form:form>
	</div>
</body>
</html>