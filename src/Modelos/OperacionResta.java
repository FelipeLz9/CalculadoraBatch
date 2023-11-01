/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author lopez
 */
public class OperacionResta extends Operacion{

    public OperacionResta(Operando o1, Operando o2) {
        super(o1, o2);
    }
    
    
    /**
     * Realiza una operación de resta entre dos operandos y almacena el resultado en 'ans'.
     *
     * @return El resultado de la resta.
     */
    @Override
    public double operar(){
        return ans = o1.getNumero() - o2.getNumero();
    }

}
