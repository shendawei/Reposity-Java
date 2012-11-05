package com.shendw.jar;

public class Person
{
    String mName;
    String mIdentifer;
    int    mAge;
    String mSex;
    String mCareer;

    public Person()
    {
    }

    public Person(String name, int age)
    {
        super();
        this.mName = name;
        this.mAge = age;
    }

    public Person(String name, String identifer, int age, String sex, String career)
    {
        super();
        this.mName = name;
        this.mIdentifer = identifer;
        this.mAge = age;
        this.mSex = sex;
        this.mCareer = career;
    }

    public String getmName()
    {
        return mName;
    }

    public void setmName(String mName)
    {
        this.mName = mName;
    }

    public String getmIdentifer()
    {
        return mIdentifer;
    }

    public void setmIdentifer(String mIdentifer)
    {
        this.mIdentifer = mIdentifer;
    }

    public int getmAge()
    {
        return mAge;
    }

    public void setmAge(int mAge)
    {
        this.mAge = mAge;
    }

    public String getmSex()
    {
        return mSex;
    }

    public void setmSex(String mSex)
    {
        this.mSex = mSex;
    }

    public String getmCareer()
    {
        return mCareer;
    }

    public void setmCareer(String mCareer)
    {
        this.mCareer = mCareer;
    }
    
    public void read()
    {
        System.out.println("I am reading!");
    }
    
    public void relax()
    {
        System.out.println("I am relaxing!");
    }

}
