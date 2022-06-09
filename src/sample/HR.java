package sample;

public class HR extends Employee{

    public int numofWarnings;
    public boolean employed;// if they're employed or fired
    //number of warnings an employee gets and giving them salaries

    public HR (){

    }

    public HR (String name , int ssn,String address , String phone,int experience_years,int workHours,boolean present, int warnings, boolean employed){
        super( name ,ssn,address,phone, experience_years, workHours, present);
        this.numofWarnings= warnings;
        this.employed= Fired();
    }

    public int getWarnings()
    {
        return this.numofWarnings;
    }


// ??


    public void setWarnings(int value)
    {
        this.numofWarnings=value;
    }


    public boolean getEmployed()
    {
        return this.employed;
    }
    public void setEmployed(boolean value)
    {
        this.employed=value;
    }


    //give them salaries and bonusus, based on their work

    @Override
    public double calculateSalary(){
        if (level.equals(l1))
            salary= salary+ 50;
        else if (level.equals(l2))
            salary= salary+ 200;
        else
            salary= salary +300;
        return salary;
    }

    // fire them if warnings are too much
    public boolean Fired(){
        if (numofWarnings ==0 )
            employed= true;
        else if(numofWarnings> 0 && numofWarnings<= 3)
            employed= true;

        else if(numofWarnings>3 && numofWarnings< 6)
            employed= true;

        else if(numofWarnings>6)
            employed = false;

        return employed;
    }




    @Override
    public String tostring() {
        return ("name= "+name+"\n"+"id= "+id+"\n"+"experience_years= "+experience_years+"\n"+"workHours= "+workHours+"\n"+"present= "+present+"\n"+"attendance= "+attendance+"\n"+"warnings= "+numofWarnings+"\n"+"Salary= "+this.salary+"\n"+"employement= "+employed+"\n");
    }
}
