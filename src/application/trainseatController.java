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
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;

public class trainseatController implements Initializable{
	@FXML Button btnBack;
	@FXML StackPane trains;
	@FXML TextField money;
	int summoney;
	@FXML Button direct;
	@FXML Button random;
	@FXML Button exit;
	static int bit=0;
	int israndom() {
		return bit;
	}
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		trainpeopleController tC = new trainpeopleController();
		summoney = tC.getsummoney();
		money.setText(String.valueOf((int)(summoney/100)*100)+"¿ø");
		}
	public void handleBtnBack(ActionEvent event) {
		try {
			StackPane root = (StackPane) btnBack.getScene().getRoot();
			
			trains.setTranslateX(0);
			
			Timeline timeline = new Timeline();
			KeyValue keyValue = new KeyValue(trains.translateXProperty(), 350);
			KeyFrame keyFrame = new KeyFrame(
	    		Duration.millis(100), 
	    		new EventHandler<ActionEvent>() {
		        	@Override
		        	public void handle(ActionEvent event) {
		        		root.getChildren().remove(trains);
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
	public void handleBtnNew(ActionEvent event) {
		money.setText(String.valueOf((int)(summoney/100)*100)+"¿ø");
	}
	public void handledirect(ActionEvent event) {
				try{
				Parent dt= FXMLLoader.load(getClass().getResource("directseat.fxml"));
				StackPane root = (StackPane) direct.getScene().getRoot();
				root.getChildren().add(dt);
			
				dt.setTranslateX(350);

				Timeline timeline = new Timeline();
				KeyValue keyValue = new KeyValue(dt.translateXProperty(), 0);
				KeyFrame keyFrame = new KeyFrame(Duration.millis(100), keyValue);
				timeline.getKeyFrames().add(keyFrame);
				timeline.play();
				} catch (Exception e) {
					e.printStackTrace();
				}
	}
	public void handlegorandom(ActionEvent event) {
		bit=1;
				try {
				Parent tg= FXMLLoader.load(getClass().getResource("result.fxml"));
				StackPane root = (StackPane) random.getScene().getRoot();
				root.getChildren().add(tg);
			
				tg.setTranslateX(350);

				Timeline timeline = new Timeline();
				KeyValue keyValue = new KeyValue(tg.translateXProperty(), 0);
				KeyFrame keyFrame = new KeyFrame(Duration.millis(100), keyValue);
				timeline.getKeyFrames().add(keyFrame);
				timeline.play();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void exit(ActionEvent event) {
		Platform.exit();
	}
}