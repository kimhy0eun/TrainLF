package application;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;

public class rootController2 implements Initializable {
	@FXML Button btnLogin;
	@FXML TextField currenttime;
	@FXML Button found;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		btnLogin.setOnAction(e->handleBtnLogin(e));
		Thread thread = new Thread() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy³â MM¿ù ddÀÏ HH:mm:ss");
				while(true) {
					String Time = sdf.format(new Date());
					Platform.runLater(()->{
						currenttime.setText(Time);
					});
					try {
						Thread.sleep(100);
					}
					catch (Exception e) {
					}
				}
			};
		};
		thread.setDaemon(true);
		thread.start();
	}
	
	public void  handleBtnLogin(ActionEvent event) {
		try {
			Parent login= FXMLLoader.load(getClass().getResource("destin.fxml"));
			StackPane root = (StackPane) btnLogin.getScene().getRoot();
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
	public void exit(ActionEvent event) {
		Platform.exit();
	}
}