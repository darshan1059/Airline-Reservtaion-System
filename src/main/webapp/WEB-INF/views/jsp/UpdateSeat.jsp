<%@ include file="jspf/header.jspf"%>
<title>Edit Seat Details</title>
</head>
<body>
	<div class="body-spidy-container">
		<%@ include file="jspf/navigation/navigation.jspf"%>
		<div class="process-page">
			<div class="inner-page">
				<div class="container-edit-user">
					<h3>Edit Seat Details</h3>
					<br />
					<form:form method="post" modelAttribute="seat">
						<form:hidden path="seatId" />
						<div class="form-group">
							<div class="row">
								<div class="col">
									<form:label path="seatClass" name="">Seat Class</form:label>
								</div>
								<div class="col">
									<form:input path="seatClass" type="text" class="form-control"
										required="true" readonly="true"/>
									<form:errors path="seatClass" cssClass="text-warning" />
								</div>
							</div>

							<div class="row pt-3">
								<div class="col">
									<form:label path="flightId">Flight Id</form:label>
								</div>
								<div class="col">
									<form:input path="flightId" type="text" class="form-control"
										required="true" />
									<form:errors path="flightId" cssClass="text-warning" />
								</div>
							</div>
							<div class="row pt-3">
								<div class="col">
									<form:label path="priceForBooking">Price For Booking</form:label>
								</div>
								<div class="col">
									<form:input path="priceForBooking" type="text"
										class="form-control" required="true" />
									<form:errors path="priceForBooking" cssClass="text-warning" />
								</div>
							</div>
							<div class="row pt-3">
								<div class="col">
									<form:label path="priceForCancel">Price For Cancel</form:label>
								</div>
								<div class="col">
									<form:input path="priceForCancel" type="text"
										class="form-control" required="true" />
									<form:errors path="priceForCancel" cssClass="text-warning" />
								</div>
							</div>
							<div class="row pt-3">
								<div class="col">
									<form:label path="tax">Tax</form:label>
								</div>
								<div class="col">
									<form:input path="tax" type="text" class="form-control"
										required="true" />
									<form:errors path="tax" cssClass="text-warning" />
								</div>
							</div>
							<div class="form-row pt-4">
								<div class="col">
									<button type="submit" value="Update" id="submit"
										class="btn btn-success btn-lg">Update</button>
								</div>
							</div>
						</div>
					</form:form>
				</div>
		</div>
	</div>
	<%@ include file="jspf/footer.jspf"%>
	</div>
</body>
</html>