
package withDrawSucess;

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


public class WithDrawController implements Initializable {

    @FXML
    private Label res;
    @FXML
    private AnchorPane withSuccessPage;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        res.setText("withdrawl Sucessfully");
    }    

    @FXML
    private void BackToDetails(ActionEvent event) throws IOException 
    {
        Parent root = FXMLLoader.load(getClass().getResource("/accountDetails/details.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
        withSuccessPage.getScene().getWindow().hide();
    }
    
}
