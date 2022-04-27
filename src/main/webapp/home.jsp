<%@page import="Domain.Carrusel"%>
<%@page import="com.google.protobuf.TextFormat.Printer"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page isELIgnored="false" %>
<html>
<head>

</head>
<body>
<main>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>

	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		  <div class="container-fluid">
		    <a class="navbar-brand" href="#">UEFA CHAMPIONS LEAGUE</a>
		    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
		      <span class="navbar-toggler-icon"></span>
		    </button>
		    <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
		      <div class="navbar-nav">
		        <a class="nav-link active" aria-current="page" href="#">Cuartos de final</a>
		        <a class="nav-link" href="#">Semifinales</a>
		        <a class="nav-link disabled">Final</a>
		      </div>
		    </div>
		  </div>
		</nav>
		
		
		
		<section>
	
		  <% //SCRIPTLET >CODIGO JAVA
		  Object listadoObject=request.getAttribute("Listado");
		 
			//puedo castear
			ArrayList<Carrusel> listado=(ArrayList<Carrusel>)listadoObject;
			String datos=" ";%>

		<div id="carouselExampleCaptions" class="carousel slide" data-bs-ride="carousel">
  <div class="carousel-indicators">
    <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
    <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="1" aria-label="Slide 2"></button>
    <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="2" aria-label="Slide 3"></button>
    <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="3" aria-label="Slide 4"></button>
    <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="4" aria-label="Slide 5"></button>
  </div>
		  <div class="carousel-inner">
		    <div class="carousel-item active">
      		<img src="https://as01.epimg.net/en/imagenes/2022/03/17/soccer/1647547220_483795_1647547278_noticia_normal.jpg" class="d-md-block w-100" alt="..." width=80% height=100%>
    		<div class="carousel-caption d-none d-md-block">
    		<h5>CUARTOS DE FINAL</h5>
        	<p>LIGA DE CAMPEONES</p></div>
    		</div>
		    <%
			for(Carrusel aux: listado){
			
					%>
			
			 <div class="carousel-item ">
		      <img src="<%=aux.getImagen()%>" class="d-md-block w-100" width=80% height=100%>
		      <div class="carousel-caption d-none d-md-block">
		     <h5><%=aux.getDescripcion()%></h5>
        		<p>Some representative placeholder content for the first slide.</p>
		     </div>
		     </div>
		    <%	
					}
					%>
		
		     </div>
			  <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="prev">
			    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
			    <span class="visually-hidden">Previous</span>
			  </button>
			  <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="next">
			    <span class="carousel-control-next-icon" aria-hidden="true"></span>
			    <span class="visually-hidden">Next</span>
			  </button>
		</div>
		
		</section>
	</main>
		<footer>
		
		
		<nav class="navbar navbar-dark bg-dark" >
		  <div class="container-fluid"  >
		    <a class="navbar-brand" href="#">UEFA CHAMPIONS LEAGUE</a>>
		  </div>
</nav>
		
		
		</footer>
</body>

</html>
