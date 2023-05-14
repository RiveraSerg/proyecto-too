import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Controls here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Control extends Button
{
    public Control(){
        GreenfootImage controlButton = new GreenfootImage(250, 60);
        Font adjustFont = new Font(true,false,50);
        
        controlButton.setFont(adjustFont);
        controlButton.setColor(Color.BLACK);
        
        controlButton.drawString("Controls",0,50);
        setImage(controlButton);
    }
    
    public void act()
    {
        checkMouseOverButton();
        checkClick(new ControlScreen());
    }
}
