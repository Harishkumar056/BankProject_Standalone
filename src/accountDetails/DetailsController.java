
package accountDetails;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class DetailsController implements Initializable 
{

    @FXML
    private Button BacktoCustomer;
    @FXML
    private AnchorPane detailsPage;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        
    }    

    @FXML
    private void depositButton(ActionEvent event) throws IOException 
    {
        Parent root = FXMLLoader.load(getClass().getResource("/deposit/depositScreen.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
        detailsPage.getScene().getWindow().hide();
    }

    @FXML
    private void withDrawButton(ActionEvent event) throws IOException 
    {
        Parent root = FXMLLoader.load(getClass().getResource("/withdrawl/WithDrawDisplay.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
        detailsPage.getScene().getWindow().hide();
    }

    @FXML
    private void balanceEnquire(ActionEvent event) throws IOException 
    {
        Parent root = FXMLLoader.load(getClass().getResource("/balanceEnquire/balanceScreen.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
        detailsPage.getScene().getWindow().hide();
    }

    @FXML
    private void backToFirstScreen(ActionEvent event) throws IOException 
    {
        Parent root = FXMLLoader.load(getClass().getResource("/bankproject/FXMLDocument.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
        detailsPage.getScene().getWindow().hide();
    }
}
