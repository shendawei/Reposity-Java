package com.shendw.thread;

import com.shendw.constant.Constant;

/**
 * This is a print thread.
 * 
 * @date 2012/10/25
 */
public class PrintThread implements Runnable
{
    static String THREAD_NAME = "print";
    /**
     * The field member.
     */
    private String name = THREAD_NAME;
    private String printText = null;
    
    /**
     * Method TAG.
     */
    int SLEEP = Constant.METHOD_TAG_THREAD_SLEEP;
    int JOIN  = Constant.METHOD_TAG_THREAD_JOIN;
    int YIELD = Constant.METHOD_TAG_THREAD_YIELD;
    
    private int TAG = -1;
    
    
    /**
     * The constructor.
     * 
     * @param printText
     */
    public PrintThread(String printText)
    {
        this.printText = printText;
    }
    
    /**
     * @see java.lang.Runnable#run()
     * 
     * </p perform print some information.>
     */
    @Override
    public void run()
    {
        loopMessage(getClass().getName());
        loopMessage(getClass().getCanonicalName());
        loopMessage(getClass().getSimpleName());
        loopMessage(getClass().getPackage().getName());
        
        
        if (null != printText)
        {
//            System.out.println();
            try
            {
                loopMessage(TAG);
            }
            catch (InterruptedException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
    
    public void setThreadName(String name)
    {
        if (null != name && !name.equals(""))
        {
            this.name = name;
        }
    }
    
    public String getThreadName()
    {
        return this.name;
    }
    
    public void setTestMethodTag(int TAG)/* throws InterruptedException*/
    {
        this.TAG = TAG;
        
//        switch (this.TAG)
//        {
//        case Constant.METHOD_TAG_THREAD_SLEEP:
//            Thread.sleep(100);
//            break;
//            
//        case Constant.METHOD_TAG_THREAD_JOIN:
//            Thread.currentThread().join();
//            break;
//            
//        case Constant.METHOD_TAG_THREAD_YIELD:
//            Thread.yield();
//            break;
//            
//        default:
//            break;
//        }
    }
    /**
     * Print message loop.
     */
//    @SuppressWarnings("unused")
    private void loopMessage(String name)
    {
        for (int i = 0; i < Constant.PRINT_NUMBER; i++)
        {
            System.out.println("Thread " + name + " : OUTPUT MSG " + i + " = " + printText);
        }
    }
    
    /**
     * Print message loop. And test Thread 3 methods.
     * @throws InterruptedException 
     */
    private void loopMessage(int tag) throws InterruptedException
    {
        for (int i = 0; i < Constant.PRINT_NUMBER; i++)
        {
            System.out.println("Thread " + name + " : OUTPUT MSG " + i + " = " + printText);
            switch (this.TAG)
            {
            case Constant.METHOD_TAG_THREAD_SLEEP:
                Thread.sleep(100);
                break;
                
            case Constant.METHOD_TAG_THREAD_JOIN:
                Thread.currentThread().join();
                break;
                
            case Constant.METHOD_TAG_THREAD_YIELD:
                Thread.yield();
                break;
                
            default:
                break;
            }
        }
    }
}
