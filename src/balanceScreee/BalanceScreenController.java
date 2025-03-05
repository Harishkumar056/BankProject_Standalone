
package balanceScreee;

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

import balanceEnquire.BalanceDom;

public class BalanceScreenController implements Initializable 
{
    @FXML
    private Label accNumber;
    @FXML
    private Label balance;
    @FXML
    private AnchorPane balanceScreen;
    String accNum;
    String balance1;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        
    }    

    @FXML
    private void BackToDetails(ActionEvent event) throws IOException 
    {
        Parent root = FXMLLoader.load(getClass().getResource("/accountDetails/details.fxml"));
     
        Stage stage = new Stage();
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
        balanceScreen.getScene().getWindow().hide();
    }
    
//    public void displayBalance(BalancePojo po)
//    {
//        accNum = Integer.toString(po.getAccno());
//        balance1 = Double.toString(po.getAmount());
//    }
}
