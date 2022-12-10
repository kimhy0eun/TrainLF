package application;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.StackPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class loginController implements Initializable{
	@FXML private StackPane Login;
	@FXML private Button login;
	@FXML private TextField crewid;
	@FXML private PasswordField pwd;
	@FXML private Button regisbtn,btnMain;
	
	final int FL = 10;
	private Stage primaryStage;
	 
    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }
    
    static String complete; //스태틱을 안붙이면 씬을 넘어갈때 값이 저장이 안됨.
	String getdestination() {
		return complete;
	}
    
    public void handleBtnBack(ActionEvent event) {
		try {
			StackPane root = (StackPane) btnMain.getScene().getRoot();
			
			Login.setTranslateX(0);
			
			Timeline timeline = new Timeline();
			KeyValue keyValue = new KeyValue(Login.translateXProperty(), 350);
			KeyFrame keyFrame = new KeyFrame(
	    		Duration.millis(100), 
	    		new EventHandler<ActionEvent>() {
		        	@Override
		        	public void handle(ActionEvent event) {
		        		root.getChildren().remove(Login);
		        	}
		        }, 
		        keyValue
	        );
			timeline.getKeyFrames().add(keyFrame);
			timeline.play();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		// TODO Auto-generated method stub
	 
		try {
			login.setDisable(true);
			login.setOnAction(e -> {
				try {
					userAction();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			});
			crewid.textProperty().addListener((obs, oldTxt, newTxt)-> {
				checkFieldLength();
			});
		}catch(NullPointerException e) {
			
		}
		
	}
	public void checkFieldLength() {
		login.setDisable(false);
		if(crewid.getLength()>= FL) {
			crewid.setText( crewid.getText().substring(0, FL));
		}
	}
	public void userAction() throws Exception {
		if(!userField(this.crewid, this.pwd))
			return;
		String cid = this.crewid.getText();
		String pw = this.pwd.getText();
		loginDB logindb = new loginDB();
		
		if(pw.equals(logindb.getPassword(cid))) {
			//Msg("로그인 성공했습니다.");
			Stage dialog = new Stage(StageStyle.DECORATED);
			Parent sub= FXMLLoader.load(getClass().getResource("register.fxml"));
			Scene scene = new Scene(sub);
			dialog.setScene(scene);
			dialog.show();
		}else {
			Msg("로그인 실패했습니다.");
			
			this.pwd.clear();
		}

	}
	public boolean userField(TextField crewid, PasswordField pwd) {
		if(crewid.getText().isEmpty()) {
			Msg("ID를 입력해주세요");
			crewid.requestFocus();
			pwd.clear();
			return false;
		}
		if(pwd.getText().isEmpty()) {
			Msg("패스워드를 입력해주세요");
			pwd.requestFocus();
			return false;
		}
		return true;
	}
	private void Msg(String string) {
		Alert alert1 = new Alert(AlertType.INFORMATION);
		alert1.setContentText(string);
		alert1.show();	
	}
	private void Msg2(String string) {
		Alert alert2 = new Alert(AlertType.INFORMATION);
		alert2.setContentText(string);
		alert2.show();
		
		alert2.getButtonTypes().clear();
		alert2.getButtonTypes().addAll(ButtonType.OK, ButtonType.NO);
		
		Button okbtn = (Button)alert2.getDialogPane().lookupButton(ButtonType.NO);
		okbtn.setDefaultButton(false);
		Button nobtn = (Button)alert2.getDialogPane().lookupButton(ButtonType.OK);
		nobtn.setDefaultButton(true);
		
		Optional<ButtonType> result = alert2.showAndWait();
		if(result.get() == ButtonType.OK) {
			
		}
	}
	/*public void  handleBtnLogin(ActionEvent event) {
		Stage dialog = new Stage(StageStyle.DECORATED);
		dialog.initModality(Modality.NONE);
		dialog.initOwner(primaryStage);
		 
		try {
			Parent dialog_root= FXMLLoader.load(getClass().getResource("dialog_login.fxml"));
			Button btn_next = (Button) dialog_root.lookup("#btn_next");
			btn_next.setOnAction(e->{
				try {
						Parent sub= FXMLLoader.load(getClass().getResource("destin.fxml"));
						StackPane root = (StackPane) regisbtn.getScene().getRoot();
						root.getChildren().add(login);
						dialog.close();
					
					} catch(Exception exception) {
					
					}
					
			});
			Scene scene = new Scene(dialog_root);
			dialog.setScene(scene);
			dialog.show();
			}catch(IOException e) {
				
			}
			
	}*/
	}

	

