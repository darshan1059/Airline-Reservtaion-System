<%@ include file="jspf/header.jspf"%>
<title>All Airport Data</title>
</head>
<body>
	<div class="body-spidy-container">
		<%@ include file="jspf/navigation/navigation.jspf"%>
		<div class="process-page">
			<div class="inner-page">
				<div class="admin-customer-page">
				<c:url value="/getAllAirport" var="pagedLink">
				<c:param name="p" value="~"/>
				</c:url>
					<c:choose>
						<c:when test="${empty airportList}">
							<div class="flightDataAvailable">
								<p>Sorry No Airport Details Available</p>
							</div>
						</c:when>
						<c:otherwise>
							<table>
								<tr>
									<th>Airport id</th>
									<th>Airport Name</th>
									<th>Flight id</th>
									<th>Country</th>
									<th>City</th>
									<th></th>
									<th></th>
								</tr>
								<c:forEach items="${airportList}" var="airport">
									<tr>
										<td>${airport.airportId}</td>
										<td>${airport.nameOfAirport}</td>
										<td>${airport.flightId}</td>
										<td>${airport.country}</td>
										<td>${airport.city}</td>
										<td><a type="button" class="btn btn-success btn-lg"
											href="/updateairport?id=${airport.airportId}">Update</a></td>
										<td><a type="button" class="btn btn-danger btn-lg"
											href="/deleteairport?id=${airport.airportId}">Delete</a></td>
									</tr>

								</c:forEach>
							</table>
						</c:otherwise>
					</c:choose>
					<br>
					<a href="${0}" class="btn btn-primary mx-1">First</a>
					<c:forEach var="i" begin="0" end="${lastPageNumber-1}">
						<a href="${i}" class="btn btn-primary mx-1">${i+1}</a>
					</c:forEach>
					<a href="${lastPageNumber-1}" class="btn btn-primary mx-1">Last</a>
				</div>
				<br />
				<a type="button" class="btn btn-primary btn-lg" href="/addairport">Add
					Airport Data</a>
			</div>
		</div>
	</div>
	<%@ include file="jspf/footer.jspf"%>
</body>
</html>