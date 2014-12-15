package com.jc.model;

import java.sql.CallableStatement;
import java.sql.Connection;

/**
 *
 * @author Brenda
 */
public class DAOCliente {
     public static String guardarPropietario(String nombre,String direccion,int edad,String email) throws Exception{
         Conexion c=new Conexion();
        Connection con=c.conectarse();
     CallableStatement callate=con.prepareCall("{call guardarCliente(?,?,?,?,?,?)}");
        callate.registerOutParameter(1,java.sql.Types.INTEGER);
         callate.registerOutParameter(2,java.sql.Types.INTEGER);
        callate.setString(3,nombre);
        callate.setString(4,direccion);
         callate.setInt(5,edad);
          callate.setString(6,email);
        
      
        callate.execute();
        int pk=callate.getInt(1);
     return "Propietario:"+pk;
    }
    
}
