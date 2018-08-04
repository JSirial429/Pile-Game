
//Name: Jorge Sirias
//Class: COP 3337 Programing II
//Professor: Greg Shaw
//Section: U07
//Date: 10/23/17
//
//I affirm that this program is entirely my own work and none of it is the work of any other person.
//  _Jorge Siras__________________
//	(your signature)

public class Nim 
{
    //An array used to point to an array of objects that implement the player interface.
    private Player [] list;
    
    /**
     * Creates nim object with a pointer to an array of object of player interface type
     * @param objects an array pointed to by an array called list
     */
    public Nim(Player [] objects)
    {
        
        list = objects;
        
    }
    
    /**
     * A method that simulates the turns taken by each player while the pile size of the marble is greater than 0.
     * For each object of interface type in the array the play method calls upon the move method polymorphically.
     */
    public void play()
    {
        // Creates a new game pile object which starts the game
        Pile gamePile = new Pile();
        System.out.println("There are " + gamePile.returnPile() + " marbles in the starting game pile.\n");
        
        //While the pile size of marbles does not equal zero the players keep taking turns.
        while(gamePile.returnPile() != 0)
        {
            
            //int halfPile = gamePile.returnPile()/2;
            //int list[0].move();
            //An enhanced for loop that lets players take turns back and forth until the pile size is zero.
            for(Player object : list)
            {
                 //Current pile changes for every iteration
                 int currentPile = gamePile.returnPile();
                 // size of the pile updates by half with each iteration
                 int halfPile = gamePile.returnPile()/2;
                 //Updates the pile size for each classes of interface type
                 object.updatePile(currentPile);
                 //The players whose turn it is makes a move and chooses an integer that is stored in this variable
                 int marblesRemoved = object.move();
                
                 //If the pile size is 1 then the player whose turn it is automatically loses
                if(currentPile == 1)
                {
                
                    System.out.println("There is only one marble left.\n"
                                       + "Therefore " + object.getName() + 
                                       " you get the last marble and you lose the game of Nim!\n");
                    
                    gamePile.removeMarbles(1);
                    break;
                    
                }
                //If the player chooses an incorrect number of marbles to take away then they keep choosing until their selesction is a legal move
                else if((marblesRemoved == currentPile) || (marblesRemoved == 0) || (marblesRemoved > halfPile))
                {
                    
                    while(!(marblesRemoved <= halfPile && marblesRemoved >= 1))
                    {
                        System.out.println(object.getName() + " has chosen too many marbles to remove from the pile "
                            + "or you have chosen to remove zero marbles.\n Please choose again.\n");
                
                        marblesRemoved = object.move();
                        gamePile.removeMarbles(marblesRemoved);
                
                    }
                        
                }
                //If the player chooses a valid selection then the remove marbles method of the pile class is called to update the pile size
                else if(marblesRemoved >= 1 && marblesRemoved <= halfPile)
                {
                    //Might add a nest if statement for if(marblesRemoved == 1) to simulate the end of game
                   gamePile.removeMarbles(marblesRemoved);
                   System.out.println(object.getName() +  " has removed " + object.returnMarbles() + " msrbles!\n");
                   
                }
            
                System.out.println("There are " + gamePile.returnPile() + " marbles left!\n");
                
                if(currentPile == 0)
                {
                
                    System.out.println("There are no marbles left.\n"
                                       + "Therefore " + object.getName() + 
                                       " you get the last marble and you lose the game of Nim!\n");
                    
                }
                
            }// end of enhanced for loop
        
        }//end of while loop
        
        
    }// end of play() method
    
}
