<%@ include file="jspf/header.jspf"%>
<title>Flight Ticket Booking Details</title>
</head>
<body>
		<div class="body-spidy-container">
			<%@ include file="jspf/navigation/navigation.jspf"%>
			<div class="process-page">
				<div class="inner-page">
					<div class="admin-customer-page">
					<div class="small-3 columns">
					<h3 class="container-pass-details"> Passengers On Flight ${flightId} </h3> <br />
	      </div>

						<c:choose>
						<c:when test="${empty travelCustomerList}">
							<div class="flightDataAvailable">
								<p>Sorry No Details Available</p>
							</div>
						</c:when>
						<c:otherwise>
							<table>
								<tr>
									<th>Travel Customer Id</th>
									<th>Ticket Id</th>
									<th>First Name</th>
									<th>Last Name</th>
									<th>Gender</th>
									<th>Seat Number</th>
									<th>Check In</th>
									<th>Cabin</th>


								</tr>
								<c:forEach items="${travelCustomerList}"
									var="travelCustomer">
									<tr>
										<td>${travelCustomer.travelCustomerId}</td>
										<td>${travelCustomer.ticket.ticketId}</td>
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
					<br />
					<a type="button" class="btn btn-primary btn-lg"
							href="/getallticketbooking">Click Here To Go Back</a>
					
				</div>
			</div>
		</div>
	</div>
	<%@ include file="jspf/footer.jspf"%>
</body>
</html>