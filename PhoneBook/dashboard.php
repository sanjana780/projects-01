<?php
session_start();

require 'db.php';
$query = "SELECT contact_id FROM contactdetails ";
    $result = mysqli_query($dbcon,$query);
	$row = @mysqli_num_rows($result);
	
?>
<html>
<head>
<title>Phone Book</title>
<link rel="stylesheet" href="style.css?v=18">
</head>
 
<body>

<div id = "main">
  <h1> Phone Book</h1>
  <?php echo '<p class="loged">Logged in as <span>' .$_SESSION['username']. '</span></p>';
  
  include_once 'menu-main.php';
  ?>
  

 <div class=" totalcontact"> <p>Hello<br> <?php echo '<span>'. $_SESSION['username'].'</span>';?></p>
  </div>
  <div class= "addnew"><a href=""></a> </div> 
  <div class= "viewusers"><a href="view_user.php"></a> </div> 
  
  
</div>
<div class="pic1">
  Easy Accessibility
</div>
<div class="contact">
 Customer Support
</div><div class="gui">
  Easy inerface
</div><div class="data">
  Database Connectivity
</div>
<!-- <div class="plus">
  Get Started
</div> -->
<hr style="    
     position: relative;
    top: 94%;
    left: -4%;
    width: 683px;
    rotate: 33deg;
    color: black;
    border: solid 0.5px;"
    
  >
<hr style="    
     position: relative;
    top: 92.5%;
    left: -4%;
    width: 683px;
    rotate: -33deg;
    color: black;
    border: solid 0.5px;"
  >
<div id="plus">
  <button type="button" class="plus" onclick="window.location.href='add_user.php'">+</button>
</div>


<img id="DASH" src="pic1.png">
<img id="contact" src="contact.png">
<img id="gui" src="gui.png">
<img id="data" src="data.png">
</body>
</html>
