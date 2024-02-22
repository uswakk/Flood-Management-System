package application;



import java.io.IOException;
import java.net.URL;

import javafx.application.Application;
//import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ProcessSale implements Initializable {
	
	String contact;
	String address;
	String account;
	
	
	  private TextField Contact;
	    private TextField Address;
	    private TextField Account;
	    
	int Bill = 0;
	@FXML
	
	private ChoiceBox<String> myChoiceBox;
	Label Amount;
	private String[] BankAccounts = {"Paypal", "JazzCash", "HBL-KONNECT"};
	//Contact = contact;
	//address = Address;
	//account = Account;
	
@Override
public void initialize(URL arg0, ResourceBundle arg1) {
	// TODO Auto-generated method stub
	myChoiceBox.getItems().addAll(BankAccounts);
	
}

public	void setBill(int total) {
	
	Bill = total;
	//System.out.println("BILL IS : " + Bill);

}

 /*public void displaytotal(int total)
{
	
	Amount.setText("Rs." + total);

}

*/

public void Done(ActionEvent event) throws IOException{
	   
	
	 
	   try 
	   {
		   Stage primaryStage = new Stage();
	
		 Parent root = FXMLLoader.load( getClass().getResource("OrderComplete.fxml") );
		  
		  // Stage stage;
		  	//		   stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		   Scene scene = new Scene(root);
			scene.setRoot(root);
			primaryStage.setTitle("Order Complete");
			primaryStage.setScene(scene);
			 
			primaryStage.show();
		   
	   }
	   catch(Exception e) {
			e.printStackTrace();
		}
	   
	  
	   
  }
}

