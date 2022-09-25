<html>
  <head>
    <title>Envio de Mensajes</title>
  </head>
<!-- Captura de datos e inserción en el Javabean: -->
<jsp:useBean id="mensa" scope="request" class="javabeans.Mensaje" />
<jsp:setProperty name="mensa" property="*"/>
<% if ( request.getParameter("texto") != null ){%>
   <jsp:forward page="controlador?operacion=grabar"/>
<%}%>

<body>
<center>       
  <h1>Generación de mensajes</h1>
  <form method="post">
  <br/><br/>
  <b>Datos del mensaje :</b><br/><br/>
     Introduzca el destinatario :  <input type="text" name="destino"><br/>
  <br/>
     Introduzca el remitente :  <input type="text" name="remite"><br/>
  <br/>
     CC: <input type="text" name="copia"><br/>
  <br/>
     Introduzca el texto : <br/>
  <textarea name="texto" rows="10" cols="60">
     ... Escribe tu mensaje aquí ...
  </textarea>
  <hr/><br/>
  <input type="submit" name="Submit" value="Enviar">
  <input type="reset" value="Reset">
  </form>
</center>
</body>
</html>
