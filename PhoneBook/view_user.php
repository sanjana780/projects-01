<?php
session_start();
//echo $_SESSION['username'];
?>
<html>
<head>
<title>Phone Book</title>
<link rel="stylesheet" href="style.css?v=1">
<script>
   function ConfirmDelete() {
  return confirm("Do you want to delete?");
}
</script>
</head>
<body>
<div id = "main">
  <h1> Phone Book</h1>
  <!-- <form>
<div class="search-container">
  <form action="/search" method="get">
    <input class="search" id="searchleft" type="search" name="q" placeholder="Search" style="    position: absolute;
    top: 137px;
    left: 15px;
">
    <label class="button searchbutton" for="searchleft" style="position: absolute;
    top: 137px;
    left: 5px;"><span class="mglass">&#9906;</span></label>
  </form>
</div> -->
  
  <?php  include_once 'menu-main.php';?><br><br>
  
   <table class=" viewtabl" >
  <th>
  <tr>
  <td> <strong>S.No</strong></td>
  <td><strong>Name</strong></td>
  <td><strong>Designation</strong></td>
  <td><strong>Phone</strong></td>
  <td><strong>Address</strong></td>
  <td><strong>Selected</strong></td>
  <td><strong>Action</strong></td>
  </tr>
  </th>
  <?php  //https://www.formget.com/update-data-in-database-using-php/  to display table in echo https://stackoverflow.com/questions/35944425/displaying-a-user-profile-page-php
   require_once 'db.php';
   $count= 1;
   $query = "SELECT * FROM contactdetails ORDER BY contact_name";
    $result = mysqli_query($dbcon,$query);
	 while($row = @mysqli_fetch_assoc($result)){?>
  
  
  <tr>
  <td id="od"> <?php echo $count;?></td>
  <td class="ev"> <?php echo $row["contact_name"];?></td>
  <td class="od"><?php echo $row["designation"];?></td>
  <td class="ev"><?php echo $row["phone"];?></td>
  <td class="od"><?php echo $row["address"];?></td>
  <td class="od"><?php echo $row["selected"];?></td>
  <td class="ev">
  <a href="delete.php?deleteid=<?php echo $row["contact_id"]; ?> "id="del" Onclick="return ConfirmDelete()">Delete</a>
 <a href="edit.php?editid=<?php echo $row["contact_id"]; ?>"id="edt" >Edit</a>
  </td>
  </tr>
 <?php $count++;}?>
	 </table>
	   
</div>
</body>

</html>

