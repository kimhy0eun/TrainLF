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

public class directseat2Controller implements Initializable{
	@FXML Button btnBack;
	@FXML Button gofrom2to1;
	@FXML Button gofrom2to3;
	@FXML StackPane traindi;
	@FXML Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26,b27,b28,b29,b30,b31,b32;
	@FXML TextField selectseatb1,selectseatb2,selectseatb3,selectseatb4,selectseatb5;
	@FXML TextField selectseatb6,selectseatb7,selectseatb8,selectseatb9,selectseatb10;
	@FXML Label warnings;
	@FXML Button exit;
	@FXML Button done;
	directseatController dC = new directseatController();
	trainpeopleController tc = new trainpeopleController();
	int totalpeople = tc.getpeople();
	int count=dC.getcount();
	dup1 d2 = new dup1();
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		if(count==0) {
		if(totalpeople==1) {
			selectseatb1.setText("미정");
			selectseatb2.setText("-");
			selectseatb3.setText("-");
			selectseatb4.setText("-");
			selectseatb5.setText("-");
			selectseatb6.setText("-");
			selectseatb7.setText("-");
			selectseatb8.setText("-");
			selectseatb9.setText("-");
			selectseatb10.setText("-");
		}
		else if(totalpeople==2) {
			selectseatb1.setText("미정");
			selectseatb2.setText("미정");
			selectseatb3.setText("-");
			selectseatb4.setText("-");
			selectseatb5.setText("-");
			selectseatb6.setText("-");
			selectseatb7.setText("-");
			selectseatb8.setText("-");
			selectseatb9.setText("-");
			selectseatb10.setText("-");
		}
		else if(totalpeople==3) {
			selectseatb1.setText("미정");
			selectseatb2.setText("미정");
			selectseatb3.setText("미정");
			selectseatb4.setText("-");
			selectseatb5.setText("-");
			selectseatb6.setText("-");
			selectseatb7.setText("-");
			selectseatb8.setText("-");
			selectseatb9.setText("-");
			selectseatb10.setText("-");
		}
		else if(totalpeople==4) {
			selectseatb1.setText("미정");
			selectseatb2.setText("미정");
			selectseatb3.setText("미정");
			selectseatb4.setText("미정");
			selectseatb5.setText("-");
			selectseatb6.setText("-");
			selectseatb7.setText("-");
			selectseatb8.setText("-");
			selectseatb9.setText("-");
			selectseatb10.setText("-");
		}
		else if(totalpeople==5) {
			selectseatb1.setText("미정");
			selectseatb2.setText("미정");
			selectseatb3.setText("미정");
			selectseatb4.setText("미정");
			selectseatb5.setText("미정");
			selectseatb6.setText("-");
			selectseatb7.setText("-");
			selectseatb8.setText("-");
			selectseatb9.setText("-");
			selectseatb10.setText("-");
		}
		else if(totalpeople==6) {
			selectseatb1.setText("미정");
			selectseatb2.setText("미정");
			selectseatb3.setText("미정");
			selectseatb4.setText("미정");
			selectseatb5.setText("미정");
			selectseatb6.setText("미정");
			selectseatb7.setText("-");
			selectseatb8.setText("-");
			selectseatb9.setText("-");
			selectseatb10.setText("-");
		}
		else if(totalpeople==7) {
			selectseatb1.setText("미정");
			selectseatb2.setText("미정");
			selectseatb3.setText("미정");
			selectseatb4.setText("미정");
			selectseatb5.setText("미정");
			selectseatb6.setText("미정");
			selectseatb7.setText("미정");
			selectseatb8.setText("-");
			selectseatb9.setText("-");
			selectseatb10.setText("-");
		}
		else if(totalpeople==8) {
			selectseatb1.setText("미정");
			selectseatb2.setText("미정");
			selectseatb3.setText("미정");
			selectseatb4.setText("미정");
			selectseatb5.setText("미정");
			selectseatb6.setText("미정");
			selectseatb7.setText("미정");
			selectseatb8.setText("미정");
			selectseatb9.setText("-");
			selectseatb10.setText("-");
		}
		else if(totalpeople==9) {
			selectseatb1.setText("미정");
			selectseatb2.setText("미정");
			selectseatb3.setText("미정");
			selectseatb4.setText("미정");
			selectseatb5.setText("미정");
			selectseatb6.setText("미정");
			selectseatb7.setText("미정");
			selectseatb8.setText("미정");
			selectseatb9.setText("미정");
			selectseatb10.setText("-");
		}
		else if(totalpeople==10) {
			selectseatb1.setText("미정");
			selectseatb2.setText("미정");
			selectseatb3.setText("미정");
			selectseatb4.setText("미정");
			selectseatb5.setText("미정");
			selectseatb6.setText("미정");
			selectseatb7.setText("미정");
			selectseatb8.setText("미정");
			selectseatb9.setText("미정");
			selectseatb10.setText("미정");
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
			selectseatb1.setText(seatdata1);
			selectseatb2.setText(seatdata2);
			selectseatb3.setText(seatdata3);
			selectseatb4.setText(seatdata4);
			selectseatb5.setText(seatdata5);
			selectseatb6.setText(seatdata6);
			selectseatb7.setText(seatdata7);
			selectseatb8.setText(seatdata8);
			selectseatb9.setText(seatdata9);
			selectseatb10.setText(seatdata10);
			for(int i=0; i<10; i++) {
				int set = d2.getarrayvalue2(i);
				if(set==1) b1.setDisable(true); if(set==2) b2.setDisable(true); if(set==3) b3.setDisable(true); if(set==4) b4.setDisable(true);
				if(set==5) b5.setDisable(true); if (set==6) b6.setDisable(true); if(set==7) b7.setDisable(true); if(set==8) b8.setDisable(true);
				if(set==9) b9.setDisable(true); if(set==10) b10.setDisable(true); if(set==11) b11.setDisable(true); if(set==12) b12.setDisable(true);
				if(set==13) b13.setDisable(true); if(set==14) b14.setDisable(true); if(set==15) b15.setDisable(true); if(set==16) b16.setDisable(true);
				if(set==17) b17.setDisable(true); if(set==18) b18.setDisable(true); if(set==19) b19.setDisable(true); if(set==20) b20.setDisable(true);
				if(set==21) b21.setDisable(true); if(set==22) b22.setDisable(true); if(set==23) b23.setDisable(true); if(set==24) b24.setDisable(true);
				if(set==25) b25.setDisable(true); if(set==26) b26.setDisable(true); if(set==27) b27.setDisable(true); if(set==28) b28.setDisable(true);
				if(set==29) b29.setDisable(true); if(set==30) b30.setDisable(true); if(set==31) b31.setDisable(true); if(set==32) b32.setDisable(true);	
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
	public void handleb1() {
		count=dC.getcount();
		selectseathelper(count,2,1);
		if(count<totalpeople)b1.setDisable(true);
		}
	public void handleb2() {
		count=dC.getcount();
		selectseathelper(count,2,2);
		if(count<totalpeople)b2.setDisable(true);
	}
	public void handleb3() {
		count=dC.getcount();
		selectseathelper(count,2,3);
		if(count<totalpeople)b3.setDisable(true);
		}
	public void handleb4() {
		count=dC.getcount();
		selectseathelper(count,2,4);
		if(count<totalpeople)b4.setDisable(true);
		}
	public void handleb5() {
		count=dC.getcount();
		selectseathelper(count,2,5);
		if(count<totalpeople)b5.setDisable(true);
		}
	public void handleb6() {
		count=dC.getcount();
		selectseathelper(count,2,6);
		if(count<totalpeople)b6.setDisable(true);
		}
	public void handleb7() {
		count=dC.getcount();
		selectseathelper(count,2,7);
		if(count<totalpeople)b7.setDisable(true);
		}
	public void handleb8() {
		count=dC.getcount();
		selectseathelper(count,2,8);
		if(count<totalpeople)b8.setDisable(true);
		}
	public void handleb9() {
		count=dC.getcount();
		selectseathelper(count,2,9);
		if(count<totalpeople)b9.setDisable(true);
		}
	public void handleb10() {
		count=dC.getcount();
		selectseathelper(count,2,10);
		if(count<totalpeople)b10.setDisable(true);
		}
	public void handleb11() {
		count=dC.getcount();
		selectseathelper(count,2,11);
		if(count<totalpeople)b11.setDisable(true);
		}
	public void handleb12() {
		count=dC.getcount();
		selectseathelper(count,2,12);
		if(count<totalpeople)b12.setDisable(true);
		}
	public void handleb13() {
		count=dC.getcount();
		selectseathelper(count,2,13);
		if(count<totalpeople)b13.setDisable(true);
		}
	public void handleb14() {
		count=dC.getcount();
		selectseathelper(count,2,14);
		if(count<totalpeople)b14.setDisable(true);
		}
	public void handleb15() {
		count=dC.getcount();
		selectseathelper(count,2,15);
		if(count<totalpeople)b15.setDisable(true);
		}
	public void handleb16() {
		count=dC.getcount();
		selectseathelper(count,2,16);
		if(count<totalpeople)b16.setDisable(true);
		}
	public void handleb17() {
		count=dC.getcount();
		selectseathelper(count,2,17);
		if(count<totalpeople)b17.setDisable(true);
		}
	public void handleb18() {
		count=dC.getcount();
		selectseathelper(count,2,18);
		if(count<totalpeople)b18.setDisable(true);
		}
	public void handleb19() {
		count=dC.getcount();
		selectseathelper(count,2,19);
		if(count<totalpeople)b19.setDisable(true);
		}
	public void handleb20() {
		count=dC.getcount();
		selectseathelper(count,2,20);
		if(count<totalpeople)b20.setDisable(true);
		}
	public void handleb21() {
		count=dC.getcount();
		selectseathelper(count,2,21);
		if(count<totalpeople)b21.setDisable(true);
		}
	public void handleb22() {
		count=dC.getcount();
		selectseathelper(count,2,22);
		if(count<totalpeople)b22.setDisable(true);
		}
	public void handleb23() {
		count=dC.getcount();
		selectseathelper(count,2,23);
		if(count<totalpeople)b23.setDisable(true);
		}
	public void handleb24() {
		count=dC.getcount();
		selectseathelper(count,2,24);
		if(count<totalpeople)b24.setDisable(true);
		}
	public void handleb25() {
		count=dC.getcount();
		selectseathelper(count,2,25);
		if(count<totalpeople)b25.setDisable(true);
		}
	public void handleb26() {
		count=dC.getcount();
		selectseathelper(count,2,26);
		if(count<totalpeople)b26.setDisable(true);
		}
	public void handleb27() {
		count=dC.getcount();
		selectseathelper(count,2,27);
		if(count<totalpeople)b27.setDisable(true);
		}
	public void handleb28() {
		count=dC.getcount();
		selectseathelper(count,2,28);
		if(count<totalpeople)b28.setDisable(true);
		}
	public void handleb29() {
		count=dC.getcount();
		selectseathelper(count,2,29);
		if(count<totalpeople)b29.setDisable(true);
		}
	public void handleb30() {
		count=dC.getcount();
		selectseathelper(count,2,30);
		if(count<totalpeople)b30.setDisable(true);
		}
	public void handleb31() {
		count=dC.getcount();
		selectseathelper(count,2,31);
		if(count<totalpeople)b31.setDisable(true);
		}
	public void handleb32() {
		count=dC.getcount();
		selectseathelper(count,2,32);
		if(count<totalpeople)b32.setDisable(true);
		}
	
	void selectseathelper(int fill,int a,int b) {
		if(totalpeople>fill) {
		switch(fill) {
		case 0 : selectseatb1.setText(a+"호차 "+b); d2.setarrayvalue2(b); dC.setseat1(a+"호차 "+b); dC.addcount(); break;
		case 1 : selectseatb2.setText(a+"호차 "+b); d2.setarrayvalue2(b); dC.setseat2(a+"호차 "+b); dC.addcount(); break;
		case 2 : selectseatb3.setText(a+"호차 "+b); d2.setarrayvalue2(b); dC.setseat3(a+"호차 "+b); dC.addcount(); break;
		case 3 : selectseatb4.setText(a+"호차 "+b); d2.setarrayvalue2(b); dC.setseat4(a+"호차 "+b); dC.addcount(); break;
		case 4 : selectseatb5.setText(a+"호차 "+b); d2.setarrayvalue2(b); dC.setseat5(a+"호차 "+b); dC.addcount(); break;
		case 5 : selectseatb6.setText(a+"호차 "+b); d2.setarrayvalue2(b); dC.setseat6(a+"호차 "+b); dC.addcount(); break;
		case 6 : selectseatb7.setText(a+"호차 "+b); d2.setarrayvalue2(b); dC.setseat7(a+"호차 "+b); dC.addcount(); break;
		case 7 : selectseatb8.setText(a+"호차 "+b); d2.setarrayvalue2(b); dC.setseat8(a+"호차 "+b); dC.addcount(); break;
		case 8 : selectseatb9.setText(a+"호차 "+b); d2.setarrayvalue2(b); dC.setseat9(a+"호차 "+b); dC.addcount(); break;
		case 9 : selectseatb10.setText(a+"호차 "+b); d2.setarrayvalue2(b); dC.setseat10(a+"호차 "+b); dC.addcount(); break;
		}
	}
}
	public void godirectseat21(ActionEvent event) {
		try {
			Parent g21= FXMLLoader.load(getClass().getResource("directseat.fxml"));
			StackPane root = (StackPane) gofrom2to1.getScene().getRoot();
			root.getChildren().add(g21);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void godirectseat23(ActionEvent event) {
		try {
			Parent g13= FXMLLoader.load(getClass().getResource("directseat3.fxml"));
			StackPane root = (StackPane) gofrom2to3.getScene().getRoot();
			root.getChildren().add(g13);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void handlegoresult(ActionEvent event) {
		int check=0;
		String check1 = selectseatb1.getText(); if(check1.equals("미정")) check++;
		String check2 = selectseatb2.getText(); if(check2.equals("미정")) check++;
		String check3 = selectseatb3.getText(); if(check3.equals("미정")) check++;
		String check4 = selectseatb4.getText(); if(check4.equals("미정")) check++;
		String check5 = selectseatb5.getText(); if(check5.equals("미정")) check++;
		String check6 = selectseatb6.getText(); if(check6.equals("미정")) check++;
		String check7 = selectseatb7.getText(); if(check7.equals("미정")) check++;
		String check8 = selectseatb8.getText(); if(check8.equals("미정")) check++;
		String check9 = selectseatb9.getText(); if(check9.equals("미정")) check++;
		String check10 = selectseatb10.getText(); if(check10.equals("미정")) check++;
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
			warnings.setText("선택하신 인원이 부족합니다!");
		}
	}
	public void exit(ActionEvent event) {
		Platform.exit();
	}
}
