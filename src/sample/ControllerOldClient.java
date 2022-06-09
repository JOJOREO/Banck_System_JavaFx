package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class ControllerOldClient {
    @FXML
    public TextArea ta1;

    VipClient a1 = new VipClient();

    normalClient a2 = new normalClient();
    @FXML
    Button bt1;
    @FXML
    Button bt2;
    @FXML
    Button bt3;
    @FXML
    Button bt4;

    @FXML
    public void show(ActionEvent event) throws Exception {
        try {

            ta1.setText(a1.showClient());
        }
        catch(Exception e) {
            e.printStackTrace();
        }

    }



    @FXML
    public void opentable3(ActionEvent event) throws Exception
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
    public void edit(ActionEvent event) throws Exception{
        try
        {
            String txt1=ta1.getText();
            a1.editclient(txt1);
        }
        catch(Exception e) {
            e.printStackTrace();
        }

    }






}


