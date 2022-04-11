<%@ include file="jspf/header.jspf"%>
<title>Payment Process</title>
</head>
<body>
	<div class="body-spidy-container">
		<%@ include file="jspf/navigation/navigation.jspf"%>
		<div class="process-page">
			<div class="inner-page">
				<h2>Payment</h2>
				<p>Choose a payment method:</p>
				<c:if test="${param.error}">
						<div id="error">
							<p class="warning-message">${param.error}</p>
						</div>
					</c:if>
				<div class="tab">
					<button class="tablinks" onclick="openTab(event, 'Credit Card')"
						id="defaultOpen">
						<img src="images/icons/icons8-credit-card-60.png" width="50px"
							height="50px" />
					</button>
					<button class="tablinks" onclick="openTab(event, 'Upi')">
						<img src="images/icons/upi.png" width="60px" height="60px" />
					</button>
					<button class="tablinks" onclick="openTab(event, 'Other Payment')">
						<span>Other Payment</span>
					</button>
				</div>
				<div id="Credit Card" class="tabcontent">
					<div class="form spidy-card">
						<h3>Pay through Card</h3>
						<form:form modelAttribute="payment" method="post">
							<div class="row">
								<div class="col">
									<form:input path="cardNumber" class="form-control"
										placeholder="Enter card number" pattern="[0-9]{13,16}" title="Enter valid card number" required="true"/>
									<form:errors path="cardNumber" cssClass="text-warning" />
								</div>
								<div class="col">
									<form:input path="name" class="form-control"
										placeholder="Enter cardholder name" required="true"/>
									<form:errors path="name" cssClass="text-warning" />
								</div>
							</div>
							<div class="row pt-4">
								<div class="col">
									<form:input path="expiryYear"
										class="form-control" placeholder="Enter expiry year" pattern="^(2)([2-9]{1})$" title="Enter valid expiry year" required="true"/>
									<form:errors path="expiryYear" cssClass="text-warning" />
								</div>
								<div class="col">
									<form:input path="expiryMonth"
										class="form-control" placeholder="Enter expiry month" pattern="[0-9]{2}" title="Enter valid expiry month" required="true"/>
									<form:errors path="expiryMonth" cssClass="text-warning" />
								</div>
							</div>
							<div class="row pt-4">
								<div class="col">
									<form:input path="cvv" class="form-control col-md-2"
										placeholder="Enter cvv" pattern="[0-9]{3}" title="Enter valid cvv number" required="true"/>
									<form:errors path="cvv" cssClass="text-warning" />
								</div>
							</div>

							<div class="row pt-2">
								<div class="col mt-4 ">
									<input type="submit" class="btn btn-secondary btn-lg" value="Pay">
								</div>
							</div>
						</form:form>
					</div>

				</div>

				<div id="Upi" class="tabcontent">
					<h3>Upi</h3>
					<p>To be Implemented</p>
				</div>

				<div id="Other Payment" class="tabcontent">
					<h3>Pay on desk</h3>
					<div class="row pt-2">
								<div class="col mt-4 ">
									<input type="submit" class="btn btn-secondary" value="Pay">
								</div>
							</div>
				</div>

			</div>
		</div>

	</div>

	<script>
		function openTab(evt, cityName) {
			var i, tabcontent, tablinks;
			tabcontent = document.getElementsByClassName("tabcontent");
			for (i = 0; i < tabcontent.length; i++) {
				tabcontent[i].style.display = "none";
			}
			tablinks = document.getElementsByClassName("tablinks");
			for (i = 0; i < tablinks.length; i++) {
				tablinks[i].className = tablinks[i].className.replace(
						" active", "");
			}
			document.getElementById(cityName).style.display = "block";
			evt.currentTarget.className += " active";
		}

		// Get the element with id="defaultOpen" and click on it
		document.getElementById("defaultOpen").click();
	</script>
	<%@ include file="jspf/footer.jspf"%>
</body>
</html>