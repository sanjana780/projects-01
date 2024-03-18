<?php
require_once 'db.php';
if(isset($_POST['submit'])){
	$fname = $_POST['fname'];
	$designation = $_POST['designation'];
	$phone = $_POST['phone'];
	$selected = $_POST['selected'];
	$address = $_POST['address'];
	

	if($fname == ''  || $phone ==''  ){
		echo '<p class="addusererror">Fields marked with * are required</p>';
	} else {
		$sql = "INSERT INTO contactdetails(contact_name,designation	,phone, selected, address) VALUES ('$fname','$designation','$phone', '$selected','$address' )";

$result= mysqli_query($dbcon,$sql);
		if($result){
	   echo '<p class="addsucces">Record added successfully</p><br> ';
   }else {
	 echo '<p class="aderrorMsg">There was error while adding record</p>';  
   
	}	
}
}
?>


<html>
<head>
<title>Phone Book</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
<div id= "main">
 
  <h1> Phone Book</h1>
<?php  include_once 'menu-main.php';?></div>
  <form class="addusrbox" action="<?php echo $_SERVER['PHP_SELF']; ?>" method="post">
  <h1> Add User</h1>
 <label>Name<span style="color:red;">*</span></label> <input type="text" name ="fname" maxlength="20"><br>
 <label>Designation</label> <input type="text" name ="designation" maxlength="20" ><br>
 <label>Phone<span style="color:red;">*</span></label><input type="text" name="phone" onkeypress='return event.charCode >= 48 && event.charCode <= 57' maxlength="12"/><br>
 <label>Address</label> <input type="text" name="address" ><br>

  <label>selected</label>

 <select class="option" id="cars" name="selected">
	<option value=" "> </option>
  <option value="HOTEL">HOTEL</option>
  <option value="COLLEGE">COLLEGE</option>
  <option value="TRAVEL">TRAVEL</option>
  <option value="RESTAURANT">RESTAURANT</option>
  <option value="RESORT">RESORT</option>
  <option value="OTHERS">OTHERS</option>
</select>
<br>

 
 
  <input type="submit" value ="Add" name="submit">

  
  

  </form>

</body>
</html>