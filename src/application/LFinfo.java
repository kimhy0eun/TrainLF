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
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;

public class LFinfo {
	String tk;     //��������
	String tn;        //������ȣ
	int num;       //ȣ��
	String gdate;  //���� ��¥
	String lfk;    //�нǹ� ����
	
	public LFinfo() {}
	
	public LFinfo(String tk,String tn, String gdate, String lfk) {
		super();
		this.tk = tk;
		this.tn = tn;
		//this.num = num;
		this.gdate = gdate;
		this.lfk = lfk;
		
	}
	public String getTk() {
		return tk;
	}
	public void setTk(String tk) {
		this.tk = tk;
	}
	public String getTn() {
		return tn;
	}
	public void setTn(String tn) {
		this.tn = tn;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getGdate() {
		return gdate;
	}
	public void setGdate(String gdate) {
		this.gdate = gdate;
	}
	public String getLfk() {
		return lfk;
	}
	public void setLfk(String lfk) {
		this.lfk = lfk;
	}
}