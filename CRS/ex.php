<?php
session_start();
?>
<?php
if(isset($_POST['signup1']))
{
	$name=$_POST['name'];
	$email=$_POST['email'];
	$contact=$_POST['contact'];
	$hr=$_POST['hr'];
	$userid=$_POST['uname'];
	$pass1=$_POST['psw1'];
	$pass2=$_POST['psw2'];
	
	$_SESSION['company']=$name;
	
	if($name=="" || $contact=="" || $pass1=="" || $email=="" || $hr=="" || $userid=="")
	{
		echo '<script type="text/javascript">alert("Please enter all the details");</script>';	
	}
	else if($pass1!=$pass2)
	{
		echo '<script type="text/javascript">alert("PASSWORD DOESNOT MATHCH !");</script>';
	}
	else
	{
		$conn1=mysqli_connect("localhost","root","","harshika");
		$que1="INSERT INTO `company`(`Name`, `email`,`contact`,`hr`,`userid`,`psw`) VALUES
		('$name','$email','$contact','$hr','$userid','$pass1')";
		echo "hello ";
		$res1=mysqli_query($conn1,$que1);
		if($res1)
		{
		header("location:C-dashboard.php");
		}
		else
		{echo "Data Not Inserted";}
	}
}


if(isset($_POST['signup2']))
{
	$name=$_POST['name'];
	$contact=$_POST['contact'];
	$sex=$_POST['gender'];
	$address=$_POST['address'];
	$userid=$_POST['uname'];
	$email=$_POST['email'];
	$pass1=$_POST['psw1'];
	$pass2=$_POST['psw2'];
	
	if($name=="" || $contact=="" || $pass1=="" || $email=="" || $address=="" || $sex=="")
	{
		echo '<script type="text/javascript">alert("Please enter all the details");</script>';	
	}
	else if($pass1!=$pass2)
	{
		echo '<script type="text/javascript">alert("PASSWORD DOESNOT MATHCH !");</script>';
	}
	else
	{
		$conn=mysqli_connect("localhost","root","","harshika");
		$que="INSERT INTO `student`(`Name`, `gender`,`address`,`userid`,`email`,`pass`, `contact`) VALUES
		('$name','$sex','$address','$userid','$email','$pass1','$contact')";
		$res=mysqli_query($conn,$que);
		if($res)
		{
		header("location:S-dashboard.php");
		}
		else
		{echo "Data Not Inserted";}
	}
}

if(isset($_POST['login2']))
{
	$name=$_POST['uname1'];
	$pass=$_POST['psw'];
	$conn2=mysqli_connect("localhost","root","","harshika");
	$que2="SELECT * FROM `student` WHERE `userid`='$name' AND `pass`='$pass'";
	$res2=mysqli_query($conn2,$que2);
	if($res2->num_rows > 0)
	{header('location:S-dashboard.php');}
	else
	{	
		echo '<script type="text/javascript">alert("Invalid Password");</script>';
	}
}

if(isset($_POST['login1']))
{
	$name=$_POST['uname2'];
	$pass=$_POST['psw'];
	$conn3=mysqli_connect("localhost","root","","harshika");
	$que3="SELECT `Name` FROM `company` WHERE `userid`='$name' AND `psw`='$pass'";
	$res3=mysqli_query($conn3,$que3);
	if($res3->num_rows > 0)
	{
		while($row = $res3->fetch_assoc())
	{
		$_SESSION['company']=$row["name"];
	}
		header('location:C-dashboard.php');
	}
	else
	{	
		echo '<script type="text/javascript">alert("Invalid Password");</script>';
	}
}

if(isset($_POST['pos']))
{
	$job=$_POST['job'];
	$sal=$_POST['sal'];
	$req=$_POST['req'];
	$com=$_SESSION['company'];
		$conn4=mysqli_connect("localhost","root","","harshika");
		$que4="INSERT INTO `vacancy`(`company`, `job`,`salary`,`requirement`) VALUES
		('$com','$job','$sal','$req')";
		$res4=mysqli_query($conn4,$que4);
		if($res4)
		{
		header('location:C-dashboard.php');
		echo '<script type="text/javascript">alert("Posted a new vacancy");</script>';
		}
		else
		{echo '<script type="text/javascript">alert("couldnot post");</script>';}	
}

if(isset($_POST['send']))
{
	$name=$_POST['name1'];
	$comp=$_POST['company'];
	$job=$_POST['job'];
	$email=$_POST['email'];
	$agg1=$_POST['agg1'];
	$agg2=$_POST['agg2'];
		$conn5=mysqli_connect("localhost","root","","harshika");
		$que5="INSERT INTO `application`(`name`,`company`, `job`,`email`,`hsc`,`univ`) VALUES
		('$name','$comp','$job','$email','$agg1','$agg2')";
		$res5=mysqli_query($conn5,$que5);
		if($res5)
		{
		echo '<script type="text/javascript">alert("SENT");</script>';
		header('location:C-dashboard.php');
		}
		else
		{echo '<script type="text/javascript">alert("couldnot send");</script>';}	
}
?>