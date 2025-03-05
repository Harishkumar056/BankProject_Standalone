
package Login;

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
import deposit.DepositScreenController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CustomerLoginController implements Initializable {

    @FXML
    private TextField accountNumber;
    @FXML
    private TextField pinnumber;
    @FXML
    private AnchorPane customerLogin;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void backButton(ActionEvent event) throws IOException 
    {
        Parent root = FXMLLoader.load(getClass().getResource("/customerPage/customerScreen.fxml"));
        DepositScreenController cr = new DepositScreenController();
        //cr.getAccountNumber(Integer.parseInt(accountNumber.getText()));
        Stage stage = new Stage();
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
        customerLogin.getScene().getWindow().hide();
    }

    @FXML
    private void proceedButt(ActionEvent event) throws IOException 
    {
        
        try 
        {
            AccountPojo pojo = new AccountPojo();
            AccontCheckDom dom = new AccontCheckDom();

            pojo.setAccnum(Integer.parseInt(accountNumber.getText()));
            pojo.setPin(Integer.parseInt(pinnumber.getText()));
            boolean res = dom.checkAccount(pojo);
            if(res==true)
            {
                Parent root = FXMLLoader.load(getClass().getResource("/accountDetails/details.fxml"));
     
                Stage stage = new Stage();
                Scene scene = new Scene(root);

                stage.setScene(scene);
                stage.show();
                customerLogin.getScene().getWindow().hide();
            }
            else if(res == false)
            {
                Parent root = FXMLLoader.load(getClass().getResource("/loginFail/loginFail"
                        + ".fxml"));
     
                Stage stage = new Stage();
                Scene scene = new Scene(root);

                stage.setScene(scene);
                stage.show();
                customerLogin.getScene().getWindow().hide();
            }
        }
        catch (SQLException ex) 
        {
            Logger.getLogger(CustomerLoginController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
}
