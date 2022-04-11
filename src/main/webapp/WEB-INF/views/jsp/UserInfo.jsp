<%@ include file="jspf/header.jspf"%>
<title>User Info</title>
</head>
<body>
	<div class="body-spidy-container">
		<%@ include file="jspf/navigation/navigation.jspf"%>
		<div class="process-page">
			<div class="inner-page">
				<div class="admin-customer-page">
					<c:choose>
						<c:when test="${empty ticketBookingHistory}">
							<div class="flightDataAvailable">
								<p>Sorry No Booking Details Available</p>
							</div>
						</c:when>
						<c:otherwise>
							<table>
								<tr>
									<th>TicketId</th>
									<th>Booking Id</th>
									<th>Customer Id</th>
									<th>Email Id</th>
									<th>Phone Number</th>
									<th>PNR Number</th>
									<th>Oauth2 User Id</th>
									<th></th>
									<th></th>
								</tr>
								<c:forEach items="${ticketBookingHistory}" var="ticketBooking">
									<tr>
										<td>${ticketBooking.ticketId}</td>
										<td>${ticketBooking.bookingId}</td>
										<td>${ticketBooking.customerId}</td>
										<td>${ticketBooking.email}</td>
										<td>${ticketBooking.phoneNumber}</td>
										<td>${ticketBooking.pnrNumber}</td>
										<td>${ticketBooking.userEmail}</td>
										<td><a type="button" class="btn btn-danger btn-lg"
											href="/deletebooking?id=${ticketBooking.ticketId}">Delete</a></td>
										<td><a type="button" class="btn btn-primary btn-lg"
											href="/getticketbookingcustomerinfo?id=${ticketBooking.ticketId}">Travelers</a></td>
									</tr>

								</c:forEach>
							</table>
						</c:otherwise>
					</c:choose>
				</div>
			</div>
		</div>
	</div>
	<%@ include file="jspf/footer.jspf"%>
</body>
</html>