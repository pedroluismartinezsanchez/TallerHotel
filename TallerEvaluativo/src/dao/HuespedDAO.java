/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import modelo.Huesped;

/**
 *
 * @author PEDRO LUIS MARTINEZ
 */
public class HuespedDAO {
    private ArrayList<Huesped> huespedes;

    public HuespedDAO() {
        this.huespedes = new ArrayList<>();
    }

    public ArrayList<Huesped> getHuespedes() {
        return huespedes;
    }

    public void setHuespedes(ArrayList<Huesped> huespedes) {
        this.huespedes = huespedes;
    }
    
    public boolean guardar(Huesped huesped){
        huespedes.add(huesped);
        return true;
    }
    
    public Huesped buscar(int id){
        for (Huesped huesped : huespedes) {
            if (huesped.getId() == id){
            return huesped;
            }
        }
        return null;
    }
    
    public boolean eliminar(int id){
        for (Huesped huesped : huespedes) {
            if (huesped.getId() == id) {
                huespedes.remove(huesped);
                return true;
                
            }
        }
        return false;
    }
    
    public boolean actualizar(int id, Huesped nuevoHuesped) {
        for (int i = 0; i < huespedes.size(); i++) {
            if (huespedes.get(i).getId() == id) {
            huespedes.set(i, nuevoHuesped);
            return true; 
            }
        }
        return false; 
    }

}
