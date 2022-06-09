package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class ControllerOfficeBoyNew {
    officeBoy a1 = new officeBoy();

    @FXML
    public TextField txt1;
    @FXML
    public TextField txt2;
    @FXML
    public TextField txt3;
    @FXML
    public TextField txt4;
    @FXML
    public TextField txt5;
    @FXML
    public TextField txt6;
    @FXML
    public RadioButton rb1;
    @FXML
    public TextField txt8;
    @FXML
    public TextField txt9;
    @FXML
    public TextField txt10;
    @FXML
    Button bt1;
    @FXML
    Label lb11;

    @FXML
    public void fill(ActionEvent event) throws Exception
    {

        //String inputToFile1=this.name+","+this.ssn+","+this.address+","+this.phone+","+this.experience_years+","+this.workHours+","+this.present+","+this.numberOfAccountsOpened+","+this.numberOfTransactions+","+this.numberOfAccountsReviewed;
        //String name, int ssn, String address, String phone, int experience_years, int workHours, boolean present, int numberOfAccountsOpened, int numberOfTransactions, int numberOfAccountsReviewed) {
        try {
            a1.name=txt1.getText();
            a1.ssn=Integer.parseInt(txt2.getText());
            a1.address=txt3.getText();
            a1.phone=txt4.getText();
            a1.experience_years=Integer.parseInt(txt5.getText());
            a1.workHours=Integer.parseInt(txt6.getText());
            if(rb1.isSelected())
                a1.present=true;
            else
                a1.present=false;
            a1.numberDrinksServed=Integer.parseInt(txt8.getText());
            a1.numberOfSandwichesServed=Integer.parseInt(txt9.getText());
            a1.numberOfDaysOff=Integer.parseInt(txt10.getText());
            a1.addOfficeBoy();
            lb11.setText("OFFICEBOY ADDED SUCCESFULLY");


        } catch(Exception e) {
            e.printStackTrace();
        }

    }





    }


