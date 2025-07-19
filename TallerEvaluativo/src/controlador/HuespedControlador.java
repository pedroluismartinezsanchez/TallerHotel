/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import dao.HuespedDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Huesped;

/**
 *
 * @author PEDRO LUIS MARTINEZ
 */
public class HuespedControlador {
    
    private HuespedDAO dao = new HuespedDAO();
    
    public boolean agregarHuesped (Huesped huesped){
        if(huesped.getNombre().isBlank() || huesped.getCorreo().isBlank()){
            JOptionPane.showMessageDialog(null,"Nombre y correo no pueden estar vacíos."); 
        }
        if(huesped.getEdad() <= 18 ){
         JOptionPane.showMessageDialog(null,"El Huesped es menor de edad."); 
        }
        
        dao.guardar(huesped);
        return true;

    }
    
     public DefaultTableModel listar() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new String[]{"Id", "Nombre", "Edad", "Correo Electronico"});
        ArrayList<Huesped> huespedes = dao.getHuespedes();
        for (int i = 0; i < huespedes.size(); i++) {
            modelo.addRow(new Object[]{
                huespedes.get(i).getId(),
                huespedes.get(i).getNombre(),
                huespedes.get(i).getEdad(),
                huespedes.get(i).getCorreo()
                
            });
        }
        return modelo;

    }
    
}
