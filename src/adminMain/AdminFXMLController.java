
package adminMain;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class AdminFXMLController implements Initializable 
{

    @FXML
    private AnchorPane adminMain;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        
    }    

    @FXML
    private void backToAdmin(ActionEvent event) throws IOException 
    {
        Parent root = FXMLLoader.load(getClass().getResource("/adminPage/adminScree.fxml"));
     
        Stage stage = new Stage();
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
        adminMain.getScene().getWindow().hide();
    }

    @FXML
    private void customerDetails(ActionEvent event) throws IOException 
    {
        Parent root = FXMLLoader.load(getClass().getResource("/CheckCustomers/customers.fxml"));
     
        Stage stage = new Stage();
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
        adminMain.getScene().getWindow().hide();
    }

    @FXML
    private void deleteCustomer(ActionEvent event) throws IOException 
    {
        Parent root = FXMLLoader.load(getClass().getResource("/DeleteCustomer/deleteCustomer.fxml"));
     
        Stage stage = new Stage();
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
        adminMain.getScene().getWindow().hide();
    }
    
}
