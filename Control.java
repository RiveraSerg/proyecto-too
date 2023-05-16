import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Control extends Button
{
    public Control(){
        super(250, 60, "Controls");
    }
    
    public void handleClick()
    {
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new ControlScreen());
        }
    }
}
