package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class VipClient extends Client{

    public VipClient(){

    }

    public VipClient(String name,int ssn,String address,String phone,String username,int pinCode, int balance, int amount, double oldLoan)
    {super(name,ssn,address,phone, username, pinCode, balance, amount, oldLoan);

    }



    @Override

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
    @Override

    public boolean WithDraw(double amount)
    {
        if(this.balance > amount)
        {

            this.balance -= amount;
            System.out.println("Withdrawal complete.\n");
            return true;
        }
        else if (this.balance < amount && this.balance>= 0)
        {
            balance+=amount;//lend vip costumer the wanted amount but add it to loan
            Loan(amount);
            System.out.println("Your Balance is not enough but transaction achieved by adding to loan.\n");
            return true;
        }
        else
            return false;

    }
     @Override
     public void Loan(double amount)
     {

         this.oldLoan = this.oldLoan + amount;

     }
    @Override

    public boolean savingsDeposit(double amount)
    {
        if (amount > 0)
        {
            this.balance += amount + ( 0.6 * amount) ;
            return true;
        }
        else
            return false;
    }

    @Override

    public boolean addToAccount(double amount)
    {
        if (amount > 0)
        {
            this.balance += amount;
            System.out.println("amount added to balance");
            return true;
        }
        else
        {
            System.out.println("amount less than zero");
            return false;
        }

    }
    public int checkBalance()
    {
        return this.balance;
    }

    @Override

    public void waitTime( int time){
        int num=5;//client waits 5 minutes for output to show;
        time= num*4;
        System.out.println("Please wait for "+ time);
    }

    public void addClient() throws FileNotFoundException {
        File file1=new File("F://java intellj projects//oop second look//oop project//com//company//clients.txt");
        String inputText1="";
        String inputToFile1=this.name+","+this.ssn+","+this.address+","+this.phone+","+this.username+","+this.pinCode+","+this.balance+","+this.amount+","+this.oldLoan+","+"vip";
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
        return("name= "+name+"\n"+"ssn= "+ssn+"\n"+"address= "+address+"\n"+"phone= "+phone+"\n"+"username= "+username+ "\n"+"balance= "+balance+"\n"+"oldloan= "+oldLoan+"\n");
    }
}
