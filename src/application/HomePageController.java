package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class HomePageController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    
    @FXML 
   public Button logOut;
    
    @FXML 
    public Button itemsBuy;

    @FXML
    void LogOut(ActionEvent event) throws IOException{

    	Parent root = FXMLLoader.load( getClass().getResource("mainApp.fxml") );
       	Stage primaryStage = (Stage) logOut.getScene().getWindow();
   		Scene scene = new Scene(root);
   		primaryStage.setScene(scene);
   		primaryStage.show();
    }

    @FXML 
    void buyItems(ActionEvent event) throws IOException 
    {
    	Parent root = FXMLLoader.load( getClass().getResource("BuyItems.fxml") );
       	Stage primaryStage = (Stage) itemsBuy.getScene().getWindow();
   		Scene scene = new Scene(root);
   		primaryStage.setScene(scene);
   		primaryStage.show();
    }
    @FXML
    void initialize() {

    }
}
