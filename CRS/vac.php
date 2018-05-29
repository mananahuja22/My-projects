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
<body bGCOLOR="#ffdf8e"">
<center>
<?php
echo "<h1><u>Vacancies</u></h1>";
$con=mysqli_connect("localhost","root","","harshika");
$que="SELECT * FROM `vacancy`;";
$res=mysqli_query($con,$que);
if ($res->num_rows > 0)
	{	
    while($row = $res->fetch_assoc())
	{
		echo '<table id="tab1">
    <tr>
        <th>Company:</th>
        <td>'.$row["company"].'</td>
    </tr>
    <tr>
        <th>JOB:</th>
        <td>'.$row["job"].'</td>
    </tr>
	<tr>
        <th>Salary:</th>
        <td>'.$row["salary"].'</td>
    </tr>
	<tr>
        <th>Requirements:</th>
        <td>'.$row["requirement"].'</td>
    </tr>
	</table>';
	}
}
$con->close();
?>
</center>
</body>
<html>