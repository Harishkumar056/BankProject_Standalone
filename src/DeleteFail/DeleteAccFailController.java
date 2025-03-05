
package DeleteFail;

import deposit.DepositScreenController;
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


public class DeleteAccFailController implements Initializable {

    @FXML
    private AnchorPane delAccFail;
    @FXML
    private Label delFail;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        delFail.setText("Account Deleted Fail");
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
        delAccFail.getScene().getWindow().hide();
    }
    
}
