<!DOCTYPE html>

<%@page import="java.util.ArrayList"%>
<%@page import="Domain.Carrusel"%>
<%@page import="java.util.Collection"%>

<html lang="es">
<head>
	<meta charset="UTF-8"/>	
</head>
<body>
	
	<main>
		
		<%-- seccion ppal --%>
		
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>

	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		  <div class="container-fluid">
		    <h3 class="card-subtitle mb-2 text-muted">UEFA CHAMPIONS LEAGUE -- Background</h3>
		    
		    
		   
		  </div>
		</nav>
		
		
				</div>
				<div class="col">
					<h2 class="card-title" align="center">Listado de im&aacute;genes en carrousel</h2>
					<table class="table">
					 	<thead>
					    <tr align="center">
					      <th scope="col" >C&Oacute;DIGO</th>
					      <th scope="col" >DESCRIPCI&Oacute;N</th>
					      <th scope="col" >IMAGEN</th>
					     
					    </tr>
					  </thead>
					  <tbody>
					  	<% 
					  	Object listadoObject=request.getAttribute("Imagenes");
						 
						//puedo castear
						ArrayList<Carrusel> listado=(ArrayList<Carrusel>)listadoObject;
					  	
					  	
					  	%>
						<% for(Carrusel aux: listado){%>
						    <tr>
						      <td align="center"><%=aux.getId() %></td>
						      <td scope="row" align="center"><%=aux.getDescripcion() %>&nbsp;</td>
						      <td align="center"><img src="<%=aux.getImagen()%>" class="thumbnail" width=300 height=100></td>
						    </tr>
					   	<%} %>				    
					  </tbody>
					</table>
					
						
						 	
				</div>
				
		
	</main>
	<footer>
	
	<h4 class="card-title">Edici&oacute;n Carrousel</h4>
	
		<nav class="navbar navbar-dark bg-dark" >
		  <div class="container-fluid"  >
			<form action=".\EditCarrouselServlet" method="POST" style="text-align: center;">
						  <fieldset >
					
						   	<div class="mb-3">
						    <table class="table table-dark table-striped">
						    <thead>
							    <tr>
							      <td scope="col" WIDTH="100" >
							      <label for="Urlimg">Agregar nueva url</label></td>
							      <td scope="col" WIDTH="450">
							      <input type="url" id="Urlimg" name="Urlimg"  style="WIDTH: 400px; HEIGHT: 30px" size=12></td>
							      <td scope="col" WIDTH="100" >
							      
							      <label >Ingrese descripcion</label></td>
							      <td scope="col" WIDTH="450">
							      <input type="text" id="desc" name="desc"  style="WIDTH: 400px; HEIGHT: 30px" size=12></td>
							      
							      <th WIDTH="180">
							      <label for="disabledSelect" class="form-label">Imagen a modificar</label></th>
								  <th scope="row" WIDTH="110">
								  <select class="form-select" aria-label="Default select example" name="id">
										 
										  <option value="0">Zero</option>
										  <option value="1">One</option>
										  <option value="2">Two</option>
										  <option value="3">Three</option>
										</select></th>
								  <th WIDTH="30"><button type="submit" class="btn btn-primary">Actualizar</button></th>
								<th><a class="btn btn-primary" href="/practica_web/index.jsp" role="button">HOME</a></th>			     
							    </tr>
					  		</thead>
						 	</table>
						    </div>
						    </fieldset>
							</form>
							</div>
					
			</nav>
	
	</footer>
	
	
	
</body>
</html>