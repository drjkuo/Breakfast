
/**
 * Write a description of class Dennys here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dennys extends foodFactory
{
    // instance variables - replace the example below with your own
    //private int x;

    /**
     * Constructor for objects of class Dennys
  
    public Dennys()
    {
        // initialise instance variables
        //x = 0;
    }
    */

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    //@Override
    public Food makeFood()
    {
        // put your code here
        return new Steak();
    }
}
