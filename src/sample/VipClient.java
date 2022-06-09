package sample;

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
            double remaining;
            remaining =amount -oldLoan;
            this.oldLoan = 0;
            this.balance+=remaining;
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
            Loan(amount-balance);
            balance=0;//lend vip costumer the wanted amount but add it to loan
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
        File file1=new File("F://java intellj projects//oop_project_javafx//src//sample//clients.txt");
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

    public String showClient() throws FileNotFoundException {
        File file1 = new File("C:\\Users\\Habiba\\IdeaProjects\\oop_project_javafx final\\oop_project_javafx\\src\\sample\\clients.txt");
        String inputText1 = "";
        Scanner reader = new Scanner(file1);
        while (reader.hasNext())//display the contents of file as well
        {
            inputText1 += (reader.nextLine() + "\n");


        }
        //System.out.println(inputText1+"\n");
        return inputText1;
    }

    public void editclient(String inputtexxt2) throws FileNotFoundException {
        File file1=new File("C:\\Users\\Habiba\\IdeaProjects\\oop_project_javafx final\\oop_project_javafx\\src\\sample\\clients.txt");
        String inputText1="";
        PrintWriter writer =new PrintWriter(file1);
        writer.write(inputtexxt2);
        writer.close();
    }


    public String searchclient(String inputtexxt2) throws FileNotFoundException {
        File file1 = new File("C:\\Users\\Habiba\\IdeaProjects\\oop_project_javafx final\\oop_project_javafx\\src\\sample\\clients.txt");
        String inputText1 = "";
        String inputText2 = "";
        Scanner reader = new Scanner(file1);
        int flag=0;
        while (reader.hasNext() && flag==0)//display the contents of file as well
        {
            VipClient a1 = new VipClient();
            inputText1 = (reader.nextLine());
            String[] words = inputText1.split(",");
            if (words[4].equals(inputtexxt2))
            {
                flag = 1;


            }
            else
            {
                flag = 0;

            }



            //System.out.println(words[4]);

        }
       // System.out.println(flag+"\n");

        if(flag==1)
            return inputText1;
        else
            return "not found";
    }

    public void editMiddle(String inputtexxt2,String data) throws FileNotFoundException {
        File file1 = new File("C:\\Users\\Habiba\\IdeaProjects\\oop_project_javafx final\\oop_project_javafx\\src\\sample\\clients.txt");
        String inputText1 = "";
        String inputText2 = "";
        Scanner reader = new Scanner(file1);
        int flag=0;


        while (reader.hasNext())//display the contents of file as well
        {
            VipClient a1 = new VipClient();
            inputText1 = (reader.nextLine() );
            String[] words = inputText1.split(",");



            if (words[4].equals(inputtexxt2))
            {

                flag=1;
            }
            else
                flag=0;
            if (flag==1)
            {
                inputText1=data;
                inputText2 += (inputText1+"\n");
            }
            else {

                inputText2 += (inputText1+"\n");
            }


        }
        PrintWriter writer = new PrintWriter(file1);
        writer.write(inputText2);
        writer.close();
    }



    public int extractClientdata(String inputText1)
    {
        String[] words = inputText1.split(",");
        VipClient a1 = new VipClient();
        //a1.name=words[0];
        //a1.ssn= Integer.parseInt(words[1]);
        //a1.address=words[2];
        //a1.phone=words[3];
        //a1.username=words[4];
        //a1.pinCode= Integer.parseInt(words[5]);
        int balance=Integer.parseInt(words[6]);
        int amount=Integer.parseInt(words[7]);
        Double oldLoan=Double.parseDouble(words[8]);
        return balance;

        //String inputToFile1=this.name+","+this.ssn+","+this.address+","+this.phone+","+this.username+","+this.pinCode+","+this.balance+","+this.amount+","+this.oldLoan+","+"normal";


    }

    public VipClient extractClient(String inputText1)
    {
        String[] words = inputText1.split(",");
        VipClient a1 = new VipClient();
        a1.name=words[0];
        a1.ssn= Integer.parseInt(words[1]);
        a1.address=words[2];
        a1.phone=words[3];
        a1.username=words[4];
        a1.pinCode= Integer.parseInt(words[5]);
        a1.balance=Integer.parseInt(words[6]);
        a1.amount=0;
        a1.oldLoan=Double.parseDouble(words[8]);
        return a1;

        //String inputToFile1=this.name+","+this.ssn+","+this.address+","+this.phone+","+this.username+","+this.pinCode+","+this.balance+","+this.amount+","+this.oldLoan+","+"normal";


    }







    @Override
    public String tostring() {
        return("name= "+name+"\n"+"ssn= "+ssn+"\n"+"address= "+address+"\n"+"phone= "+phone+"\n"+"username= "+username+ "\n"+"balance= "+balance+"\n"+"oldloan= "+oldLoan+"\n");
    }
}
