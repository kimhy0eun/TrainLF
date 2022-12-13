package application;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.function.Predicate;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.css.PseudoClass;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;

public class SearchController implements Initializable {
   @FXML private StackPane search;
   @FXML private Button btnMain;
   @FXML Button exit;
   @FXML private Button searchlist;
   
   @FXML private TableView<LostList> trainTable;
   @FXML private TableColumn<LostList, Integer> date;
   @FXML private TableColumn<LostList, String> train;
   @FXML private TableColumn<LostList, String> lost;
   @FXML private TextField searchBox;
      
   
   @Override
   public void initialize(URL location, ResourceBundle resources) {
        date.setCellValueFactory(cellData -> cellData.getValue().dateProperty().asObject());
        train.setCellValueFactory(cellData -> cellData.getValue().trainProperty());
        lost.setCellValueFactory(cellData -> cellData.getValue().lostProperty());
      
        List<LostList> lostlist = new ArrayList<>();
        lostlist.add(new LostList("무궁화호", 221010, "아이폰"));
        lostlist.add(new LostList("ktx", 221110, "지갑"));
        lostlist.add(new LostList("srt", 221214, "버스"));


        FilteredList<LostList> filteredData = new FilteredList<>(FXCollections.observableList(lostlist));
        trainTable.setItems(filteredData);
        
        trainTable.setRowFactory(tableView -> {
            TableRow<LostList> row = new TableRow<>();
            row.pseudoClassStateChanged(PseudoClass.getPseudoClass("highlighted"), false);
            row.itemProperty().addListener((obs, oldLostList, newLostList) -> {
                boolean assignClass = filteredData.contains(newLostList) &&
                        (newLostList.getLost().equals("아이폰") ||
                                newLostList.getLost().equals("버즈"));

                row.pseudoClassStateChanged(PseudoClass.getPseudoClass("highlighted"), assignClass);
            });
            return row;
            
        });
        
        searchBox.textProperty().addListener((observable, oldValue, newValue) ->
        trainTable.setItems(filterList(lostlist, newValue.toLowerCase()))
        );
   }
   
   private Predicate<LostList> createPredicate(String searchText){
        return LList -> {
            if (searchText == null || searchText.isEmpty()) return true;
            return searchFindsLostList(LList, searchText);
        };
    }

    private ObservableList<LostList> filterList(List<LostList> list, String searchText){
        List<LostList> filteredList = new ArrayList<>();

        for (LostList LList : list){
            if(searchFindsLostList(LList, searchText)){
                filteredList.add(LList);
            }
        }
        return FXCollections.observableList(filteredList);
    }

    private boolean searchFindsLostList(LostList LList, String searchText){
        return (LList.getLost().toLowerCase().contains(searchText)) ||
                (LList.getTrain().toLowerCase().contains(searchText)) ||
                Integer.valueOf(LList.getDate()).toString().equals(searchText);
    }
    
    public void handleClearSearchText(ActionEvent event) {
        searchBox.setText("");
        event.consume();
    }

    public static class LostList {
        IntegerProperty date;
        StringProperty train;
        StringProperty lost;

        public LostList(String train, Integer date, String lost) {
           this.train = new SimpleStringProperty(train);
            this.date = new SimpleIntegerProperty(date);
            this.lost = new SimpleStringProperty(lost);
        }

        public int getDate() {
            return date.get();
        }

        public void setDate(int date) {
            this.date.set(date);
        }

        public IntegerProperty dateProperty() {
            return date;
        }

        public String getTrain() {
            return train.get();
        }

        public void setTrain(String train) {
            this.train.set(train);
        }

        public StringProperty trainProperty() {
            return train;
        }

        public String getLost() {
            return lost.get();
        }

        public void setLost(String lost) {
            this.lost.set(lost);
        }

        public StringProperty lostProperty() {
            return lost;
        }
    }

   public void handleBtnBack(ActionEvent event) {
      try {
         StackPane root = (StackPane) btnMain.getScene().getRoot();
         
         search.setTranslateX(0);
         
         Timeline timeline = new Timeline();
         KeyValue keyValue = new KeyValue(search.translateXProperty(), 350);
         KeyFrame keyFrame = new KeyFrame(
             Duration.millis(100), 
             new EventHandler<ActionEvent>() {
                 @Override
                 public void handle(ActionEvent event) {
                    root.getChildren().remove(search);
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
               Parent login= FXMLLoader.load(getClass().getResource("finddelete.fxml"));
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