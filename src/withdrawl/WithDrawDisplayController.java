
package withdrawl;

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


public class WithDrawDisplayController implements Initializable {

    @FXML
    private TextField accnum;
    @FXML
    private TextField pin;
    @FXML
    private TextField amounnt;
    @FXML
    private AnchorPane withDrawPage;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        // TODO
    }    

    @FXML
    private void proceed(ActionEvent event) throws SQLException, IOException 
    {
        withPojo pojo = new withPojo();
        WithDom dom = new WithDom();
        pojo.setAccountNumber(Integer.parseInt(accnum.getText()));
        pojo.setPin(Integer.parseInt(pin.getText()));
        withPojo balanceCheck = dom.withDrawProceess(pojo);
        
        double avalAmt = balanceCheck.getAmount();
        double needAmt = Double.parseDouble(amounnt.getText());
        boolean res = false;
        if(avalAmt >= needAmt)
        {
            double amt = avalAmt - needAmt;
            pojo.setAmount(amt);
            res = dom.withDrawAmount(pojo);
            if(res ==  true)
            {
                Parent root = FXMLLoader.load(getClass().getResource("/withDrawSucess/withDraw.fxml"));
                Stage stage = new Stage();
                Scene scene = new Scene(root);

                stage.setScene(scene);
                stage.show();
                withDrawPage.getScene().getWindow().hide();
            }
            
        }
        else if(res == false)
        {
            Parent root = FXMLLoader.load(getClass().getResource("/withDrawFail/withFail.fxml"));
            Stage stage = new Stage();
            Scene scene = new Scene(root);

            stage.setScene(scene);
            stage.show();
            withDrawPage.getScene().getWindow().hide();
        }
    }

    @FXML
    private void BackToDetails(ActionEvent event) throws IOException 
    {
        Parent root = FXMLLoader.load(getClass().getResource("/accountDetails/details.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();

        withDrawPage.getScene().getWindow().hide();
    }
    
}
