/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cineflix;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 * @author jesus
 */
public class PeliculasController implements Initializable {
    
    @FXML
    private Label lbt1,lbt2,lbt3,lbt4,pc1,pc2,pc3,pc4;
    
    @FXML
    private TextArea texta1,texta2,texta3,texta4;
    
    @FXML
    private ImageView im1,im2,im3,im4;
    
    public static String image1, titulo1, desc1, precio1;
    public static String image2, titulo2, desc2, precio2;
    public static String image3, titulo3, desc3, precio3;
    public static String image4, titulo4, desc4, precio4;
    public pelicula p1 = new pelicula(image1, titulo1, desc1, precio1, image1);
    public pelicula p2 = new pelicula(image2, titulo2, desc2, precio2, image2);
    public pelicula p3 = new pelicula(image3, titulo3, desc3, precio3, image3);
    public pelicula p4 = new pelicula(image4, titulo4, desc4, precio4, image4);
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Image show1 =new Image(p1.image);
        im1.setImage(show1);
        Image show2 =new Image(p2.image);
        im2.setImage(show2);
        Image show3 =new Image(p3.image);
        im3.setImage(show3);
        Image show4 =new Image(p4.image);
        im4.setImage(show4);
        lbt1.setText(p1.titulo);
        lbt2.setText(p2.titulo);
        lbt3.setText(p3.titulo);
        lbt4.setText(p4.titulo);
        texta1.setText(p1.desc);
        texta2.setText(p2.desc);
        texta3.setText(p3.desc);
        texta4.setText(p4.desc);
        pc1.setText(p1.precio);
        pc2.setText(p2.precio);
        pc3.setText(p3.precio);
        pc4.setText(p4.precio);
        
        
    }
    
}
