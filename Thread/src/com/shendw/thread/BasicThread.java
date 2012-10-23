/**
 * Implement thread has two ways.
 * 
 * First way : Extend Thread class.
 * 
 * Second way : Implement Runnable interface.
 * 
 * This file is to learn how to start a thread.
 */
package com.shendw.thread;

/**
 * Learn to use thread.
 * 
 * @author Shen Dawei
 * 
 * @date 2012/10/23
 */
public class BasicThread
{
    /**
     * The field member.
     */
    
    /**
     * The main method.
     */
    public static void main(String[] args)
    {
        System.out.println("basic thread demo!");
        BasicThread mainThread = new BasicThread();
        
        /*
         * Call inner thread class.
         */
        /**
         * ThreadOne
         */
        // Access inner class , you must call BasicThread's instance.
        ThreadOne threadOne = mainThread.new ThreadOne();
        // Access static inner class , you must call BasicThread name.
        // ThreadOne threadOne0 = new BasicThread.ThreadOne();
        
        /*// only code test.
        threadOne.run();   // Only call thread's run method, but not start thread.
        */
        threadOne.start();   // Start thread.
        
        /**
         * ThreadTwo
         */
        ThreadTwo threadTwo = mainThread.new ThreadTwo();
        Thread thread = new Thread(threadTwo);
//        thread.run();
        thread.start();
        
        /*
         * Call outer thread class.
         */
        OuterThreadOne outerThreadOne = new OuterThreadOne();
//        outerThreadOne.run();
        outerThreadOne.start();
        
        OuterThreadTwo outerthreadTwo = new OuterThreadTwo();
        Thread thread2 = new Thread(outerthreadTwo);
//        thread2.run();
        thread2.start();
        
    }
    
    /**
     * The inner class : ThreadOne
     * 
     * First way : Extend Thread class.
     * 
     * 直接在main中访问内部类，则ThreadOne必须为static类型，方式为new BasicThread.ThreadOne()；
     */
    /*static */class ThreadOne extends Thread
    {
        /**
         * The field member.
         */
        
        /**
         * The constructor.
         */
        public ThreadOne()
        {
            
        }
        
        /**
         * Override thread's run method.
         */
        @Override
        public void run()
        {
            // TODO Auto-generated method stub
            super.run();
        }
    }
    
    /**
     * The inner class : ThreadTwo
     * 
     * Second way : Implement Runnable interface.
     * 
     * 直接在main中访问内部类，则ThreadTwo必须为static类型，方式为new BasicThread.ThreadOne()；
     */
    /*static */class ThreadTwo implements Runnable
    {
        /**
         * The field member.
         */
        
        /**
         * The constructor.
         */
        public ThreadTwo()
        {
            
        }

        /**
         * Override thread's run method.
         */
        @Override
        public void run()
        {
            
        }
    }
}

/**
 * The outer class.
 * 
 * First way : Extend Thread class.
 * 
 * 直接在main中访问外部类，直接new OuterThreadOne()；
 */
class OuterThreadOne extends Thread
{
    /**
     * The field member.
     */
    
    /**
     * The constructor.
     */
    public OuterThreadOne()
    {
        
    }
    
    /**
     * Override thread's run method.
     */
    @Override
    public void run()
    {
        
    }
}
/**
 * The outer class.
 * 
 * Second way : Implement Runnable interface.
 * 
 * 直接在main中访问外部类，直接new OuterThreadTwo()；
 */
class OuterThreadTwo implements Runnable
{
    /**
     * The field member.
     */
    
    /**
     * The constructor.
     */
    public OuterThreadTwo()
    {
        
    }

    /**
     * Override thread's run method.
     */
    @Override
    public void run()
    {
        
    }
}