/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _1ocp.bien;

/**
 *
 * @author isabe
 */
public class Ataque_Planta implements Ataques {
    
    public Ataque_Planta() {
        
    }
    
    @Override
    public void puntosvida(Pokemon pokemon) {
        pokemon.setPorcentajeVida(pokemon.getPorcentajeVida()*0.60);
    }
    
}
