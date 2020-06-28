<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Student</title>
<jsp:include page="menu.jsp" />
<body>
	<h3 style="color: red;">Add New Student</h3>

	<div id="addStudent">
		<form:form action="/addNewStudent" method="post" modelAttribute="stu">
			<p>
				<label>Enter Student Id</label>
				<form:input path="USN" />
			</p>
			<p>
				<label>Enter Full Name</label>
				<form:input path="Full_Name" />
			</p>
			<p>
				<label>Enter Father Name</label>
				<form:input path="Father_Name" />
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
				<label>Enter Join Date</label>
				<form:input path="Date_Join" />
			</p>
			<p>
				<label>Enter B_Date</label>
				<form:input path="B_date" />
			</p>
			<p>
				<label>Enter Admission Number</label>
				<form:input path="ADMNO" />
			</p>
			<p>
				<label>Enter Address</label>
				<form:input path="Address" />
			</p>
			<p>
				<label>Enter Branch</label>
				<form:input path="Branch" />
			</p>
			<input type="SUBMIT" value="Submit" />
		</form:form>
	</div>
</body>
</html>
