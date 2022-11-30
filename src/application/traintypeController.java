package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;
import java.lang.*;

public class traintypeController implements Initializable {
	@FXML TextField destinCheck;
	@FXML Button btnBack;
	@FXML StackPane traint;
	@FXML Label destinCheck2;
	@FXML ListView<String> listView;
	@FXML ImageView imageView;
	@FXML Button gotraintime;
	@FXML Label warning;
	@FXML Button exit;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		DestinController destinController = new DestinController();
		String destination = destinController.getdestination();
		destinCheck.setText(destination);
		destinCheck2.setText(destination);
		listView.setItems(FXCollections.observableArrayList("무궁화호","새마을호","KTX"));
		listView.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				// TODO Auto-generated method stub
				if(newValue.equals(0)) {
					imageView.setImage(new Image(getClass().getResource("trainpicture/무궁화호.PNG").toString()));
				}
				if(newValue.equals(1)) {
					imageView.setImage(new Image(getClass().getResource("trainpicture/새마을호.PNG").toString()));
				}
				if(newValue.equals(2)) {
					imageView.setImage(new Image(getClass().getResource("trainpicture/KTX.PNG").toString()));
				}
			}
		});

	}
	static String traintype; //스태틱을 안붙이면 씬을 넘어갈때 값이 저장이 안됨.
	String gettraintype() {
		return traintype;
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
	public void handleBtnNew(ActionEvent event) {
		DestinController destinController = new DestinController();
		String destination = destinController.getdestination();
		destinCheck.setText(destination);
	}
	public void handlegotraintime(ActionEvent event) {
	traintype = listView.getSelectionModel().getSelectedItem();
	if(traintype!=null) {
	try {
		warning.setText("");
		Parent traintime= FXMLLoader.load(getClass().getResource("traintime.fxml"));
		StackPane root = (StackPane) gotraintime.getScene().getRoot();
		root.getChildren().add(traintime);
		
		traintime.setTranslateX(350);

		Timeline timeline = new Timeline();
		KeyValue keyValue = new KeyValue(traintime.translateXProperty(), 0);
		KeyFrame keyFrame = new KeyFrame(Duration.millis(100), keyValue);
		timeline.getKeyFrames().add(keyFrame);
		timeline.play();
	} catch(Exception e) {
		e.printStackTrace();
	}
	}
	else {
		warning.setText("기차를 선택해주세요!");
	}
}
	public void exit(ActionEvent event) {
		Platform.exit();
	}
}
