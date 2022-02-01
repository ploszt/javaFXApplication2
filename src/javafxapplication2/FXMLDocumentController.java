/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author ploszt
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private Button button;
    @FXML
    private RadioButton rbRadio1;
    @FXML
    private ToggleGroup group1;
    @FXML
    private RadioButton rbRadio2;
    @FXML
    private AnchorPane AnchorPane;
    @FXML
    private ComboBox<String> comboBox1;
    
   
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        Map<String, Integer> map1 = new HashMap<String, Integer>();
        map1.put("Jenő", 18);
        map1.put("Béla", 32);
        map1.put("Estván", 19);
        map1.put("Gyula", 28);
        
        
//        comboBox1.getItems().addAll("Jeno","Bela","Pesta","Gyula");
        comboBox1.getItems().addAll(map1.keySet());
        System.out.println(comboBox1.getItems().toString());

        comboBox1.setPromptText("Válassz genya!");
    }    

    @FXML
    private void handleRadioButton(ActionEvent event) {
        
        System.out.println(group1.selectedToggleProperty().getName());
        
        
        
    }
    
}
