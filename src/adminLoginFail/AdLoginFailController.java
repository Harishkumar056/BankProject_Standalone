/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adminLoginFail;

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

/**
 * FXML Controller class
 *
 * @author 91934
 */
public class AdLoginFailController implements Initializable {

    @FXML
    private AnchorPane adminFail;
    @FXML
    private Label failsDis;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        failsDis.setText("Enter Valid Password");
    }    

    @FXML
    private void backToAdmin(ActionEvent event) throws IOException 
    {
        Parent root = FXMLLoader.load(getClass().getResource("/adminPage/adminScree.fxml"));
     
        Stage stage = new Stage();
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
        adminFail.getScene().getWindow().hide();
    }
    
}
