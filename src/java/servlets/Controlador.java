/*
 * Controlador.java
 *
 * Created on 22 de enero de 2010, 15:52
 */

package servlets;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;
import java.util.*;
import javabeans.*;
import modelo.*;

public class Controlador extends HttpServlet {

  public void service( HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    String op=request.getParameter( "operacion" );
    // Acceso a la página de envío de mensajes
    if ( op.equals( "envio" ) )
      response.sendRedirect( "envio.jsp" );
    // Grabación de un mensaje
    if ( op.equals( "grabar" ) ) {
      Mensaje men = (Mensaje)request.getAttribute( "mensa" );
      Operaciones oper = new Operaciones( request );
      oper.grabaMensaje( men );
      response.sendRedirect( "inicio.htm" );
    }
    // Acceso a la página de solicitud de mensajes
    if ( op.equals( "muestra" ) )
      response.sendRedirect( "mostrar.htm" );
    // Acceso a la lista de mensajes del usuario
    if ( op.equals( "ver" ) ) {
      Operaciones oper = new Operaciones( request );
      ArrayList mensajes = oper.obtenerMensajes( request.getParameter( "nombre" ));
      request.setAttribute( "mensajes", mensajes );
      RequestDispatcher rd = request.getRequestDispatcher( "/ver.jsp" );
      rd.forward( request, response );
    }
  } 
}