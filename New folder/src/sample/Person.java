package sample;

public abstract class Person
{
    String name;
    int ssn;

    String address;
    String phone;

    public Person()
    {

    }
    public Person(String name , int ssn,String address , String phone)
    {
        this.name= name;
        this.ssn = ssn;

        this.address=address;
        this.phone=phone;
    }


    public String getName() // getter and setter methods
    {
        return this.name;
    }
    public int getSsn()
    {
        return this.ssn;
    }
    public String getAddress()
    {
        return this.address;
    }
    public String getPhone()
    {
        return this.phone;
    }
    //----------------------------------------------------------------------------

    public void setName(String value)
    {
        this.name=value;
    }

    public void setSsn(int value)
    {
        this.ssn=value;
    }

    public void setAddress(String value)
    {
        this.address=value;
    }
    public void setPhone(String value)
    {
        this.phone=value;
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////
public abstract String tostring();
}
