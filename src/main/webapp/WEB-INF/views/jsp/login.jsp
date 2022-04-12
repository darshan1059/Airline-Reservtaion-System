<%@ include file="jspf/header.jspf"%>
<title>Customer Login</title>
</head>
<body>
	<div class="body-spidy-container">
		<%@ include file="jspf/navigation/navigation.jspf"%>
		<div class="page-design">

			<div class="login-page-design" id="login">
				<!--  Example code starts-->
				<section class="login-block">
					<div class="container  container123">
						<div class="row">
							<div class="col-md-4">
								<h2 class="login-header">Login Now</h2>
								<form class="login-form" action="/processLogin" method="post">
									<c:if test="${param.verifyemail}">
										<div id="error">
											<p class="warning-message">
												Please Verify Your Identity <br>Email/Username does not
												exists.
											</p>
										</div>
									</c:if>
									<c:if test="${param.error}">
										<div id="error">
											<p class="warning-message">User Does Not Exists.</p>
										</div>
									</c:if>
									<div class="form-group">
										<label for='username'>Username</label> <input type="text"
											name="username" class="form-control mx-0" autoComplete="Off"
											required placeholder="Enter your username here" />
									</div>
									<div class="form-group mx-0">
										<label for="userPassword">Password</label> 
										<input type="password" name="password" class="form-control mx-0"
											required placeholder="Enter your password here" />
									</div>
									<button class="btn btn-info login-button" type="submit"
										value="submit">
										<i class="fas fa-sign-in-alt"> </i> <span>Log in</span>
									</button>
									<a href="/oauth2/authorization/google"
										class="btn btn-info login-button-google"><i
										class="fa-brands fa-google"></i><span>&nbsp;</span></a>
								</form>
								<div class="login">
									<br> <br>
									<p>Don't Have an Account, Sign Up Now ?</p>
									<button onclick="location.href='/signup';"
										class="signup-button-design" value="">
										<i class="fa-solid fa-user-plus"></i> <span>Sign up</span>
									</button>
								</div>

							</div>
							<div class="col-md-8">
								<img class="spidy-3-sub-first-img2" src="images/logo2.png"
									height="100" width="250" style="margin: 50px 230px;">
								<p class="spidy-3-sub-second-text">This website is about
									Airline Reservation System. Using this website your can book
									flight tickets and travel all around the world. We provide 24 X
									7 customer support. If you need any help or any assistance
									regarding our services, Feel free to reach us or you can mail
									us at jmkairline.service@gmail.com</p>
							</div>
						</div>
					</div>
			</div>
		</div>

		<%@ include file="jspf/footer.jspf"%>

	</div>
	<script type="text/javascript">
		$(document).ready(function() {
			$('#signup').hide();
		});
	</script>
</body>
</html>