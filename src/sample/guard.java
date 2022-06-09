package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class guard extends Employee {
    int numberOfThievesCaught;
    int numberOfBulletsShot;
    int numberOfDaysOff;
    public boolean injured;
    double insurance=0;
    public guard()
    {}

    public guard(String name , int ssn,String address , String phone,int experience_years,int workHours,boolean present,int numberOfThievesCaught,int numberOfBulletsShot,int numberOfDaysOff)
    { super(name ,ssn,address,phone, experience_years, workHours, present);
    this.numberOfThievesCaught=numberOfThievesCaught;
    this.numberOfBulletsShot=numberOfBulletsShot;
    this.numberOfDaysOff=numberOfDaysOff;
    this.injured= numberOfBulletsShot >= 10;//simplified if condition if number of bullets shot greater than output true;
    this.insurance=calculateInsurance();
    }
    public double calculateInsurance()
    {
        if(injured)
            insurance+=calculateSalary()*1.5;
        return insurance;
    }

    public void addGuard() throws FileNotFoundException {
        File file1=new File("C:\\Users\\Habiba\\IdeaProjects\\oop_project_javafx final\\oop_project_javafx\\src\\sample\\workers.txt");
        String inputText1="";
        String inputToFile1=this.name+","+this.ssn+","+this.address+","+this.phone+","+this.experience_years+","+this.workHours+","+this.present+","+this.numberOfThievesCaught+","+this.numberOfBulletsShot+","+this.numberOfDaysOff+" Guard";
        Scanner reader = new Scanner(file1);
        while(reader.hasNext())//display the contents of file as well
        {
            inputText1+=(reader.nextLine()+"\n");

        }
        PrintWriter writer =new PrintWriter(file1);
        writer.write(inputText1);
        writer.write(inputToFile1);
        writer.close();
    }

    public void editGuard(String inputtexxt2) throws FileNotFoundException {
        File file1=new File("C:\\Users\\Habiba\\IdeaProjects\\oop_project_javafx final\\oop_project_javafx\\src\\sample\\workers.txt");
        String inputText1="";
        PrintWriter writer =new PrintWriter(file1);
        writer.write(inputtexxt2);
        writer.close();
    }

    public String showguard() throws FileNotFoundException {
        File file1=new File("C:\\Users\\Habiba\\IdeaProjects\\oop_project_javafx final\\oop_project_javafx\\src\\sample\\workers.txt");
        String inputText1="";
        Scanner reader = new Scanner(file1);
        while(reader.hasNext())//display the contents of file as well
        {
            inputText1+=(reader.nextLine()+"\n");


        }
        //System.out.println(inputText1+"\n");
        return inputText1;
    }

}
