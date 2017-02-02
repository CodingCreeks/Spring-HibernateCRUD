<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<title>Save Customer</title>
<link type="text/css" rel="stylesheet" href="/static/css/style.css">
<link type="text/css" rel="stylesheet" href="/static/css/add-customer-style.css">
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h2>CRM- Customer Relationship Manager</h2>
		</div>
	</div>

	<div id="container">
		<h3>Save Customer</h3>
		<form:form action="saveCustomer" modelAttribute="customer"
			method="POST">

			<!--need to associate this data with customer id  -->
			<form:hidden path="id" />
			<form:hidden path="address.id" />

			<table>
				<tbody>
					<tr>
						<td><label>First Name : </label></td>
						<td><form:input path="firstName" /></td>
					</tr>
					<tr>
						<td><label>Last Name : </label></td>
						<td><form:input path="lastName" /></td>
					</tr>
					<tr>
						<td><label>Email : </label></td>
						<td><form:input path="email" /></td>
					</tr>
					<tr>
						<td><label>Street : </label></td>
						<td><form:input path="address.street" /></td>
					</tr>
					<tr>
						<td><label>City : </label></td>
						<td><form:input path="address.city" /></td>
					</tr>
					<tr>
						<td><label>State : </label></td>
						<td><form:input path="address.state" /></td>
					</tr>
					<tr>
						<td><label>Country : </label></td>
						<td><form:input path="address.country.country" /></td>
					</tr>
					<tr>
						<td><label>PinCode : </label></td>
						<td><form:input path="address.pincode" /></td>
					</tr>
					<tr>
						<td><label></label></td>
						<td><input type="submit" value="submit" class="save" /></td>
					</tr>
				</tbody>
			</table>
		</form:form>

		<div style=""></div>
		<p>
			<a href="${pageContext.request.contextPath}/customer/list">Back	to List</a>
		</p>
	</div>
</body>
</html>