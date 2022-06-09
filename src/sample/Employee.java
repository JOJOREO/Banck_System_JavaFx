package sample;

public abstract class Employee extends  Person
{
    public static int  id=0;
    public double salary;
    public int experience_years ;
    public String level;
    final String l1="junior";
    final String l2="senior";
    final String l3="expert";
    public int workHours;
    public double bonus;
    public boolean present;
    public int attendance=30;
    public Employee()
    {

    }
    public Employee(String name , int ssn,String address , String phone,int experience_years,int workHours,boolean present)
    { super( name ,ssn,address,phone);
        id++;
        this.experience_years=experience_years;
        if(experience_years<=3)
            this.level=l1;
        else if(experience_years<=10)
            this.level=l2;
        else
            this.level=l3;
        this.workHours=workHours;
        this.present=present;
    }
    //------------------------------------------------------- **  getter and setters ** -------------------------------------------

    public double getSalary() {
        return this.salary;
    }

    public int getExperienceYears() {
        return this.experience_years;
    }
    public String getLevel() {
        return this.level;
    }

    public int getWorkHours() {
        return this.workHours;
    }

    public double getBonus() {
        return this.bonus;
    }

    public boolean getPresent() {
        return this.present;
    }

    public void setLevel(String value)
    {
        this.level=value;
    }

    public void setWorkHours(int value)
    {
        this.workHours=value;
    }

    public void setBonus(double value)
    {
        this.bonus=value;
    }

    public void setAttendance(int value)
    {
        this.attendance=value;
    }
//------------------------------------------------------------------------------------------
    public int calculateAttendance()
    {
        if (present=false) {
            workHours -= 24;
            attendance = workHours / 60;
        }

            return workHours / 60;

    }

    public void calculatebonus() {

    if (workHours < 650 || attendance <= 25) //less than 5 hrs a day = no bonus & must have worked 25 days min
        this.bonus = 0;
    else {
        this.bonus = (workHours % 100) * (attendance % 10);
    }

    }
    public double calculateSalary()
    {
        calculatebonus();
        if(level == l1)
            salary=bonus+250;

        else if(level == l2)
            salary=bonus+500;

        else if(level == l3)
            salary=bonus+1000;

        return salary;
        }




    @Override
    public String tostring() {
        return ("name= "+name+"\n"+"id= "+id+"\n"+"experience_years= "+experience_years+"\n"+"workHours= "+workHours+"\n"+"present= "+present+"\n"+"attendance= "+attendance+"\n");
    }
}
