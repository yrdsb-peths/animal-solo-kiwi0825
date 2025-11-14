import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Elephant, our hero.
 * 
 * @author Kelly
 * @version November 2025
 */

public class Elephant extends Actor
{    
    public void act()
    {
        // moves the elephant left and right by one unit
        if (Greenfoot.isKeyDown("left")) {
            move(-1);
        } else if (Greenfoot.isKeyDown("right")) {
            move(1);
        }
        
        // remove apple if elephant eats it
        removeTouching(Apple.class);
    }
    
}
