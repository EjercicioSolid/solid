/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _4dip.bien;

/**
 *
 * @author Palacios
 */
public class Programador {
    
    private IComputadora computadora;
    
    /*
        Se está limitando a que el programador solo pueda utilziar 
        una computadora Windows, el programador debe tener total independencia
        para elegir su computadora
    */
    /**
     Solución: 
     * Ahora el programador puede usar cualquier computador 
     * @param computador
     **/
    public Programador(IComputadora computador) {
        this.computadora = computador;
    }

    public IComputadora getComputadora() {
        return computadora;
    }

    public void setComputadora(IComputadora computadora) {
        this.computadora = computadora;
    }

    

    
    
    
    
}
