
package com.mycompany.proyectmavenmysql;

import java.sql.*;
import javax.swing.JOptionPane;
public class Conexion {
    
    //Constructor privado: para no crear instancias en otras clases min: 27
    private Conexion(){
        
    }
    
    //Variable para guardar el estado de la conexion a nuestra base de datos
    private static Connection conexion;
    
    //Variable para crear 1 sola instancia
    private static Conexion instancia;
    
    //Variables para conectarnos a la Base de datos
    private static final String url = "jdbc:mysql://localhost/bd_proyecto1";
    private static final String username = "root";
    private static final String password = "";
    
    
    //Metodo para conectarnos a la base de datos
    public Connection conectar(){
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Obtenemos la coneccion mediante los parametros y la guardamos en la variable
            conexion = DriverManager.getConnection(url,username,password);
            
            JOptionPane.showMessageDialog(null, "Conexion exitosa!");
            
            return conexion;
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error: "+ e);
        }
        return conexion;
    }
    
    //Metodo para cerrar la conexion
    public void cerrarConexion() throws SQLException{
        try{           
            conexion.close();
            JOptionPane.showMessageDialog(null,"Se desconecto de la base de datos");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error: "+ e);
            //conexion.close();
            conexion.close();       
        }finally{
            conexion.close();
        }
    }
    
    //Patron singleton (No estoy seguro si lo necesitamos)
    //Para cear una unia instancia(?
    public static Conexion getInstance(){
        if(instancia == null){
            instancia = new Conexion();
        }
        return instancia;
    }
        
}
