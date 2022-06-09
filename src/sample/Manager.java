package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Manager extends Employee{
    public int numberOfPaperSigned;
    public int numberOfEmployeesHired;
    public int numberOfEmployeesFired;
    public int numberOfDaysOffGiven;
    public Manager()
    {

    }
    public Manager(String name , int ssn,String address ,String phone,int experience_years,int workHours,boolean present,int numberOfPaperSigned,int numberOfEmployeesHired,int numberOfEmployeesFired,int numberOfDaysOffGiven)
    {super(name,ssn,address,phone,experience_years,workHours,present);
    this.numberOfPaperSigned=numberOfPaperSigned;
    this.numberOfEmployeesHired=numberOfEmployeesHired;
    this.numberOfEmployeesFired=numberOfEmployeesFired;
    this.numberOfDaysOffGiven=numberOfDaysOffGiven;


    }


    public int getNumberOfPaperSigned() {
        return numberOfPaperSigned;
    }

    public int getNumberOfDaysOffGiven() {
        return numberOfDaysOffGiven;
    }

    public int getNumberOfEmployeesHired() {
        return numberOfEmployeesHired;
    }

    public int getNumberOfEmployeesFired() {
        return numberOfEmployeesFired;
    }


    @Override
    public void calculatebonus() {
        if (workHours < 650 || attendance <= 25) //less than 5 hrs a day = no bonus & must have worked 25 days min
            this.bonus = 0;
        else {
            this.bonus = (workHours % 100) * (attendance % 10);
        if (numberOfPaperSigned >= 100)
            bonus += 30;
        else if (numberOfEmployeesHired >= 10)
            bonus += 20;
        else if (numberOfEmployeesFired > 10)
            bonus -= 50;
        else if (numberOfDaysOffGiven > 7)
            bonus -= 30;


        }
    }

    public void addManager() throws FileNotFoundException {
        File file1=new File("C:\\Users\\Habiba\\IdeaProjects\\oop_project_javafx final\\oop_project_javafx\\src\\sample\\managers.txt");
        String inputText1="";
        String inputToFile1=this.name+","+this.ssn+","+this.address+","+this.phone+","+this.experience_years+","+this.workHours+","+this.present+","+this.numberOfPaperSigned+","+this.numberOfEmployeesHired+","+this.numberOfEmployeesFired+","+this.numberOfDaysOffGiven;
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

    public void editManager(String inputtexxt2) throws FileNotFoundException {
        File file1=new File("C:\\Users\\Habiba\\IdeaProjects\\oop_project_javafx final\\oop_project_javafx\\src\\sample\\managers.txt");
        String inputText1="";
        String inputToFile1=this.name+","+this.ssn+","+this.address+","+this.phone+","+this.experience_years+","+this.workHours+","+this.present+","+this.numberOfPaperSigned+","+this.numberOfEmployeesHired+","+this.numberOfEmployeesFired+","+this.numberOfDaysOffGiven;
        Scanner reader = new Scanner(file1);
        while(reader.hasNext())//display the contents of file as well
        {
            inputText1+=(reader.nextLine()+"\n");

        }
        PrintWriter writer =new PrintWriter(file1);

        writer.write(inputtexxt2);
        writer.close();
    }

    public String showManager() throws FileNotFoundException {
        File file1=new File("C:\\Users\\Habiba\\IdeaProjects\\oop_project_javafx final\\oop_project_javafx\\src\\sample\\managers.txt");
        String inputText1="";
        Scanner reader = new Scanner(file1);
        while(reader.hasNext())//display the contents of file as well
        {
            inputText1+=(reader.nextLine()+"\n");

        }
        //System.out.println(inputText1+"\n");
        return (inputText1);
    }





}
