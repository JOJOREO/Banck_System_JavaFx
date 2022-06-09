package com.company;

import java.io.FileNotFoundException;
public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        normalClient o1= new normalClient("aly aly",99999999,"sporting","+01298555421","aly123",4321,750000,200000,300000);
        VipClient o2= new VipClient("ahmed ahmed",1234509876,"smouha","+012987654321","ahmed123",1234,1000000,0,120000);
        Manager o3= new Manager("amr amr ",987654321,"smouha","+012987654321",5,180,false,7,3,1,4);
        Accountant o4= new Accountant("mohamed mohamed",123456789,"gleem street","+0123456789",8,500,true,10,25, 12);


        //add to files
        o1.addClient();
        o2.addClient();
        o3.addManager();
        o4.addAccountant();
        //show data
        o1.showClient();
        o2.showClient();
        o3.showManager();
        o4.showAccountant();


	// write your code here
    }
}
