
/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Man
{
    // instance variables - replace the example below with your own
    // a man born with a food
    private Food food;

    /**
     * Constructor for objects of class Main
     */
    public Man()
    {
        // initialise instance variables
        //food = new Hamburger();
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void eat()
    {
        // put your code here
        if (this.food != null) 
        {
            System.out.println("I got something to eat." + "  It's " + food.beingEaten()+ ".");
            this.food = null;
        }
        else 
        {
            System.out.println("Nothing to eat!");
        }
    }
    
    public void getFood(Food f)
    {
       
       //if (f.isInstance(Hamburger)) {
       //if (Hamburger.isInstance(f)) { 
       if (f instanceof Hamburger) { 
           food = new Hamburger();
           //System.out.println(
       }
     
       
       if (f instanceof Fish) {
           food = new Fish();
       }
        
        /*
        if (((int)(Math.random()*2) % 2) == 0) {
            food = new Hamburger();
        }
        else {
            food = new Fish();
        }
        */
       
    }
    
}