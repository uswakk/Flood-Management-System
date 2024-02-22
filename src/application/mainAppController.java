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
import javafx.scene.control.Button;
import javafx.stage.Stage;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner;
/*public class User()
{
	
}*/

public class mainAppController {

    @FXML
    public TextField ttext;
    public TextField tpassword;
    String userName;
    String Password; //use these variables to verify credentials
    int value = 1;
    
    @FXML
    public URL location;
    
    @FXML
    public Button logIn;

    @FXML
    void btnOKClicked(ActionEvent event)  {
    	//Stage mainWindow  = (Stage) ttext.getScene().getWindow();
    	
    	//int value = 1; //turns 0 of password doesn't matched with the username and if either password or username doesn't exists
        int iUserName = 0; //match Password with userName
        int passwordFound = 1;
        int userNameFound = 1;
        int iPassword = 0; //match Password with userName
    	
    	try
    	{

    		userName  = ttext.getText();
        	Password = tpassword.getText();
        	//String title = "Welcome " + userName + "!"; 
        	//mainWindow.setTitle(title);
        	
        	
        	 try {
        		  
    		      File myObj = new File("C:\\Users\\Lenovo Smart Book\\Desktop\\semester 5\\SDA\\Final Project\\newProj\\src\\application\\userNames.txt");
    		      Scanner myReader = new Scanner(myObj);

    		      while (myReader.hasNextLine()) 
    		      {
    		        String data = myReader.nextLine();
    		        if(data.equals(userName))
    		        {
    		        	//found//
    		        	userNameFound = 1;
    		        	break;
    		        }
    		        else
    		        {
    		        	userNameFound = 0;
    		        	iUserName++;
    		        }
    		       
    		        
    		      }
    		      
    		      if(userNameFound == 0)
   		        {
   		        	value = 0;
   		        }
   		      
    		      //
    		      myReader.close();
    		    } catch (FileNotFoundException e) {
    		      System.out.println("An error occurred.");
    		      e.printStackTrace();
    		    }
    	  
    	  try {
    		  
    		  String compare;
    	      File newObj = new File("C:\\Users\\Lenovo Smart Book\\Desktop\\semester 5\\SDA\\Final Project\\newProj\\src\\application\\passwords.txt");
    	      Scanner myReader = new Scanner(newObj);
    	      while (myReader.hasNextLine()) {
    	        compare = myReader.nextLine();
    	        if(compare.equals(Password))
    	        {
    	        	//found//
    	        	passwordFound = 1;
    	        	break;
    	        }
    	        else
    	        {
    	        	iPassword++;
    	        	passwordFound = 0; 
    	        }
    	        
    	        
    	        
    	        
    	        //System.out.println(compare);
    	      }
    	      myReader.close();
    	    } catch (FileNotFoundException e) {
    	      System.out.println("An error occurred.");
    	      e.printStackTrace();
    	    }
       	
    	  
    	  /*System.out.print(iUserName);
    	  System.out.print(iPassword);
    	  System.out.print(passwordFound);
    	  System.out.print(userNameFound);*/
    	  if( (iPassword == iUserName) && passwordFound == 1 && userNameFound == 1 )
    	  {
    		  System.out.println("Log In Successful! Moving to new Window");
    		  //Stage primaryStage = new Stage();
  	    	  Parent root = FXMLLoader.load( getClass().getResource("HomePage.fxml") );
  	    	  Stage primaryStage = (Stage) logIn.getScene().getWindow();
  	   		  Scene scene = new Scene(root);
  			  primaryStage.setTitle("Welcome @" + userName);
  			  primaryStage.setScene(scene);
  			  primaryStage.show();
    		  value = 1;
    		 
    		  //here we would move on to a new window
    	  }
    	  else
    	  {
    		 System.out.println("Write Credentials again!");
    		 value = 0;
    	  }
        	
        	
        	
        	System.out.println("Username: " + userName);
        	System.out.println("Password: " + Password);
    		
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    	
    	 
 	  
    }
    
    
    
 
   @FXML
   public Button registerUser;
    
   @FXML
    public void signUp(ActionEvent event) throws IOException{
	   
	   
	   try 
	   {
		   //Stage primaryStage = new Stage();
		   	/*Parent root = FXMLLoader.load( getClass().getResource("register.fxml") );
		   	Stage primaryStage = (Stage) registerUser.getScene().getWindow();
			Scene scene = new Scene(root);
			scene.setRoot(root);
			primaryStage.setTitle("Register User");
			primaryStage.setScene(scene);
			primaryStage.show();*/
		   
		Parent root = FXMLLoader.load( getClass().getResource("register.fxml") );
       	Stage primaryStage = (Stage) registerUser.getScene().getWindow();
   		Scene scene = new Scene(root);
   		primaryStage.setScene(scene);
   		primaryStage.show();
			
			
		   
	   }
	   catch(Exception e) {
			e.printStackTrace();
		}
	  
	   
   }
    

    @FXML
    void initialize() {

    }
}
