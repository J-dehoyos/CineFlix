/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cineflix;

import javax.swing.JOptionPane;

/**
 *
 * @author jesus
 */
public class listahistorial {
    public static historial cab;
    public listahistorial(String nom){
        historial agregar = cab;
        while(agregar != null){
            if(agregar.titulo.equals(nom)){
                JOptionPane.showMessageDialog(null,"Comprado");
                
            }
        }
    }
}
