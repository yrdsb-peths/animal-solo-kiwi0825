import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Elephant extends Actor
{
    public void act()
    {
        if(isTouching(Apple.class)) {
            removeTouching(null);
        }
    }
    
    public void eat() {
        MyWorld world = (MyWorld) getWorld();
        world.spawnApple();
    }
}
