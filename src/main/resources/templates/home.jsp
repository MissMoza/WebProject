
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<meta charset="ISO-8859-1">
<title>This is home page</title>
<link rel="stylesheet" href="styles.css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</head>
<body>
<header class="color">


<nav class="navbar navbar-expand-lg navbar-light fixed-top flex-column">
<div class="container-fluid">
<button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown" aria-controls="navbarNavDropdown"  aria-expanded="false"
  aria-label="Tooggle navigation">
  <span class="navbar-toggle-icon">
  
  </span></button>
  
  <a class="navbar-brand py-0 my-0"  href=" #">
  <h2>Peacock Tour and Safaris</h2>
  </a>
  <div class="collapse navbar-collapse justify-content-center" id="navbarNavDropdown" >
  <ul class="navbar-nav justify-content-between">
  <li class="nav-item">
  <a class="nav-link active" aria-current="page" href="#">Home</a>
  </li>
  <li class="nav-item">
  <a class="nav-link" href="#">Tour</a>
  
  </li>
  <li class="nav-item">
  <a class="nav-link" href="#">About me</a>
  
  </li>
  <li class="nav-item">
  <a class="nav-link" href="#">Contact</a>
  
  
  </li>
  </ul>
 </div>
</div>
  
  
  
</nav>



<br><br>

<div class="card img-fluid" style="width:1000px">
    <img width="100%" th:src="@{images/street.jpg}"  height="450px"/>
    <div class="card-img-overlay">
      <h4 class="card-title">John Doe</h4>
      <p class="card-text">Some example text some example text. Some example text some example text. Some example text some example text. Some example text some example text.</p>
    
    </div>
  </div>
</header>




</body>
</html>