package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ControllerCeo {
    @FXML
    public TextArea ta1;
    @FXML
    public TextField tf1;
    public AnchorPane anchorpane1;

    @FXML
    Button showManager;
    @FXML
    Button addManager;
    @FXML
    Button editManager;
    @FXML
    Button showAccountant;
    @FXML
    Button addAccountant;
    @FXML
    Button editAccountant;
    @FXML
    Button showClient;
    @FXML
    Button addVip;
    @FXML
    Button addNormal;
    @FXML
    Button editClients;
    @FXML
    Button showWorkers;
    @FXML
    Button addWorkers;
    @FXML
    Button editWorkers;


    Accountant a0 = new Accountant();
    @FXML
    public void showAccountant(ActionEvent event) throws Exception {
        try {

            ta1.setText(a0.showAccountant());
        }
        catch(Exception e) {
            e.printStackTrace();
        }

    }



    @FXML
    public void opentableAccountant(ActionEvent event) throws Exception
    {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("accountant.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("adding new accountant menu");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void editAccountant(ActionEvent event) throws Exception{
        try
        {
            String txt1=ta1.getText();
            a0.editAccountant(txt1);
        }
        catch(Exception e) {
            e.printStackTrace();
        }

    }

    VipClient a1 = new VipClient();

    normalClient a2 = new normalClient();

    @FXML
    public void showClient(ActionEvent event) throws Exception {
        try {

            ta1.setText(a1.showClient());
        }
        catch(Exception e) {
            e.printStackTrace();
        }

    }



    @FXML
    public void opentableClient(ActionEvent event) throws Exception
    {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("newClient.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("adding new client menu");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void editClient(ActionEvent event) throws Exception{
        try
        {
            String txt1=ta1.getText();
            a1.editclient(txt1);
        }
        catch(Exception e) {
            e.printStackTrace();
        }

    }




    Manager a3 = new Manager();
    @FXML
    public void showManager(ActionEvent event) throws Exception {
        try {

            ta1.setText(a3.showManager());
        }
        catch(Exception e) {
            e.printStackTrace();
        }

    }



    @FXML
    public void opentableManager(ActionEvent event) throws Exception
    {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("manager.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("adding new managers menu");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void editManager(ActionEvent event) throws Exception{
        try
        {
            String txt1=ta1.getText();
            a3.editManager(txt1);
        }
        catch(Exception e) {
            e.printStackTrace();
        }

    }

    guard a4 = new guard();

    @FXML
    public void showworkers(ActionEvent event) throws Exception {
        try {

            ta1.setText(a4.showguard());
        }
        catch(Exception e) {
            e.printStackTrace();
        }

    }

    @FXML
    public void opentableHR(ActionEvent event) throws Exception
    {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Hr.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("adding new worker menu");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void editWorkers(ActionEvent event) throws Exception{
        try
        {
            String txt1=ta1.getText();
            a4.editGuard(txt1);
        }
        catch(Exception e) {
            e.printStackTrace();
        }

    }





}


