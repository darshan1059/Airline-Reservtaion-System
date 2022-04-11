$(document).ready(function() {
	$('.drop-click').click(function() {
		$(this).closest('.spidy-hook').toggleClass('grid');
		$(this).closest('.spidy-hook').find('.ticket-drop').stop().slideToggle();
		/*$('.ticket-drop').slideToggle({
			start: function() {
				$(this).css({
					display: "grid"
				})
			}
		});*/
	});
	/*var inactiveTime;
	$('*').on('mousemove click mouseup mousedown keydown keypress keyup submit change mouseenter scroll resize dblclick', function() {

		function alertUser() {
			// do your task here
			alert("Session Timout, Go Back to Homepage");
		}

		clearTimeout(inactiveTime);

		inactiveTime = setTimeout(alertUser, 15000); // 10 seconds
		
	});
	$("body").trigger("mousemove");*/
});

