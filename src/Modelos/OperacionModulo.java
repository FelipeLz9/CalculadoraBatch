/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author lopez
 */
public class OperacionModulo extends Operacion{

    private final int CONST = 5;
    
    public OperacionModulo(Operando o1, Operando o2) {
        super(o1, o2);
    }
    
    /**
     * Realiza una operación de módulo entre dos operandos y almacena el resultado en 'ans'.
     *
     * @param num1 El primer operando.
     * @param num2 El segundo operando.
     * @return El resultado del módulo.
     */
    public double operacion(Operando num1, Operando num2){
        return ans = num1.getNumero()%num2.getNumero();
    }
    
}
