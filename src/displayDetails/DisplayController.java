
package displayDetails;

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


public class DisplayController implements Initializable {

    @FXML
    private Label displayLab;
    @FXML
    private AnchorPane displayScreen;

   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        displayLab.setText("Pin gendrated Sucessfully");
    }    

    @FXML
    private void backButton(ActionEvent event) throws IOException 
    {
        Parent root = FXMLLoader.load(getClass().getResource("/customerPage/customerScreen.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
        displayScreen.getScene().getWindow().hide();
    }
    
}
