<%@ include file="jspf/header.jspf"%>
<title>Edit Airport Details</title>
</head>
<body>
	<div class="body-spidy-container">
		<%@ include file="jspf/navigation/navigation.jspf"%>
		<div class="process-page">
			<div class="inner-page">
				<div class="container-edit-user">
					<h3>Edit Airport Details</h3>
					<br />
					<form:form method="post" modelAttribute="airport">
						<form:hidden path="airportId" />
						<form:hidden path="flightId" />

						<div class="form-group">
							<div class="row">
								<div class="col">
									<form:label path="nameOfAirport" name="">Name Of Airport</form:label>
								</div>
								<div class="col">
									<form:input path="nameOfAirport" type="text"
										class="form-control" required="true" />
									<form:errors path="nameOfAirport" cssClass="text-warning" />
								</div>
							</div>
							<div class="row pt-3">
								<div class="col">
									<form:label path="flightId">Flight Id</form:label>
								</div>
								<div class="col">
									<form:input path="flightId" type="text" class="form-control"
										disabled="true" />
									<form:errors path="flightId" cssClass="text-warning" />
								</div>
							</div>

							<div class="row pt-3">
								<div class="col">
									<form:label path="country">Country</form:label>
								</div>
								<div class="col">
									<form:input path="country" type="text" class="form-control"
										required="true" />
									<form:errors path="country" cssClass="text-warning" />
								</div>
							</div>
							<div class="row pt-3">
								<div class="col">
									<form:label path="city">City</form:label>
								</div>
								<div class="col">
									<form:input path="city" type="text" class="form-control"
										required="true" />
									<form:errors path="city" cssClass="text-warning" />
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