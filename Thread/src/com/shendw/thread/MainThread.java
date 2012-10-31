package com.shendw.thread;

import com.shendw.constant.Constant;

public class MainThread extends Thread
{
    Thread curThread = Thread.currentThread();   // curThread.name = main;
    
    public MainThread(){}
    
    /**
     * The main entry.
     * 
     * @param args
     */
    public static void main(String[] args)
    {
        // Main thread.
        MainThread mainThread = new MainThread();
        mainThread.start();
        
        
        // New thread.
        PrintThread ptSleep = new PrintThread("printer");
//        ptSleep.setThreadName("sleep");
//        ptSleep.setTestMethodTag(Constant.METHOD_TAG_THREAD_SLEEP);
        Thread th1 = new Thread(ptSleep);
        th1.start();
        /*Thread.yield();
        
        // New thread.
        PrintThread ptJoin = new PrintThread("printer");
        ptJoin.setThreadName("join");
//        ptJoin.setTestMethodTag(Constant.METHOD_TAG_THREAD_JOIN);
        Thread th2 = new Thread(ptJoin);
        th2.start();
        try
        {
            th2.join();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        
        
        // New thread.
        PrintThread ptYield = new PrintThread("printer");
        ptYield.setThreadName("yield");
//        ptYield.setTestMethodTag(Constant.METHOD_TAG_THREAD_YIELD);
        Thread th3 = new Thread(ptYield);
        th3.start();*/
    }
    
    private void loopCurThreadMsg(Thread curThread)
    {
        for (int i = 0; i < Constant.PRINT_NUMBER; i++)
        {
            System.out.println("Thread " + curThread.getName() + " : OUTPUT MSG " + i + " = " + "main");
        }
    }

    @Override
    public void run()
    {
        // Thread thread = Thread.currentThread(); // thread.name = Thread-0;
        loopCurThreadMsg(curThread);
    }
    
    private void testYield()
    {
        Thread.yield();
    }
}
