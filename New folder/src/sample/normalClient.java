package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class normalClient extends Client{



    public  normalClient()
    {

    }

    public normalClient(String name,int ssn,String address,String phone,String username,int pinCode, int balance, int amount, double oldLoan)
    {super(name,ssn,address,phone, username, pinCode, balance, amount,oldLoan);

        this.oldLoan= oldLoan;


    }



    public boolean PayLoan(double amount)
    {
        if (this.oldLoan >= amount)
        {
            this.oldLoan -= amount;
            System.out.println("amount deducted from loan successfully");
            return true;
        }
        else
        {
            amount-=oldLoan;
            this.oldLoan = 0;
            this.balance+=amount;
            System.out.println("loan fully paid and remaining amount added to balance");
            return false;
        }
    }

    public boolean  WithDraw(double amount)
    {
        if (this.balance > amount)
        {
            this.balance -= amount;
            System.out.println("Withdrawal complete.\n");
            return true;
        }
        else
        {
            System.out.println("Your Balance is not enough.");
            return false;
        }
    }

    public void Loan(double amount)
    {

        this.oldLoan = this.oldLoan + amount;

    }


    public boolean savingsDeposit(double amount)
    {
        if (amount > 0)
        {
            this.balance += amount + ( 0.3 * amount) ;
            return true;
        }
        else
            return false;
    }

    public boolean addToAccount(double amount)
    {
        if (amount > 0)
        {
            this.balance += amount;
            System.out.println("amount added to balance");
            return true;
        }
        else {
            System.out.println("amount less than zero");
            return false;
        }
    }
    public int checkBalance()
    {
        return this.balance;
    }


     public void waitTime( int time){
        int num=5;//client waits 5 mins for output to show;
        time= num*10;
        System.out.println("Please wait for "+ time);
     }

    public void addClient() throws FileNotFoundException {
        File file1=new File("F://java intellj projects//oop_project_javafx//src//sample//clients.txt");
        String inputText1="";
        String inputToFile1=this.name+","+this.ssn+","+this.address+","+this.phone+","+this.username+","+this.pinCode+","+this.balance+","+this.amount+","+this.oldLoan+","+"normal";
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

    public void showClient() throws FileNotFoundException {
        File file1 = new File("F://java intellj projects//oop second look//oop project//com//company//clients.txt");
        String inputText1 = "";
        Scanner reader = new Scanner(file1);
        while (reader.hasNext())//display the contents of file as well
        {
            inputText1 += (reader.nextLine() + "\n");


        }
        System.out.println(inputText1+"\n");
    }

    @Override
    public String tostring() {
        return("name= "+name+"\n"+"ssn= "+ssn+"\n"+"address= "+address+"\n"+"phone= "+phone+"\n"+"username= "+username +"\n"+"balance= "+balance+"\n"+"oldloan= "+oldLoan+"\n");
    }
}
