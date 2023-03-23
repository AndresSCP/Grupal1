<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>Formulario de Contacto</title>
	<!-- Incluimos los archivos CSS de Bootstrap -->
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<h1 class="text-center">Formulario de Contacto</h1>
		<form action="index.jsp" method="post">
			<div class="form-group">
				<label for="nombre">Nombre completo:</label>
				<input type="text" id="nombre" name="nombre" class="form-control" required>
			</div>

			<div class="form-group">
				<label for="email">Correo electrónico:</label>
				<input type="email" id="email" name="email" class="form-control" required>
			</div>

			<div class="form-group">
				<label for="asunto">Asunto:</label>
				<input type="text" id="asunto" name="asunto" class="form-control" required>
			</div>

			<div class="form-group">
				<label for="mensaje">Mensaje:</label>
				<textarea id="mensaje" name="mensaje" class="form-control" required></textarea>
			</div>

			<button type="submit" class="btn btn-primary">Enviar</button>
		</form>
	</div>
	<!-- Incluimos los archivos JS de Bootstrap -->
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>
</html>