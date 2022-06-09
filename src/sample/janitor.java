package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class janitor extends Employee {
    public int numberWindowsCleaned;
    public int numberOfCleaningBottlesUsed;
    public int numberOfTimesVacumedFLoor;
    public boolean sick;
    public double insurance;
    public janitor()
    {

    }
    public janitor(String name , int ssn,String address , String phone,int experience_years,int workHours,boolean present,int numberWindowsCleaned,int numberOfCleaningBottlesUsed,int numberOfTimesVacumedFLoor)
        { super(name, ssn, address, phone, experience_years, workHours, present);

            this.numberWindowsCleaned=numberWindowsCleaned;
            this.numberOfCleaningBottlesUsed=numberOfCleaningBottlesUsed;
            this.numberOfTimesVacumedFLoor=numberOfTimesVacumedFLoor;
            this.sick=numberWindowsCleaned>75;
            this.insurance=calculateInsurance();
    }

    public double calculateInsurance()
    {
        if(sick)
            insurance+=calculateSalary()*1.5;
        return insurance;
    }
    public void addJanitor() throws FileNotFoundException {
        File file1=new File("C:\\Users\\Habiba\\IdeaProjects\\oop_project_javafx final\\oop_project_javafx\\src\\sample\\workers.txt");
        String inputText1="";
        String inputToFile1=this.name+","+this.ssn+","+this.address+","+this.phone+","+this.experience_years+","+this.workHours+","+this.present+","+this.numberWindowsCleaned+","+this.numberOfCleaningBottlesUsed+","+this.numberOfTimesVacumedFLoor+" Janitor";
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
