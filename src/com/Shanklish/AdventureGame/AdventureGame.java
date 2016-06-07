package com.Shanklish.AdventureGame;
import java.util.Scanner;

public class AdventureGame
    {

	public static void main( String[] args )
	{
	    Scanner scan = new Scanner(System.in);
	    
	    String choice="";
	    
	    boolean x = true;
	    
	    System.out.println("Who the F*$& is at my door?");
	    String name = scan.nextLine();
	    
	    do
		{
        	    	System.out.println(name +" ? " + " Did Jimmy send you?(Yes/No)");
        	    	choice = scan.nextLine();
	    
		} while(!choice.equalsIgnoreCase("yes") && !choice.equalsIgnoreCase("no"));
		
	    if(choice.equalsIgnoreCase("yes"))
		{
		    do 
			{
		    	System.out.println("Tell him I need more time" + " [ Is that an acceptable answer?(yes/no) ]");
	    		choice=scan.nextLine();
	    		
			}while(!choice.equalsIgnoreCase("yes") && !choice.equalsIgnoreCase("no"));
		    
	    			if(choice.equalsIgnoreCase("yes"))
	    			    System.out.println(name + " walks away in a very peaceful manner");
	    			
	    			else if(choice.equalsIgnoreCase("no"))
	    			    {
	    				System.out.println("*Rattling and shuffling is heard inside. Will " + name + " [kick the door open] [run down the stairs] or [go home] ?" );
	    				choice = scan.nextLine();
	    				
	    					if(choice.equalsIgnoreCase("kick the door open"))
	    					    System.out.println("*The person inside has escaped through the fire escape");
	    					
	    					else if(choice.equalsIgnoreCase("run down the stairs"))
	    					    System.out.println("After 23 flights of stairs, suspect has already escaped via horse");
	    					
	    					else 
						    System.out.println("Wasn't worth it anyways.");
						
	    			    }
		}
	    else if (choice.equalsIgnoreCase("no"))
		System.out.println("Then GTFO off my lawn");

	}

    }
