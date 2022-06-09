package com.company;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileNotFoundException;


public class Accountant extends Employee {
    public int numberOfAccountsOpened;
    public int numberOfTransactions;
    public int numberOfAccountsReviewed;
    public int warnings;

    public Accountant() {
    }

    public Accountant(String name, int ssn, String address, String phone, int experience_years, int workHours, boolean present, int numberOfAccountsOpened, int numberOfTransactions, int numberOfAccountsReviewed) {
        super(name, ssn, address, phone, experience_years, workHours, present);
        this.numberOfAccountsOpened = numberOfAccountsOpened;
        this.numberOfAccountsReviewed = numberOfAccountsReviewed;
        this.numberOfTransactions = numberOfTransactions;
        if (attendance >= 25)
            warnings = 1;
        else if (warnings <= 25 && warnings >= 20)
            warnings = 2;
        else if (warnings < 20)
            warnings = 3;

    }

    public int getNumberOfAccountsOpened() {
        return numberOfAccountsOpened;
    }

    public int getNumberOfTransactions() {
        return numberOfTransactions;
    }

    public int getNumberOfAccountsReviewed() {
        return numberOfAccountsReviewed;
    }

    public int getWarnings() {
        return warnings;
    }


    @Override
    public void calculatebonus() {

        if (workHours < 650 || attendance <= 25) //less than 5 hrs a day = no bonus & must have worked 25 days min
            this.bonus = 0;
        else {
            this.bonus = (workHours % 100) * (attendance % 10);
            if (warnings == 1)
                bonus *= 0.8;
            else if (warnings == 2)
                bonus *= 0.5;
            else if (warnings == 3)
                bonus = 0;
        }
    }

    public void addAccountant() throws FileNotFoundException {
        File file1=new File("F://java intellj projects//oop second look//oop project//com//company//accountants.txt");
        String inputText1="";
        String inputToFile1=this.name+","+this.ssn+","+this.address+","+this.phone+","+this.experience_years+","+this.workHours+","+this.present+","+this.numberOfAccountsOpened+","+this.numberOfTransactions+","+this.numberOfAccountsReviewed;
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

    public void showAccountant() throws FileNotFoundException {
        File file1=new File("F://java intellj projects//oop second look//oop project//com//company//accountants.txt");
        String inputText1="";
        Scanner reader = new Scanner(file1);
        while(reader.hasNext())//display the contents of file as well
        {
            inputText1+=(reader.nextLine()+"\n");


        }
        System.out.println(inputText1+"\n");

    }
}
