/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package cineflix;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.stage.WindowEvent;

/**
 * FXML Controller class
 *
 * @author jesus
 */
public class CarritoController implements Initializable {
    @FXML
    private TableView<pelicula> tabla;
    
    @FXML
    private TableColumn<pelicula, String> titulo;
    
    @FXML
    private TableColumn<pelicula, String> desc;
    
    @FXML
    private TableColumn<pelicula, String> precio;
    
    public static ObservableList<pelicula> peli = FXCollections.observableArrayList();
    
    @FXML
    private Button btnVolver, btnComprar;
    
    @FXML
    private void actionEvent(ActionEvent e){
        Object evt = e.getSource();
        if(evt.equals(btnVolver)){
            LoadStage("principal.fxml", e);
        }
        if(evt.equals(btnComprar)){
            
        }
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        titulo.setCellValueFactory(new PropertyValueFactory<pelicula, String>("titulo"));
        desc.setCellValueFactory(new PropertyValueFactory<pelicula, String>("desc"));
        precio.setCellValueFactory(new PropertyValueFactory<pelicula, String>("precio"));
        tabla.setItems(peli);
        // TODO
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
            Logger.getLogger(CarritoController.class.getName()).log(Level.SEVERE,null, ex);
        }
        
    }
}
