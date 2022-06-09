package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class officeBoy extends Employee{
    public int numberDrinksServed;
    public int numberOfSandwichesServed;
    public int numberOfDaysOff;;
    public boolean accident;
    public double insurance;
    public officeBoy()
    {

    }
    public officeBoy(String name , int ssn,String address , String phone,int experience_years,int workHours,boolean present,int numberDrinksServed,int numberOfSandwichesServed,int numberOfDaysOff)
    { super(name, ssn, address, phone, experience_years, workHours, present);

        this.numberDrinksServed=numberDrinksServed;
        this.numberOfSandwichesServed=numberOfSandwichesServed;
        this.numberOfDaysOff=numberOfDaysOff;
        this.accident=numberDrinksServed>30;
        this.insurance=calculateInsurance();
    }

    public double calculateInsurance()
    {
        if(accident)
            insurance+=calculateSalary()*1.5;
        return insurance;
    }

    public void addOfficeBoy() throws FileNotFoundException {
        File file1=new File("C:\\Users\\Habiba\\IdeaProjects\\oop_project_javafx final\\oop_project_javafx\\src\\sample\\workers.txt");
        String inputText1="";
        String inputToFile1=this.name+","+this.ssn+","+this.address+","+this.phone+","+this.experience_years+","+this.workHours+","+this.present+","+this.numberDrinksServed+","+this.numberOfSandwichesServed+","+this.numberOfDaysOff+" officeboy";
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
