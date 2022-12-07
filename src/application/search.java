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
import javafx.scene.layout.StackPane;
import javafx.util.Duration;

public class search implements Initializable {
	@FXML private StackPane destin;
	@FXML private StackPane traintype;
	@FXML private Button btnMain;
	@FXML Button exit;
	@FXML private Button searchlist;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}
	static String complete; //����ƽ�� �Ⱥ��̸� ���� �Ѿ�� ���� ������ �ȵ�.
	String getdestination() {
		return complete;
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
		   

	public void exit(ActionEvent event) {
		Platform.exit();
	}
}
