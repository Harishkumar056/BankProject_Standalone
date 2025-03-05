/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balanceEnquire;

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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author 91934
 */
public class BalanceScreenController implements Initializable {

    @FXML
    private TextField accNum;
    @FXML
    private TextField pin;
    @FXML
    private AnchorPane balanceEnquirePage;
    @FXML
    private Label res;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void backToDetails(ActionEvent event) throws IOException 
    {
        Parent root = FXMLLoader.load(getClass().getResource("/accountDetails/details.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
        balanceEnquirePage.getScene().getWindow().hide();
    }

    @FXML
    private void checkBalance(ActionEvent event) throws SQLException, IOException 
    {
        BalanceDom dom = new BalanceDom();
        BalancePojo pojo = new BalancePojo();
        
        pojo.setAccno(Integer.parseInt(accNum.getText()));
        pojo.setPin(Integer.parseInt(pin.getText()));
        
        BalancePojo po = dom.balance(pojo);
//        if(po != null)
//        {
//            Parent root = FXMLLoader.load(getClass().getResource("/balanceScreee/balanceScreen.fxml"));
//            Stage stage = new Stage();
//            Scene scene = new Scene(root);
//
//            stage.setScene(scene);
//            stage.show();
//            balanceEnquirePage.getScene().getWindow().hide();
//        }
        res.setText(Double.toString(po.getAmount()));
    }
    
}
