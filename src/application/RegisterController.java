package application;

import java.io.IOException;
import javafx.application.Application;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
public class  RegisterController extends Application{
	
	public int validatePhoneNum(String phoneNum)
	{
		int value = 1;
		if(phoneNum.length() != 11)
		{
			value = 0;
		}
		/*if(phoneNum[0]!='0' && phoneNum[1] != '3')
		{
			value = 0;
		}*/
		return value;
	}

	public int validateCNIC(String CNIC)
	{
		int value = 1;
		if(CNIC.length() != 13)
		{
			value = 0;
		}
		
		try
		{
			String compare;
			File readFile = new File("C:\\Users\\Lenovo Smart Book\\Desktop\\semester 5\\SDA\\Final Project\\newProj\\src\\application\\cnic.txt");
			Scanner Reader = new Scanner(readFile);
			while (Reader.hasNextLine()) {
		        compare= Reader.nextLine();
		        if(compare.equals(CNIC))
		        {
		        	value = 0; //can't have an existing value of CNIC
		        }
		        //System.out.println(compare);
		      }
		      Reader.close();
			
		}
		catch(FileNotFoundException e)
		{
			System.out.println("An error occurred.in the CNIC File");
		      e.printStackTrace();
		}
		//fileReading here
		
		
		return value;
	}
	
	public int validateUserName(String userName)
	{
		int value = 1;
		//file reading here
		try
		{
			String compare;
			File readFile = new File("C:\\Users\\Lenovo Smart Book\\Desktop\\semester 5\\SDA\\Final Project\\newProj\\src\\application\\userNames.txt");
			Scanner Reader = new Scanner(readFile);
			while (Reader.hasNextLine()) {
		        compare= Reader.nextLine();
		        if(compare.equals(userName))
		        {
		        	value = 0; //can't have an existing value of userName
		        }
		        //System.out.println(compare);
		      }
		      Reader.close();
			
		}
		catch(FileNotFoundException e)
		{
			System.out.println("An error occurred in the UserName File");
		      e.printStackTrace();
		}

		
		return value; 
	}
    @FXML
    public ResourceBundle resources;

    @FXML
    public URL location;

    @FXML
    public TextField fName;

    @FXML
    public TextField email;

    @FXML
    public TextField phoneNum;

    @FXML
    public TextField cnic;

    @FXML
    public TextField lName;

    @FXML
    public TextField userName;

    @FXML
    public TextField password;

    @FXML
    public TextField confirmPassword;
    
    @FXML
	public Button SignUp;
    
    @FXML 
    public Button logIN;
	

