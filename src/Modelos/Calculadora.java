/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author lopez
 */
public class Calculadora {
    
    public LectorArchivoDeEntrada lector;
    private EscritorArchivoSalida escritor;

    public void calcular() throws IOException {
        ArrayList<Operacion> ops = lector.crearOperacion();
        double resultado;
        ArrayList<String> resultados = new ArrayList<>();

        for(Operacion op : ops){
            if (op != null) {
                resultado = op.operar();
                resultados.add(Double.toString(resultado));
            }else{
                resultados.add("Error");
            }
        }
        escritor.escribirResultadoEnArchivo(resultados);
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
