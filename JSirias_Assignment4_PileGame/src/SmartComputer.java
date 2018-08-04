
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

public class SmartComputer implements Player
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
    public SmartComputer()
    {
        
        playerName = "Smart Computer";
        
    }
    
    /**
     * 
     * @return the number of marbles taken by the player
     */
    public int returnMarbles()
    {
        
        return numMarbles;
        
    }
    
    /**
     * Smart computer always moves strategically by always removing enough marbles
     * to make the remaining pile a power of two minus one. 
     * @return 
     */
    public int move()
    {
        
        //The halfPile size updates itself everytime this method is called
        int halfPile = pileSize/2;
        //Variable to keep the while loop running
        boolean acceptableNumOfMarbles = false;
        //Variables that holds a randomly generated number
        int power = 0;
        //Variables that holds the answer to 2 raised to some power
        int exponent = 0;
        //Variable that holds the winning number of marbles to remove from the pile 
        int answer = 0;
        //Added this!!!Might delete if it doesn't work
        if( halfPile == 2 || halfPile == 1)
        {
            
            answer = 1;
            numMarbles = 1;
            
            
        }
        else if(pileSize > 3)
        {
        
            while(!acceptableNumOfMarbles)
            {
          
                Random rdm = new Random();
                //Chooses a number from the range of 1...halfPile -1
                power = rdm.nextInt(halfPile - 2) + 1;
                //System.out.println(power);//testing purposes
                exponent = (int) (Math.pow(2, power) - 1);
                //System.out.println(2 +"^" + power + " - 1 = " + exponent);//testing purposes
        
                if(exponent < halfPile)
                {
                
                    answer = halfPile - exponent;
                    numMarbles = answer;
                    //System.out.println(halfPile + "-" + exponent + "= " + answer);//testing purposes
                    acceptableNumOfMarbles = true;
                
                }   
          
            }
        
        //return answer;//Might change to numMarbles
        }
        //System.out.println(playerName + " has removed " + numMarbles + " marble.");//Testing purposes
        return numMarbles;
        
    }
    
    /**
     * 
     * @return a string that contains the player's name.
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
