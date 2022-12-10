package application;

import java.net.URL;
import java.util.ResourceBundle;


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
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;

public class RegisterController implements Initializable {
   @FXML
   private TableView<User> table;
   
   @FXML
    private TableColumn<User, String> TrainColumn;
   
   @FXML
    private TableColumn<User, Integer> DateColumn;
   
   @FXML
    private TableColumn<User, String> LostColumn;
   
   @FXML
    private TextField TrainField;

    @FXML
    private TextField DateField;
    
    @FXML
    private TextField LostField;
   
    @FXML
    private Button registerbtn;
    @FXML private StackPane register;
    
   
    
    static String complete; //스태틱을 안붙이면 씬을 넘어갈때 값이 저장이 안됨.
   String getdestination() {
      return complete;
   }
    
    
    
    ObservableList<User> list = FXCollections.observableArrayList(
          new User(new SimpleStringProperty("ex)무궁화호"),new SimpleIntegerProperty(221010),new SimpleStringProperty("ex)아이폰")));
    
    @Override
    public void initialize(URL location, ResourceBundle resource) {
       TrainColumn.setCellValueFactory(cellData-> cellData.getValue().trainProperty());
       DateColumn.setCellValueFactory(cellData-> cellData.getValue().dateProperty().asObject());
       LostColumn.setCellValueFactory(cellData-> cellData.getValue().lostProperty());
       table.setItems(list);
       
       registerbtn.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
          @Override
          public void handle(MouseEvent event) {
             table.getItems().add(new User(new SimpleStringProperty(TrainField.getText()), 
                   new SimpleIntegerProperty(Integer.parseInt(DateField.getText())),
                         new SimpleStringProperty(LostField.getText())));
             TrainField.clear();
             DateField.clear();
             LostField.clear();
             
          }
       });
       
       
    }
    
    @FXML
    private void delete(ActionEvent event) {
       table.getItems().removeAll(table.getSelectionModel().getSelectedItem());
       
    }
    
    
    public void exit(ActionEvent event) {
      Platform.exit();
   }
 
}