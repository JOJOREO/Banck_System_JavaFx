package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ControllerLogin {
    @FXML
    public Button managerButton;
    @FXML
    public void opentable1(ActionEvent event) throws Exception
    {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("manager.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("adding new manager menu");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }

    }


    @FXML
    public Button accountantButton;
    @FXML
    public void opentable2(ActionEvent event) throws Exception
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
    public Button normalClient;
    @FXML
    public void opentable3(ActionEvent event) throws Exception
    {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("oldNormalClientLogin.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Normal CLient menu");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }

    }

    @FXML
    public Button VipClient;
    @FXML
    public void opentable4(ActionEvent event) throws Exception
    {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("oldVipClientLogin.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("VIP client menu");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }

    }

    @FXML
    public Button oldAccountant;
    @FXML
    public void opentable5(ActionEvent event) throws Exception
    {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("oldaccountant.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("show all clients");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }

    }

    @FXML
    public Button oldManager;
    @FXML
    public void opentable6(ActionEvent event) throws Exception
    {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("oldmanager.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("show all accountants");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }

    }

}
