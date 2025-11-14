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
        move(1);
        
        if(isTouching(Apple.class)) {
            removeTouching(null);
        }
    }
    
    public void eat() {
        MyWorld world = (MyWorld) getWorld();
        world.spawnApple();
    }
}
