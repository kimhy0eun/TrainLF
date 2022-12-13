package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;

public class findController implements Initializable {
	@FXML private StackPane finddelete;
	@FXML private Button btnMain, exit;
	@FXML
	private TableView<User> table;
	
	@FXML
    private TableColumn<User, String> TrainColumn;
	
	@FXML
    private TableColumn<User, Integer> DateColumn;
	
	@FXML
    private TableColumn<User, String> LostColumn;
	
	
    @FXML
    private TextField LostField;
    
    @FXML
    private Button deletebtn;
    
    /*static String train1;
    String gettrain() {
    	return train1;
    }
    static String date1;
    String getdate() {
    	return date1;
    }
    static String lost1;
    String getlost() {
    	return lost1;
    }*/
    
    ObservableList<User> list = FXCollections.observableArrayList(
    		new User(new SimpleStringProperty("����ȭȣ"),new SimpleIntegerProperty(221010),new SimpleStringProperty("������")));
    		//new User(new SimpleStringProperty("ktx"),new SimpleIntegerProperty(221110),new SimpleStringProperty("����"))
    		//,new User(new SimpleStringProperty("srt"),new SimpleIntegerProperty(221214),new SimpleStringProperty("����")));
    
    @Override
    public void initialize(URL location, ResourceBundle resource) {
    	TrainColumn.setCellValueFactory(cellData-> cellData.getValue().trainProperty());
    	DateColumn.setCellValueFactory(cellData-> cellData.getValue().dateProperty().asObject());
    	LostColumn.setCellValueFactory(cellData-> cellData.getValue().lostProperty());
    	table.setItems(list);
    	

    }
    @FXML
    private void delete(ActionEvent event) {
       table.getItems().removeAll(table.getSelectionModel().getSelectedItem());
       
    }
    
    public void handleBtnBack(ActionEvent event) {
		try {
			StackPane root = (StackPane) btnMain.getScene().getRoot();
			
			finddelete.setTranslateX(0);
			
			Timeline timeline = new Timeline();
			KeyValue keyValue = new KeyValue(finddelete.translateXProperty(), 350);
			KeyFrame keyFrame = new KeyFrame(
	    		Duration.millis(100), 
	    		new EventHandler<ActionEvent>() {
		        	@Override
		        	public void handle(ActionEvent event) {
		        		root.getChildren().remove(finddelete);
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
    
 /*   
    //��Ϲ�ư
    @FXML
    void registerbtn(ActionEvent event) {
    	User user = new User(TrainField.getText(),
    			Integer.parseInt(DateField.getText()),
    			LostField.getText());
    	ObservableList<User> users = table.getItems();
    	users.add(user);
    	table.setItems(users);
    }
    
    //������ư
    @FXML
    void deletebtn(ActionEvent event) {
    	int selectedID = table.getSelectionModel().getSelectedIndex();
    	table.getItems().remove(selectedID);
    }*/
}
