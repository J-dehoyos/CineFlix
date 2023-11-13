/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cineflix;

/**
 *
 * @author jesus
 */
public class pelicula {
    String image, titulo, desc, precio, comprador;
    pelicula sig;

    public pelicula() {
    }
    
    public pelicula(String image, String titulo, String desc, String precio, String comprador) {
        this.image = image;
        this.titulo = titulo;
        this.desc = desc;
        this.precio = precio;
        this.comprador = comprador;
        sig = null;
    }

    public String getComprador() {
        return comprador;
    }

    public void setComprador(String comprador) {
        this.comprador = comprador;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
    
}
