package com.shendw.jar;

public class MyTask
{
    @SuppressWarnings("unused")
    private void perform()
    {
        System.out.println("perform: The time of my task is : " + System.currentTimeMillis());
    }
    
    /*
     * A Task is any class that extends org.apache.tools.ant.Task or can be
     * adapted as a Task using an adapter class.
     * 
     * It must implement public execute() method.
     */
    public void execute()
    {
        System.out.println("execute: The time of my task is : " + System.currentTimeMillis());
    }
}
