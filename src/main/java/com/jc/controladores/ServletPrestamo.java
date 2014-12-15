 
 
 package com.jc.controladores; 
 
 
 import java.io.IOException; 
 import java.io.PrintWriter; 
 import javax.servlet.ServletException; 
 import javax.servlet.http.HttpServlet; 
 import javax.servlet.http.HttpServletRequest; 
 import javax.servlet.http.HttpServletResponse; 
 
 
 
 
 public class ServletPrestamo extends HttpServlet { 
 
 
    
     protected void doPost(HttpServletRequest request, HttpServletResponse response) 
             throws ServletException, IOException { 
         response.setContentType("text/html;charset=UTF-8"); 
         PrintWriter out = response.getWriter(); 
        String mensaje="no insertado"; 
         //Pedimos los valores 
         
     int id=   Integer.parseInt(request.getParameter("id")); 
     String nombre=    request.getParameter("nombre"); 
    String direccion=    request.getParameter("direccion"); 
     int edad= Integer.parseInt(request.getParameter("edad")); 
     String email= request.getParameter("email"); 
      
      
     } 
 } 
