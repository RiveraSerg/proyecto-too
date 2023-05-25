import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ControlScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ControlScreen extends World
{

    /**
     * Constructor for objects of class ControlScreen.
     * 
     */
    public ControlScreen()
    {    
        super(840, 480, 1, false); 
        GreenfootImage background = new GreenfootImage("Control.png"); // Ruta de la imagen de fondo
        background.scale(getWidth(), getHeight());
        setBackground(background);
        
        BackButton Button = new BackButton();
        addObject(Button, 805, 440);
    }
}
