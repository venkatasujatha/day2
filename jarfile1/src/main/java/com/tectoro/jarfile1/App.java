package com.tectoro.jarfile1;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )throws Exception
    {
    	
        Class.forName("java.sql.Driver");
    	System.out.println( "Hello World!" );
    }
    
}
