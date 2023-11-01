/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 *
 * @author lopez
 */
public class EscritorArchivoSalida {
    
    Path outFile = Paths.get("C:\\Users\\lopez\\OneDrive\\Documentos\\ArchivoSalida.txt");
    Charset charset = Charset.forName("UTF-8");
    
    public void escribirResultadoEnArchivo(ArrayList<String> str) throws IOException {
               
        try (BufferedWriter writer = Files.newBufferedWriter(outFile, charset)) {
            for(String s : str){
                System.out.println(s);
                writer.write(s);
                writer.newLine();
            }
            writer.close();
        }catch(IOException e){
            throw e;
        }
    }
    
}
