<%@ include file="jspf/header.jspf"%>
<title>Edit User Details</title>
</head>
<body>
	<div class="body-spidy-container">
		<%@ include file="jspf/navigation/navigation.jspf"%>
		<div class="process-page">
			<div class="inner-page">
				<div class="container-edit-user">
					<h3>Edit User Details</h3>
					<form:form method="post" modelAttribute="customer">
						<form:hidden path="customerId" />
						<form:hidden path="emailId" />
						<div class="form-group">
							<div class="row">
								<div class="col">
									<form:label path="firstName" name="">First Name</form:label>
								</div>
								<div class="col">
									<form:input path="firstName" type="text" class="form-control"
										required="true" />
									<form:errors path="firstName" cssClass="text-warning" />
								</div>
							</div>

							<div class="row pt-3">
								<div class="col">
									<form:label path="lastName">Last Name</form:label>
								</div>
								<div class="col">
									<form:input path="lastName" type="text" class="form-control"
										required="true" />
									<form:errors path="lastName" cssClass="text-warning" />
								</div>

							</div>
							<div class="row pt-3">
								<div class="col">
									<form:label path="enabled">Enabled</form:label>
								</div>
								<div class="col">
									<form:select path="enabled" class="form-control">
										<form:option value="true" label="Enabled" />
										<form:option value="false" label="Disabled" />
									</form:select>
									<form:errors path="enabled" cssClass="text-warning" />
								</div>

							</div>
							<div class="row pt-3">
								<div class="col">
									<form:label path="phoneNumber">Phone Number</form:label>
								</div>
								<div class="col">
									<form:input path="phoneNumber" type="text" class="form-control"
										pattern="^([789])([0-9]{9})$" title="Enter valid phonenumber"
										required="true" />
									<form:errors path="phoneNumber" cssClass="text-warning" />
								</div>
							</div>
							<div class="row pt-3">
								<div class="col">
									<form:label path="password">Password</form:label>
								</div>
								<div class="col">
									<form:input path="password" type="text" class="form-control"
										required="true" />
									<form:errors path="password" cssClass="text-warning" />
								</div>
							</div>
							<div class="row pt-3">
								<div class="col">
									<form:label path="username">User Name</form:label>
								</div>
								<div class="col">
									<form:input path="username" type="text" class="form-control"
										required="true" />
									<form:errors path="username" cssClass="text-warning" />
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
							<div class="form-row pt-4">
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