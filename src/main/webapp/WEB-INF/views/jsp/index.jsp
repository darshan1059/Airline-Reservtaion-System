<%@ include file="jspf/header.jspf"%>
<title>Airline Reservation System</title>
</head>
<body>
	<div class="body-spidy-container">
		<%@ include file="jspf/navigation/navigation.jspf"%>
		<hr />
		<!-- div -->
		<div id="carouselFlight" class="carousel slide"
                data-ride="carousel">
                <div class="carousel-inner">
                    <div class="carousel-item active">
                        <img class="d-block w-100" src="https://www.rivieratours.in/images/slider/slider-8.jpg" alt="First slide">
                    </div>
                    <div class="carousel-item">
                        <img class="d-block w-100" src="https://www.rivieratours.in/images/slider/slider-9.jpg" alt="Second slide">
                    </div>
                    <div class="carousel-item">
                        <img class="d-block w-100" src="https://www.rivieratours.in/images/slider/slider-9.jpg" alt="Third slide">
                    </div>
                </div>
                <a class="carousel-control-prev" href="#carouselFlight"
                    role="button" data-slide="prev"> <span
                    class="carousel-control-prev-icon" aria-hidden="true"></span> <span
                    class="sr-only">Previous</span>
                </a> <a class="carousel-control-next" href="#carouselFlight"
                    role="button" data-slide="next"> <span
                    class="carousel-control-next-icon" aria-hidden="true"></span> <span
                    class="sr-only">Next</span>
                </a>
            </div>

		<div class="row container serviceSec">
			<div class="col-6">
				<form action="/" method="post">
					<h2>
						<strong>Plan Your Journey Now</strong>
					</h2>
					<!--  Radio buttons-->
					<input type="radio" id="one-way" name="Plan_your_Journey" value="1"
						checked="checked"> <label for="one-way">One-Way</label> <input
						type="radio" id="round-trip" name="Plan_your_Journey" value="2"
						checked="checked"> <label for="round-trip">Round
						Trip</label>

					<!--  -->
					<div class="row serviceRow1">
						<div class="col-md-6">
							<input type="text" name="source" class="form-control"
								placeholder="Source" />
						</div>
						<div class="col-md-6">
							<input type="text" name="destination" class="form-control"
								placeholder="Destination" />
						</div>
					</div>
					<div class="row serviceRow1">
						<div class="col-md-6">
							<label for="journeyDate">Date Of Journey</label> <input
								type="date" name="journeyDate" class="form-control"
								id="journeyDate" value="2022-04-09" />
						</div>

						<div class="col-md-6">
							<label for="returnDate" id="label-returnDate">Return Date
								Of Journey</label> <input type="date" name="returnDate"
								class="form-control" id="returnDate" value="2022-04-09" />
						</div>
					</div>
					<div class="row serviceRow1">
						<div class="col-md-10">
							<label for="passenger">Select Passenger</label> <select
								name="passenger" class="form-control">
								<option value="1">1</option>
								<option value="2">2</option>
								<option value="3">3</option>
								<option value="4">4</option>
								<option value="5">5</option>
								<option value="6">6</option>
								<option value="7">7</option>
							</select>
						</div>
					</div>
					<div class="row serviceRow1">
						<div class="col-md-10">
							<label for="passenger">Select Class Of Journey</label> <select
								name="classOfjourney" class="form-control" id="classOfjourney">
								<option value="ECONOMY">ECONOMY</option>
								<option value="BASIC_ECONOMY">BASIC_ECONOMY</option>
								<option value="PREMIUM_ECONOMY">PREMIUM_ECONOMY</option>
								<option value="BUSINESS">BUSINESS</option>
								<option value="FIRST">FIRST</option>
							</select>
						</div>
					</div>
					<div class="row serviceRow1">
						<div class="mt-4">
							<input type="submit" class="btn btn-secondary searchBtn"
								value="Search">
						</div>
					</div>
				</form>
			</div>
			<div class="col-6">
				<div class="container image-slideshow">
					<img class="abc71" src="images/travel1.jpg" /> <img class="abc71"
						src="images/travel2.jpg" /> <img class="abc71"
						src="images/travel3.jpg" /> <img class="abc71"
						src="images/travel4.jpg" /> <img class="abc71"
						src="images/travel5.jpg" /> <img class="abc71"
						src="images/travel6.jpg" /> <img class="abc71"
						src="images/travel7.jpg" /> <img class="abc71"
						src="images/travel8.jpg" /> <img class="abc71"
						src="images/travel9.jpg" />
				</div>
			</div>
		</div>

		<div class="spidy-2">
			<div class="spidy-2-sub">
				<div class="spidy-2-sub-0">
					<p class="spidy-3-sub-heading-text">Top Places to Visit</p>
				</div>
				<div class="spidy-2-sub-1">
					<div class="spidy-2-sub-1-div">
						<a href="https://en.wikipedia.org/wiki/Taj_Mahal"><img
							class="spidy-2-sub-1-img" src="images/tajmahal.jpg" /></a>
					</div>
				</div>
				<div class="spidy-2-sub-2">
					<div class="spidy-2-sub-1-div">
						<a href="https://en.wikipedia.org/wiki/Palolem_Beach"><img
							class="spidy-2-sub-1-img" src="images/goa.jpg" /></a>
					</div>
				</div>
				<div class="spidy-2-sub-3">
					<div class="spidy-2-sub-1-div">
						<a href="https://en.wikipedia.org/wiki/Golden_Temple"><img
							class="spidy-2-sub-1-img" src="images/golden.jpg" /></a>
					</div>
				</div>
				<div class="spidy-2-sub-4">
					<div class="spidy-2-sub-1-div">
						<a href="https://en.wikipedia.org/wiki/Alappuzha"><img
							class="spidy-2-sub-1-img" src="images/kerala.jpg" /></a>
					</div>
				</div>
			</div>
		</div>

		<div class="spidy-2">
			<div class="spidy-2-sub">
				<div class="spidy-2-sub-1">
					<div class="spidy-2-sub-1-div">
						<a href="https://statueofunity.in"><img
							class="spidy-2-sub-1-img" src="images/travel8.jpg" /></a>
					</div>
				</div>
				<div class="spidy-2-sub-2">
					<div class="spidy-2-sub-1-div">
						<a href="https://en.wikipedia.org/wiki/Chitrakote_Falls"><img
							class="spidy-2-sub-1-img" src="images/travel9.jpg" /></a>
					</div>
				</div>
				<div class="spidy-2-sub-3">
					<div class="spidy-2-sub-1-div">
						<a href="https://en.wikipedia.org/wiki/Hawa_Mahal"><img
							class="spidy-2-sub-1-img" src="images/travel6.jpg" /></a>
					</div>
				</div>
				<div class="spidy-2-sub-4">
					<div class="spidy-2-sub-1-div">
						<a href="https://en.wikipedia.org/wiki/charminar"><img
							class="spidy-2-sub-1-img" src="images/charminar.jpg" /></a>
					</div>
				</div>
			</div>
		</div>
		<div class="spidy-3">
			<div class="spidy-3-sub">
				<div class="spidy-3-sub-heading">
					<h1 class="spidy-3-sub-heading-text">Quick about website</h1>
				</div>
				<div class="spidy-3-sub-first">
					<img class="spidy-3-sub-first-img" src="images/logo.png"
						height="200" width="200" />
				</div>
				<div class="spidy-3-sub-second">
					<p class="spidy-3-sub-second-text">This website is about
						Airline Reservation System. Using this website your can book
						flight tickets and travel all around the world. We provide 24 X 7
						customer support. If you need any help or any assistance regarding
						our services, Feel free to reach us or you can mail us at
						jmkairline.service@gmail.com</p>
				</div>
			</div>
		</div>



		<div class="spidy-3">
			<div class="spidy-2-sub">
				<div class="spidy-2-sub-0">
					<p class="spidy-3-sub-heading-text">Feedback from customers</p>
				</div>
				<div class="spidy-2-sub-feed1">
					<progress id="file" class="spidy-2-sub-feed1-progress" value="89"
						max="100"> 89% </progress>
					<br>
					<progress id="file" class="spidy-2-sub-feed1-progress" value="67"
						max="100"> 67% </progress>
					<br>
					<progress id="file" class="spidy-2-sub-feed1-progress" value="32"
						max="100"> 32% </progress>
					<br>
					<progress id="file" class="spidy-2-sub-feed1-progress" value="12"
						max="100"> 12% </progress>
					<br>
					<progress id="file" class="spidy-2-sub-feed1-progress" value="02"
						max="100"> 02% </progress>
					<br>

				</div>
				<div class="spidy-2-sub-feed2">
					<label for="file">&#11088; &nbsp; &nbsp; &#11088; &nbsp;
						&nbsp; &#11088; &nbsp; &nbsp; &#11088; &nbsp; &nbsp; &#11088;</label><br>
					<label for="file">&#11088; &nbsp; &nbsp; &#11088;&nbsp;
						&nbsp; &#11088; &nbsp; &nbsp; &#11088;</label><br> <label for="file">&#11088;
						&nbsp; &nbsp; &#11088; &nbsp; &nbsp; &#11088;</label><br> <label
						for="file">&#11088; &nbsp; &nbsp; &#11088;</label><br> <label
						for="file">&#11088;</label><br>
				</div>
				<div class="spidy-2-sub-feed3">
					<span>3000 users</span><br> <span>2000 users</span><br> <span>1000
						users</span><br> <span>400 users</span><br> <span>10
						users</span><br>
				</div>
			</div>
		</div>

	<script>
			$(function() {
				$('input[type=radio][name=Plan_your_Journey]').change(
						function() {
							if (this.value == 1) {
								$('#returnDate').hide();
								$('#label-returnDate').hide();
							} else if (this.value == 2) {
								$('#returnDate').show();
								$('#label-returnDate').show();
							}
						});
				var current = 0, $imgs = jQuery('.image-slideshow .abc71');
				imgAmount = $imgs.length;
				$($imgs.css('position', 'absolute').hide().get(0)).show();

				window.setInterval(swapImages, 1000);
				function swapImages() {
					var $currentImg = $('.abc71:visible');
					var $nextImg = $('.abc71:hidden').eq(
							Math.floor(Math.random()
									* $('.abc71:hidden').length));
					speed = 2500;
					// animation speed should be the same for both images so we have a smooth change
					$currentImg.fadeOut(speed);
					$nextImg.fadeIn(speed);
				}

			});
		</script>
	<%@ include file="jspf/footer.jspf"%>
	</div>
</body>
</html>