<%@ include file="jspf/header.jspf"%>
<title>Contact Us</title>
</head>
<body>
	<div class="body-spidy-container">
		<%@ include file="jspf/navigation/navigation.jspf"%>
		<div class="process-page">
			<div class="inner-page-details">
			<h2 align="center">Contact Us</h2>
			<c:choose>
			<c:when test='${isSuccess}'>
				<p>Message Sent Successfully</p>
			</c:when>
		</c:choose>		
			<div padding=1rem class="inner-page-sub-1">
				<form:form method="post" modelAttribute="contact">
						<div class="form-row">
							<div class="col">
								<form:label path="firstName" name="">First Name</form:label>
								<form:input path="firstName" type="text" class="form-control"
									required="true" placeholder="Enter Firstname"/>
								<form:errors path="firstName" cssClass="text-warning" />
							</div>
						</div>
						<br>
						<div class="form-row">
							<div class="col">
								<form:label path="lastName">Last Name</form:label>
								<form:input path="lastName" type="text" class="form-control"
									required="true" placeholder="Enter Lastname"/>
								<form:errors path="lastName" cssClass="text-warning" />
							</div>
						</div>
						<br>
						<div class="form-row">
							<div class="col">
								<form:label path="email">Email</form:label>
								<form:input path="email" type="text" class="form-control"
									required="true" placeholder="Enter your email"/>
								<form:errors path="email" cssClass="text-warning" />
							</div>
							</div>
							<br>
							<div class="form-row">
							<div class="col">
								<form:label path="subject">Subject</form:label>
								<form:input  path="subject" type="textarea" class="form-control text-area-design"
									required="true" placeholder="Enter Message Here..."/>
								<form:errors path="subject" cssClass="text-warning" />
							</div>
							</div>
							<div class="form-row pt-4">
							<div class="col">
								<button type="submit" value="submit" id="submit"
									class="btn btn-primary btn-lg">Submit</button>
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