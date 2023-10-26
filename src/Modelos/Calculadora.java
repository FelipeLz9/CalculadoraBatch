/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.io.*;

/**
 *
 * @author lopez
 */
public class Calculadora {
    
    public LectorArchivoDeEntrada lector;
    private EscritorArchivoSalida escritor;
    private final int SUMA = 1;
    private final int RESTA = 2;
    private final int MULTIPLICACION = 3;
    private final int DIVISION = 4;
    private final int MODULO = 5;

    public void calcular() throws IOException {
        Operacion op = lector.crearOperacion();
        double resultado;

        if (op != null) {
            switch (op.getCONST()) {
                case SUMA -> {
                    resultado = op.operacion(op.getO1(), op.getO2());
                    System.out.println(resultado);
                    escritor.escribirResultadoEnArchivo(Double.toString(resultado));
                }
                case RESTA -> {
                    resultado = op.operacion(op.getO1(), op.getO2());
                    escritor.escribirResultadoEnArchivo(Double.toString(resultado));
                }
                case MULTIPLICACION -> {
                    resultado = op.operacion(op.getO1(), op.getO2());
                    escritor.escribirResultadoEnArchivo(Double.toString(resultado));
                }
                case DIVISION -> {
                    resultado = op.operacion(op.getO1(), op.getO2());
                    escritor.escribirResultadoEnArchivo(Double.toString(resultado));
                }
                case MODULO -> {
                    resultado = op.operacion(op.getO1(), op.getO2());
                    escritor.escribirResultadoEnArchivo(Double.toString(resultado));
                }
                default -> escritor.escribirResultadoEnArchivo("Error");
            }
        } else {
            escritor.escribirResultadoEnArchivo("Error");
        }
    }

    /**
     * @return the lector
     */
    public LectorArchivoDeEntrada getLector() {
        return lector;
    }

    /**
     * @param lector the lector to set
     */
    public void setLector(LectorArchivoDeEntrada lector) {
        this.lector = lector;
    }

    public void setEscritor(EscritorArchivoSalida escritor) {
        this.escritor = escritor;
    }
    
    
}
