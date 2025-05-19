/*

// ****************************************************************
// Rock.java
//
// Play Rock, Paper, Scissors with the user
//          
// ****************************************************************


public class Rock
{
    public static void main(String[] args){

	String personPlay;    //User's play -- "R", "P", or "S"
	String computerPlay;  //Computer's play -- "R", "P", or "S"
	int computerInt;      //Randomly generated number used to determine
	                      //computer's play

	//using scanner class to read the user input from keyboard
	System.out.print ("Enter your play: R, P, or S: ");
	.....
	
	
	//using Random class to randomly generated number: 0, 1, and 2 used to determine computer's play.
	.....
	
	

	//Using a switch statement to translate computer's randomly generated play to string
	//"R", "P", or "S".  
	switch (computerInt)
	    {
	    case 0: 
		....
	    default://If play is not a value you expected (0,1,2), set it to "I" and print a warning message.
		
	    }

	//Print computer's play
	System.out.println("Computer play is " + computerPlay);

	//Illegal person play?
	if (!(personPlay.equals("P") || 
	      personPlay.equals("R") || 
	      personPlay.equals("S")))
	    System.out.println("Illegal person play: " + personPlay);

	//Illegal computer play?
	else if (computerPlay.equals("I")) 
	    System.out.println("Illegal computer play: " + computerPlay);

	else
	//See who won.  Use nested ifs instead of &&.
	    {
		if (personPlay.equals(computerPlay))  
		    System.out.println("It's a tie!");

		else if (personPlay.equals("R"))
			//...Fill in the rest of code
	    }


    }
}

		

	
		



*/