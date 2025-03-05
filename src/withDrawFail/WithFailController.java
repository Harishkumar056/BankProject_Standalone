/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package withDrawFail;

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
public class WithFailController implements Initializable {

    @FXML
    private AnchorPane withFailPage;
    @FXML
    private Label fail;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       fail.setText("insufficiency Balance");
    }    

    @FXML
    private void BackToDetails(ActionEvent event) throws IOException 
    {
        Parent root = FXMLLoader.load(getClass().getResource("/accountDetails/details.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
        withFailPage.getScene().getWindow().hide();
    }
    
}
