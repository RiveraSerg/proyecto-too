import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button extends Actor
{
    private boolean mouseOverButton = false;
    
    public void act()
    {
        // Add your action code here.
    }
    
    public void checkMouseOverButton(){
        int transitionValue = 255;
        if(Greenfoot.mouseMoved(null)){
            mouseOverButton = Greenfoot.mouseMoved(this);
        }
        
        if(mouseOverButton){
            transitionAdjustment(transitionValue/2);
        }else{
            transitionAdjustment(transitionValue);
        }
    }
    
    public void transitionAdjustment(int adjustment){
        GreenfootImage temporalImage = getImage();
        temporalImage.setTransparency(adjustment);
        setImage(temporalImage);
    }
    
    public void checkClick(World world){
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(world);
        }
    }
}
