/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Controladores;

import Modelos.*;
import Vistas.Ventana;

/**
 *
 * @author lopez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        Ventana v = new Ventana();
        v.setCalculadora(c);
        v.setVisible(true);
        v.setLocationRelativeTo(null);
    }
    
}
