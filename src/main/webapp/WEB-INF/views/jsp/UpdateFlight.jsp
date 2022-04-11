<%@ include file="jspf/header.jspf"%>
<title>Edit Flight Details</title>
</head>
<body>
	<div class="body-spidy-container">
		<%@ include file="jspf/navigation/navigation.jspf"%>
		<div class="process-page">
			<div class="inner-page">
				<div class="container-edit-user">
					<h3>Edit Flight Details</h3>
					<br />
					
					<form:form method="post" modelAttribute="flightDetails">
						<form:hidden path="flightId" />
						<form:hidden path="imageName" />
						<form:hidden path="extraFacility" />
						<form:hidden path="duration" />
						<div class="form-group">
							<div class="row">
								<div class="col">
									<form:label path="flightNumber" name="">FlightNumber</form:label>
								</div>
								<div class="col">
									<form:input path="flightNumber" type="text"
										class="form-control" required="true" />
									<form:errors path="flightNumber" cssClass="text-warning" />
								</div>
							</div>

							<div class="row pt-3">
								<div class="col">
									<form:label path="flightName">Flight Name</form:label>
								</div>
								<div class="col">
									<form:input path="flightName" type="text" class="form-control"
										required="true" />
									<form:errors path="flightName" cssClass="text-warning" />
								</div>
							</div>
							<div class="row pt-3">
								<div class="col">
									<form:label path="source">Source</form:label>
								</div>
								<div class="col">
									<form:input path="source" type="text" class="form-control"
										required="true" />
									<form:errors path="source" cssClass="text-warning" />
								</div>
							</div>
							<div class="row pt-3">
								<div class="col">
									<form:label path="destination">Destination</form:label>
								</div>
								<div class="col">
									<form:input path="destination" type="text" class="form-control"
										required="true" />
									<form:errors path="destination" cssClass="text-warning" />
								</div>
							</div>
							<div class="row pt-3">
								<div class="col">
									<form:label path="distance">Distance</form:label>
								</div>
								<div class="col">
									<form:input path="distance" type="text" class="form-control"
										required="true" />
									<form:errors path="distance" cssClass="text-warning" />
								</div>
							</div>

							<div class="row pt-3">
								<div class="col">
									<form:label path="days">Days</form:label>
								</div>
								<div class="col">
									<form:input path="days" type="text" class="form-control"
										required="true" />
									<form:errors path="days" cssClass="text-warning" />
								</div>
							</div>
							<div class="row pt-3">
								<div class="col">
									<form:label path="luggage">Luggage</form:label>
								</div>
								<div class="col">
									<form:input path="luggage" type="text" class="form-control"
										required="true" />
									<form:errors path="luggage" cssClass="text-warning" />
								</div>
							</div>
							<div class="row pt-3">
								<div class="col">
									<form:label path="arrivalDate">Arrival Date</form:label>
								</div>
								<div class="col">
									<form:input path="arrivalDate" type="text" class="form-control"
										required="true" />
									<form:errors path="arrivalDate" cssClass="text-warning" />
								</div>
							</div>
							<div class="row pt-3">
								<div class="col">
									<form:label path="arrivalTime">Arrival Time</form:label>
								</div>
								<div class="col">
									<form:input path="arrivalTime" type="text" class="form-control" 
										required="true" />
									<form:errors path="arrivalTime" cssClass="text-warning" />
								</div>
							</div>
							<div class="row pt-3">
								<div class="col">
									<form:label path="departureDate">Departure Date</form:label>
								</div>
								<div class="col">
									<form:input path="departureDate" type="text" class="form-control"
										required="true" />
									<form:errors path="departureDate" cssClass="text-warning" />
								</div>
							</div>
							<div class="row pt-3">
								<div class="col">
									<form:label path="departureTime">Departure</form:label>
								</div>
								<div class="col">
									<fmt:formatDate value=""/>
									<form:input path="departureTime" type="text" class="form-control"
										required="true" />
									<form:errors path="departureTime" cssClass="text-warning" />
								</div>
							</div>
							<div class="row pt-4">
								<div class="">
									<button type="submit" value="Update" id="submit"
										class="btn btn-success btn-lg">Update</button>
								</div>
							</div>
						</div>
					</form:form>
				</div>
			</div>
		</div>
	</div>
	<%@ include file="jspf/footer.jspf"%>
</body>
</html>