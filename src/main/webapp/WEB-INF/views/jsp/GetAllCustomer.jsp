<%@ include file="jspf/header.jspf"%>
<title>All Customer</title>
</head>
<body>
	<div class="body-spidy-container">
		<%@ include file="jspf/navigation/navigation.jspf"%>
		<div class="process-page">
			<div class="inner-page">
				<div class="admin-customer-page">
				<c:url value="/getAllCustomer" var="pagedLink">
						<c:param name="p" value="~" />
					</c:url>
					<c:choose>
						<c:when test="${empty customerList}">
							<div class="flightDataAvailable">
								<p>Sorry No Customer Details Available</p>
							</div>
						</c:when>
						<c:otherwise>
							<table>
								<tr>
									<th>FirstName</th>
									<th>LastName</th>
									<th>UserName</th>
									<th>Email Id</th>
									<th>Phone Number</th>
									<th>Country</th>
									<th></th>
									<th></th>
								</tr>
								<c:forEach items="${customerList}" var="customer">
									<tr>
										<td>${customer.firstName}</td>
										<td>${customer.lastName}</td>
										<td>${customer.username}</td>
										<td>${customer.emailId}</td>
										<td>${customer.phoneNumber}</td>
										<td>${customer.country}</td>
										<td><a type="button" class="btn btn-success btn-lg"
											href="/updatecustomer?id=${customer.customerId}">Update</a></td>
										<td><a type="button" class="btn btn-danger btn-lg"
											href="/deletecustomer?id=${customer.customerId}">Delete</a></td>
									</tr>

								</c:forEach>
							</table>
						</c:otherwise>
					</c:choose>
					<br>
					<a href="${0}" class="btn btn-primary mx-1">First</a>
					<c:forEach var="i" begin="0" end="${lastPageNo-1}" >
						<a href="${i}" class="btn btn-primary mx-1">${i+1}</a>    	<!-- Displaying Page No -->
					</c:forEach>
					<a href="${lastPageNo-1}" class="btn btn-primary mx-1">Last</a>
					<br>
					<br>
					<a type="button" class="btn btn-primary btn-lg" href="/addcustomer">Add
						Customer</a>
				</div>
			</div>
		</div>
	</div>
	<%@ include file="jspf/footer.jspf"%>
</body>
</html>