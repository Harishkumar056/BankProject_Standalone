/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginFail;

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
public class LoginFailController implements Initializable {

    @FXML
    private AnchorPane loginFailPage;
    @FXML
    private Label faillLabel;

    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        faillLabel.setText("Login Fail");
    }    

    @FXML
    private void BackToLogin(ActionEvent event) throws IOException 
    {
        Parent root = FXMLLoader.load(getClass().getResource("/Login/CustomerLogin.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();

        loginFailPage.getScene().getWindow().hide();
    }

    
}
