
package deposit;

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


public class DepositScreenController implements Initializable 
{    

    @FXML
    private TextField amount;
    @FXML
    private AnchorPane depositPage;
    @FXML
    private TextField accNumber;
    @FXML
    private TextField pin;
    
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }       

    @FXML
    private void depositButt(ActionEvent event) throws SQLException, IOException 
    {
        Pojo p = new Pojo();
        Dom dom = new Dom();
        p.setPin(Integer.parseInt(pin.getText()));
        p.setAccountNumber(Integer.parseInt(accNumber.getText()));
        p.setAmount(Double.parseDouble(amount.getText()));
        boolean res = dom.db(p);
        if(res == true)
        {
            Parent root = FXMLLoader.load(getClass().getResource("/depositStatusDisplay/depositDis.fxml"));
            Stage stage = new Stage();
            Scene scene = new Scene(root);

            stage.setScene(scene);
            stage.show();
            depositPage.getScene().getWindow().hide();
        }
        else
        {
            Parent root = FXMLLoader.load(getClass().getResource("/depositFail/depositFailDisplay.fxml"));
            Stage stage = new Stage();
            Scene scene = new Scene(root);

            stage.setScene(scene);
            stage.show();
            depositPage.getScene().getWindow().hide();
        }
    }

    @FXML
    private void backButton(ActionEvent event) throws IOException 
    {
       Parent root = FXMLLoader.load(getClass().getResource("/accountDetails/details.fxml"));
            Stage stage = new Stage();
            Scene scene = new Scene(root);

            stage.setScene(scene);
            stage.show();
            depositPage.getScene().getWindow().hide();
    }
    
}
