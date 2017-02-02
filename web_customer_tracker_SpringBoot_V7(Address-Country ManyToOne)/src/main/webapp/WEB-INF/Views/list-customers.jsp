<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>List Customers</title>
<!--Reference our style.css sheet  -->
<link type="text/css" rel="stylesheet" href="/static/css/style.css">
</head>
<body>
	<div class="wrapper">
		<div id="header">
			<h2>CRM- Customer Relationship Manager</h2>
		</div>
	</div>
	<div id="container">
		<div id="content">
			<!-- Put New button: add Customer -->
			<input type="button" value="Add Customer"
				onclick="window.location.href='showFormForAdd'; return flase;"
				class="add-button" />

			<!--add our the html table  -->
			<table>
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
					<th>Street</th>
					<th>City</th>
					<th>State</th>
					<th>Country</th>
					<th>PinCode</th>
					<th>Action</th>
				</tr>
				<!--Loop over and print Customer  -->
				<c:forEach var="tempCustomer" items="${customers}">

					<!--Construct an 'update' link with customer id  -->
					<c:url var="updatelink" value="/customer/showFormForUpdate">
						<c:param name="customerId" value="${tempCustomer.id}" />
					</c:url>

					<!--Construct an 'delete' link with customer id  -->
					<c:url var="deletelink" value="/customer/deleteCustomer">
						<c:param name="customerId" value="${tempCustomer.id}" />
					</c:url>

					<tr>
						<td>${tempCustomer.firstName}</td>
						<td>${tempCustomer.lastName}</td>
						<td>${tempCustomer.email}</td>
						<td>${tempCustomer.address.street}</td>
						<td>${tempCustomer.address.city}</td>
						<td>${tempCustomer.address.state}</td>
						<td>${tempCustomer.address.country}</td>
						<td>${tempCustomer.address.pincode}</td>

						<td>
							<!-- display the update link --> <a href="${updatelink}">Update</a>
							| <!-- display the delete link --> <a href="${deletelink}"
							onclick="if(!(confirm('Are you sure you want to delete this Customer?'))) return false">Delete</a>
						</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
</body>
</html>