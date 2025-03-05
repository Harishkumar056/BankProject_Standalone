
package accountNumber;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class AccountNumberController implements Initializable {

    @FXML
    private AnchorPane accountNumbePage;
    @FXML
    private Label accountName;
    @FXML
    private Label accountNumber;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        Dom dom = new Dom();
        try 
        {
            Pojo p = dom.getDetails();
            accountName.setText(p.getName());
            accountNumber.setText(Integer.toString(p.getAccno()));
        } catch (SQLException ex) 
        {
            Logger.getLogger(AccountNumberController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }    

    @FXML
    private void setPin(ActionEvent event) throws IOException 
    {
        Parent root = FXMLLoader.load(getClass().getResource("/gendratePinScreen/setPinScreen.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
        accountNumbePage.getScene().getWindow().hide();
    }
    
}
