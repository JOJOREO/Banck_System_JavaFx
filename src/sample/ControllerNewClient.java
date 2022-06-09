package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class ControllerNewClient {
    VipClient a1 = new VipClient();

    normalClient a2 = new normalClient();

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
    public RadioButton rb2;
    @FXML
    public TextField txt7;

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
            if(rb1.isSelected()) {
                a1.name = txt1.getText();
                a1.ssn = Integer.parseInt(txt2.getText());
                a1.address = txt3.getText();
                a1.phone = txt4.getText();
                a1.ssn = Integer.parseInt(txt5.getText());
                a1.username = txt6.getText();
                a1.pinCode=Integer.parseInt(txt6.getText());
                a1.balance=Integer.parseInt(txt7.getText());
                a1.amount=0;
                a1.oldLoan=0;
                a1.addClient();

            }
            else if(rb2.isSelected())
            {
                a2.name = txt1.getText();
                a2.ssn = Integer.parseInt(txt2.getText());
                a2.address = txt3.getText();
                a2.phone = txt4.getText();
                a2.ssn = Integer.parseInt(txt5.getText());
                a2.username = txt6.getText();
                a2.pinCode=Integer.parseInt(txt6.getText());
                a2.balance=Integer.parseInt(txt7.getText());
                a2.amount=0;
                a2.oldLoan=0;
                a2.addClient();

            }



            lb11.setText("CLIENT ADDED SUCCESFULLY");


        } catch(Exception e) {
            e.printStackTrace();
        }

    }







}


