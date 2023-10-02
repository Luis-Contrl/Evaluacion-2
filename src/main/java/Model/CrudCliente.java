/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import DAO.DAOcliente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public class CrudCliente {
    Conexion conexion = new Conexion();
    public String Create(Object obj) throws SQLException{
        DAOcliente cliente = (DAOcliente) obj;
        Connection connection;
        PreparedStatement pst;
        String query = "INSERT INTO TBL_CLIENTES VALUES (?)";
        String respuesta;
        
        try{
            Class.forName(conexion.getDriver());
            connection = (Connection) DriverManager.getConnection(conexion.getUrl(), conexion.getUsuario(), conexion.getPassword());
            
            pst = (PreparedStatement) connection.prepareStatement(query);
            pst.setString(1, cliente.getNombre_cliente());
            respuesta = Integer.toString(pst.executeUpdate());
            
        }
        catch(ClassNotFoundException | SQLException ex){
            respuesta = ex.getMessage();
        }
        return respuesta;
    }
    
    
}
