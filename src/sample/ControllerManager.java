package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class ControllerManager {
    @FXML
    public TextArea ta1;
    @FXML
    public TextField tf1;
    Accountant a1 = new Accountant();
    @FXML
    public void show(ActionEvent event) throws Exception {
        try {

            ta1.setText(a1.showAccountant());
        }
        catch(Exception e) {
            e.printStackTrace();
        }

    }



    @FXML
    public void opentable3(ActionEvent event) throws Exception
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
    public void edit(ActionEvent event) throws Exception{
        try
        {
            String txt1=ta1.getText();
            a1.editAccountant(txt1);
        }
        catch(Exception e) {
            e.printStackTrace();
        }

    }



    }


