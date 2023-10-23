/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author lopez
 */
public class OperacionSuma extends Operacion{

    private final int CONST = 1;
    
    public OperacionSuma(Operando o1, Operando o2){
        super(o1, o2);
    }
    
    /**
     * Recibe dos operandos los cuales permiten realizar la suma.
     *
     * @param num1 El primer operando.
     * @param num2 El segundo operando.
     * @return El resultado de la suma.
     */
    @Override
    public double operacion(Operando num1, Operando num2){
        return ans = num1.getNumero() + num2.getNumero();
    }

}
