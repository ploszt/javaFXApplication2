/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author ploszt
 */
public class FXMain extends Application {
    
        public static void main(String[] args) {
        Application.launch(FXMain.class, args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/javafxapplication2/FXML.fxml"));

        Scene scene = new Scene(root);
        
        primaryStage.setScene(scene);

        primaryStage.show();
    }
    
    }

    /**
     * @param args the command line arguments
     */
