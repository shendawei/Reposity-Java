package com.shendw.extra;

import com.shendw.jar.Person;

public class UseExtraClass
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Person person = new Person();
        person.setmName("extra");
        person.setmCareer("project");
        
        System.out.println(person.getmName());
    }

}
