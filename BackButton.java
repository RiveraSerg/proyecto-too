import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class BackButton extends Button
{
    public BackButton(){
        super(200, 60, "Back");
    }
    
    public void handleClick()
    {
        
            Greenfoot.setWorld(new TitleScreen());
    
    }
}
