/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package aulacincojavafx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author lucas
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label lblMsg;
    private Button btnClick;
    
    @FXML
    private void clicouBotao(ActionEvent event) {
        // Ao clicar no botão troca o texto e realoca o label
        lblMsg.setText("Olá Mundo!");
        double x = lblMsg.getLayoutX();
        double y = lblMsg.getLayoutY();
        x = 105;
        lblMsg.setLayoutX(x);
        lblMsg.setLayoutY(y);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
