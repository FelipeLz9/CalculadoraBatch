/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author lopez
 */
public class OperacionMultiplicacion extends Operacion{

    private final int MULTIPLICACION = 3;
    
    public OperacionMultiplicacion(Operando o1, Operando o2) {
        super(o1, o2);
    }
    
    /**
     * Realiza una operación de multiplicación entre dos operandos y almacena el resultado en 'ans'.
     *
     * @param num1 El primer operando.
     * @param num2 El segundo operando.
     * @return El resultado de la multiplicación.
     */
    @Override
    public double operacion(Operando num1, Operando num2){
        return ans = num1.getNumero()*num2.getNumero();
    }

}
