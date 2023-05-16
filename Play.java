import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Play extends Button
{
    public Play(){
        super(100, 60, "Play");
    }
    
    public void handleClick()
    {
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new MyWorld());
        }
    }
}
