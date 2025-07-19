/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author PEDRO LUIS MARTINEZ
 */
public class IDGenerator {
    private static int contadorConsulta = 0;
    

    public static String generarCodigoID() {
        return "ID Huesped: " + String.format("%06d", ++contadorConsulta);
    }

    
}

