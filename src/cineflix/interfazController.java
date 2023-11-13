/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
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
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.stage.WindowEvent;

/**
 *
 * @author jesus
 */
public class interfazController implements Initializable {
    
    public static String comprador;
    public listausuario lista = new listausuario();
    
    @FXML
    private Button Registro, Login;
    
    @FXML
    private TextField textLuser, textRuser;
    
    @FXML
    private PasswordField textLpass, textRpass;
    
    @FXML
    private void actionEvent (ActionEvent e){
        Object evt = e.getSource();
        if(evt.equals(Registro)){
            String user = textRuser.getText();
            String pass = textRpass.getText();
            lista.llenarLista(user, pass);
            textRpass.setText("");
            textRuser.setText("");
        }
        if(evt.equals(Login)){
            String user = textLuser.getText();
            String pass = textLpass.getText();
            usuario login = lista.login(user, pass);
            if(login != null){
                comprador = user;
                LoadStage("principal.fxml", e);
            }
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
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
            Logger.getLogger(interfazController.class.getName()).log(Level.SEVERE,null, ex);
        }
        
    }
}
