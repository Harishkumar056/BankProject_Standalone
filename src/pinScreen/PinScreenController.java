/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pinScreen;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class PinScreenController implements Initializable {

    @FXML
    private AnchorPane pinDisplay;
    @FXML
    private Label display;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        display.setText("pin created");
    }    

    @FXML
    private void backToCustomerScreen(ActionEvent event) throws IOException 
    {
        Parent root = FXMLLoader.load(getClass().getResource("/customerPage/customerScreen.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();

        pinDisplay.getScene().getWindow().hide();
    }
    
}
