/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author lopez
 */
public class EscritorArchivoSalida {
    
    public void escribirResultadoEnArchivo(double resultado) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Archivo de Salida.txt"))) {
            writer.write(Double.toString(resultado));
            writer.newLine();
            writer.close();
        } catch (IOException e){
            throw e;
        }
    }
    
    public void escribirResultadoEnArchivo(String str) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Archivo de Salida.txt"))) {
            writer.write(str);
            writer.close();
        } catch (IOException e){
            throw e;
        }
    }
    

}
