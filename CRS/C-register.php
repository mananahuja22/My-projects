<?php
session_start();
?>
<html>
<head>
	<title> C-Register </title>
	<link rel="icon" href="register.png" type="image" sizes="18x18">
<style>

    .header{
        width: 100%;
        position: fixed;        
        background: #333;
        padding: 0px;;
        color: #fff;
		top : 0;
		left : 0;
		border: 5px solid black;
    }

	.footer{
        width: 100%;
        position: fixed;        
        background: #333;
        padding: 20px 20px;
        color: #fff;
		bottom : 0;
		left : 0;
		border: 5px solid black;
    }  
* {
    box-sizing: border-box;
}

body {
    margin: 0;
}

.column {
    float : left;
    padding : 20px;
    height : 380px;
	padding-top : 40px;
}

.left {
  width: 25%;
}

.right {
  width: 75%;
}

.container{
 		width: 100%;
        position: fixed;
		padding: 20px 50px 20px 20px;
		margin-top:309px;
		left:0px;
		height:500px;
		content : center;
		display : table;
		clear : both;
		opacity : 0.8;
}
body
{
	background-image : url("b1.jpg");
	background-repeat : no-repeat;
	background-position: -40px 310px; 
}
a:link {
    text-decoration: none;
	color: black;
}

a:visited {
    text-decoration: none;
	color: black;
}

a:hover {
    text-decoration: underline;
	color: blue;
}

a:active {
    text-decoration: underline;
}

input[type=text], input[type=password] ,input[type=phone]{
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;
}

button {
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 100%;
}

.cancelbtn {
    padding: 14px 20px;
    background-color: #f44336;
}

.cancelbtn,.signupbtn {float:left;width:50%}

.infocontainer {
    padding: 16px;
}

.modal {
    display: none; 
    position: fixed; 
    z-index: 1; 
    left: 0;
    top: 0;
    width: 100%; 
    height: 100%; 
    overflow: auto; 
    background-color: rgb(0,0,0); 
    background-color: rgba(0,0,0,0.4);
    padding-top: 60px;
}

.modal-content {
    background-color: #fefefe;
    margin: 5% auto 15% auto; 
    border: 1px solid #888;
    width: 80%; 
}

.close {
    position: absolute;
    right: 35px;
    top: 15px;
    color: #000;
    font-size: 40px;
    font-weight: bold;
}

.close:hover,
.close:focus {
    color: red;
    cursor: pointer;
}

.clearfix::after {
    content: "";
    clear: both;
    display: table;
}

@media screen and (max-width: 300px) {
    .cancelbtn, .signupbtn {
       width: 100%;
    }
}	
</style>
</head>

<body>

	<div class="header">
	<img src="Recruitment-Process-Outsourcing11.jpg" width="1480" height="300" alt="logo" />
	</div> 

	<div class="container">
		<div class="column left" style="background-color: cyan;">
			<h2><a href="home.php" >=> HOME</a></h2>
			<h2><a href="about.php" >=> ABOUT US</a></h2>
			<h2><a href="contact.php" >=> CONTACT US</a></h2>
		</div>
		<div class="column right" style="background-color: skyblue;">
			<h1>REGISTER</h1>
			<button onclick="document.getElementById('id01').style.display='block'" style="width:auto;">Sign Up</button>
			<div id="id01" class="modal">
				<span onclick="document.getElementById('id01').style.display='none'" class="close" title="Close Modal">×</span>
				<form class="modal-content animate" action="ex.php" method="POST">
				<div class="infocontainer">
				
				<label><b>* Company Name</b></label>
				<input type="text" placeholder="Enter Company Name" name="name" required>
				
				<label><b>* Email</b></label>
				<input type="text" placeholder="Enter Email" name="email" required>
				
				<label><b>* Contact Number</b></label>
				<input type="text" placeholder="Contact no." name="contact" required>
				
				<label><b>* HR Name</b></label>
				<input type="text" placeholder="Enter HR Name" name="hr" required>
				
				<label><b>* User Name</b></label>
				<input type="text" placeholder="Enter User-name" name="uname" required>
				
				<label><b>* Password</b></label>
				<input type="password" placeholder="Enter Password" name="psw1" required>
				
				<label><b>* Repeat Password</b></label>
				<input type="password" placeholder="Repeat Password" name="psw2" required>
				
				<input type="checkbox" checked="checked"> Remember me
				<p>By creating an account you agree to our <a href="#">Terms & Privacy</a>.</p>
				
				<div class="clearfix">
					<button type="button" onclick="document.getElementById('id01').style.display='none'" class="cancelbtn">Cancel</button>
					<button type="submit" class="signupbtn" name="signup1">Sign Up</button>
				</div>
				</div>
				</form>
			</div>
			<script>
			var modal = document.getElementById('id01');
			window.onclick = function(event) {
			if (event.target == modal) {
			modal.style.display = "none";
			}
			}
			</script>
		</div>
	</div>
	
	<div class="footer">
		<div class="footainer">Copyright &copy; 2017</div>
	</div>

</body>
</html>