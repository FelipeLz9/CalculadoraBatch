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

    public void calcular() throws IOException, FileNotFoundException{
        Operacion op = lector.crearOperacion();
        double resultado;
        if(op.getCONST() == SUMA){  
            resultado = op.operacion(op.getO1(), op.getO2());
            System.out.println(resultado +"");
            escritor.escribirResultadoEnArchivo(resultado);
        }else if(op.getCONST() == RESTA){
            resultado = op.operacion(op.getO1(), op.getO2());
            escritor.escribirResultadoEnArchivo(resultado);
        }else if(op.getCONST() == MULTIPLICACION){
            resultado = op.operacion(op.getO1(), op.getO2());
            escritor.escribirResultadoEnArchivo(resultado);
        }else if(op.getCONST() == DIVISION){
            resultado = op.operacion(op.getO1(), op.getO2());
            escritor.escribirResultadoEnArchivo(resultado);
        }else if(op.getCONST() == MODULO){
            resultado = op.operacion(op.getO1(), op.getO2());
            escritor.escribirResultadoEnArchivo(resultado);
        }else if(op == null){
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
