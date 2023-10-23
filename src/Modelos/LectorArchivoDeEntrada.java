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
public class LectorArchivoDeEntrada {
    
    private File file;

    public LectorArchivoDeEntrada(File file) {
        this.file = file;
    }
    
    /**
     * Valida el formato de los datos en el archivo de entrada.
     *
     * @return operacion Si alguno de los elementos de la operacion no cumple con los requisitos
     * el resultado sera null, sino será el tipo de operacion que debe ejecutarse.
     * @throws FileNotFoundException Si el archivo de entrada no se encuentra.
     * @throws IOException Si se produce un error de lectura del archivo.
     * @throws NumberFormatException Si los datos en el archivo no son números válidos.
     */
    public Operacion crearOperacion() throws FileNotFoundException, IOException{
        Operando o1 = null;
        Operando o2 = null;
        Operacion operacion = null;
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String linea = reader.readLine();
            String[] elementos = linea.split(" ");
            try{
                if(!elementos[0].equals("ANS") ){
                    double num = Double.parseDouble(elementos[0]);
                    o1 = new Operando(num);
                }
                if(!elementos[2].equals("ANS")){
                    double num = Double.parseDouble(elementos[2]);
                    o2 = new Operando(num);
                }
                if(!elementos[1].equals("+")){
                    operacion = new OperacionSuma(o1,o2);
                }else if(!elementos[1].equals("-")){
                    operacion = new OperacionResta(o1,o2);
                }else if(!elementos[1].equals("*")){
                    operacion = new OperacionMultiplicacion(o1, o2);
                }else if(!elementos[1].equals("/")){
                    operacion = new OperacionDivision(o1,o2);
                }else if(!elementos[1].equals("%")){
                    operacion = new OperacionModulo(o1, o2);
                }
                reader.close();
            }catch(NumberFormatException e){
                throw e;
            }
        }catch(FileNotFoundException e){
            throw e;
        }
        return operacion;
    }

    /**
     * @return the file
     */
    public File getFile() {
        return file;
    }

    /**
     * @param file the file to set
     */
    public void setFile(File file) {
        this.file = file;
    }
}