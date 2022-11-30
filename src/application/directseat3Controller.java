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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;

public class directseat3Controller implements Initializable{
	@FXML Button btnBack;
	@FXML Button gofrom3to1;
	@FXML Button gofrom3to2;
	@FXML StackPane traindi;
	@FXML Button c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20,c21,c22,c23,c24,c25,c26,c27,c28,c29,c30,c31,c32;
	@FXML TextField selectseatc1;
	@FXML TextField selectseatc2;
	@FXML TextField selectseatc3;
	@FXML TextField selectseatc4;
	@FXML TextField selectseatc5;
	@FXML TextField selectseatc6;
	@FXML TextField selectseatc7;
	@FXML TextField selectseatc8;
	@FXML TextField selectseatc9;
	@FXML TextField selectseatc10;
	@FXML Button exit;
	@FXML Label warning;
	@FXML Button done;
	directseatController dC = new directseatController();
	trainpeopleController tc = new trainpeopleController();
	int totalpeople = tc.getpeople();
	int count=dC.getcount();
	dup1 d3 = new dup1();
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		if(count==0) {
			if(totalpeople==1) {
				selectseatc1.setText("미정");
				selectseatc2.setText("-");
				selectseatc3.setText("-");
				selectseatc4.setText("-");
				selectseatc5.setText("-");
				selectseatc6.setText("-");
				selectseatc7.setText("-");
				selectseatc8.setText("-");
				selectseatc9.setText("-");
				selectseatc10.setText("-");
			}
			else if(totalpeople==2) {
				selectseatc1.setText("미정");
				selectseatc2.setText("미정");
				selectseatc3.setText("-");
				selectseatc4.setText("-");
				selectseatc5.setText("-");
				selectseatc6.setText("-");
				selectseatc7.setText("-");
				selectseatc8.setText("-");
				selectseatc9.setText("-");
				selectseatc10.setText("-");
			}
			else if(totalpeople==3) {
				selectseatc1.setText("미정");
				selectseatc2.setText("미정");
				selectseatc3.setText("미정");
				selectseatc4.setText("-");
				selectseatc5.setText("-");
				selectseatc6.setText("-");
				selectseatc7.setText("-");
				selectseatc8.setText("-");
				selectseatc9.setText("-");
				selectseatc10.setText("-");
			}
			else if(totalpeople==4) {
				selectseatc1.setText("미정");
				selectseatc2.setText("미정");
				selectseatc3.setText("미정");
				selectseatc4.setText("미정");
				selectseatc5.setText("-");
				selectseatc6.setText("-");
				selectseatc7.setText("-");
				selectseatc8.setText("-");
				selectseatc9.setText("-");
				selectseatc10.setText("-");
			}
			else if(totalpeople==5) {
				selectseatc1.setText("미정");
				selectseatc2.setText("미정");
				selectseatc3.setText("미정");
				selectseatc4.setText("미정");
				selectseatc5.setText("미정");
				selectseatc6.setText("-");
				selectseatc7.setText("-");
				selectseatc8.setText("-");
				selectseatc9.setText("-");
				selectseatc10.setText("-");
			}
			else if(totalpeople==6) {
				selectseatc1.setText("미정");
				selectseatc2.setText("미정");
				selectseatc3.setText("미정");
				selectseatc4.setText("미정");
				selectseatc5.setText("미정");
				selectseatc6.setText("미정");
				selectseatc7.setText("-");
				selectseatc8.setText("-");
				selectseatc9.setText("-");
				selectseatc10.setText("-");
			}
			else if(totalpeople==7) {
				selectseatc1.setText("미정");
				selectseatc2.setText("미정");
				selectseatc3.setText("미정");
				selectseatc4.setText("미정");
				selectseatc5.setText("미정");
				selectseatc6.setText("미정");
				selectseatc7.setText("미정");
				selectseatc8.setText("-");
				selectseatc9.setText("-");
				selectseatc10.setText("-");
			}
			else if(totalpeople==8) {
				selectseatc1.setText("미정");
				selectseatc2.setText("미정");
				selectseatc3.setText("미정");
				selectseatc4.setText("미정");
				selectseatc5.setText("미정");
				selectseatc6.setText("미정");
				selectseatc7.setText("미정");
				selectseatc8.setText("미정");
				selectseatc9.setText("-");
				selectseatc10.setText("-");
			}
			else if(totalpeople==9) {
				selectseatc1.setText("미정");
				selectseatc2.setText("미정");
				selectseatc3.setText("미정");
				selectseatc4.setText("미정");
				selectseatc5.setText("미정");
				selectseatc6.setText("미정");
				selectseatc7.setText("미정");
				selectseatc8.setText("미정");
				selectseatc9.setText("미정");
				selectseatc10.setText("-");
			}
			else if(totalpeople==10) {
				selectseatc1.setText("미정");
				selectseatc2.setText("미정");
				selectseatc3.setText("미정");
				selectseatc4.setText("미정");
				selectseatc5.setText("미정");
				selectseatc6.setText("미정");
				selectseatc7.setText("미정");
				selectseatc8.setText("미정");
				selectseatc9.setText("미정");
				selectseatc10.setText("미정");
			}
		}
		else {
			String seatdata1 = dC.getseat1();
			String seatdata2 = dC.getseat2();
			String seatdata3 = dC.getseat3();
			String seatdata4 = dC.getseat4();
			String seatdata5 = dC.getseat5();
			String seatdata6 = dC.getseat6();
			String seatdata7 = dC.getseat7();
			String seatdata8 = dC.getseat8();
			String seatdata9 = dC.getseat9();
			String seatdata10 = dC.getseat10();
			selectseatc1.setText(seatdata1);
			selectseatc2.setText(seatdata2);
			selectseatc3.setText(seatdata3);
			selectseatc4.setText(seatdata4);
			selectseatc5.setText(seatdata5);
			selectseatc6.setText(seatdata6);
			selectseatc7.setText(seatdata7);
			selectseatc8.setText(seatdata8);
			selectseatc9.setText(seatdata9);
			selectseatc10.setText(seatdata10);
			for(int i=0; i<10; i++) {
				int set = d3.getarrayvalue3(i);
				if(set==1) c1.setDisable(true); if(set==2) c2.setDisable(true); if(set==3) c3.setDisable(true); if(set==4) c4.setDisable(true);
				if(set==5) c5.setDisable(true); if (set==6) c6.setDisable(true); if(set==7) c7.setDisable(true); if(set==8) c8.setDisable(true);
				if(set==9) c9.setDisable(true); if(set==10) c10.setDisable(true); if(set==11) c11.setDisable(true); if(set==12) c12.setDisable(true);
				if(set==13) c13.setDisable(true); if(set==14) c14.setDisable(true); if(set==15) c15.setDisable(true); if(set==16) c16.setDisable(true);
				if(set==17) c17.setDisable(true); if(set==18) c18.setDisable(true); if(set==19) c19.setDisable(true); if(set==20) c20.setDisable(true);
				if(set==21) c21.setDisable(true); if(set==22) c22.setDisable(true); if(set==23) c23.setDisable(true); if(set==24) c24.setDisable(true);
				if(set==25) c25.setDisable(true); if(set==26) c26.setDisable(true); if(set==27) c27.setDisable(true); if(set==28) c28.setDisable(true);
				if(set==29) c29.setDisable(true); if(set==30) c30.setDisable(true); if(set==31) c31.setDisable(true); if(set==32) c32.setDisable(true);	
			}
		}		
	}
	public void handleBtnBack(ActionEvent event) {
		try {
			dC.initializecount();
			StackPane root = (StackPane) btnBack.getScene().getRoot();
			
			btnBack.setTranslateX(0);
			
			Timeline timeline = new Timeline();
			KeyValue keyValue = new KeyValue(traindi.translateXProperty(), 350);
			KeyFrame keyFrame = new KeyFrame(
	    		Duration.millis(100), 
	    		new EventHandler<ActionEvent>() {
		        	@Override
		        	public void handle(ActionEvent event) {
		        		root.getChildren().remove(traindi);
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
	public void handlec1() {
		count=dC.getcount();
		selectseathelper(count,3,1);
		if(count<totalpeople)c1.setDisable(true);
		}
	public void handlec2() {
		count=dC.getcount();
		selectseathelper(count,3,2);
		if(count<totalpeople)c2.setDisable(true);
		}
	public void handlec3() {
		count=dC.getcount();
		selectseathelper(count,3,3);
		if(count<totalpeople)c3.setDisable(true);
		}
	public void handlec4() {
		count=dC.getcount();
		selectseathelper(count,3,4);
		if(count<totalpeople)c4.setDisable(true);
		}
	public void handlec5() {
		count=dC.getcount();
		selectseathelper(count,3,5);
		if(count<totalpeople)c5.setDisable(true);
		}
	public void handlec6() {
		count=dC.getcount();
		selectseathelper(count,3,6);
		if(count<totalpeople)c6.setDisable(true);
		}
	public void handlec7() {
		count=dC.getcount();
		selectseathelper(count,3,7);
		if(count<totalpeople)c7.setDisable(true);
		}
	public void handlec8() {
		count=dC.getcount();
		selectseathelper(count,3,8);
		if(count<totalpeople)c8.setDisable(true);
		}
	public void handlec9() {
		count=dC.getcount();
		selectseathelper(count,3,9);
		if(count<totalpeople)c9.setDisable(true);
		}
	public void handlec10() {
		count=dC.getcount();
		selectseathelper(count,3,10);
		if(count<totalpeople)c10.setDisable(true);
		}
	public void handlec11() {
		count=dC.getcount();
		selectseathelper(count,3,11);
		if(count<totalpeople)c11.setDisable(true);
		}
	public void handlec12() {
		count=dC.getcount();
		selectseathelper(count,3,12);
		if(count<totalpeople)c12.setDisable(true);
		}
	public void handlec13() {
		count=dC.getcount();
		selectseathelper(count,3,13);
		if(count<totalpeople)c13.setDisable(true);
		}
	public void handlec14() {
		count=dC.getcount();
		selectseathelper(count,3,14);
		if(count<totalpeople)c14.setDisable(true);
		}
	public void handlec15() {
		count=dC.getcount();
		selectseathelper(count,3,15);
		if(count<totalpeople)c15.setDisable(true);
		}
	public void handlec16() {
		count=dC.getcount();
		selectseathelper(count,3,16);
		if(count<totalpeople)c16.setDisable(true);
		}
	public void handlec17() {
		count=dC.getcount();
		selectseathelper(count,3,17);
		if(count<totalpeople)c17.setDisable(true);
		}
	public void handlec18() {
		count=dC.getcount();
		selectseathelper(count,3,18);
		if(count<totalpeople)c18.setDisable(true);
		}
	public void handlec19() {
		count=dC.getcount();
		selectseathelper(count,3,19);
		if(count<totalpeople)c19.setDisable(true);
		}
	public void handlec20() {
		count=dC.getcount();
		selectseathelper(count,3,20);
		if(count<totalpeople)c20.setDisable(true);
		}
	public void handlec21() {
		count=dC.getcount();
		selectseathelper(count,3,21);
		if(count<totalpeople)c21.setDisable(true);
		}
	public void handlec22() {
		count=dC.getcount();
		selectseathelper(count,3,22);
		if(count<totalpeople)c22.setDisable(true);
		}
	public void handlec23() {
		count=dC.getcount();
		selectseathelper(count,3,23);
		if(count<totalpeople)c23.setDisable(true);
		}
	public void handlec24() {
		count=dC.getcount();
		selectseathelper(count,3,24);
		if(count<totalpeople)c24.setDisable(true);
		}
	public void handlec25() {
		count=dC.getcount();
		selectseathelper(count,3,25);
		if(count<totalpeople)c25.setDisable(true);
		}
	public void handlec26() {
		count=dC.getcount();
		selectseathelper(count,3,26);
		if(count<totalpeople)c26.setDisable(true);
		}
	public void handlec27() {
		count=dC.getcount();
		selectseathelper(count,3,27);
		if(count<totalpeople)c27.setDisable(true);
		}
	public void handlec28() {
		count=dC.getcount();
		selectseathelper(count,3,28);
		if(count<totalpeople)c28.setDisable(true);
		}
	public void handlec29() {
		count=dC.getcount();
		selectseathelper(count,3,29);
		if(count<totalpeople)c29.setDisable(true);
		}
	public void handlec30() {
		count=dC.getcount();
		selectseathelper(count,3,30);
		if(count<totalpeople)c30.setDisable(true);
		}
	public void handlec31() {
		count=dC.getcount();
		selectseathelper(count,3,31);
		if(count<totalpeople)c31.setDisable(true);
		}
	public void handlec32() {
		count=dC.getcount();
		selectseathelper(count,3,32);
		if(count<totalpeople)c32.setDisable(true);
		}
	
	void selectseathelper(int fill,int a,int b) {
		if(totalpeople>count) {
		switch(fill) {
		case 0 : selectseatc1.setText(a+"호차 "+b); d3.setarrayvalue3(b); dC.setseat1(a+"호차 "+b); dC.addcount(); break;
		case 1 : selectseatc2.setText(a+"호차 "+b); d3.setarrayvalue3(b); dC.setseat2(a+"호차 "+b); dC.addcount(); break;
		case 2 : selectseatc3.setText(a+"호차 "+b); d3.setarrayvalue3(b); dC.setseat3(a+"호차 "+b); dC.addcount(); break;
		case 3 : selectseatc4.setText(a+"호차 "+b); d3.setarrayvalue3(b); dC.setseat4(a+"호차 "+b); dC.addcount(); break;
		case 4 : selectseatc5.setText(a+"호차 "+b); d3.setarrayvalue3(b); dC.setseat5(a+"호차 "+b); dC.addcount(); break;
		case 5 : selectseatc6.setText(a+"호차 "+b); d3.setarrayvalue3(b); dC.setseat6(a+"호차 "+b); dC.addcount(); break;
		case 6 : selectseatc7.setText(a+"호차 "+b); d3.setarrayvalue3(b); dC.setseat7(a+"호차 "+b); dC.addcount(); break;
		case 7 : selectseatc8.setText(a+"호차 "+b); d3.setarrayvalue3(b); dC.setseat8(a+"호차 "+b); dC.addcount(); break;
		case 8 : selectseatc9.setText(a+"호차 "+b); d3.setarrayvalue3(b); dC.setseat9(a+"호차 "+b); dC.addcount(); break;
		case 9 : selectseatc10.setText(a+"호차 "+b); d3.setarrayvalue3(b); dC.setseat10(a+"호차 "+b); dC.addcount(); break;
		}
	}
}
	public void godirectseat31(ActionEvent event) {
		try {
			Parent g31= FXMLLoader.load(getClass().getResource("directseat.fxml"));
			StackPane root = (StackPane) gofrom3to1.getScene().getRoot();
			root.getChildren().add(g31);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void godirectseat32(ActionEvent event) {
		try {
			Parent g32= FXMLLoader.load(getClass().getResource("directseat2.fxml"));
			StackPane root = (StackPane) gofrom3to2.getScene().getRoot();
			root.getChildren().add(g32);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void handlegoresult(ActionEvent event) {
		int check=0;
		String check1 = selectseatc1.getText(); if(check1.equals("미정")) check++;
		String check2 = selectseatc2.getText(); if(check2.equals("미정")) check++;
		String check3 = selectseatc3.getText(); if(check3.equals("미정")) check++;
		String check4 = selectseatc4.getText(); if(check4.equals("미정")) check++;
		String check5 = selectseatc5.getText(); if(check5.equals("미정")) check++;
		String check6 = selectseatc6.getText(); if(check6.equals("미정")) check++;
		String check7 = selectseatc7.getText(); if(check7.equals("미정")) check++;
		String check8 = selectseatc8.getText(); if(check8.equals("미정")) check++;
		String check9 = selectseatc9.getText(); if(check9.equals("미정")) check++;
		String check10 = selectseatc10.getText(); if(check10.equals("미정")) check++;
		if(check==0) {
		try {
			Parent result= FXMLLoader.load(getClass().getResource("result.fxml"));
			StackPane root = (StackPane) done.getScene().getRoot();
			root.getChildren().add(result);
			
			result.setTranslateX(350);

			Timeline timeline = new Timeline();
			KeyValue keyValue = new KeyValue(result.translateXProperty(), 0);
			KeyFrame keyFrame = new KeyFrame(Duration.millis(100), keyValue);
			timeline.getKeyFrames().add(keyFrame);
			timeline.play();
		} catch(Exception e) {
			e.printStackTrace();
		}
		}
		else {
			warning.setText("선택하신 인원이 부족합니다!");
		}
	}
	public void exit(ActionEvent event) {
		Platform.exit();
	}
}