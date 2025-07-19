/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Usuario;

/**
 *
 * @author PEDRO LUIS MARTINEZ
 */
public class IngresoUsuario {
    
    public boolean validarUsuario (Usuario usuario){
         return usuario.getNombre().equals("usuario") && 
                usuario.getContraseña().equals("12345");
    }
}
