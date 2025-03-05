
package createAccount;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class CreateNewAccountController implements Initializable 
{
    @FXML
    private TextField customerName;
    @FXML
    private TextField customerPhno;
    @FXML
    private TextField customerAddress;
    @FXML
    private AnchorPane accountCreationPage;
    @FXML
    private TextField customerAadhar;
    @FXML
    private TextField customerFatherName;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        // TODO
    }    

    @FXML
    private void backToCustomer(ActionEvent event) throws IOException 
    {
        Parent root = FXMLLoader.load(getClass().getResource("/customerPage/customerScreen.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
        accountCreationPage.getScene().getWindow().hide();
    }

    @FXML
    private void createNewAccountButt(ActionEvent event) throws IOException 
    {
        CreAccPojo pojo = new CreAccPojo();
        CreAccDOM dom = new CreAccDOM();
        pojo.setName(customerName.getText());
        pojo.setPhno(Long.parseLong(customerPhno.getText()));
        pojo.setAddress(customerAddress.getText());
        pojo.setAadharNumber(Long.parseLong(customerAadhar.getText()));
        pojo.setFatherName(customerFatherName.getText());
        
        boolean creaAcc = dom.insertDetails(pojo);
        if(creaAcc == true)
        {
            Parent root = FXMLLoader.load(getClass().getResource("/accountNumber/accountNumber.fxml"));
            Stage stage = new Stage();
            Scene scene = new Scene(root);

            stage.setScene(scene);
            stage.show();
            accountCreationPage.getScene().getWindow().hide();
        }
        else
        {
            
        }
    }   
}
