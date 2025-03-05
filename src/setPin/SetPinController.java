
package setPin;

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


public class SetPinController implements Initializable {

    @FXML
    private AnchorPane pinScreen;
    @FXML
    private TextField accountNumber;
    @FXML
    private TextField pin;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void ProceedButton(ActionEvent event) throws SQLException, IOException 
    {
        pojo p = new pojo();
        Dom dom = new Dom();
        
        p.setAccountnumber(Long.parseLong(accountNumber.getText()));
        p.setPin(Integer.parseInt(pin.getText()));
        int setPin = dom.setPin(p);
        if(setPin > 0)
        {
            Parent root = FXMLLoader.load(getClass().getResource("/pinScreen/pinScreen.fxml"));
            Stage stage = new Stage();
            Scene scene = new Scene(root);

            stage.setScene(scene);
            stage.show();
            
            pinScreen.getScene().getWindow().hide();
        }
        else
        {
            
        }
        
    }
    
}
