<%@ include file="jspf/header.jspf"%>
<title>Search Result</title>
</head>
<body>
	<div class="body-spidy-container">
		<%@ include file="jspf/navigation/navigation.jspf"%>
		<div class="process-page">
			<div class="inner-page">
				<c:choose>
					<c:when test='${flightData}'>
						<div class="flightDataAvailable">
							<p>Sorry No Any Flights Available</p>
						</div>
					</c:when>
					<c:otherwise>
						<div class="search-header">
							<div class="child-search-header1_1">Departure</div>
							<div class="child-search-header1_2">Duration</div>
							<div class="child-search-header1_3">Arrival</div>
						</div>
						<c:forEach items="${searchedFlightDetailList.flightList}"
							var="flightDetails" varStatus="status">
							<div class="spidy-hook">
								<div class="ticket_search">
									<div class="div-ticket1">
										<img class="child-div-ticket-1_1_search"
											src="images/icons/${flightDetails.imageName}" />
										<p class="child-div-ticket-1_2_search">${flightDetails.flightName}</p>
									</div>
									<div class="div-ticket2">
										<p class="child-div-t1_search">${flightDetails.source}</p>

										<h3 class="child-div-t2_search">
											${flightDetails.getDepartureDate()} ${flightDetails.getDepartureTime()}</h3>
									</div>
									<div class="div-ticket3">
										<p class="child-div-ticket-3_1_search">${flightDetails.duration}</p>
										<hr class="child-div-ticket-3_4_search">
										<span class="material-icons child-div-ticket-3_2_search">
											flight</span>
										<p class="child-div-ticket-3_3_search">Non Stop</p>
									</div>
									<div class="div-ticket4">
										<p class="child-div-t1_search">${flightDetails.destination}</p>
										<h3 class="child-div-t2_search">${flightDetails.getArrivalDate()} ${flightDetails.getArrivalTime()}</h3>
									</div>
									<div class="div-ticket5">
										<h3 class="child-div-ticket5_1_search">&#8377
											${searchedFlightDetailList.seatList[status.index].priceForBooking}</h3>
										<div class="btn-dropdown-de">
											<a class="drop-click child-div-ticket5_2_search">More
												Details</a>
										</div>
									</div>
								</div>
								<div class="ticket-drop">
									<div class="ticket">
										<div class="div-ticket6">
											<c:choose>
												<c:when
													test="${flightDetails.extraFacility.contains('Wifi')}">
													<span><img
														src="https://img.icons8.com/material/24/000000/wifi--v1.png" /></span>
												</c:when>
												<c:otherwise>
													<span><img
														src="https://img.icons8.com/material/24/000000/wifi-off.png" /></span>
												</c:otherwise>
											</c:choose>
											<c:choose>
												<c:when
													test="${flightDetails.extraFacility.contains('Meal')}">
													<img
														src="https://img.icons8.com/material/24/000000/food-bar.png" />
												</c:when>
												<c:otherwise>
													<img
														src="https://img.icons8.com/material/24/000000/no-food.png" />
												</c:otherwise>
											</c:choose>
											<c:choose>
												<c:when
													test="${flightDetails.extraFacility.contains('Plug')}">
													<img
														src="https://img.icons8.com/material-outlined/24/000000/phone-disconnected.png" />
												</c:when>
												<c:otherwise>
													<img
														src="https://img.icons8.com/material/24/000000/no-phones.png" />
												</c:otherwise>
											</c:choose>
										    <div class="div-ticket1">
												<img class="child-div-ticket-1_1"
													src="images/icons/${flightDetails.imageName}" height="40px" width="40px"  style="margin-top:5px;"/>
												<p class="child-div-ticket-1_2">${flightDetails.flightName}</p>
												<p class="child-div-ticket-1_3">${flightDetails.flightNumber}</p>
										    </div> 
										</div>
										
										<div class="div-ticket2">
											<p class="child-div-t1">${flightDetails.source}</p>
											<h3 class="child-div-t2">${flightDetails.getDepartureDate()}</h3>
											<p class="child-div-t3">${flightDetails.getDepartureTime()}</p>
											<p class="child-div-t4">${searchedFlightDetailList.airportSourceList[status.index].nameOfAirport}</p>
										</div>
										<div class="div-ticket3">
											<p class="child-div-ticket-3_1">${flightDetails.duration}</p>
											<hr class="child-div-ticket-3_4">
											<span class="material-icons child-div-ticket-3_2">flight</span>
											<p class="child-div-ticket-3_3">Non Stop</p>
										</div>
										<div class="div-ticket4">
											<p class="child-div-t1">${flightDetails.destination}</p>
											<h3 class="child-div-t2">${flightDetails.getArrivalDate()}</h3>
											<p class="child-div-t3">${flightDetails.getArrivalTime()}</p>
											<p class="child-div-t4">${searchedFlightDetailList.airportDestinationList[status.index].nameOfAirport}</p>
										</div>

										<div class="div-ticket8">
											<span>Base Fare :- &#8377
												${searchedFlightDetailList.seatList[status.index].priceForBooking}</span>
											<br> <span>Tax :- &#8377
												${searchedFlightDetailList.seatList[status.index].tax}</span> <br>
											<span>Other Discounts :- No</span> <br> <span>Total
												Fare :- &#8377
												${searchedFlightDetailList.seatList[status.index].priceForBooking
											+ searchedFlightDetailList.seatList[status.index].tax}</span>
											<br>
										</div>
										<div class="div-ticket9">
											<span><i class="fa-solid fa-bag-shopping"></i> Cabin:
												7 kg</span> <br> <span><i
												class="fa-solid fa-suitcase-rolling"></i> Luggage:
												${flightDetails.luggage}</span> <br>
										</div>
										<div class="div-ticket10">
											<span>Cancellation Cost :- &#8377
												${searchedFlightDetailList.seatList[status.index].priceForCancel}</span>
										</div>
										<div class="div-ticket12">
											<span>Note:- Due to Covid, flights schedule may
												change. Plan your journey according to that.</span>
										</div>
										<div class="div-ticket13">
											<a href="/moredetails?id=${flightDetails.flightId}"
												class="btn btn-primary btn-lg">Book Ticket</a>
										</div>
									</div>


								</div>
							</div>
						</c:forEach>
					</c:otherwise>
				</c:choose>
			</div>
		</div>
	</div>
	<%@ include file="jspf/footer.jspf"%>
</body>
</html>