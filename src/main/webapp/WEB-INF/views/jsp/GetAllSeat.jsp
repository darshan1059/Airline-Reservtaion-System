<%@ include file="jspf/header.jspf"%>
<title>All Seat</title>
</head>
<body>
	<div class="body-spidy-container">
		<%@ include file="jspf/navigation/navigation.jspf"%>
		<div class="process-page">
			<div class="inner-page">
				<div class="admin-customer-page">
					<c:choose>
						<c:when test="${empty seatList}">
							<div class="flightDataAvailable">
								<p>Sorry No Seat Details Available</p>
							</div>
						</c:when>
						<c:otherwise>
							<table>
								<tr>
									<th>Seat Class</th>
									<th>Flight Id</th>
									<th>Price For Booking</th>
									<th>Price For Cancel</th>
									<th>Tax</th>
									<th></th>
									<th></th>
								</tr>
								<c:forEach items="${seatList}" var="seat">
									<tr>
										<td>${seat.seatClass}</td>
										<td>${seat.flightId}</td>
										<td>${seat.priceForBooking}</td>
										<td>${seat.priceForCancel}</td>
										<td>${seat.tax}</td>
										<td><a type="button" class="btn btn-success btn-lg"
											href="/updateseat?id=${seat.seatId}">Update</a></td>
										<td><a type="button" class="btn btn-danger btn-lg"
											href="/deleteseat?id=${seat.seatId}">Delete</a></td>
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
</html>s