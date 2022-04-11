<%@ include file="jspf/header.jspf"%>
<title>All Flight</title>
</head>
<body>
	<div class="body-spidy-container">
		<%@ include file="jspf/navigation/navigation.jspf"%>
		<div class="all-flight">
			<div class="inner-page-exception">
				<div class="admin-customer-page">
					<c:url value="/getAllFlight" var="pagedLink">
						<c:param name="p" value="~" />
					</c:url>
					<c:choose>
						<c:when test="${empty flightList}">
							<div class="flightDataAvailable">
								<p>Sorry No Flight Details Available</p>
							</div>
						</c:when>
						<c:otherwise>
							<table>
								<tr>
									<th>Flight Icon</th>
									<th>Flight Number</th>
									<th>Flight Name</th>
									<th>Source</th>
									<th>Destination</th>
									<th>Distance</th>
									<th>Luggage</th>
									<th>Departure</th>
									<th>Arrival</th>
									<th>Duration</th>
									<th></th>
									<th></th>
								</tr>
								<c:forEach items="${flightList}" var="flightDetails">
									<tr>
										<td><img class="admin-flight-icon"
											src="images/icons/${flightDetails.imageName}" /></td>
										<td>${flightDetails.flightNumber}</td>
										<td>${flightDetails.flightName}</td>
										<td>${flightDetails.source}</td>
										<td>${flightDetails.destination}</td>
										<td>${flightDetails.distance}</td>
										<td>${flightDetails.luggage}</td>
										<td>${flightDetails.departureDate} ${flightDetails.departureTime}</td>
										<td>${flightDetails.arrivalDate} ${flightDetails.arrivalTime}</td>
										<td>${flightDetails.duration}</td>
										<td><a type="button" class="btn btn-success btn-lg"
											href="/updateflight?id=${flightDetails.flightId}">Update</a></td>
										<td><a type="button" class="btn btn-danger btn-lg"
											href="/deleteflight?id=${flightDetails.flightId}">Delete</a></td>
									</tr>
								</c:forEach>
							</table>
						</c:otherwise>
					</c:choose>
					<c:forEach var="i" begin="0" end="${ lastPageNo-1 }" >
						<a href="${ i }" class="btn btn-primary mx-1">${ i+1 }</a>    	<!-- Displaying Page No -->
					</c:forEach>
				</div>
			</div>
		</div>
	</div>
	<%@ include file="jspf/footer.jspf"%>
</body>
</html>