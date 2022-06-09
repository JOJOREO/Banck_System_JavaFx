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

public class ControllerHR {
    @FXML
    public TextArea ta1;
    @FXML
    public TextField tf1;
    public AnchorPane anchorpane1;

    @FXML
    Button showManager;
    @FXML
    Button addOfficeBoy;
    @FXML
    Button editOfficeBoy;
    @FXML
    Button showAccountant;
    @FXML
    Button addAccountant;//guard
    @FXML
    Button editAccountant;
    @FXML
    Button showClient;
    @FXML
    Button addVip;//janitor
    @FXML
    Button addNormal;
    @FXML
    Button editClients;
    @FXML
    Button addAtmRepairEngineer;
    @FXML
    Button editAtmRepairEngineer;
    @FXML
    Button addCurrencyExchanger;
    @FXML
    Button editCurrencyExchanger;



    guard a0 = new guard();
    @FXML
    public void showAccountant(ActionEvent event) throws Exception {
        try {

            ta1.setText(a0.showguard());
        }
        catch(Exception e) {
            e.printStackTrace();
        }

    }



    @FXML
    public void opentableGuard(ActionEvent event) throws Exception
    {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("guard.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("adding new guard menu");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void editGuard(ActionEvent event) throws Exception{
        try
        {
            String txt1=ta1.getText();
            a0.editGuard(txt1);
        }
        catch(Exception e) {
            e.printStackTrace();
        }

    }

    janitor a1 = new janitor();



    @FXML
    public void opentableJanitor(ActionEvent event) throws Exception
    {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("janitor.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("adding new janitor menu");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void editJanitor(ActionEvent event) throws Exception{
        try
        {
            String txt1=ta1.getText();
            a1.editGuard(txt1);
        }
        catch(Exception e) {
            e.printStackTrace();
        }

    }



    atmRepairEngineer a2 = new atmRepairEngineer();

    @FXML
    public void opentableAtmRepairEngineer(ActionEvent event) throws Exception
    {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("atmRepairEngineer.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("adding new atmRepairEngineer menu");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void editAtmRepairEngineer(ActionEvent event) throws Exception{
        try
        {
            String txt1=ta1.getText();
            a2.editGuard(txt1);
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }



    officeBoy a3 = new officeBoy();


    @FXML
    public void opentablOfficeBoy(ActionEvent event) throws Exception
    {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("officeBoy.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("adding new officeBoy menu");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void editOfficeBoy(ActionEvent event) throws Exception{
        try
        {
            String txt1=ta1.getText();
            a3.editGuard(txt1);
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    currencyExchanger a4 = new currencyExchanger();


    @FXML
    public void opentableCurrencyExchanger(ActionEvent event) throws Exception
    {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("currencyExchanger.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("adding new currencyExchanger menu");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void editCurrencyExchanger(ActionEvent event) throws Exception{
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


