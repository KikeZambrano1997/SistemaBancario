/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema_bancario;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Javier
 */
public class ConexionSistemaBancario {
    private Connection conexionBD;
    
    public Connection getConexion() {
        return conexionBD;
    }       
    public void setConexion(Connection conexionBD) {
        this.conexionBD = conexionBD;
    }
    public ConexionSistemaBancario conectar() {
    
        try {
          Class.forName("oracle.jdbc.OracleDriver");// carga el driver y oracle 

         String BaseDeDatos = "jdbc:oracle:thin:@192.168.5.7:1521:duval"; //crea una variable con la direccion el puerto y la instancia (express)
         conexionBD = DriverManager.getConnection(BaseDeDatos, "proyecto","luis");  // carga la conexion (usuario contraseña)

         
        } 
        catch (Exception e) {
             JOptionPane.showMessageDialog(null, e.getMessage()+"aqui es");
        }
        return this;
    }
    public boolean ejecutar(String sql) { //
        try {
            Statement sentencia; // objetos para sentencias de oracle 
            sentencia = getConexion().createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY); // crea l0s parametros de embio y r
            sentencia.executeUpdate(sql); //ejecuta el insert delete y el updte 
            getConexion().commit();
            sentencia.close();
        } 
        catch (SQLException e) {
             JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }        
        return true;
    }
         public ResultSet consultar(String sql) { 
        ResultSet resultado = null; 
        try { 
            Statement sentencia; 
            sentencia = getConexion().createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
            resultado = sentencia.executeQuery(sql); 
             
        } catch (SQLException e) { 
            e.printStackTrace(); 
            return null; 
        }        
        return resultado; 
    }

    public ResultSet retornarResulset(String select_minID_CLIENTE_as_valor_FROM_CLIENT) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
