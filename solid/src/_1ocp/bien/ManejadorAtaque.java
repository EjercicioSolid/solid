/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _1ocp.bien;

import _1ocp.mal.*;
/**
 *
 * @author Palacios
 */
public class ManejadorAtaque {
    private final Pokemon pokemon;

    public ManejadorAtaque(Pokemon pokemon) {
        this.pokemon = pokemon;
    }
    
    public void manejarAtaque(final Ataque ataque){
        
        switch(ataque){
            case ATAQUE_AGUA:
                Ataque_Agua agua= new Ataque_Agua();
                agua.puntosvida(pokemon);
            case ATAQUE_FUEGO:
                Ataque_Fuego fuego= new Ataque_Fuego();
                fuego.puntosvida(pokemon);
            case ATAQUE_AIRE:
                Ataque_Aire aire=new Ataque_Aire();
                aire.puntosvida(pokemon);
            case ATAQUE_PLANTA:
                Ataque_Planta planta=new Ataque_Planta();
                planta.puntosvida(pokemon);
               
            /*Cuando queremos agregar otro ataque (ej: ATAQUE_ROCA), tenemos que cambiar dos clases
              ManejadorAtaque y Ataque y esto viola el Principio Open Close
            */
        }
    }
}
