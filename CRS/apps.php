<?php
session_start();
?>
<html>
<head>
<title>
Campus Recruitment
</title>
<style>
#tab1 {
		margin:  10px;
		width: 92%;
		border: 2px solid #bfc9c8;
		padding: 3%;
		background-color: #fff;
}
</style>
</head>
<body bGCOLOR="#ffdf8e">
<center>
<?php
echo "<h1><u>Applications</u></h1>";
$con=mysqli_connect("localhost","root","","harshika");
$com=$_SESSION['company'];
$que="SELECT * FROM `application`;";
$res=mysqli_query($con,$que);
if ($res->num_rows > 0)
	{	
    while($row = $res->fetch_assoc())
	{
		echo '<table id="tab1">
    <tr>
        <th>Candidate Name:</th>
        <td>'.$row["name"].'</td>
    </tr>
    <tr>
        <th>Company:</th>
        <td>'.$row["company"].'</td>
    </tr>
	<tr>
        <th>Job:</th>
        <td>'.$row["job"].'</td>
    </tr>
	<tr>
        <th>Email ID:</th>
        <td>'.$row["email"].'</td>
    </tr>
	<tr>
        <th>Higher Secondary Aggregate:</th>
        <td>'.$row["hsc"].'</td>
    </tr>
	<tr>
        <th>University Aggregate:</th>
        <td>'.$row["univ"].'</td>
    </tr>
	</table>';
	}
}
$con->close();
?>
</center>
</body>
<html>