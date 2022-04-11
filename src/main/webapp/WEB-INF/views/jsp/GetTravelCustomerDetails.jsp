<%@ include file="jspf/header.jspf"%>
<title>Traveling Customers</title>
</head>
<body>
	<div class="body-spidy-container">
		<%@ include file="jspf/navigation/navigation.jspf"%>
		<div class="process-page">
			<div class="inner-page">
				<div class="admin-customer-page">
					<c:choose>
						<c:when test="${empty ticketBookingDetailstraveler}">
							<div class="flightDataAvailable">
								<p>Sorry No User Available</p>
							</div>
						</c:when>
						<c:otherwise>
							<table>
								<tr>
									<th>Id</th>
									<th>First Name</th>
									<th>Last Name</th>
									<th>Gender</th>
									<th>Seat Number</th>
									<th>Check In</th>
									<th>Cabin</th>


								</tr>
								<c:forEach items="${ticketBookingDetailstraveler}"
									var="travelCustomer">
									<tr>
										<td>${travelCustomer.travelCustomerId}</td>
										<td>${travelCustomer.firstName}</td>
										<td>${travelCustomer.lastName}</td>
										<td>${travelCustomer.gender}</td>
										<td>${travelCustomer.seatNumber}</td>
										<td>${travelCustomer.cabin}</td>
										<td>${travelCustomer.checkIn}</td>

									</tr>

								</c:forEach>
							</table>
						</c:otherwise>
					</c:choose>
				</div>
				<br />
				<c:choose>
					<c:when test="${role}">
						<a type="button" class="btn btn-primary btn-lg"
							href="/getallticketbooking">Click Here To Go Back</a>
					</c:when>
					<c:otherwise>
						<a type="button" class="btn btn-primary btn-lg"
							href="/userinfo">Click Here To Go Back</a>
					</c:otherwise>
				</c:choose>

			</div>
		</div>
	</div>
	<%@ include file="jspf/footer.jspf"%>
</body>
</html>