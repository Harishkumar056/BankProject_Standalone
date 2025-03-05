
package CheckCustomers;

import deposit.DepositScreenController;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class CustomersController implements Initializable {

    @FXML
    private AnchorPane customerTablePage;
    //<?> is here mention which pojo class is coming
    @FXML
    private TableView<CustomerPojo> table;
    @FXML
    //<?,?> whichclass come from data like (pojo), type should be Non-primitive Type
    private TableColumn<CustomerPojo, Long> accnumber;
    @FXML
    private TableColumn<CustomerPojo, String> name;
    @FXML
    private TableColumn<CustomerPojo, Long> phNum;
    @FXML
    private TableColumn<CustomerPojo, String> address;
    @FXML
    private TableColumn<CustomerPojo, Long> aadhar;
    @FXML
    private TableColumn<CustomerPojo, Integer> pin;
    @FXML
    private TableColumn<CustomerPojo, String> fatherName;
    @FXML
    private TableColumn<CustomerPojo, Double> amount;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        try 
        {
            CustomerDom cusdom = new CustomerDom();
            List<CustomerPojo> li = cusdom.CustomerDetails();
            
            for(CustomerPojo p : li)
            {
                table.getItems().add(p);
            }
        }
        catch (SQLException ex) 
        {
            Logger.getLogger(CustomersController.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }    

    @FXML
    private void bactToAdmin(ActionEvent event) throws IOException 
    {
        Parent root = FXMLLoader.load(getClass().getResource("/adminMain/adminFXML.fxml"));
        DepositScreenController cr = new DepositScreenController();
        //cr.getAccountNumber(Integer.parseInt(accountNumber.getText()));
        Stage stage = new Stage();
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
        customerTablePage.getScene().getWindow().hide();
    }
    
    
}
