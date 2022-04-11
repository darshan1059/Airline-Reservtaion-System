<html lang="en">
  <head>
    <meta charset="utf-8">
    <title>Verify Your Email</title>
    <style>
    .otp{
	color: #ffffff;
	font-size: 2.089em;
    }
    .otpdesign{
    	background-color: #ff5a36;
    	 border: 1px solid #ccc;
    	   padding: 30px;
    	    width: 200px;
    	    border-radius: 4px;
    }
    </style>
  </head>
  <body>
    <h2>JMK Airlines</h2>
    <p>Email Verification OTP</p>
    <h2>Hello ${customerName} </h2>
    
    <div class="otpdesign">
       
       <br>
 		<p>Here's your One Time Password (OTP), Please use this ONE TIME PASSWORD (OTP) to verify your email</p> <br>
       	<p class="otp">${OTP}</p>
	   <br>
    </div>
  </body>
</html>