<%@ page contentType="text/html;charset=UTF-8" %>

<html>
    <head>
        <title>Evidencia1AV</title>
    </head>
    
    <body>
        <h1>Calculadora IMC</h1>
        
            <form action="crear" method="post">
                <label for="nombre">Nombre:</label>
                <input type="nombre" id="nombre" name="nombre">
                <br>
                <label for="apellido">Apellido:</label>
                <input type="apellido" id="apellido" name="apellido">
                <br>
                <label for="edad">Edad:</label>
                <input type="edad" id="edad" name="edad">
                <br>
                <label for="usuario">Usuario:</label>
                <input type="usuario" id="usuario" name="usuario">
                <br>
                <label for="pass">Password:</label>
                <input type="pass" id="pass" name="pass">
                <br>
                <br>
                <button type="submit">Ingresar</button>
            </form>
    </body>
</html>
