/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author User
 */
public class DAOcliente {
    private String nombre_cliente, apellido_cliente, correo_cliente;
    private int telefono_cliente;
    
    

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public DAOcliente() {
        
    }

    public DAOcliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }
    
    
    
    
    
    
    public String getApellido_cliente() {
        return apellido_cliente;
    }

    public void setApellido_cliente(String apellido_cliente) {
        this.apellido_cliente = apellido_cliente;
    }
    
    public String getCorreo_cliente() {
        return correo_cliente;
    }

    public void setCorreo_cliente(String correo_cliente) {
        this.correo_cliente = correo_cliente;
    }

    public int getTelefono_cliente() {
        return telefono_cliente;
    }

    public void setTelefono_cliente(int telefono_cliente) {
        this.telefono_cliente = telefono_cliente;
    }
    
    
    public Boolean ValidaSubida(String nom){
        Boolean flag = true;
        if(!nom.isEmpty()){ setNombre_cliente(nom); }else{return false;}
        
        return flag;
    }
    
    
}
