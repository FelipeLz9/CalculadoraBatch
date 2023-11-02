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
    public ArrayList<Operacion> crearOperacion() throws FileNotFoundException, IOException {
        
        ArrayList<Operacion> operaciones = new ArrayList<>();
        double resultadoAnterior = 0.0;

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String linea;
            boolean primeraLinea = true; 
            while ((linea = reader.readLine()) != null) {
                Operacion operacion = null;
                String[] elementos = linea.split(" ");
                if (elementos.length != 3) {
                    operaciones.add(null); 
                    continue; 
                }
                try {
                    double num1;
                    double num2;
                    if (elementos[0].equals("ANS")) {
                        if (primeraLinea) {
                            operaciones.add(null);
                            continue; 
                        }
                        num1 = resultadoAnterior; 
                    } else {
                        num1 = Double.parseDouble(elementos[0]);
                    }
                    if (elementos[2].equals("ANS")) {
                        if (primeraLinea) {
                            operaciones.add(null);
                            continue; 
                        }
                        num2 = resultadoAnterior; 
                    } else {
                        num2 = Double.parseDouble(elementos[2]);
                    }
                    Operando o1 = new Operando(num1);
                    Operando o2 = new Operando(num2);
                    switch (elementos[1]) {
                        case "+" -> operacion = new OperacionSuma(o1, o2);
                        case "-" -> operacion = new OperacionResta(o1, o2);
                        case "*" -> operacion = new OperacionMultiplicacion(o1, o2);
                        case "/" -> operacion = new OperacionDivision(o1, o2);
                        case "%" -> operacion = new OperacionModulo(o1, o2);
                        default -> {
                            operaciones.add(null); 
                            continue; 
                        }
                    }
                    if (operacion != null) {
                        resultadoAnterior = operacion.operar(); 
                    }
                } catch (NumberFormatException e) {
                    operaciones.add(null); 
                }
                operaciones.add(operacion);
                primeraLinea = false; 
            }
        } catch (FileNotFoundException e) {
            throw e;
        } catch (IOException e) {
            throw e;
        }
    return operaciones;
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
