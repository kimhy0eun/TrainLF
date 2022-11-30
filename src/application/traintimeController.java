package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;

public class traintimeController implements Initializable{
	@FXML Button btnBack;
	@FXML StackPane traint;
	@FXML TextField traintypeCheck;
	@FXML Label traintypeCheck2;
	@FXML ListView<String> TimeList;
	@FXML Button gotrainpeople;
	@FXML Label warning;
	@FXML Button exit;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		traintypeController tC = new traintypeController();
		String traintype = tC.gettraintype();
		traintypeCheck.setText(traintype);
		traintypeCheck2.setText(traintype);
		if(traintype.equals("무궁화호")){
			TimeList.setItems(FXCollections.observableArrayList(
				"6:56",
				"8:01",
				"10:09",
				"11:47",
				"13:14",
				"14:55",
				"16:03",
				"17:44",
				"19:34",
				"20:38",
				"22:31",
				"23:25"));
		}
		else if(traintype.equals("새마을호")) {
			TimeList.setItems(FXCollections.observableArrayList(
					"6:36",
					"7:44",
					"8:50",
					"10:01",
					"11:55",
					"13:24",
					"14:45",
					"16:11",
					"17:36",
					"19:29",
					"20:14",
					"23:48"));
		}
		else if(traintype.equals("KTX")) {
			TimeList.setItems(FXCollections.observableArrayList(
					"6:46",
					"7:49",
					"8:52",
					"10:40",
					"13:15",
					"14:35",
					"16:23",
					"17:48",
					"19:04",
					"20:58",
					"22:11",
					"23:08"));
		}
	}
	static String traintimesave; //스태틱을 안붙이면 씬을 넘어갈때 값이 저장이 안됨.
	String gettraintime() {
		return traintimesave;
	}
	public void handleBtnNew(ActionEvent event) {
		traintypeController tC = new traintypeController();
		String traintype = tC.gettraintype();
		traintypeCheck.setText(traintype);
	}
	public void handleBtnBack(ActionEvent event) {
		try {
			StackPane root = (StackPane) btnBack.getScene().getRoot();
			
			traint.setTranslateX(0);
			
			Timeline timeline = new Timeline();
			KeyValue keyValue = new KeyValue(traint.translateXProperty(), 350);
			KeyFrame keyFrame = new KeyFrame(
	    		Duration.millis(100), 
	    		new EventHandler<ActionEvent>() {
		        	@Override
		        	public void handle(ActionEvent event) {
		        		root.getChildren().remove(traint);
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
	public void handlegotrainpeople(ActionEvent event) {
		traintimesave = TimeList.getSelectionModel().getSelectedItem();
		if(traintimesave!=null) {
			try {
			Parent trainpeople= FXMLLoader.load(getClass().getResource("trainpeople.fxml"));
			StackPane root = (StackPane) gotrainpeople.getScene().getRoot();
			root.getChildren().add(trainpeople);
			
			trainpeople.setTranslateX(350);

			Timeline timeline = new Timeline();
			KeyValue keyValue = new KeyValue(trainpeople.translateXProperty(), 0);
			KeyFrame keyFrame = new KeyFrame(Duration.millis(100), keyValue);
			timeline.getKeyFrames().add(keyFrame);
			timeline.play();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
		else {
			warning.setText("시간을 선택해주세요!");
		}
}
	public void exit(ActionEvent event) {
		Platform.exit();
	}
}
