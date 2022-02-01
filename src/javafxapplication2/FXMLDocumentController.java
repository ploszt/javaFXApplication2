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

    Map<String, Integer> map1 = new HashMap<String, Integer>();

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        map1.put("Jeno", 18);
        map1.put("Bela", 32);
        map1.put("Estvan", 19);
        map1.put("Gyula", 28);
        map1.put("Julcsa", 38);
        
        rbRadio1.setSelected(true);
        System.out.println(rbRadio1.isSelected());
        System.out.println(rbRadio2.isSelected());
        
//        comboBox1.getItems().addAll("Jeno","Bela","Pesta","Gyula");
        comboBox1.getItems().addAll(map1.keySet());
        comboBox1.getSelectionModel().select(0);
//        System.out.println(comboBox1.getItems().toString());

        comboBox1.setPromptText("Válassz genya!");
    }    

    @FXML
    private void handleRadioButton(ActionEvent event) {
        
//        System.out.println(group1.getSelectedToggle().getToggleGroup().selectedToggleProperty().toString() );
        System.out.println( ((RadioButton)group1.getSelectedToggle()).getText() );
        
        
        
    }

    @FXML
    private void handleCBox(ActionEvent event) {
        System.out.println(comboBox1.getSelectionModel().getSelectedItem() + "-t valaxtottad! " + 
                map1.get(comboBox1.getSelectionModel().getSelectedItem()).intValue());
    }
    
}
