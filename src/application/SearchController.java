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
	@FXML private StackPane destin;
	@FXML private StackPane traintype;
	@FXML private Button btnMain;
	@FXML Button exit;
	@FXML private Button searchlist;
	
	@FXML private TableView<Order> trainTable;
	@FXML private TableColumn<Order, Integer> train;
	@FXML private TableColumn<Order, String> date;
	@FXML private TableColumn<Order, String> lost;
	@FXML private TextField searchBox;
		
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		train.setCellValueFactory(cellData -> cellData.getValue().idProperty().asObject());
        date.setCellValueFactory(cellData -> cellData.getValue().stateProperty());
        lost.setCellValueFactory(cellData -> cellData.getValue().cityProperty());
		
        List<Order> orders = new ArrayList<>();
        orders.add(new Order(221010, "무궁화호", "아이폰"));
        orders.add(new Order(221110, "ktx", "지갑"));
        orders.add(new Order(221214, "srt", "버스"));


        FilteredList<Order> filteredData = new FilteredList<>(FXCollections.observableList(orders));
        trainTable.setItems(filteredData);
        
        trainTable.setRowFactory(tableView -> {
            TableRow<Order> row = new TableRow<>();
            row.pseudoClassStateChanged(PseudoClass.getPseudoClass("highlighted"), false);
            row.itemProperty().addListener((obs, oldOrder, newOrder) -> {
                boolean assignClass = filteredData.contains(newOrder) &&
                        (newOrder.getCity().equals("New York") ||
                                newOrder.getCity().equals("Boston"));

                row.pseudoClassStateChanged(PseudoClass.getPseudoClass("highlighted"), assignClass);
            });
            return row;
            
        });
        
        searchBox.textProperty().addListener((observable, oldValue, newValue) ->
        trainTable.setItems(filterList(orders, newValue.toLowerCase()))
        );
	}
	
	private Predicate<Order> createPredicate(String searchText){
        return order -> {
            if (searchText == null || searchText.isEmpty()) return true;
            return searchFindsOrder(order, searchText);
        };
    }

    private ObservableList<Order> filterList(List<Order> list, String searchText){
        List<Order> filteredList = new ArrayList<>();

        for (Order order : list){
            if(searchFindsOrder(order, searchText)){
                filteredList.add(order);
            }
        }
        return FXCollections.observableList(filteredList);
    }

    private boolean searchFindsOrder(Order order, String searchText){
        return (order.getCity().toLowerCase().contains(searchText)) ||
                (order.getState().toLowerCase().contains(searchText)) ||
                Integer.valueOf(order.getId()).toString().equals(searchText);
    }
    
    public void handleClearSearchText(ActionEvent event) {
        searchBox.setText("");
        event.consume();
    }

    public static class Order {
        IntegerProperty id;
        StringProperty state;
        StringProperty city;

        public Order(Integer id, String state, String city) {
            this.id = new SimpleIntegerProperty(id);
            this.state = new SimpleStringProperty(state);
            this.city = new SimpleStringProperty(city);
        }

        public int getId() {
            return id.get();
        }

        public void setId(int id) {
            this.id.set(id);
        }

        public IntegerProperty idProperty() {
            return id;
        }

        public String getState() {
            return state.get();
        }

        public void setState(String state) {
            this.state.set(state);
        }

        public StringProperty stateProperty() {
            return state;
        }

        public String getCity() {
            return city.get();
        }

        public void setCity(String city) {
            this.city.set(city);
        }

        public StringProperty cityProperty() {
            return city;
        }
    }
    
	static String complete; //스태틱을 안붙이면 씬을 넘어갈때 값이 저장이 안됨.
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
