import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{  
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        super(840, 480, 1, false);
        Player player = new Player();
        addObject(player, 50, 200);
        Ground ground = new Ground();
        addObject(ground, 100, 300);
    }
    
   
}