    @FXML
    public void registerUser(ActionEvent event) throws IOException {
    	
    	int value = 1;

    	
    	String userFirstName = fName.getText();
    	String userLastName = lName.getText();
    	String userPhoneNum = null;
    	String userEmail = email.getText();
    	String userCNIC = null;
    	String usersName = null; 
    	String Password = null;
    	
    	if(validateUserName(userName.getText() ) == 1)
		{
			usersName = userName.getText();
		}
		else
		{
			value = 0;
		}
    	
    	System.out.print(value);
    	
       	if( validatePhoneNum(phoneNum.getText()) == 1 )
    	{
       		userPhoneNum = phoneNum.getText();
    	}
       	else
       	{
       		value = 0;
       	}
       	
       	System.out.print(value);
       	
       	if(validateCNIC(cnic.getText()) == 1)
       	{
       		userCNIC = cnic.getText();
       	}
       	else
       	{
       		value = 0;
       	}
       	System.out.print(value);
    	
    	if(password.getText().equals(confirmPassword.getText()))
    	{
    		Password = password.getText();
    	}
    	
    	//File Writing Here//
    	System.out.print(value);
    	
    	if(value == 1)
    	{
    		System.out.println("Register User Function Working Successfully!"); 
    		try {
       		 
                // Open given file in append mode by creating an
                // object of BufferedWriter class
                BufferedWriter out = new BufferedWriter(
                new FileWriter("C:\\Users\\Lenovo Smart Book\\Desktop\\semester 5\\SDA\\Final Project\\newProj\\src\\application\\usersInfo.txt", true));
     
                // Writing on output stream
                
                out.write(usersName + "/"+ Password + "/" + userCNIC + "/" + userFirstName + userLastName +"/" +userEmail + "/" + userPhoneNum + "/");
                out.newLine();
                //out.newLine();
                // Closing the connection
                out.close();
            }
     
            // Catch block to handle the exceptions
            catch (IOException e) {
     
                // Display message when exception occurs
                System.out.println("exception occurred" + e);
            }
    		
    		//write to a different file
    		try {
          		 
                // Open given file in append mode by creating an
                // object of BufferedWriter class
                BufferedWriter out1 = new BufferedWriter(
                new FileWriter("C:\\Users\\Lenovo Smart Book\\Desktop\\semester 5\\SDA\\Final Project\\newProj\\src\\application\\userNames.txt", true));
                
     
                // Writing on output stream
                out1.write(usersName);
                out1.newLine();
                //out1.newLine();
                // Closing the connection
                out1.close();
            }
     
            // Catch block to handle the exceptions
            catch (IOException e) {
     
                // Display message when exception occurs
                System.out.println("exception occurred" + e);
                }
    		
    		//write to a different file//passwords
    		try {
          		 
                // Open given file in append mode by creating an
                // object of BufferedWriter class
                BufferedWriter out2 = new BufferedWriter(
                new FileWriter("C:\\Users\\Lenovo Smart Book\\Desktop\\semester 5\\SDA\\Final Project\\newProj\\src\\application\\passwords.txt", true));
     
                // Writing on output stream
                out2.write(Password);
                out2.newLine();
                // Closing the connection
                out2.close();
            }
     
            // Catch block to handle the exceptions
            catch (IOException e) {
     
                // Display message when exception occurs
                System.out.println("exception occurred" + e);
                }
    		
    		//write to the cnic file
    		try {
         		 
                // Open given file in append mode by creating an
                // object of BufferedWriter class
                BufferedWriter out3 = new BufferedWriter(
                new FileWriter("C:\\Users\\Lenovo Smart Book\\Desktop\\semester 5\\SDA\\Final Project\\newProj\\src\\application\\cnic.txt", true));
     
                // Writing on output stream
                out3.write(userCNIC);
                out3.newLine();
                // Closing the connection
                out3.close();
            }
     
            // Catch block to handle the exceptions
            catch (IOException e) {
     
                // Display message when exception occurs
                System.out.println("exception occurred" + e);
                }
        	
    		
    		//redirect user to someplace else 
    		//Stage primaryStage = new Stage();
        	Parent root = FXMLLoader.load( getClass().getResource("confirmationPage.fxml") );
        	Stage primaryStage = (Stage) SignUp.getScene().getWindow();
    		Scene scene = new Scene(root);
    		primaryStage.setScene(scene);
    		primaryStage.show();
    		
    	}
    	
    	

    }
    
    @FXML
    public void logIn(ActionEvent event) throws IOException
    {
 	   
 			Parent root = FXMLLoader.load( getClass().getResource("mainApp.fxml") );
        	Stage primaryStage = (Stage) logIN.getScene().getWindow();
    		Scene scene = new Scene(root);
    		primaryStage.setScene(scene);
    		primaryStage.show();
 			
    }

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		
	}
    
   /* @FXML
    void initialize() {
        assert fName != null : "fx:id=\"fName\" was not injected: check your FXML file 'register.fxml'.";
        assert email != null : "fx:id=\"email\" was not injected: check your FXML file 'register.fxml'.";
        assert phoneNum != null : "fx:id=\"phoneNum\" was not injected: check your FXML file 'register.fxml'.";
        assert cnic != null : "fx:id=\"cnic\" was not injected: check your FXML file 'register.fxml'.";
        assert lName != null : "fx:id=\"lName\" was not injected: check your FXML file 'register.fxml'.";
        assert userName != null : "fx:id=\"userName\" was not injected: check your FXML file 'register.fxml'.";
        assert password != null : "fx:id=\"password\" was not injected: check your FXML file 'register.fxml'.";
        assert confirmPassword != null : "fx:id=\"confirmPassword\" was not injected: check your FXML file 'register.fxml'.";

    }*/
}
