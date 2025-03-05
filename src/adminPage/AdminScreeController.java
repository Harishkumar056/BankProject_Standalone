
package adminPage;

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


public class AdminScreeController implements Initializable {

    @FXML
    private TextField adminName;
    @FXML
    private TextField adminPassword;
    @FXML
    private AnchorPane adminLoginPage;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void adminLogin(ActionEvent event) throws SQLException, IOException 
    {
        adminPojo po = new adminPojo();
        adminDao dao = new adminDao();
        
        po.setName(adminName.getText());
        po.setPin(Integer.parseInt(adminPassword.getText()));
        
        boolean res = dao.verifyAdmin(po);
        if(res == true)
        {
            Parent root = FXMLLoader.load(getClass().getResource("/adminMain/adminFXML.fxml"));
     
            Stage stage = new Stage();
            Scene scene = new Scene(root);

            stage.setScene(scene);
            stage.show();
            adminLoginPage.getScene().getWindow().hide();
        }
        else if(res == false)
        {
            Parent root = FXMLLoader.load(getClass().getResource("/adminLoginFail/adLoginFail.fxml"));
     
            Stage stage = new Stage();
            Scene scene = new Scene(root);

            stage.setScene(scene);
            stage.show();
            adminLoginPage.getScene().getWindow().hide();    
        }
    }

    @FXML
    private void adminBack(ActionEvent event) throws IOException 
    {
        Parent root = FXMLLoader.load(getClass().getResource("/bankproject/FXMLDocument.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
        adminLoginPage.getScene().getWindow().hide();
    }
    
}
