package application;

import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;

import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;

public class DestinController implements Initializable  {
	@FXML private StackPane register;
	@FXML private Button btnMain;
	@FXML private Button add_btn;
	@FXML Button exit;
	@FXML private Label warning;
	@FXML private TextField txt_tk;
	@FXML private TextField int_tn;
	@FXML private TextField int_num;
	@FXML private TextField txt_gdate;
	@FXML private TextField txt_lfk;
	@FXML private TableView<LFinfo> table_lf;
	@FXML private TableColumn<LFinfo, String> table_tk;
	@FXML private TableColumn<LFinfo, String> table_tn;
	@FXML private TableColumn<LFinfo, String> table_gdate;
	@FXML private TableColumn<LFinfo, String> table_lfk;
	
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
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		table_tk.setCellValueFactory(new PropertyValueFactory<>("tk"));
		table_tn.setCellValueFactory(new PropertyValueFactory<>("tn"));
		table_gdate.setCellValueFactory(new PropertyValueFactory<>("gdate"));
		table_lfk.setCellValueFactory(new PropertyValueFactory<>("lfk"));
		table_lf.setItems(getLFinfoList());
	}
	
	
	public void handleregisterComplete(ActionEvent event) {
		
		LFinfo addinfo = new LFinfo();
		addinfo.setTk(txt_tk.getText());
		addinfo.setTn(int_tn.getText());
		//addinfo.setNum(Integer.parseInt(int_num.getText()));
		addinfo.setGdate(txt_gdate.getText());
		addinfo.setLfk(txt_lfk.getText());
		table_lf.getItems().add(addinfo);
		txt_tk.clear();
		int_tn.clear();
		txt_gdate.clear();
		txt_lfk.clear();
			/*try {
				StackPane root = (StackPane) add_btn.getScene().getRoot();
				
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
			}*/
			
		
	}
	ObservableList<LFinfo> getLFinfoList(){
		ObservableList<LFinfo> lfinfos = FXCollections.observableArrayList();
		lfinfos.add(new LFinfo("ktx","315","12.25","지갑"));
		return lfinfos;
	}


	public void exit(ActionEvent event) {
		Platform.exit();
	}
}

