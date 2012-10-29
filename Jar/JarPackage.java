package com.jar;

public class JarPackage
{
    /*
     * #To archive 3 class files into an archive called classes.jar:
     * Cmd:
     * G:\JavaTest>jar cvf classes.jar com\jar\HelloWorld.class
     * com\jar\JarPackage.class com\jar\UnjarPackage.class
     * 
     * added manifest
     * adding: com/jar/HelloWorld.class(in = 502) (out= 325)(deflated 35%)
     * adding: com/jar/JarPackage.class(in = 441) (out= 296)(deflated 32%)
     * adding: com/jar/UnjarPackage.class(in = 447) (out= 296)(deflated 33%)
     */
    public static void main(String[] args)
    {
        System.out.println("JarPackage program!");
    }
}
