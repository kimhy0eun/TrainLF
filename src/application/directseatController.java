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

public class directseatController implements Initializable{
	@FXML Button btnBack;
	@FXML Button gofrom1to2;
	@FXML Button gofrom1to3;
	@FXML StackPane traindi;
	@FXML Label warning;
	@FXML Button a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15 ,a16 ,a17, a18, a19, a20, a21, a22, a23, a24, a25, a26, a27, a28, a29, a30, a31, a32;
	@FXML TextField selectseata1, selectseatb1, selectseatc1;
	@FXML TextField selectseata2, selectseatb2, selectseatc2;
	@FXML TextField selectseata3, selectseatb3, selectseatc3;
	@FXML TextField selectseata4, selectseatb4, selectseatc4;
	@FXML TextField selectseata5, selectseatb5, selectseatc5;
	@FXML TextField selectseata6, selectseatb6, selectseatc6;
	@FXML TextField selectseata7, selectseatb7, selectseatc7;
	@FXML TextField selectseata8, selectseatb8, selectseatc8;
	@FXML TextField selectseata9, selectseatb9, selectseatc9;
	@FXML TextField selectseata10, selectseatb10, selectseatc10;
	@FXML Button exit;
	@FXML Button done;
	static int totalpeople;
	static int count=0;
	int getcount() {
		return count;
	}
	void initializecount() {
		count=0;
	}
	void addcount() {
		count++;
	}
	static String seat1;
	String getseat1() {
		return seat1;
	}
	void setseat1(String s) {
		seat1 = s;
	}
	static String seat2;
	String getseat2() {
		return seat2;
	}
	void setseat2(String s) {
		seat2 = s;
	}
	static String seat3;
	String getseat3() {
		return seat3;
	}
	void setseat3(String s) {
		seat3 = s;
	}
	static String seat4;
	String getseat4() {
		return seat4;
	}
	void setseat4(String s) {
		seat4 = s;
	}
	static String seat5;
	String getseat5() {
		return seat5;
	}
	void setseat5(String s) {
		seat5 = s;
	}
	static String seat6;
	String getseat6() {
		return seat6;
	}
	void setseat6(String s) {
		seat6 = s;
	}
	static String seat7;
	String getseat7() {
		return seat7;
	}
	void setseat7(String s) {
		seat7 = s;
	}
	static String seat8;
	String getseat8() {
		return seat8;
	}
	void setseat8(String s) {
		seat8 = s;
	}
	static String seat9;
	String getseat9() {
		return seat9;
	}
	void setseat9(String s) {
		seat9 = s;
	}
	static String seat10;
	String getseat10() {
		return seat10;
	}
	void setseat10(String s) {
		seat10 = s;
	}
	dup1 d1 = new dup1();
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		count=getcount();
		if(count==0) {
		trainpeopleController tc = new trainpeopleController();
		totalpeople = tc.getpeople();
		if(totalpeople==1) {
			selectseata1.setText("미정");
			selectseata2.setText("-");
			selectseata3.setText("-");
			selectseata4.setText("-");
			selectseata5.setText("-");
			selectseata6.setText("-");
			selectseata7.setText("-");
			selectseata8.setText("-");
			selectseata9.setText("-");
			selectseata10.setText("-");
		}
		else if(totalpeople==2) {
			selectseata1.setText("미정");
			selectseata2.setText("미정");
			selectseata3.setText("-");
			selectseata4.setText("-");
			selectseata5.setText("-");
			selectseata6.setText("-");
			selectseata7.setText("-");
			selectseata8.setText("-");
			selectseata9.setText("-");
			selectseata10.setText("-");
		}
		else if(totalpeople==3) {
			selectseata1.setText("미정");
			selectseata2.setText("미정");
			selectseata3.setText("미정");
			selectseata4.setText("-");
			selectseata5.setText("-");
			selectseata6.setText("-");
			selectseata7.setText("-");
			selectseata8.setText("-");
			selectseata9.setText("-");
			selectseata10.setText("-");
		}
		else if(totalpeople==4) {
			selectseata1.setText("미정");
			selectseata2.setText("미정");
			selectseata3.setText("미정");
			selectseata4.setText("미정");
			selectseata5.setText("-");
			selectseata6.setText("-");
			selectseata7.setText("-");
			selectseata8.setText("-");
			selectseata9.setText("-");
			selectseata10.setText("-");
		}
		else if(totalpeople==5) {
			selectseata1.setText("미정");
			selectseata2.setText("미정");
			selectseata3.setText("미정");
			selectseata4.setText("미정");
			selectseata5.setText("미정");
			selectseata6.setText("-");
			selectseata7.setText("-");
			selectseata8.setText("-");
			selectseata9.setText("-");
			selectseata10.setText("-");
		}
		else if(totalpeople==6) {
			selectseata1.setText("미정");
			selectseata2.setText("미정");
			selectseata3.setText("미정");
			selectseata4.setText("미정");
			selectseata5.setText("미정");
			selectseata6.setText("미정");
			selectseata7.setText("-");
			selectseata8.setText("-");
			selectseata9.setText("-");
			selectseata10.setText("-");
		}
		else if(totalpeople==7) {
			selectseata1.setText("미정");
			selectseata2.setText("미정");
			selectseata3.setText("미정");
			selectseata4.setText("미정");
			selectseata5.setText("미정");
			selectseata6.setText("미정");
			selectseata7.setText("미정");
			selectseata8.setText("-");
			selectseata9.setText("-");
			selectseata10.setText("-");
		}
		else if(totalpeople==8) {
			selectseata1.setText("미정");
			selectseata2.setText("미정");
			selectseata3.setText("미정");
			selectseata4.setText("미정");
			selectseata5.setText("미정");
			selectseata6.setText("미정");
			selectseata7.setText("미정");
			selectseata8.setText("미정");
			selectseata9.setText("-");
			selectseata10.setText("-");
		}
		else if(totalpeople==9) {
			selectseata1.setText("미정");
			selectseata2.setText("미정");
			selectseata3.setText("미정");
			selectseata4.setText("미정");
			selectseata5.setText("미정");
			selectseata6.setText("미정");
			selectseata7.setText("미정");
			selectseata8.setText("미정");
			selectseata9.setText("미정");
			selectseata10.setText("-");
		}
		else if(totalpeople==10) {
			selectseata1.setText("미정");
			selectseata2.setText("미정");
			selectseata3.setText("미정");
			selectseata4.setText("미정");
			selectseata5.setText("미정");
			selectseata6.setText("미정");
			selectseata7.setText("미정");
			selectseata8.setText("미정");
			selectseata9.setText("미정");
			selectseata10.setText("미정");
		}
		seat1 = selectseata1.getText();
		seat2 = selectseata2.getText();
		seat3 = selectseata3.getText();
		seat4 = selectseata4.getText();
		seat5 = selectseata5.getText();
		seat6 = selectseata6.getText();
		seat7 = selectseata7.getText();
		seat8 = selectseata8.getText();
		seat9 = selectseata9.getText();
		seat10 = selectseata10.getText();
		}
		else {
			String seatdata1 = getseat1();
			String seatdata2 = getseat2();
			String seatdata3 = getseat3();
			String seatdata4 = getseat4();
			String seatdata5 = getseat5();
			String seatdata6 = getseat6();
			String seatdata7 = getseat7();
			String seatdata8 = getseat8();
			String seatdata9 = getseat9();
			String seatdata10 = getseat10();
			selectseata1.setText(seatdata1);
			selectseata2.setText(seatdata2);
			selectseata3.setText(seatdata3);
			selectseata4.setText(seatdata4);
			selectseata5.setText(seatdata5);
			selectseata6.setText(seatdata6);
			selectseata7.setText(seatdata7);
			selectseata8.setText(seatdata8);
			selectseata9.setText(seatdata9);
			selectseata10.setText(seatdata10);
			for(int i=0; i<10; i++) {
				int set = d1.getarrayvalue1(i);
				if(set==1) a1.setDisable(true); if(set==2) a2.setDisable(true); if(set==3) a3.setDisable(true); if(set==4) a4.setDisable(true);
				if(set==5) a5.setDisable(true); if (set==6) a6.setDisable(true); if(set==7) a7.setDisable(true); if(set==8) a8.setDisable(true);
				if(set==9) a9.setDisable(true); if(set==10) a10.setDisable(true); if(set==11) a11.setDisable(true); if(set==12) a12.setDisable(true);
				if(set==13) a13.setDisable(true); if(set==14) a14.setDisable(true); if(set==15) a15.setDisable(true); if(set==16) a16.setDisable(true);
				if(set==17) a17.setDisable(true); if(set==18) a18.setDisable(true); if(set==19) a19.setDisable(true); if(set==20) a20.setDisable(true);
				if(set==21) a21.setDisable(true); if(set==22) a22.setDisable(true); if(set==23) a23.setDisable(true); if(set==24) a24.setDisable(true);
				if(set==25) a25.setDisable(true); if(set==26) a26.setDisable(true); if(set==27) a27.setDisable(true); if(set==28) a28.setDisable(true);
				if(set==29) a29.setDisable(true); if(set==30) a30.setDisable(true); if(set==31) a31.setDisable(true); if(set==32) a32.setDisable(true);	
			}
		}
	}
	public void handleBtnBack(ActionEvent event) {
		try {
			count=0;
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
	public void handlea1() {
		if(count<totalpeople)a1.setDisable(true);
		selectseathelper(count,1,1);
		}
	public void handlea2() {
		if(count<totalpeople)a2.setDisable(true);
		selectseathelper(count,1,2);
	}
	public void handlea3() {
		if(count<totalpeople)a3.setDisable(true);
		selectseathelper(count,1,3);
		}
	public void handlea4() {
		if(count<totalpeople)a4.setDisable(true);
		selectseathelper(count,1,4);
		}
	public void handlea5() {
		if(count<totalpeople)a5.setDisable(true);
		selectseathelper(count,1,5);
		}
	public void handlea6() {		
		if(count<totalpeople)a6.setDisable(true);
		selectseathelper(count,1,6);
		}
	public void handlea7() {		
		if(count<totalpeople)a7.setDisable(true);
		selectseathelper(count,1,7);
		}
	public void handlea8() {		
		if(count<totalpeople)a8.setDisable(true);
		selectseathelper(count,1,8);
		}
	public void handlea9() {	
		if(count<totalpeople)a9.setDisable(true);
		selectseathelper(count,1,9);
		}
	public void handlea10() {		
		if(count<totalpeople)a10.setDisable(true);
		selectseathelper(count,1,10);
		}
	public void handlea11() {		
		if(count<totalpeople)a11.setDisable(true);
		selectseathelper(count,1,11);
		}
	public void handlea12() {		
		if(count<totalpeople)a12.setDisable(true);
		selectseathelper(count,1,12);
		}
	public void handlea13() {		
		if(count<totalpeople)a13.setDisable(true);
		selectseathelper(count,1,13);
		}
	public void handlea14() {		
		if(count<totalpeople)a14.setDisable(true);
		selectseathelper(count,1,14);
		}
	public void handlea15() {		
		if(count<totalpeople)a15.setDisable(true);
		selectseathelper(count,1,15);
		}
	public void handlea16() {		
		if(count<totalpeople)a16.setDisable(true);
		selectseathelper(count,1,16);
		}
	public void handlea17() {		
		if(count<totalpeople)a17.setDisable(true);
		selectseathelper(count,1,17);
		}
	public void handlea18() {		
		if(count<totalpeople)a18.setDisable(true);
		selectseathelper(count,1,18);
		}
	public void handlea19() {		
		if(count<totalpeople)a19.setDisable(true);
		selectseathelper(count,1,19);
		}
	public void handlea20() {		
		if(count<totalpeople)a20.setDisable(true);
		selectseathelper(count,1,20);
		}
	public void handlea21() {		
		if(count<totalpeople)a21.setDisable(true);
		selectseathelper(count,1,21);
		}
	public void handlea22() {		
		if(count<totalpeople)a22.setDisable(true);
		selectseathelper(count,1,22);
		}
	public void handlea23() {		
		if(count<totalpeople)a23.setDisable(true);
		selectseathelper(count,1,23);
		}
	public void handlea24() {		
		if(count<totalpeople)a24.setDisable(true);
		selectseathelper(count,1,24);
		}
	public void handlea25() {		
		if(count<totalpeople)a25.setDisable(true);
		selectseathelper(count,1,25);
		}
	public void handlea26() {		
		if(count<totalpeople)a26.setDisable(true);
		selectseathelper(count,1,26);
		}
	public void handlea27() {		
		if(count<totalpeople)a27.setDisable(true);
		selectseathelper(count,1,27);
		}
	public void handlea28() {		
		if(count<totalpeople)a28.setDisable(true);
		selectseathelper(count,1,28);
		}
	public void handlea29() {		
		if(count<totalpeople)a29.setDisable(true);
		selectseathelper(count,1,29);
		}
	public void handlea30() {		
		if(count<totalpeople)a30.setDisable(true);
		selectseathelper(count,1,30);
		}
	public void handlea31() {		
		if(count<totalpeople)a31.setDisable(true);
		selectseathelper(count,1,31);
		}
	public void handlea32() {		
		if(count<totalpeople)a32.setDisable(true);
		selectseathelper(count,1,32);
		}
	void selectseathelper(int fill,int a,int b) {
		if(totalpeople>count) {
		switch(fill) {
		case 0 : selectseata1.setText(a+"호차 "+b); d1.setarrayvalue1(b); seat1=a+"호차 "+b; addcount(); break;
		case 1 : selectseata2.setText(a+"호차 "+b); d1.setarrayvalue1(b); seat2=a+"호차 "+b; addcount(); break;
		case 2 : selectseata3.setText(a+"호차 "+b); d1.setarrayvalue1(b); seat3=a+"호차 "+b; addcount(); break;
		case 3 : selectseata4.setText(a+"호차 "+b); d1.setarrayvalue1(b); seat4=a+"호차 "+b; addcount(); break;
		case 4 : selectseata5.setText(a+"호차 "+b); d1.setarrayvalue1(b); seat5=a+"호차 "+b; addcount(); break;
		case 5 : selectseata6.setText(a+"호차 "+b); d1.setarrayvalue1(b); seat6=a+"호차 "+b; addcount(); break;
		case 6 : selectseata7.setText(a+"호차 "+b); d1.setarrayvalue1(b); seat7=a+"호차 "+b; addcount(); break;
		case 7 : selectseata8.setText(a+"호차 "+b); d1.setarrayvalue1(b); seat8=a+"호차 "+b; addcount(); break;
		case 8 : selectseata9.setText(a+"호차 "+b); d1.setarrayvalue1(b); seat9=a+"호차 "+b; addcount(); break;
		case 9 : selectseata10.setText(a+"호차 "+b); d1.setarrayvalue1(b); seat10=a+"호차 "+b; addcount(); break;
		}
	}
}
	public void godirectseat12(ActionEvent event) {
		try {
			Parent g12= FXMLLoader.load(getClass().getResource("directseat2.fxml"));
			StackPane root = (StackPane) gofrom1to2.getScene().getRoot();
			root.getChildren().add(g12);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void godirectseat13(ActionEvent event) {
		try {
			Parent g13= FXMLLoader.load(getClass().getResource("directseat3.fxml"));
			StackPane root = (StackPane) gofrom1to3.getScene().getRoot();
			root.getChildren().add(g13);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void handlegoresult(ActionEvent event) {
		int check=0;
		String check1 = selectseata1.getText(); if(check1.equals("미정")) check++;
		String check2 = selectseata2.getText(); if(check2.equals("미정")) check++;
		String check3 = selectseata3.getText(); if(check3.equals("미정")) check++;
		String check4 = selectseata4.getText(); if(check4.equals("미정")) check++;
		String check5 = selectseata5.getText(); if(check5.equals("미정")) check++;
		String check6 = selectseata6.getText(); if(check6.equals("미정")) check++;
		String check7 = selectseata7.getText(); if(check7.equals("미정")) check++;
		String check8 = selectseata8.getText(); if(check8.equals("미정")) check++;
		String check9 = selectseata9.getText(); if(check9.equals("미정")) check++;
		String check10 = selectseata10.getText(); if(check10.equals("미정")) check++;
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
		else {warning.setText("선택하신 인원이 부족합니다!");
		}
	}
	public void exit(ActionEvent event) {
		Platform.exit();
	}
}
