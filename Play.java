import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Play extends Button
{
    
    private GreenfootSound titleTheme;
    
    public Play(GreenfootSound music, String name, int x, int y){
        super(x, y, name);
        titleTheme = music;
    }
    
    public void handleClick()
    {
            titleTheme.stop();
            Greenfoot.setWorld(new FirstLevel());
    }
}
