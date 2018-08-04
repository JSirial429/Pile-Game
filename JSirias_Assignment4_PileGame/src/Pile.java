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

public class Pile 
{
    //The size of the game pile.
    private int pileSize;
    
    /**
     * Creates a game pile at random with pile size being 10<= x <=100.
     */
    public Pile()
    {
        
        Random sizePile = new Random();
        
        pileSize = sizePile.nextInt(91) + 10;
        
    }
    
    /**
     * The pile decreases at every turn by the players.
     * @param marbles the amount to be subtracted from the pile size
     */
    public void removeMarbles(int marbles)
    {
        
        pileSize = pileSize - marbles;
        
    }
    
    /**
     * 
     * @return the size of the pile during the game
     */
    public int returnPile()
    {
        
        return pileSize;
        
    }
    
}
