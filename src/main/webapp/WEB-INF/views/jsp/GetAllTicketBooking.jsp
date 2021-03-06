<%@ include file="jspf/header.jspf"%>
<title>All Ticket Booking Details</title>
</head>
<body>
	<div class="body-spidy-container">
		<%@ include file="jspf/navigation/navigation.jspf"%>
		<div class="process-page">
			<div class="inner-page">
				<div class="admin-customer-page">
					<div class="small-3 columns">
						<form action="/getallticketbooking" method="post">
						<label>Enter Flight Id</label>&nbsp;
							<input type="number" id="txt" name="flightId"> <input
								type="submit" class="btn btn-primary btn-lg mx-5"
								value="Search Bookings" />
						</form>
					</div>
					<p />

					<c:choose>
						<c:when test="${empty ticketBookingDetails}">
							<div class="flightDataAvailable">
								<p>Sorry No Booking Details Available</p>
							</div>
						</c:when>

						<c:otherwise>
							<table>
								<tr>
									<th>Ticket Id</th>
									<th>Booking Id</th>
									<th>Customer Id</th>
									<th>Email</th>
									<th>Phone Number</th>
									<th>PNR Number</th>
									<th>Flight Id</th>
									<th></th>
									<th></th>
								</tr>
								<c:forEach items="${ticketBookingDetails}" var="ticketBooking">
									<tr>
										<td>${ticketBooking.ticketId}</td>
										<td>${ticketBooking.bookingId}</td>
										<td>${ticketBooking.customerId}</td>
										<td>${ticketBooking.email}</td>
										<td>${ticketBooking.phoneNumber}</td>
										<td>${ticketBooking.pnrNumber}</td>
										<td>${ticketBooking.flight.flightId}</td>
										<!-- *** ****************** Change -->
										<td><a type="button" class="btn btn-danger btn-lg"
											href="/deleteticketbooking?id=${ticketBooking.ticketId}">Delete</a></td>
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