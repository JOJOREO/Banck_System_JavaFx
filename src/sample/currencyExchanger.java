package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class currencyExchanger extends Employee {
    public double amountEntered; // to be exchanged
    public double amountOutput; // after being exchanged
    public int numofExchanges;// number of exchanges achieved by them


    public currencyExchanger(){

    }

    public currencyExchanger(String name,int ssn,String address , String phone,int experience_years,int workHours,boolean present,double amountEntered, double amountOutput, int numofExchanges){
        super(name,ssn,address,phone, experience_years, workHours, present);
        this.amountEntered=amountEntered;
        this.amountOutput=amountOutput;
        this.numofExchanges= numofExchanges;
    }

    public Double getAmountEntered()
    {
        return this.amountEntered;
    }
    public Double getAmountOutput()
    {
        return this.amountOutput;
    }

    public void setAmountEntered(double value)
    {
        this.amountEntered=value;
    }

    public void setAmountOutput(int value)
    {
        this.amountOutput=value;
    }

    public int getNumofExchanges()
    {
        return this.numofExchanges;
    }
    public void setNumofExchanges(int value)
    {
        this.numofExchanges=value;
    }

    public void getOutput(double amount){
        amountOutput= amount*18.00;
    }

    public void getInput(double amount){
        amountEntered= amount/18.00;
    }
    //reverses the exhange to get original amount

    @Override
    public void calculatebonus(){
        if (numofExchanges>5 && numofExchanges<=15)
        salary= salary+ 50;
        else if(numofExchanges>15 )
            salary=salary+500;
    }

    @Override
    public String tostring() {
        return ("name= "+name+"\n"+"id= "+id+"\n"+"experience_years= "+experience_years+"\n"+"workHours= "+workHours+"\n"+"present= "+present+"\n"+"attendance= "+attendance+"\n");
    }

    public void addCurrencyExchanger() throws FileNotFoundException {
        File file1=new File("C:\\Users\\Habiba\\IdeaProjects\\oop_project_javafx final\\oop_project_javafx\\src\\sample\\workers.txt");
        String inputText1="";
        String inputToFile1=this.name+","+this.ssn+","+this.address+","+this.phone+","+this.experience_years+","+this.workHours+","+this.present+","+this.amountEntered+","+this.amountOutput+","+this.numofExchanges+" Currencyexchanger";
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
        File file1=new File("FC:\\Users\\Habiba\\IdeaProjects\\oop_project_javafx final\\oop_project_javafx\\src\\sample\\workers.txt");
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
