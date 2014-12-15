

package com.jc.model;

import java.sql.CallableStatement;
import java.sql.Connection;


public class DAOLibros {
    public static String guardarLibro(String nombre,String marca,String modelo) throws Exception{
         Conexion c=new Conexion();
        Connection con=c.conectarse();
     CallableStatement callate=con.prepareCall("{call guardarLibro(?,?,?,?,?)}");
        callate.registerOutParameter(1,java.sql.Types.INTEGER);
         callate.registerOutParameter(2,java.sql.Types.INTEGER);
        callate.setString(3,nombre);
        callate.setString(4,marca);
         callate.setString(5,modelo);
        
      
        callate.execute();
        int pk=callate.getInt(1);
     return "Se guardo el libro con exito:"+pk;
    }

    public static boolean guardarAutomovil(String nombre_Automovil, String marca, String modelo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

    
    
