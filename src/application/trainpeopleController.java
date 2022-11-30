package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;

public class trainpeopleController implements Initializable{
	@FXML TextField traintimeCheck;
	@FXML Button btnBack;
	@FXML StackPane trainp;
	@FXML Slider peopleslider;
	@FXML Slider oldpeopleslider;
	@FXML Slider youngpeopleslider;
	@FXML TextField people;
	@FXML TextField oldpeople;
	@FXML TextField youngpeople;
	@FXML TextField sumpeople;
	@FXML TextField moneytext;
	@FXML Button goseat;
	@FXML Button exit;
	@FXML Label warning;
	static int peopledata = 1;
	static int oldpeopledata = 0;
	static int generalpeopledata = 1;
	static int youngpeopledata = 0;
	static int summoney;
	int getsummoney() {
		return summoney;
	}
	void calculator() {
		String[] destination = {"오송","충주","대전","김천","부산","영동","서울","구미","수원", "인천","천안","울산",
				"대구","광주","대천"};
		int[] distance = {7,59,34,87,226,64,107,102,77,115,28,198,131,70,80};
		DestinController DC = new DestinController();
		String destinationdata = DC.getdestination();
		trainpeopleController tc = new trainpeopleController();
		traintypeController tT = new traintypeController();
		String traintype = tT.gettraintype();
		int gp = tc.getgeneralpeople();
		int op = tc.getoldpeople();
		int yp = tc.getyoungpeople();
		
		if(traintype.equals("무궁화호")) {
		for(int i=0; i<destination.length;i++) {
			if(destinationdata.equals(destination[i])) {
				if(distance[i]<=30) {
					if(gp==0) {
						summoney = (int)(2600*(0.7*op+0.5*yp));
						break;
					}
					else if(yp==0){
						summoney = (int)(2600*(gp+0.7*op));
						break;
					}
					else {
						summoney = (int)(2600*(gp+0.5*(yp-1)+0.7*op));
						break;
					}
					
				}
				else {
					if(gp==0) {
						summoney = (int)((2600+(int)((distance[i]-30)/5)*400)*(0.7*op+0.5*yp));
						break;
					}
					else if(yp==0){
						summoney = (int)((2600+(int)((distance[i]-30)/5)*400)*(gp+0.7*op));
						break;
					}
					else {
						summoney = (int)((2600+(int)((distance[i]-30)/5)*400)*(gp+0.5*(yp-1)+0.7*op));
						break;
					}
				}
			}
		}
		moneytext.setText(String.valueOf(((int)(summoney/100)*100))+"원");
		summoney = ((summoney/100)*100);
		}
		else if(traintype.equals("새마을호")) {
			for(int i=0; i<destination.length;i++) {
				if(destinationdata.equals(destination[i])) {
					if(distance[i]<=30) {
						if(gp==0) {
							summoney = (int)(1.3*(2600*(0.7*op+0.5*yp)));
							break;
						}
						else if(yp==0){
							summoney = (int)(1.3*(2600*(gp+0.7*op)));
							break;
						}
						else {
							summoney = (int)(1.3*(2600*(gp+0.5*(yp-1)+0.7*op)));
							break;
						}
						
					}
					else {
						if(gp==0) {
							summoney = (int)(1.3*((2600+(int)((distance[i]-30)/5)*400)*(0.7*op+0.5*yp)));
							break;
						}
						else if(yp==0){
							summoney = (int)(1.3*((2600+(int)((distance[i]-30)/5)*400)*(gp+0.7*op)));
							break;
						}
						else {
							summoney = (int)(1.3*((2600+(int)((distance[i]-30)/5)*400)*(gp+0.5*(yp-1)+0.7*op)));
							break;
						}
					}
				}
			}
			moneytext.setText(String.valueOf(((int)(summoney/100)*100))+"원");
			summoney = ((summoney/100)*100);
		}
		else {
			for(int i=0; i<destination.length;i++) {
				if(destinationdata.equals(destination[i])) {
					if(distance[i]<=30) {
						if(gp==0) {
							summoney = (int)(1.5*(2600*(0.7*op+0.5*yp)));
							break;
						}
						else if(yp==0){
							summoney = (int)(1.5*(2600*(gp+0.7*op)));
							break;
						}
						else {
							summoney = (int)(1.5*(2600*(gp+0.5*(yp-1)+0.7*op)));
							break;
						}
						
					}
					else {
						if(gp==0) {
							summoney = (int)(1.5*((2600+(int)((distance[i]-30)/5)*400)*(0.7*op+0.5*yp)));
							break;
						}
						else if(yp==0){
							summoney = (int)(1.5*((2600+(int)((distance[i]-30)/5)*400)*(gp+0.7*op)));
							break;
						}
						else {
							summoney = (int)(1.5*((2600+(int)((distance[i]-30)/5)*400)*(gp+0.5*(yp-1)+0.7*op)));
							break;
						}
					}
				}
			}
			moneytext.setText(String.valueOf(((int)(summoney/100)*100))+"원");
			summoney = ((summoney/100)*100);
		}
	}
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		calculator();
		traintimeController tC = new traintimeController();
		String traintime = tC.gettraintime();
		traintimeCheck.setText(traintime);
		peopleslider.valueProperty().addListener(new ChangeListener<Number>() {
			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				// TODO Auto-generated method stub
				people.setText(String.valueOf((int)(peopleslider.getValue())));
				sumpeople.setText(String.valueOf((int)peopleslider.getValue()+(int)oldpeopleslider.getValue()+(int)youngpeopleslider.getValue()));
				peopledata=(int)peopleslider.getValue()+(int)oldpeopleslider.getValue()+(int)youngpeopleslider.getValue();
				generalpeopledata = (int) peopleslider.getValue();
				calculator();
			}
		});
		oldpeopleslider.valueProperty().addListener(new ChangeListener<Number>() {
			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				// TODO Auto-generated method stub
				oldpeople.setText(String.valueOf((int)(oldpeopleslider.getValue())));
				sumpeople.setText(String.valueOf((int)peopleslider.getValue()+(int)oldpeopleslider.getValue()+(int)youngpeopleslider.getValue()));
				peopledata=(int)peopleslider.getValue()+(int)oldpeopleslider.getValue()+(int)youngpeopleslider.getValue();
				oldpeopledata = (int) oldpeopleslider.getValue();
				calculator();
			}
		});
		youngpeopleslider.valueProperty().addListener(new ChangeListener<Number>() {
			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				// TODO Auto-generated method stub
				youngpeople.setText(String.valueOf((int)(youngpeopleslider.getValue())));
				sumpeople.setText(String.valueOf((int)peopleslider.getValue()+(int)oldpeopleslider.getValue()+(int)youngpeopleslider.getValue()));
				peopledata=(int)peopleslider.getValue()+(int)oldpeopleslider.getValue()+(int)youngpeopleslider.getValue();
				youngpeopledata = (int) youngpeopleslider.getValue();
				calculator();
			}
		});
	}
		
	int getpeople() {
		return peopledata;
	}
	int getyoungpeople() {
		return youngpeopledata;
	}
	int getgeneralpeople() {
		return generalpeopledata;
	}
	int getoldpeople() {
		return oldpeopledata;
	}
	public void handleBtnNew(ActionEvent event) {
		traintimeController tC = new traintimeController();
		String traintime = tC.gettraintime();
		traintimeCheck.setText(traintime);
	}
	public void handleBtnBack(ActionEvent event) {
		try {
			summoney=0;
			peopledata=1;
			youngpeopledata=0;
			generalpeopledata = 1;
			oldpeopledata=0;
			StackPane root = (StackPane) btnBack.getScene().getRoot();
			
			trainp.setTranslateX(0);
			
			Timeline timeline = new Timeline();
			KeyValue keyValue = new KeyValue(trainp.translateXProperty(), 350);
			KeyFrame keyFrame = new KeyFrame(
	    		Duration.millis(100), 
	    		new EventHandler<ActionEvent>() {
		        	@Override
		        	public void handle(ActionEvent event) {
		        		root.getChildren().remove(trainp);
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
	public void handlegoseat(ActionEvent event) {
		if(peopledata>10) {
			warning.setText("10명 초과!");
		}
		else if(peopledata==0) {
			warning.setText("인원 없음!");
		}
		else{
			warning.setText("");
			try {
			Parent trainseat= FXMLLoader.load(getClass().getResource("trainseat.fxml"));
			StackPane root = (StackPane) goseat.getScene().getRoot();
			root.getChildren().add(trainseat);
			
			trainseat.setTranslateX(350);

			Timeline timeline = new Timeline();
			KeyValue keyValue = new KeyValue(trainseat.translateXProperty(), 0);
			KeyFrame keyFrame = new KeyFrame(Duration.millis(100), keyValue);
			timeline.getKeyFrames().add(keyFrame);
			timeline.play();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	}
	public void exit(ActionEvent event) {
		Platform.exit();
	}
}