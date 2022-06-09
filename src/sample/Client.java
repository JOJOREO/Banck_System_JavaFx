package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public abstract class Client extends Person {
    public String username;
    public int pinCode;
    public int balance;
    public boolean withdraw; //user insert 0  withdraw
    public boolean insert;//user insert 1  insert money in account
    public int amount;//amount  withdrawn or inserted
    public double oldLoan;
    public  Client()
    {

    }
    public Client(String name,int ssn,String address,String phone,String username,int pinCode, int balance, int amount, double oldLoan)
    {super(name,ssn,address,phone);
    this.username=username;
    this.pinCode=pinCode;
    this.balance=balance;
    this.amount=amount;

    this.oldLoan= oldLoan;


    }


    public abstract boolean PayLoan(double amount);
    public abstract boolean  WithDraw(double amount);
    public abstract void Loan(double amount);
    public abstract boolean savingsDeposit(double amount);
    public abstract boolean addToAccount(double amount);
    public abstract int checkBalance();
    public abstract void waitTime( int time);
    public abstract void addClient() throws FileNotFoundException;



    @Override
    public String tostring() {
        return("name= "+name+"\n"+"ssn= "+ssn+"\n"+"address= "+address+"\n"+"phone= "+phone+"\n"+"username= "+username+"balance= "+balance+"\n"+"oldloan= "+oldLoan+"\n");
    }
}
