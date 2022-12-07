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
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;

public class DestinController implements Initializable  {
	@FXML private StackPane destin;
	@FXML private Button btnMain;
	@FXML private Button searchlist;
	@FXML private ComboBox<String> combobox;
	@FXML private Label warning;
	@FXML Button exit;
	@FXML private DatePicker datepicker;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}
	static String destination; //스태틱을 안붙이면 씬을 넘어갈때 값이 저장이 안됨.
	String getdestination() {
		return destination;
	}
	public void handleBtnBack(ActionEvent event) {
		try {
			StackPane root = (StackPane) btnMain.getScene().getRoot();
			
			destin.setTranslateX(0);
			
			Timeline timeline = new Timeline();
			KeyValue keyValue = new KeyValue(destin.translateXProperty(), 350);
			KeyFrame keyFrame = new KeyFrame(
	    		Duration.millis(100), 
	    		new EventHandler<ActionEvent>() {
		        	@Override
		        	public void handle(ActionEvent event) {
		        		root.getChildren().remove(destin);
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
	
	public void searchlist(ActionEvent event) {
		try {
			Parent login= FXMLLoader.load(getClass().getResource("traintype.fxml"));
			StackPane root = (StackPane) searchlist.getScene().getRoot();
			root.getChildren().add(login);

			login.setTranslateX(350);

			Timeline timeline = new Timeline();
			KeyValue keyValue = new KeyValue(login.translateXProperty(), 0);
			KeyFrame keyFrame = new KeyFrame(Duration.millis(100), keyValue);
			timeline.getKeyFrames().add(keyFrame);
			timeline.play();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
    public void selectdate(ActionEvent event) {	
    	//선택된 날짜의 값을 문자열로 변환 해서 문자열에 저장합니다.
    	String strDate = datepicker.getValue().toString();
    }
	
	public void exit(ActionEvent event) {
		Platform.exit();
	}
	
}
