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
    
    public OperacionSuma(Operando o1, Operando o2){
        super(o1, o2);
    }
    
    /**
     * Recibe dos operandos los cuales permiten realizar la suma.
     * 
     * @return El resultado de la suma.
     */
    @Override
    public double operar(){
        return ans = o1.getNumero() + o2.getNumero();
    }

}
