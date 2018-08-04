import java.util.Scanner;
//Name: Jorge Sirias
//Class: COP 3337 Programing II
//Professor: Greg Shaw
//Section: U07
//Date: 10/23/17
//
//I affirm that this program is entirely my own work and none of it is the work of any other person.
//  _Jorge Siras__________________
//	(your signature)

public class PileGameTester 
{

    public static void main(String [] args)
    {
        
        System.out.println("Hello and welcome to the ancient game of NIM where "
                + "2 players take turns removing marbles from a pile.\n");
        System.out.println("The rules of NIM are simple:  \n"
                + "  - Each Player removes in between one to half the amount of marbles in a pile\n"
                + "  - If a player removes sero, more than half, or all the marbles that is considered an illegal move\n"
                + "  - The player who picks up the last marble in a pile is declared the loser!\n");
        
        //String startGame = "YES";
        //String EndGame = "NO";
        
        String playerName;
        
        //Player [] twoPlayers; DELETE**********
        
        System.out.println("What is your name?");
        Scanner scn = new Scanner(System.in);
        playerName = scn.nextLine();
        
        boolean userDoesNotWantToPlay = false;
        
        while(!userDoesNotWantToPlay)
        {
            
            boolean validOpponent = false;
            String opponent = "";
            
            while(!validOpponent)
            {
            
                System.out.println("\nSo " + playerName + " would you like to play against a smart computer "
                    + "or a dumb computer?");
            
                //Variable that holds what type of opponent does the player want to play
                opponent = scn.nextLine();
                opponent = opponent.toUpperCase();
                
                if(opponent.equals("SMART COMPUTER") || opponent.equals("DUMB COMPUTER"))
                {
                    
                    validOpponent = true;
                    
                }
                else if(!(opponent.equals("SMART COMPUTER") || opponent.equals("DUMB COMPUTER")))
                {
            
                    System.out.println("\nYour answer was incorrect. Please choose again.\n");
                
                }
            }
            
            boolean validFirstMove = false;
            String firstOrSecond = "";
                    
            while(!validFirstMove)
            {
            
                System.out.println("\nAlso, " + playerName + " would you like to go first or second");
                firstOrSecond = scn.nextLine();
                firstOrSecond = firstOrSecond.toUpperCase();
                
                if(firstOrSecond.equals("FIRST") || firstOrSecond.equals("SECOND"))
                {
                
                    validFirstMove = true;
                    
                }
                else if(!(firstOrSecond.equals("FIRST") || firstOrSecond.equals("SECOND")))
                {
                
                    System.out.println("\nYour answer was incorrect. Please choose again.\n");
                    
                }
            
            }
            
            if(opponent.equals("DUMB COMPUTER") && firstOrSecond.equals("FIRST"))
            {
            
                //HumanPlayer newPlayer = new HumanPlayer(playerName);DELETE**********
                //DumbComputer newDumbPlayer = new DumbComputer();DELETE**********
                
                Player [] twoPlayers = {new HumanPlayer(playerName), new DumbComputer()};
                Nim newGame = new Nim(twoPlayers);
                newGame.play();
                
            }
            else if(opponent.equals("DUMB COMPUTER") && firstOrSecond.equals("SECOND"))
            {
                
                //HumanPlayer newPlayer = new HumanPlayer(playerName);DELETE**********
                //DumbComputer newDumbPlayer = new DumbComputer();DELETE**********
                Player [] twoPlayers = {new DumbComputer(), new HumanPlayer(playerName)};
                Nim newGame = new Nim(twoPlayers);
                newGame.play();
            }
            else if(opponent.equals("SMART COMPUTER") && firstOrSecond.equals("FIRST"))
            {
                
                Player [] twoPlayers = {new HumanPlayer(playerName), new SmartComputer()};
                Nim newGame = new Nim(twoPlayers);
                newGame.play();
            }
            else if(opponent.equals("SMART COMPUTER") && firstOrSecond.equals("SECOND"))
            {
                
                Player [] twoPlayers = {new SmartComputer(), new HumanPlayer(playerName)};
                Nim newGame = new Nim(twoPlayers);
                newGame.play();
                
            }
            
            System.out.println(playerName + " would you like to play again, Yes or No?");
            String playAgain = scn.next();
            playAgain = playAgain.toUpperCase();
            
            if(playAgain.equals("NO"))
            {
                
                userDoesNotWantToPlay = true;
                
            }
        
            validOpponent = false;
            validFirstMove = false;
            
        }//end of while loop
        
    }//end of main method
    
}
