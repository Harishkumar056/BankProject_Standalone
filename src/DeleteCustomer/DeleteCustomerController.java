
package DeleteCustomer;

import deposit.DepositScreenController;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
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


public class DeleteCustomerController implements Initializable 
{

    @FXML
    private AnchorPane delteDisplay;
    @FXML
    private TextField accNumber;
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        // TODO
    }    

    @FXML
    private void backToAdmin(ActionEvent event) throws IOException 
    {
        Parent root = FXMLLoader.load(getClass().getResource("/adminMain/adminFXML.fxml"));
        DepositScreenController cr = new DepositScreenController();
        //cr.getAccountNumber(Integer.parseInt(accountNumber.getText()));
        Stage stage = new Stage();
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
        delteDisplay.getScene().getWindow().hide();
    }

    @FXML
    private void accountNumber(ActionEvent event) {
    }

    @FXML
    private void deleteAccount(ActionEvent event) throws SQLException, IOException 
    {
        DelePojo po = new DelePojo();
        DeleDOm deldom = new DeleDOm();
        po.setAccNumber(Integer.parseInt(accNumber.getText()));
        
        boolean res = deldom.deleteAccNum(po);
        
        if(res == true)
        {
            Parent root = FXMLLoader.load(getClass().getResource("/DeleteSucess/deleAccSuccess.fxml"));
     
            Stage stage = new Stage();
            Scene scene = new Scene(root);

            stage.setScene(scene);
            stage.show();
            delteDisplay.getScene().getWindow().hide();
        }
        else if(res == false)
        {
            Parent root = FXMLLoader.load(getClass().getResource("/DeleteFail/deleteAccFail.fxml"));
     
            Stage stage = new Stage();
            Scene scene = new Scene(root);

            stage.setScene(scene);
            stage.show();
            delteDisplay.getScene().getWindow().hide();
        }
    }
    
}
