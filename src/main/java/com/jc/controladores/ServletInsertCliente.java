
package com.jc.controladores; 
 
 
import com.jc.model.DAOAutomovil;
 import java.io.IOException; 
 import java.io.PrintWriter; 
 import javax.servlet.ServletException; 
 import javax.servlet.http.HttpServlet; 
 import javax.servlet.http.HttpServletRequest; 
 import javax.servlet.http.HttpServletResponse; 
 
 

 public class ServletInsertCliente extends HttpServlet { 
    private Object DAO;
 
 

    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
             throws ServletException, IOException { 
        response.setContentType("text/html;charset=UTF-8"); 
        PrintWriter out = response.getWriter(); 
          
            
 String Nombre=request.getParameter("Nombre"); 
         String Direccion=request.getParameter("Direccion"); 
           String Telefono=request.getParameter("Telefono"); 
           try{ 
              //se invoca el procedimiento 
              out.println(DAO.guardarCliente(Nombre,Direccion,Telefono)); 
           }catch(Exception e){} 
 } 
 }     
         
 


 
   

