package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Font;

/* Requirements To Run This Program
 * 1.   Must Install e(fx)clipse 3.8.0 on the Eclipse Marketplace
 * 2.	JFX SDK Folder
 * 3.	Libraries: JavaFX SDK, User Library(JavaFX), and
 * 		JRE System Library [JavaSE-17]
 * 4.	A module path of the JFX SDK 17 lib folder in the VM arguments,
 * 		including the file path
 * 5.	Must Use Eclipe IDE
 */ 

public class Main extends Application {
	TextField txtLastName, txtFirstName, txtEmpAddress, txtEmpID;
	// creates the GUI
	@Override
	public void start(Stage primaryStage) {
		try {
			primaryStage.setTitle("ABC University Employees' Payment System"); // sets the GUI title
			
			Label lblTitle1 = new Label("ABC University Employees Payment System");
			// layout position for lblTitle1
			lblTitle1.setLayoutX(125);
			lblTitle1.setLayoutY(14);
			lblTitle1.setFont(Font.font(20)); // changes font size to 20px
			
			Label lblHeading = new Label("Basic Information");
			// layout position for lblHeading
			lblHeading.setLayoutX(239);
			lblHeading.setLayoutY(44);
			lblHeading.setFont(Font.font(18)); // changes font size to 18px
			
			Label lblLastName = new Label("Last Name:");
			// layout position for lblLastName
			lblLastName.setLayoutX(35);
			lblLastName.setLayoutY(80);
			
			txtLastName = new TextField();
			// layout position for txtLastName
			txtLastName.setLayoutX(377);
			txtLastName.setLayoutY(80);
			txtLastName.setPromptText("Enter Your Last Name");
			txtLastName.setMaxWidth(170);
			txtLastName.setMaxHeight(25);
			
			Label lblFirstName = new Label("First Name:");
			// layout position for lblFirstName
			lblFirstName.setLayoutX(35);
			lblFirstName.setLayoutY(127);
			txtFirstName = new TextField();
			// layout position for txtFirstName
			txtFirstName.setLayoutX(377);
			txtFirstName.setLayoutY(123);
			txtFirstName.setPromptText("Enter Your First Name");
			txtFirstName.setMaxWidth(170);
			txtFirstName.setMaxHeight(25);
			
			Label lblEmpAddress = new Label("Address:");
			lblEmpAddress.setLayoutX(35);
			lblEmpAddress.setLayoutY(166);
			txtEmpAddress = new TextField();
			// layout position for txtFirstName
			txtEmpAddress.setLayoutX(377);
			txtEmpAddress.setLayoutY(166);
			txtEmpAddress.setPromptText("Email Address");
			txtEmpAddress.setMaxWidth(170);
			txtEmpAddress.setMaxHeight(25);
			
			Label lblEmpID = new Label("ID:");
			lblEmpID.setLayoutX(35);
			lblEmpID.setLayoutY(209);
			
			txtEmpID = new TextField();
			// layout position for txtFirstName
			txtEmpID.setLayoutX(377);
			txtEmpID.setLayoutY(209);
			txtEmpID.setPromptText("Employee ID Number");
			txtEmpID.setMaxWidth(170);
			txtEmpID.setMaxHeight(25);
			
			Label lblBasicMonthSal = new Label("Employee Type:");
			lblBasicMonthSal.setLayoutX(35);
			lblBasicMonthSal.setLayoutY(252);
			ComboBox<String> cmbEmpType = new ComboBox<String>();
			cmbEmpType.getItems().add("Lecturer");
			cmbEmpType.getItems().add("Assistant Professor");
			cmbEmpType.getItems().add("Professor");
			cmbEmpType.setLayoutX(377);
			cmbEmpType.setLayoutY(252);
			
			AnchorPane mainFx = new AnchorPane();
			Scene scene1 = new Scene(mainFx,640,400);
			
			Button btnSubmit1 = new Button("Submit");
			// btnSubmit1 layout position
			btnSubmit1.setLayoutX(285);
			btnSubmit1.setLayoutY(290);
			
			AnchorPane empPortalMenu = new AnchorPane();
			Scene sceneMenu = new Scene(empPortalMenu,640,400);
			
			// switches to the Menu when clicked
			btnSubmit1.setOnAction(e -> primaryStage.setScene(sceneMenu));
			
			// adds controls to the Basic Information GUI
			mainFx.getChildren().addAll(btnSubmit1); 
			mainFx.getChildren().add(lblTitle1); 
			mainFx.getChildren().add(lblHeading); 
			mainFx.getChildren().add(lblLastName);
			mainFx.getChildren().add(txtLastName);
			mainFx.getChildren().add(lblFirstName);
			mainFx.getChildren().add(txtFirstName);
			mainFx.getChildren().add(lblEmpAddress);
			mainFx.getChildren().add(txtEmpAddress);
			mainFx.getChildren().add(lblEmpID);
			mainFx.getChildren().add(txtEmpID);
			mainFx.getChildren().addAll(cmbEmpType);
			mainFx.getChildren().addAll(lblBasicMonthSal);
			
			
			primaryStage.setScene(scene1); // sets the stage
			primaryStage.show(); // shows the stage
			
			Label lblTitle2 = new Label("ABC University Employee Portal Menu");
			// layout position for lblTitle2
			lblTitle2.setLayoutX(150);
			lblTitle2.setLayoutY(14);
			lblTitle2.setFont(Font.font(20)); // changes font size to 20px
			
			Label lblMenuOp = new Label("Select an option.");
			// layout position for lblMenuOp
			lblMenuOp.setLayoutX(52);
			lblMenuOp.setLayoutY(74);
			
			RadioButton radReqPay = new RadioButton("Request Annual Payment");
			radReqPay.setLayoutX(52);
			radReqPay.setLayoutY(101);
			RadioButton radSummerCourse = new RadioButton("Teach an Additional Summer Course");
			radSummerCourse.setLayoutX(52);
			radSummerCourse.setLayoutY(159);
			RadioButton radNewGrant = new RadioButton("Received a New Grant");
			radNewGrant.setLayoutX(52);
			radNewGrant.setLayoutY(188);
			
			ToggleGroup menuOptions = new ToggleGroup();
			radReqPay.setToggleGroup(menuOptions);
			radSummerCourse.setToggleGroup(menuOptions);
			radNewGrant.setToggleGroup(menuOptions);
			
			Button btnBack = new Button("Go Back");
			// btnSubmit1 layout position
			btnBack.setLayoutX(285);
			btnBack.setLayoutY(290);
			// returns to the Basic Information section
			btnBack.setOnAction(e -> primaryStage.setScene(scene1));
			
			empPortalMenu.getChildren().add(lblTitle2);
			empPortalMenu.getChildren().add(lblMenuOp);
			empPortalMenu.getChildren().addAll(radReqPay,radSummerCourse,radNewGrant);
			empPortalMenu.getChildren().addAll(btnBack);
			
			AnchorPane requestPayInfoFx = new AnchorPane();
			Scene scene2 = new Scene(requestPayInfoFx,640,400);
			AnchorPane calcNineMPayFx = new AnchorPane();
			AnchorPane summerCourseFx = new AnchorPane();
			Scene scene5 = new Scene(summerCourseFx,640,450);
			AnchorPane newGrantFx = new AnchorPane();
			Scene scene6 = new Scene(newGrantFx,640,450);
			
			txtFirstName.getText();
			txtLastName.getText();
			txtEmpAddress.getText();
			
			radReqPay.setOnAction(e -> primaryStage.setScene(scene2));
			radSummerCourse.setOnAction(e -> primaryStage.setScene(scene5));
			radNewGrant.setOnAction(e -> primaryStage.setScene(scene6));
			
			Label lblTitle3 = new Label("ABC University Request Annual Payment Information");
			// layout position for lblTitle1
			lblTitle3.setLayoutX(75);
			lblTitle3.setLayoutY(14);
			lblTitle3.setFont(Font.font(20)); // changes font size to 20px
			
			Label displayAnnPayInfo = new Label();
			// layout position for displayAnnPayInfo
			displayAnnPayInfo.setLayoutX(45);
			displayAnnPayInfo.setLayoutY(68);
			// max width and height
			displayAnnPayInfo.setMaxWidth(170);
			displayAnnPayInfo.setMaxHeight(150);
			
			Button btnSubmit2 = new Button("Submit");
			// layout position for btnSubmit2
			btnSubmit2.setLayoutX(270);
			btnSubmit2.setLayoutY(310);
			String annPaymentInfo = ""; //printInfo();
			btnSubmit2.setOnAction(e -> displayAnnPayInfo.setText(annPaymentInfo));
			
			Button btnReturnToMenu1 = new Button("Return to Menu");
			// layout position for btnReturnToMenu
			btnReturnToMenu1.setLayoutX(270);
			btnReturnToMenu1.setLayoutY(350);
			// Return to the Menu
			btnReturnToMenu1.setOnAction(e -> primaryStage.setScene(sceneMenu));
			
			requestPayInfoFx.getChildren().add(lblTitle3);
			requestPayInfoFx.getChildren().add(displayAnnPayInfo);
			requestPayInfoFx.getChildren().addAll(btnSubmit2);
			requestPayInfoFx.getChildren().addAll(btnReturnToMenu1);
			
			Button btnReturnToMenu2 = new Button("Return to Menu");
			// layout position for btnReturnToMenu2
			btnReturnToMenu2.setLayoutX(270);
			btnReturnToMenu2.setLayoutY(390);
			// Return to the Menu
			btnReturnToMenu2.setOnAction(e -> primaryStage.setScene(sceneMenu));
			
			Button btnReturnToMenu3 = new Button("Return to Menu");
			// layout position for btnReturnToMenu3
			btnReturnToMenu3.setLayoutX(270);
			btnReturnToMenu3.setLayoutY(390);
			// Return to the Menu
			btnReturnToMenu3.setOnAction(e -> primaryStage.setScene(sceneMenu));
			calcNineMPayFx.getChildren().addAll(btnReturnToMenu3);
			Button btnSubmit4 = new Button("Submit");
			btnSubmit4.setLayoutX(270);
			btnSubmit4.setLayoutY(350);
			calcNineMPayFx.getChildren().addAll(btnSubmit4);
			
			Label lblTitle6 = new Label("ABC University Additional Summer Courses");
			// layout position for lblTitle6
			lblTitle6.setLayoutX(75);
			lblTitle6.setLayoutY(20);
			lblTitle6.setFont(Font.font(20)); // changes font size to 20px
			
			Label lblSummerCourse = new Label("Summer Course Name:");
			lblSummerCourse.setLayoutX(52);
			lblSummerCourse.setLayoutY(74);
			TextField txtSummerCourse = new TextField();
			txtSummerCourse.setLayoutX(200);
			txtSummerCourse.setLayoutY(74);
			
			Button btnReturnToMenu4 = new Button("Return to Menu");
			// layout position for btnReturnToMenu4
			btnReturnToMenu4.setLayoutX(270);
			btnReturnToMenu4.setLayoutY(390);
			btnReturnToMenu4.setLayoutY(390);
			// Return to the Menu
			btnReturnToMenu4.setOnAction(e -> primaryStage.setScene(sceneMenu));
			Button btnSubmit5 = new Button("Submit");
			btnSubmit5.setLayoutX(270);
			btnSubmit5.setLayoutY(350);
			
			btnReturnToMenu4.setOnAction(e -> primaryStage.setScene(sceneMenu));
			summerCourseFx.getChildren().add(lblTitle6);
			summerCourseFx.getChildren().add(lblSummerCourse);
			summerCourseFx.getChildren().add(txtSummerCourse);
			summerCourseFx.getChildren().addAll(btnReturnToMenu4);
			summerCourseFx.getChildren().add(btnSubmit5);
			
			Label lblTitle7 = new Label("ABC University New Grant");
			// layout position for lblTitle7
			lblTitle7.setLayoutX(75);
			lblTitle7.setLayoutY(20);
			lblTitle7.setFont(Font.font(20)); // changes font size to 20px
			
			Label lblGrantAmt = new Label("If you received a grant, how much is it?");
			lblGrantAmt.setLayoutX(52);
			lblGrantAmt.setLayoutY(74);
			TextField txtGrantAmount = new TextField();
			txtGrantAmount.setLayoutX(280);
			txtGrantAmount.setLayoutY(74);
			
			Button btnSubmit3 = new Button("Submit");
			btnSubmit3.setLayoutX(270);
			btnSubmit3.setLayoutY(350);
			
			Button btnReturnToMenu5 = new Button("Return to Menu");
			// layout position for btnReturnToMenu4
			btnReturnToMenu5.setLayoutX(270);
			btnReturnToMenu5.setLayoutY(390);
			// Return to the Menu
			btnReturnToMenu5.setOnAction(e -> primaryStage.setScene(sceneMenu));
			newGrantFx.getChildren().addAll(btnReturnToMenu5);
			newGrantFx.getChildren().add(lblTitle7);
			newGrantFx.getChildren().add(lblGrantAmt);
			newGrantFx.getChildren().add(txtGrantAmount);
			newGrantFx.getChildren().add(btnSubmit3);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/*private String printInfo() {
		return txtFirstName.getText() + txtLastName.getText() + txtEmpAddress.getText();
	}*/
	
	public static void main(String[] args) {
		launch(args); // launches the gui
	}
}