//Team Cash Money- Angela K. Tim W. Manahal T.
//APCS1 pd5
//HW34 -- Ye Olde Role Playing Game, Unchained
//2016-11-20

/*=============================================
  class YoRPG -- Driver file for Ye Olde Role Playing Game.
  Simulates monster encounters of a wandering adventurer.
  Required classes: Warrior, Monster
  =============================================*/

import java.io.*;
import java.util.*;

public class YoRPG
{
    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~

    //change this constant to set number of encounters in a game
    public final static int MAX_ENCOUNTERS = 5;

    //each round, a Warrior and a Monster will be instantiated...
    private Character pat;   //Is it man or woman?
    private Monster smaug; //Friendly generic monster name?
    private Sidekick knicks;

    private int moveCount;
    private boolean gameOver;
    private int difficulty;
    private int charChoice;
    private String charType;
	private int enter;
	private int buy;
	private int drink;

    private InputStreamReader isr;
    private BufferedReader in;
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    // ~~~~~~~~~~ DEFAULT CONSTRUCTOR ~~~~~~~~~~~
    public YoRPG()
    {
	moveCount = 0;
	gameOver = false;
	isr = new InputStreamReader( System.in );
	in = new BufferedReader( isr );
	newGame();
    }
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    // ~~~~~~~~~~~~~~ METHODS ~~~~~~~~~~~~~~~~~~~

    /*=============================================
      void newGame() -- gathers info to begin a new game
      pre:  
      post: according to user input, modifies instance var for difficulty 
      and instantiates a Warrior
      =============================================*/
    public void newGame()
    {
	String s;
	String name = "";
	s = "~~~ Welcome to Ye Olde RPG! ~~~\n";

	s += "\nChoose your difficulty: \n";
	s += "\t1: Easy\n";
	s += "\t2: Not so easy\n";
	s += "\t3: Beowulf hath nothing on me. Bring it on.\n";
	s += "Selection: ";
	System.out.print( s );

	try {
	    difficulty = Integer.parseInt( in.readLine() );
	}
	catch ( IOException e ) { }

	s="\nChoose your Character: \n";
	s += "\t1: Warrior\n";
	s += "\t2: Mage\n";
	s += "\t3: Rogue\n";
	s += "\t4: Archer\n";
	s += "\t5: Beast\n";
	s += "Selection: ";
	System.out.print( s );

	try {
	    charChoice = Integer.parseInt( in.readLine() );
	}
	catch ( IOException e ) { }

	s = "Intrepid warrior, what doth thy call thyself? (State your name): ";
	System.out.print( s );

	try {
	    name = in.readLine();
	}
	catch ( IOException e ) { }

	//instantiate the player's character
        if (charChoice == 1){
	    pat = new Warrior(name);
	    charType = "Warrior";
	    knicks = new LittleWarrior();
	}
	if (charChoice == 2){
	    pat = new Mage(name);
	    charType = "Mage";
	    knicks = new LittleMage();
	}
	if (charChoice == 3){
	    pat = new Rogue(name);
	    charType = "Rogue";
	    knicks = new LittleRogue();
	}
	if (charChoice == 4){
	    pat = new Archer(name);
	    charType = "Archer" ;
	    knicks = new LittleArcher();
	}
	if (charChoice == 5){
	    pat = new Beast(name);
	    charType = "Beast";
	    knicks = new LittleBeast();
	}
	s = "Your character is " + charType + ".";
	System.out.println(s);
	System.out.println(pat.about());
	

	s = "You received a sidekick! Its name is " + knicks.getName() + ".";
	System.out.println(s);
	    
	System.out.println("\nP.S. We love you so we gave you monies. 20 monies to be exact. Slay some monsters and you get more!!");
	System.out.println("\nP.P.S. You can only have five things on you, tops.");
    }//end newGame()

