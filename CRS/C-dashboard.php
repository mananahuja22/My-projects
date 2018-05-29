<?php
session_start();
?>

<html>

<head>
	<title>C-dashboard</title>
	<link rel="icon" href="dashboard.png" type="image" sizes="18x18">
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




input[type=text], input[type=password] {
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

button:hover {
    opacity: 0.5;
}


.cancelbtn {
    width: auto;
    padding: 10px 18px;
    background-color: #f44336;
}


.imgcontainer {
    text-align: center;
    margin: 24px 0 12px 0;
    position: relative;
}

.infocontainer{
    padding: 16px;
}

span.psw {
    float: right;
    padding-top: 16px;
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
    right: 25px;
    top: 0;
    color: #000;
    font-size: 35px;
    font-weight: bold;
}

.close:hover,
.close:focus {
    color: red;
    cursor: pointer;
}


.animate {
    -webkit-animation: animatezoom 0.9s;
    animation: animatezoom 0.9s
}

@-webkit-keyframes animatezoom {
    from {-webkit-transform: scale(0)} 
    to {-webkit-transform: scale(1)}
}
    
@keyframes animatezoom {
    from {transform: scale(0)} 
    to {transform: scale(1)}
}

@media screen and (max-width: 300px) {
    span.psw {
       display: block;
       float: none;
    }
    .cancelbtn {
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
<h2><a href="#" >Company DASHBOARD</a></h2>
<div class="card">
<img src="google.png" alt="Avatar" style="width:100%">
<div class="cotainer">
<h4><b>GOOGLE.org</b></h4> 
<p>Ragnarok</p> 
</div>
</div>
</div>
<div class="column right" style="background-color: skyblue;">
<h1><button onclick="document.getElementById('id01').style.display='block'" style="width:auto;">Post New Vacancy</button></h1> 
<h1><button style="width:auto;"><a href="apps.php">View Applications</a></button></h1> 
</div>
<div id="id01" class="modal">


<form class="modal-content animate" action="ex.php" method="POST">
	<div class="imgcontainer">
		<span onclick="document.getElementById('id01').style.display='none'" class="close" title="Close Modal">&times;</span>
	</div>
	
	<div class="infocontainer">
		<label><b>Job</b></label>
		<input type="text" placeholder="Job" name="job" required>
		
		<label><b>Salary</b></label>
		<input type="text" placeholder="Salary" name="sal" required>

		<label><b>Requirements</b></label>
		<input type="text" placeholder="Requirements" name="req" required>
		
		<button type="submit" name="pos">POST</button>

	</div>
	<div class="infocontainer" style="background-color:#f1f1f1">
		<button type="button" onclick="document.getElementById('id01').style.display='none'" class="cancelbtn">Cancel</button>
	</div>
</form>


</div>
</div>
<div class="footer">
<div class="footainer">Copyright &copy; 2017</div>
</div>
<script>
// Get the modal
var modal = document.getElementById('id01');
// When the user clicks anywhere outside of the modal, close it
window.onclick = function(event) {
if (event.target == modal) {
modal.style.display = "none";
}
}
</script>
</body>
</html>