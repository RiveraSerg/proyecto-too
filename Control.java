import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Control extends Button
{
    
    private GreenfootSound titleTheme;
    
    public Control(GreenfootSound music){
        super(250, 60, "Controls");
        titleTheme = music;
    }
    
    public void handleClick()
    {
            titleTheme.stop();
            Greenfoot.setWorld(new ControlScreen());
        
    }
}
