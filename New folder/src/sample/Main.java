package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;


/*
   to do list :
   1 check the original files add and write from files in the original code
   2 implement the old manager & old accountant by making the method in controller print all data from files
   3 adjust clients forms , radio buttons 1 on then other off
   4 take data from all forms and add it to file


 */

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("AAST BANK");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) throws FileNotFoundException {
        launch(args);
        normalClient o1= new normalClient("aly aly",99999999,"sporting","+01298555421","aly123",4321,750000,200000,300000);
        VipClient o2= new VipClient("ahmed ahmed",1234509876,"smouha","+012987654321","ahmed123",1234,1000000,0,120000);
        Manager o3= new Manager("amr amr ",987654321,"smouha","+012987654321",5,180,false,7,3,1,4);
        Accountant o4= new Accountant("mohamed mohamed",123456789,"gleem street","+0123456789",8,500,true,10,25, 12);
        ArrayList<Person> a1= new ArrayList<Person>();
        //add to files
        o1.addClient();
        o2.addClient();
        o3.addManager();
        o4.addAccountant();
        //show data
        o1.showClient();
        o2.showClient();
        o3.showManager();
        o4.showAccountant();


        // write your code here
    }
}
