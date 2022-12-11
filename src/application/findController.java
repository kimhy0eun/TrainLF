package application;

import java.net.URL;
import java.util.ResourceBundle;

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

public class findController implements Initializable {
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
    		new User(new SimpleStringProperty("무궁화호"),new SimpleIntegerProperty(221010),new SimpleStringProperty("아이폰")));
    		//new User(new SimpleStringProperty("ktx"),new SimpleIntegerProperty(221110),new SimpleStringProperty("지갑"))
    		//,new User(new SimpleStringProperty("srt"),new SimpleIntegerProperty(221214),new SimpleStringProperty("버즈")));
    
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
    
 /*   
    //등록버튼
    @FXML
    void registerbtn(ActionEvent event) {
    	User user = new User(TrainField.getText(),
    			Integer.parseInt(DateField.getText()),
    			LostField.getText());
    	ObservableList<User> users = table.getItems();
    	users.add(user);
    	table.setItems(users);
    }
    
    //삭제버튼
    @FXML
    void deletebtn(ActionEvent event) {
    	int selectedID = table.getSelectionModel().getSelectedIndex();
    	table.getItems().remove(selectedID);
    }*/
}
