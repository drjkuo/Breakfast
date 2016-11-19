 import java.util.*;
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
    //private ArrayList<Food> foodArr;
    private List<Food> foodArr = new ArrayList<Food>();

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
        if (foodArr.size() != 0) 
        {
            System.out.println("I got something to eat." + "  It's " + foodArr.get(foodArr.size()-1).beingEaten()+ ".");
            foodArr.remove(foodArr.size()-1);
        }
        else 
        {
            System.out.println("Nothing to eat!");
        }
    }
    
    public void goRestaurant(foodFactory ff)
    {
        foodArr.add(ff.makeFood());
    }
    
    public void getFood(Food f)
    {
       foodArr.add(f);
       //if (f.isInstance(Hamburger)) {
       //if (Hamburger.isInstance(f)) { 
       /*
       if (f instanceof Hamburger) { 
           //food = new Hamburger();
           foodArr.add(new Hamburger());
           //System.out.println(
       }
     
       
       if (f instanceof Fish) {
           //food = new Fish();
           foodArr.add(new Fish());
       }
       
       
       if (f instanceof Steak) {
           //food = new Fish();
           foodArr.add(new Steak());
       }
       */
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
