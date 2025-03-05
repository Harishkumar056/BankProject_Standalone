
package customerPage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class CustomerScreenController implements Initializable 
{
    @FXML
    private AnchorPane customerPage;

    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        // TODO
    }    

    @FXML
    private void createNewAccount(ActionEvent event) throws IOException 
    {
        Parent root = FXMLLoader.load(getClass().getResource("/createAccount/createNewAccount.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
        customerPage.getScene().getWindow().hide();
    }

    @FXML
    private void balanceEnquire(ActionEvent event) throws IOException 
    {
        Parent root = FXMLLoader.load(getClass().getResource("/Login/CustomerLogin.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
        customerPage.getScene().getWindow().hide();
    }

    @FXML
    private void backToVpage(ActionEvent event) throws IOException 
    {
        Parent root = FXMLLoader.load(getClass().getResource("/bankproject/FXMLDocument.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
        customerPage.getScene().getWindow().hide();
    }
    
}
