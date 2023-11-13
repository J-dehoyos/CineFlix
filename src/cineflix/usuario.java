/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cineflix;

/**
 *
 * @author jesus
 */
public class usuario {
    public String user, pass;
    usuario sig;
    
    public usuario(String user, String pass){
        this.user = user;
        this.pass = pass;
        sig = null;
    }
}
