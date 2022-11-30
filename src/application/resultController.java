package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;

public class resultController implements Initializable{
	@FXML Button gomain;
	@FXML Button printandgomain;
	@FXML TextField resultfrom;
	@FXML TextField resultto;
	@FXML TextField resulttime;
	@FXML TextField resulttrain;
	@FXML TextField resultgeneral;
	@FXML TextField resultold;
	@FXML TextField resultyoung;
	@FXML TextField resultmoney;
	@FXML TextField resultseat1,resultseat2,resultseat3,resultseat4,resultseat5,resultseat6,resultseat7,resultseat8,resultseat9,resultseat10;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		resultfrom.setText("청주역");
		DestinController DC = new DestinController();
		String destination = DC.getdestination();
		resultto.setText(destination);
		traintypeController tt = new traintypeController();
		String traintype = tt.gettraintype();
		resulttrain.setText(traintype);
		traintimeController tt2 = new traintimeController();
		String time = tt2.gettraintime();
		resulttime.setText(time);
		trainpeopleController tC = new trainpeopleController();
		int money = tC.getsummoney();
		resultmoney.setText(money+"원");
		int general = tC.getgeneralpeople();
		int old = tC.getoldpeople();
		int young = tC.getyoungpeople();
		resultgeneral.setText(""+general);
		resultold.setText(""+old);
		resultyoung.setText(""+young);
		trainseatController tC2 = new trainseatController();
		int israndom = tC2.israndom();
		if(israndom==0) {
		directseatController dC = new directseatController();
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
		resultseat1.setText(seatdata1);
		resultseat2.setText(seatdata2);
		resultseat3.setText(seatdata3);
		resultseat4.setText(seatdata4);
		resultseat5.setText(seatdata5);
		resultseat6.setText(seatdata6);
		resultseat7.setText(seatdata7);
		resultseat8.setText(seatdata8);
		resultseat9.setText(seatdata9);
		resultseat10.setText(seatdata10);
	}
			else {
				int people = tC.getpeople();
				int count=0;
				int[] randomdata = new int[people];
				for(int j=0;j<people;j++) {
					int put = (int)(Math.random()*95+1);
					for(int i=0;i<people;i++) {
						if(randomdata[i]==put) {
							count++;
						}
					}
				if(count==0) randomdata[j]=put;
				else {
					j--;
					count=0;
				}
				}
				for(int x=0; x<people; x++) {
					for(int y=0; y<people-x-1;y++) {
						if(randomdata[y]>randomdata[y+1]) {
							int temp=randomdata[y];
							randomdata[y]=randomdata[y+1];
							randomdata[y+1]=temp;
						}
					}
				}
				if(people>=1) {
				if(randomdata[0]==32) resultseat1.setText("1호차 32석");
				else if(randomdata[0]==64) resultseat1.setText("2호차 32석");
				else if(randomdata[0]==96) resultseat1.setText("3호차 32석");
				else resultseat1.setText(randomdata[0]/32+1+"호차"+randomdata[0]%32+"석");
				} else resultseat1.setText("-");
				if(people>=2) {
				if(randomdata[1]==32) resultseat2.setText("1호차 32석");
				else if(randomdata[1]==64) resultseat2.setText("2호차 32석");
				else if(randomdata[1]==96) resultseat2.setText("3호차 32석");
				else resultseat2.setText(randomdata[1]/32+1+"호차"+randomdata[1]%32+"석");
				} else resultseat2.setText("-");
				if(people>=3) {
				if(randomdata[2]==32) resultseat3.setText("1호차 32석");
				else if(randomdata[2]==64) resultseat3.setText("2호차 32석");
				else if(randomdata[2]==96) resultseat3.setText("3호차 32석");
				else resultseat3.setText(randomdata[2]/32+1+"호차"+randomdata[2]%32+"석");
				} else resultseat3.setText("-");
				if(people>=4) {
				if(randomdata[3]==32) resultseat4.setText("1호차 32석");
				else if(randomdata[3]==64) resultseat4.setText("2호차 32석");
				else if(randomdata[3]==96) resultseat4.setText("3호차 32석");
				else resultseat4.setText(randomdata[3]/32+1+"호차"+randomdata[3]%32+"석");
				} else resultseat4.setText("-");
				if(people>=5) {
				if(randomdata[4]==32) resultseat5.setText("1호차 32석");
				else if(randomdata[4]==64) resultseat5.setText("2호차 32석");
				else if(randomdata[4]==96) resultseat5.setText("3호차 32석");
				else resultseat5.setText(randomdata[4]/32+1+"호차"+randomdata[4]%32+"석");
				} else resultseat5.setText("-");
				if(people>=6) {
				if(randomdata[5]==32) resultseat6.setText("1호차 32석");
				else if(randomdata[5]==64) resultseat6.setText("2호차 32석");
				else if(randomdata[5]==96) resultseat6.setText("3호차 32석");
				else resultseat6.setText(randomdata[5]/32+1+"호차"+randomdata[5]%32+"석");
				} else resultseat6.setText("-");
				if(people>=7) {
				if(randomdata[6]==32) resultseat7.setText("1호차 32석");
				else if(randomdata[6]==64) resultseat7.setText("2호차 32석");
				else if(randomdata[6]==96) resultseat7.setText("3호차 32석");
				else resultseat7.setText(randomdata[6]/32+1+"호차"+randomdata[6]%32+"석");
				} else resultseat7.setText("-");
				if(people>=8) {
				if(randomdata[7]==32) resultseat8.setText("1호차 32석");
				else if(randomdata[7]==64) resultseat8.setText("2호차 32석");
				else if(randomdata[7]==96) resultseat8.setText("3호차 32석");
				else resultseat8.setText(randomdata[7]/32+1+"호차"+randomdata[7]%32+"석");
				} else resultseat8.setText("-");
				if(people>=9) {
				if(randomdata[8]==32) resultseat9.setText("1호차 32석");
				else if(randomdata[8]==64) resultseat9.setText("2호차 32석");
				else if(randomdata[8]==96) resultseat9.setText("3호차 32석");
				else resultseat9.setText(randomdata[8]/32+1+"호차"+randomdata[8]%32+"석");
				} else resultseat9.setText("-");
				if(people==10) {
				if(randomdata[9]==32) resultseat10.setText("1호차 32석");
				else if(randomdata[9]==64) resultseat10.setText("2호차 32석");
				else if(randomdata[9]==96) resultseat10.setText("3호차 32석");
				else resultseat10.setText(randomdata[9]/32+1+"호차"+randomdata[9]%32+"석");
				} else resultseat10.setText("-");
			}
		}
	public void gomain(ActionEvent event) {
		Platform.exit();
	}
	public void printandgomain(ActionEvent event) {
		System.out.println("탑승권 출력 완료 되었습니다. 행복한 하루 되세요!");
		Platform.exit();
	}
	public void exit(ActionEvent event) {
		Platform.exit();
	}
	}
