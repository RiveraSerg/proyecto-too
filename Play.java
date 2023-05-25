import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Play extends Button
{
    
    private GreenfootSound titleTheme;
    
    public Play(GreenfootSound music){
        super(100, 60, "Play");
        titleTheme = music;
    }
    
    public void handleClick()
    {
        if(Greenfoot.mouseClicked(this)){
            titleTheme.stop();
            Greenfoot.setWorld(new MyWorld());
        }
    }
}
