package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ControllerVipClientOldLogin {
    VipClient a1 = new VipClient();

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
    public RadioButton rb1;
    @FXML
    public RadioButton rb2;

    @FXML
    Button bt1;
    @FXML
    Label lb5;
    @FXML
    CheckBox cb;

    @FXML
    public void fill(ActionEvent event) throws Exception
    {


        //String inputToFile1=this.name+","+this.ssn+","+this.address+","+this.phone+","+this.experience_years+","+this.workHours+","+this.present+","+this.numberOfAccountsOpened+","+this.numberOfTransactions+","+this.numberOfAccountsReviewed;
        //String name, int ssn, String address, String phone, int experience_years, int workHours, boolean present, int numberOfAccountsOpened, int numberOfTransactions, int numberOfAccountsReviewed) {
        try {
            VipClient a2;
            a2 = a1.extractClient(a1.searchclient(txt1.getText()));

            a2.username=txt1.getText();
            a2.pinCode=Integer.parseInt(txt2.getText());


            a2.balance=a2.extractClientdata(a2.searchclient(txt1.getText()));
            a2.amount=Integer.parseInt(txt3.getText());

            if(rb1.isSelected())
                a2.WithDraw(a2.amount);
            else if(rb2.isSelected())
                a2.addToAccount(a2.amount);
            else if(cb.isSelected()) {
                a2.PayLoan(a2.amount);
                txt4.setText(String.valueOf(a2.oldLoan));
            }
            else
                txt4.setText(String.valueOf(a2.oldLoan));
            txt5.setText(String.valueOf(a2.balance));
            String inputToFile1=a2.name+","+a2.ssn+","+a2.address+","+a2.phone+","+a2.username+","+a2.pinCode+","+a2.balance+","+a2.amount+","+a2.oldLoan+","+"VIP";
            a2.editMiddle(a2.username, inputToFile1);

            //a1.editclient();


            lb5.setText("TRANSACTIONS DONE SUCCESFULLY");


        } catch(Exception e) {
            e.printStackTrace();
        }

    }





}

