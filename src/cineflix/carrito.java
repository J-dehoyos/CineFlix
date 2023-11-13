/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cineflix;

import java.util.Stack;

/**
 *
 * @author jesus
 */
public class carrito {
    public static Stack<pelicula> pila;
    
    public carrito(){
        this.pila = new Stack<>();
    }
    public void setPush(String image, String titulo, String desc, String precio, String comprador){
        pelicula p = new pelicula(image, titulo, desc, precio, comprador);
        for(pelicula agregar : pila){
            if(!agregar.titulo.equals(p.titulo) && agregar.comprador.equals(p.comprador)){
                pila.push(p);
            }
        }
    }
    public void comprar (String titulo, String comprador){
        for(pelicula comprar : pila){
            if(comprar.titulo.equals(titulo) && comprar.comprador.equals(comprador)){
                pila.remove(comprar);
            }
        }
    }
}
