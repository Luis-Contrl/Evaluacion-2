/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author User
 */
public class Conexion {
    private final String driver;
    private final String url;
    private final String usuario;
    private final String password;
    
    public Conexion() {
        this.driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        this.url = "jdbc:sqlserver://localhost\\PC-Luis\\SQLEXPRESS:1433;databaseName=Clientes;trustServerCertificate=true";
        this.usuario = "sa";
        this.password = "123456";
    }

    public String getDriver() {
        return driver;
    }

    public String getUrl() {
        return url;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getPassword() {
        return password;
    }
    
    
}
