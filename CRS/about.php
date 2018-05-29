<html>

<head>
	<title> About US </title>
	<link rel="icon" href="about_us1600.png" type="image" sizes="18x18">
</head>

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
		opacity : 0.5;
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
</style>

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
    <h2>This site is made by <u>MANAN AHUJA</u> :)</h2>
  </div>
</div>

<div class="footer">
        <div class="footainer">Copyright &copy; 2017</div>
</div>

</body>
</html>