import greenfoot.*;

/**
 * The World our hero lives in.
 * 
 * @author Kelly
 * @version November 2025
 */

public class MyWorld extends World {
    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld() {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 300);
        
        Label scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 50, 50);
        
        createApple();
        
        
    }
    
    /**
     * Create a new apple at random location at top of screen
     */
    public void createApple() {
        Apple apple = new Apple();
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(apple, x, y);
    }
    
}
