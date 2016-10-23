<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <title>Resimler</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<div class="jumbotron text-center">
  <h1>Wellcome Gallery</h1>
  <p>Resize this responsive page to see the effect!</p>
</div>
  
<div class="container">
  <div class="row">
    <div class="col-sm-4">
      <h3>Column 1</h3>
       <img src="${resim1}" class="img-circle" alt="Cinque Terre" width="304" height="236">
    </div>
    <div class="col-sm-4">
      <h3>Column 2</h3>
       <img src="${resim2}" class="img-circle" alt="Cinque Terre" width="304" height="236">
    </div>
    <div class="col-sm-4">
      <h3>Column 3</h3>
      <img src=${resim3} class="img-circle" alt="Cinque Terre" width="304" height="236">
    </div>
  </div>
  <hr/>
  <div class="row">
    <div class="col-sm-4">
      <h3>Column 1</h3>
       <img src="${resim4}" class="img-circle" alt="Cinque Terre" width="304" height="236">
    </div>
    <div class="col-sm-4">
      <h3>Column 2</h3>
       <img src="${resim5}" class="img-circle" alt="Cinque Terre" width="304" height="236">
    </div>
    <div class="col-sm-4">
      <h3>Column 3</h3>
      <img src="http://www.w3schools.com/bootstrap/cinqueterre.jpg" class="img-circle" alt="Cinque Terre" width="304" height="236">
    </div>
  </div>
</div>

 
</body>
</html>
