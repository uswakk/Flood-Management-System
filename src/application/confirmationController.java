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

public class confirmationController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    public Button logIn;

    @FXML
    void goBackLogIn(ActionEvent event) throws IOException {
    	//Stage primaryStage = new Stage();
    	Parent root = FXMLLoader.load( getClass().getResource("mainApp.fxml") );
       	Stage primaryStage = (Stage) logIn.getScene().getWindow();
   		Scene scene = new Scene(root);
   		primaryStage.setScene(scene);
   		primaryStage.show();

    }

    @FXML
    void initialize() {
        assert logIn != null : "fx:id=\"logIn\" was not injected: check your FXML file 'confirmationpage.fxml'.";

    }
}
