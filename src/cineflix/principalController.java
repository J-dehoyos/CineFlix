/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cineflix;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.stage.WindowEvent;

/**
 *
 * @author jesus
 */
public class principalController implements Initializable {
    
    @FXML
    private Button btnTerror, btnComedia, btnAccion, btnSuspenso, btnCarrito, btnHistorial;
    
    @FXML
    private void actionEvent(ActionEvent e){
        Object evt = e.getSource();
        if(evt.equals(btnTerror)){
            PeliculasController.image1 = "file:/C:/Users/jesus/Documents/NetBeansProjects/CineFlix/src/images/hablame.jpg";
            PeliculasController.image2 = "file:/C:/Users/jesus/Documents/NetBeansProjects/CineFlix/src/images/winnie.jpg";
            PeliculasController.image3 = "file:/C:/Users/jesus/Documents/NetBeansProjects/CineFlix/src/images/megan.jpg";
            PeliculasController.image4 = "file:/C:/Users/jesus/Documents/NetBeansProjects/CineFlix/src/images/cria.jpg";
            PeliculasController.titulo1 = "Hablame";
            PeliculasController.titulo2 = "Winnie The Pooh";
            PeliculasController.titulo3 = "M3GAN";
            PeliculasController.titulo4 = "Cría siniestra";
            PeliculasController.desc1 = "Un grupo de amigos descubre cómo convocar espíritus usando una mano embalsamada y se engancha tanto que se convierte en la última moda.";
            PeliculasController.desc2 = "Christopher ha regresado al bosque junto a su nueva esposa, con la esperanza de presentarle a sus viejos amigos.";
            PeliculasController.desc3 = "es una maravilla de la inteligencia artificial, una muñeca realista programada para ser la mejor compañera de los niños y la mayor aliada de los padres.";
            PeliculasController.desc4 = "Una ingeniosa metáfora sobre el proceso de transición de la adolescencia a abrazar la vida adulta es lo que propone Cría siniestra";
            PeliculasController.precio1 = "$15";
            PeliculasController.precio2 = "$12";
            PeliculasController.precio3 = "$16";
            PeliculasController.precio4 = "$9";
            LoadStage("Peliculas.fxml", e);
        }
        if(evt.equals(btnComedia)){
            PeliculasController.image1 = "file:/C:/Users/jesus/Documents/NetBeansProjects/CineFlix/src/images/hablame.jpg";
            PeliculasController.image2 = "file:/C:/Users/jesus/Documents/NetBeansProjects/CineFlix/src/images/winnie.jpg";
            PeliculasController.image3 = "file:/C:/Users/jesus/Documents/NetBeansProjects/CineFlix/src/images/megan.jpg";
            PeliculasController.image4 = "file:/C:/Users/jesus/Documents/NetBeansProjects/CineFlix/src/images/cria.jpg";
            PeliculasController.titulo1 = "Pixeles";
            PeliculasController.titulo2 = "Un espia y medio";
            PeliculasController.titulo3 = "Alerta roja";
            PeliculasController.titulo4 = "Tiempo para mi";
            PeliculasController.desc1 = "En el momento en el que unos alienígenas reciben señales de videojuegos arcade clásicos y los malinterpretan como una directa y abierta declaración de guerra contra ellos.";
            PeliculasController.desc2 = "Se trata de hace veinte años dos estudiantes de una secundaria eran todo lo opuesto, uno un perdedor y el otro un chico con gran futuro.";
            PeliculasController.desc3 = "Hace dos mil años, Marco Antonio le obsequia a Cleopatra tres huevos enjoyados como regalo de bodas que simboliza su devoción. Los huevos se pierden en el tiempo hasta que un granjero encuentra dos en 1907, pero el último permanece perdido.";
            PeliculasController.desc4 = "Con su familia fuera, un padre de familia aprovecha sus primeros días solo después de muchos años para reunirse con un viejo amigo fiestero y desenfrenado.";
            PeliculasController.precio1 = "$11";
            PeliculasController.precio2 = "$13";
            PeliculasController.precio3 = "$15";
            PeliculasController.precio4 = "$11";
            LoadStage("Peliculas.fxml", e);
        }
    }
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }
    private void LoadStage(String url, Event event){
        
        try {
            Object eventSource = event.getSource();
            Node sourceAsNode = (Node) eventSource;
            Scene oldScene = sourceAsNode.getScene();
            Window window = oldScene.getWindow();
            Stage stage = (Stage) window;
            stage.hide();
            
            Parent root = FXMLLoader.load(getClass().getResource(url));
            Scene scene = new Scene(root);
            Stage newStage = new Stage();
            newStage.setScene(scene);
            newStage.show();
            
            newStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
                @Override
                public void handle(WindowEvent event) {
                    Platform.exit();
                }        
            });
        }catch ( IOException ex){
            Logger.getLogger(interfazController.class.getName()).log(Level.SEVERE,null, ex);
        }
        
    }
}
