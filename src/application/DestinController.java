package application;

import java.net.URL;
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
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;

public class DestinController implements Initializable  {
	@FXML private StackPane register;
	@FXML private StackPane traintype;
	@FXML private Button btnMain;
	@FXML private Button registerComplete;
	@FXML Button exit;
	@FXML private Label warning;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}
	static String complete; //스태틱을 안붙이면 씬을 넘어갈때 값이 저장이 안됨.
	String getdestination() {
		return complete;
	}
	public void handleBtnBack(ActionEvent event) {
		try {
			StackPane root = (StackPane) btnMain.getScene().getRoot();
			
			register.setTranslateX(0);
			
			Timeline timeline = new Timeline();
			KeyValue keyValue = new KeyValue(register.translateXProperty(), 350);
			KeyFrame keyFrame = new KeyFrame(
	    		Duration.millis(100), 
	    		new EventHandler<ActionEvent>() {
		        	@Override
		        	public void handle(ActionEvent event) {
		        		root.getChildren().remove(register);
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
	
	public void handleregisterComplete(ActionEvent event) {
		
			try {
				StackPane root = (StackPane) registerComplete.getScene().getRoot();
				
				register.setTranslateX(0);
				
				Timeline timeline = new Timeline();
				KeyValue keyValue = new KeyValue(register.translateXProperty(), 350);
				KeyFrame keyFrame = new KeyFrame(
		    		Duration.millis(100), 
		    		new EventHandler<ActionEvent>() {
			        	@Override
			        	public void handle(ActionEvent event) {
			        		root.getChildren().remove(register);
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
	public void exit(ActionEvent event) {
		Platform.exit();
	}
}
