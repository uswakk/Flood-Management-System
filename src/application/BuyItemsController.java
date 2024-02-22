package application;


import java.io.IOException;
import javafx.application.Application;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class BuyItemsController {

	ProcessSale PS  = new ProcessSale();

	int total = 0;
	@FXML
	
		
	public void Rs700(ActionEvent E)
	{
		System.out.println("700\n");
		total+=700;
		System.out.println("Bill is : " + total);
		
	}
	
	public void Rs3000(ActionEvent E)
	{
		System.out.println("3000\n");
		total+=3000;
		System.out.println("Bill is : " + total);
	}
	public void Rs900(ActionEvent E)
	{
		System.out.println("900\n");
		
		total+=900;
		System.out.println("Bill is : " + total);
	}
	public void Rs2000(ActionEvent E)
	{
		System.out.println("2000\n");
		total+=2000;
		System.out.println("Bill is : " + total);
		
	}
	public void Rs500(ActionEvent E)
	{
		System.out.println("500\n");
		total+=500;
		System.out.println("Bill is : " + total);
		
	}
	public void Rs1500(ActionEvent E)
	{
		System.out.println("1500\n");
		total+=1500;
		System.out.println("Bill is : " + total);
		
	}
	
	
	
	 @FXML
	    public void cart(ActionEvent event) throws IOException{
		   
		 PS.setBill(total);
		 
		   try 
		   {
			   Stage primaryStage = new Stage();
			//   FXMLLoader loader = new FXMLLoader(getClass().getResource("ProcessSale.fxml"));
			 // Parent root = loader.load();
			  // ProcessSale PS2 =loader.getController();
			   //PS2.displaytotal(total);
			 Parent root = FXMLLoader.load( getClass().getResource("ProcessSale.fxml") );
			  
			  // Stage stage;
			  	//		   stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			   Scene scene = new Scene(root);
				scene.setRoot(root);
				primaryStage.setTitle("Process Sale");
				primaryStage.setScene(scene);
				 
				primaryStage.show();
			   
		   }
		   catch(Exception e) {
				e.printStackTrace();
			}
		   
		  
		   
	   }
	

}