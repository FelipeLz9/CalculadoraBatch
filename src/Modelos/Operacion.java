/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author lopez
 */
public abstract class Operacion {
    
    protected Operando o1;
    protected Operando o2;
    protected double ans;

    public Operacion(Operando o1, Operando o2) {
        this.o1 = o1;
        this.o2 = o2;
    }

    public abstract double operar();
    
    /**
     * @return the o1
     */
    public Operando getO1() {
        return o1;
    }

    /**
     * @param o1 the o1 to set
     */
    public void setO1(Operando o1) {
        this.o1 = o1;
    }

    /**
     * @return the o2
     */
    public Operando getO2() {
        return o2;
    }

    /**
     * @param o2 the o2 to set
     */
    public void setO2(Operando o2) {
        this.o2 = o2;
    }

    /**
     * @return the ans
     */
    public double getAns() {
        return ans;
    }

    /**
     * @param ans the ans to set
     */
    public void setAns(double ans) {
        this.ans = ans;
    }
    
}
