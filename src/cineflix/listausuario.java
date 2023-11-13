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
public class listausuario {
    usuario cab;
    
    public listausuario(){ cab = null; }
    
    public usuario buscarNom(String user){
        usuario p;
        if(cab == null){
            return null;
        }else{
            p=cab;
            while(p != null){
                if(p.user.equals(user)){
                    return p;
                }else{
                    p=p.sig;
                }
            }
        }
        return null;
    }
    
    public usuario crearNodo (String user, String pass){
        usuario info, p;
        if(user.equals("") || pass.equals("")){
            JOptionPane.showMessageDialog(null, "Ambos campos son requeridos para el registro!");
        }else{
            p = buscarNom(user);
            if(p != null){
                JOptionPane.showMessageDialog(null, "Ya existe un usuario con este nombre!");
            }else if(p == null){
                info = new usuario(user, pass);
                return info;
            }
        }
        return null;
    }
    public void llenarLista(String user, String pass){
        usuario info = crearNodo(user, pass);
        if(info != null){
            if(cab == null){
                cab = info;
                JOptionPane.showMessageDialog(null, "Usuario registrado con exito, Inicie sesion para continuar!");
            }else{
                info.sig= cab;
                cab=info;
                JOptionPane.showMessageDialog(null, "Usuario registrado con exito, Inicie sesion para continuar!");
            }
        }
    }
    public usuario login (String user, String pass){
        usuario p = cab;
        while(p != null){
            if(p.user.equals(user) && p.pass.equals(pass)){
                return p;
            }else{
                p = p.sig;
            }
        }
        return null;
    }
}
