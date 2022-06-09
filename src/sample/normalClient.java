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
            double remaining;
            remaining =amount -oldLoan;
            this.oldLoan = 0;
            this.balance+=remaining;
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
        File file1=new File("C:\\Users\\Habiba\\IdeaProjects\\oop_project_javafx final\\oop_project_javafx\\src\\sample\\clients.txt");
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
    /*
    public void searchClient()throws FileNotFoundException
    {
        File file1 = new File("F://java intellj projects//oop second look//oop project//com//company//clients.txt");
        String inputText1 = "";
        String currentLine = "";
        int flag=0;

        Scanner reader = new Scanner(file1);
        while (reader.hasNext()&& flag!=1)//display the contents of file as well
        {
            inputText1 += (reader.nextLine() + "\n");
            currentLine = reader.nextLine();
                String[] words = currentLine.split(",");
                for (int i = 0; i < words.length; i++) {
                     if (words[0] == username)
                     {
                         flag = 1;
                         //(String name,int ssn,String address,String phone,String username,int pinCode, int balance, int amount, double oldLoan)


                     }


                }
                while (reader.hasNextLine()) {

                }


            }
        }
        //System.out.println(inputText1+"\n");


*/


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
            normalClient a1 = new normalClient();
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
        //System.out.println(flag+"\n");

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
            normalClient a1 = new normalClient();
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


/*
        public void searchclientANDWrite(String inputtexxt2,String data) throws FileNotFoundException
    {
            File file1 = new File("F://java intellj projects//oop_project_javafx//src//sample//clients.txt");
            String inputText1 = "";
            String inputText2 = "";
            Scanner reader = new Scanner(file1);
            while (reader.hasNext())//display the contents of file as well
            {
                normalClient a1 = new normalClient();
                inputText1 = (reader.nextLine() + "\n");
                String[] words = inputText1.split(",");
                if(words[0]==inputtexxt2)
                    inputText1=data;

                inputText2 +=inputText1;
                PrintWriter writer =new PrintWriter(file1);
                writer.write(inputText2);
                writer.close();

            }
        //System.out.println(inputText1+"\n");


    }
    */

    public int extractClientdata(String inputText1)
    {
        String[] words = inputText1.split(",");
      normalClient a1 = new normalClient();
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
    public normalClient extractClient(String inputText1)
    {
        String[] words = inputText1.split(",");
        normalClient a1 = new normalClient();
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
        return("name= "+name+"\n"+"ssn= "+ssn+"\n"+"address= "+address+"\n"+"phone= "+phone+"\n"+"username= "+username +"\n"+"balance= "+balance+"\n"+"oldloan= "+oldLoan+"\n");
    }
}
