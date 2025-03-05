
package gendratePinScreen;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
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
import mySqlConnect.MySqlConnection;


public class SetPinScreenController implements Initializable 
{
    @FXML
    private AnchorPane gendratePinScreen;
    @FXML
    private TextField checkName;
    @FXML
    private TextField checkAccountNumber;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        // TODO
    }    

    @FXML
    private void genratePinFun(ActionEvent event) throws SQLException, IOException 
    {
        PinPojo pojo = new PinPojo();
        PinDom dom = new PinDom();
        
        pojo.setName(checkName.getText());
        pojo.setAcno(Integer.parseInt(checkAccountNumber.getText()));
        
        boolean res = dom.setPin(pojo);
        
        if(res == true)
        {
//            checkName.setText(res.getName());
//            checkAccountNumber.setText(Integer.toString(res.getAcno()));
            
            Parent root = FXMLLoader.load(getClass().getResource("/setPin/setPin.fxml"));
            Stage stage = new Stage();
            Scene scene = new Scene(root);

            stage.setScene(scene);
            stage.show();
            
            gendratePinScreen.getScene().getWindow().hide();
        }
    }
    
}