	//simulates a shop 
	public void shop(){
		String s;
		int mon;
		
		s = "\nThere be a shop over yonder. Would you like to enter?\n";

		s += "\t1: Yes\n";
		s += "\t2: No\n";
		s += "Selection: ";
		System.out.print( s );

		try {
			enter = Integer.parseInt( in.readLine() );
		}
		catch ( IOException e ) { }
	
		if (enter == 1){
			System.out.println("\nWELCOME. WE HAVE THING.\n");
			System.out.println("just a reminder, you have " + pat.getCoins() + " monies.\n");
			s = "\t1: Viva la Vida - restores to full HP\t12 monies\n";
			s += "\t2: I need to save money for college (no buy)\n";
			s += "\nSelection: ";
			System.out.print( s );

			try {
				buy = Integer.parseInt( in.readLine() );
			}
			catch ( IOException e ) { }
		
			if (buy == 1){
				pat.setCoins(-12);
				pat.setPotions(1);
				System.out.println("Thank you for purchasing! Good luck on your adventuring!");
			}

			else{
				System.out.println("Bye!");
			}
		}
	}
    /*=============================================
      boolean playTurn -- simulates a round of combat
      pre:  Warrior pat has been initialized
      post: Returns true if player wins (monster dies).
      Returns false if monster wins (player dies).
      =============================================*/
    public boolean playTurn()
    {
	int i = 1;
	int n = 1;
	int d1, d2, d3, d4;
	d1 = 0;
	d2 = 0;
	d3 = 0;
	d4 = 0;
	
	shop();

	if (!knicks.isAlive()){
		knicks.reset();
	    }

	if ( Math.random() >= ( difficulty / 3.0 ) )
	    System.out.println( "\nNothing to see here. Move along!" );
	else {
	    System.out.println( "\nLo, yonder monster approacheth!" );

	    smaug = new Monster();

	    while( smaug.isAlive() && pat.isAlive() ) {

		// Give user the option of using a special attack:
		// If you land a hit, you incur greater damage,
		// ...but if you get hit, you take more damage.
		try {
		    System.out.println( "\nChoose your attack:" );
		    if (pat.getSpecialAttack() < 3){
			System.out.println( "\t1: Attack! \n\t2: Specialize!" );
			i = Integer.parseInt( in.readLine() );
		    }
		    
		    else if (pat.getSpecialAttack() == 3 && pat.getSpecialAttack() < 5){
			System.out.println( "\t1: Attack! \n\t2: Specialize! \n\t3: Super Attack!" );
			i = Integer.parseInt( in.readLine() );
		    }
		    
		    else if (pat.getSpecialAttack() >= 5){
			System.out.println( "\t1: Attack! \n\t2: Specialize! \n\t3: Super Attack! \n\t4: Mega Attack!");
			i = Integer.parseInt( in.readLine() );
		    }
		}
		catch ( IOException e ) { }
		
		try{
		    if (knicks.isAlive()){
			System.out.println( "Command your sidekick to:" );
			System.out.println( "\t1: Stay Balanced \n\t2: Go nuts and attack! \n\t3: Shield up like Dwayne Johnson");
			n = Integer.parseInt(in.readLine());
		    }
		}
		catch ( IOException e) {}

		/*if ( i == 2 )
		    pat.specialize();
		else
		pat.normalize();*/
		
		if ( i == 1){
		    d1 = pat.attack( smaug );
		    d2 = smaug.attack(pat);
		}

		else if ( i == 2){
		    pat.specialize();
		    d1 = pat.attack( smaug );
		    d2 = smaug.attack(pat);
		    pat.normalize();
		}

		else if ( i == 3 ){
		    d1 = pat.specialAttack1( smaug );
		    d2 = smaug.attack(pat);
		}

		else if ( i == 4){
		    d1 = pat.specialAttack2( smaug );
		    d2 = smaug.attack(pat);
		}
	       

		
		System.out.println( "\n" + pat.getName() + " dealt " + d1 +
				    " points of damage.");
		System.out.println ("\n" + "Ye Olde Monster smacked " + pat.getName() + " for " + d2 + " points of damage.");

		if (knicks.isAlive()){
		    if (n == 2){
			knicks.crazyAttack();
		    }
		    else if (n == 3){
			knicks.rockDefense();
		    }
		    d3 = knicks.attack(smaug);
		    knicks.normalize();
		    System.out.println( "\n" + knicks.getName() + " dealt " + d3 + "points of damage.");
		}
		
		if (knicks.isAlive()){
		    
		    if (Math.random() < 0.5){
			d4 = smaug.attack( knicks );
			System.out.println("\n" + "Ye Olde Monster smacked " + knicks.getName() + " for " + d4 + " points of damage.");
			if (!knicks.isAlive()){
			    System.out.println("Your sidekick " + knicks.getName() + " is bludgeoned!");
			}
		    }
		}

		
	    }//end while

	    //option 1: you & the monster perish
	    if ( !smaug.isAlive() && !pat.isAlive() ) {
		System.out.println( "'Twas an epic battle, to be sure... " + 
				    "You cut ye olde monster down, but " +
				    "with its dying breath ye olde monster. " +
				    "laid a fatal blow upon thy skull." );
		return false;
	    }
	    //option 2: you slay the beast
	    else if ( !smaug.isAlive() ) {
		System.out.println( "HuzzaaH! Ye olde monster hath been slain!" );
		pat.setCoins(8);
		System.out.println("You got 8 monies!");
		drink();
		return true;
	    }
	    //option 3: the beast slays you
	    else if ( !pat.isAlive() ) {
		System.out.println( "Ye olde self hath expired. You got dead." );
		return false;
	    }
	}//end else

	return true;
    }//end playTurn()
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

	//drinking potion...
	public void drink(){
		String str;
			
		str = "Would you like to drink a potion?\n";
		str += "\t1: Yah\n";
		str += "\t2: Nah\n";
		str += "Selection: ";
		System.out.print( str );

		try {
			drink = Integer.parseInt( in.readLine() );
		}
		catch ( IOException e ) { }
		
		if (drink == 1){
			if (pat.getPotions() == 0){
				System.out.println("You don't have any potions :(");
			}
			else{
				System.out.println("To living!!");
				pat.potionHP();
				pat.setPotions(-1);
			}
		}
		else{
			System.out.println("Alright then, onward!");
		}
	}
	
    public static void main( String[] args )
    {
	//loading...
	YoRPG game = new YoRPG();

	int encounters = 0;

	while( encounters < MAX_ENCOUNTERS ) {
	    if ( !game.playTurn() )
		break;
	    encounters++;
	   
	    System.out.println();
	}

	System.out.println( "Thy game doth be over." );
    }//end main

}//end class YoRPG


