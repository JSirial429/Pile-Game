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

public class HumanPlayer implements Player
{
    
    //number of marbles player chooses to take from the pile
    private int numMarbles;
    
    //name of the human player
    private String playerName;
    
    //pile size so that computer can make decision
    private int pileSize;

    
    /**
     * Creates a human player object with the name of the player
     * @param name a string that contains the name of the player
     */
    public HumanPlayer(String name)
    {        
        
        playerName = name;
        
    }
    
    /**
     * returns the number of marbles taken by the player
     * @return an integer  
     */
    public int returnMarbles()
    {
        return numMarbles;
        
    }
    
    /**
     * Ask the player to remove a certain amount of numbers
     * @return the number of marbles chosen by the player to remove
     */
    public int move()
    {
        Scanner scan = new Scanner(System.in);
        
        if(pileSize == 1)
        {
            
            numMarbles = 1;
            
        }
        else if(pileSize != 1)
        {
        
            System.out.println(" The current pile size is " + pileSize);
        
            System.out.println("How many marbles would you like to take away from the pile, " + playerName);
        
            numMarbles = scan.nextInt();
        }
        
        return numMarbles;
    
    }
    
    /**
     * Method that retrieves player's name
     * @return a string with the player's name
     */
    public String getName()
    {
        
        
        return playerName;
        
    }
    
    /**
     * Updates the pile size with each method call so that player can make decision as to how many 
     * marbles to remove from the game pile
     * @param marbles the number which updates the pile size
     */
    public void updatePile(int marbles)
    {
        
        pileSize = marbles;
        
    }
    
}
