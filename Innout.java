
/**
 * Write a description of class Innout here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Innout extends foodFactory
{
    // instance variables - replace the example below with your own
    //private int x;

    /**
     * Constructor for objects of class Innout
     */
    public Innout()
    {
        // initialise instance variables
        //x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    @Override
    public Food makefood()
    {
        // put your code here
        return new Hamburger();
    }
}
