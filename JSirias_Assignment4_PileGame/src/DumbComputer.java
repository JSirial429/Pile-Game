import java.util.Random;

//Name: Jorge Sirias
//Class: COP 3337 Programing II
//Professor: Greg Shaw
//Section: U07
//Date: 10/23/17
//
//I affirm that this program is entirely my own work and none of it is the work of any other person.
//  _Jorge Siras__________________
//	(your signature)

public class DumbComputer implements Player
{
    //number of marbles player chooses to take from the pile
    private int numMarbles;
    //Player's name
    private String playerName;
    //pile size so that computer can make decision
    private int pileSize;
    
    
    /**
     * Creates a dumb computer object composed of the name of the player.
     */
    public DumbComputer()
    {
    
        playerName = "Dumb Computer";
        
    }
    
    /**
     * 
     * @return returns the number of marbles to remove from pile
     */
    public int returnMarbles()
    {
        
        
        return numMarbles;
        
    }
    
    /**
     * Dumb computer always play it safe and chooses a number from the range
     * of 1 to half a pile size. 
     * @return then number of marbles to remove from the pile size
     */
    public int move()
    {
        
        if(pileSize==1)
        {
            numMarbles = 1;
        }
        else if(pileSize != 1)
        {
            Random rdm = new Random();
        
            int halfPile = pileSize/2; 
        
            // Generates a number from range 1 to half pile size
            numMarbles = rdm.nextInt(halfPile - 1 + 1) + 1;
        
        }
        
        return numMarbles;
        
    }
    
    /**
     * 
     * @return the string of the player's name
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
