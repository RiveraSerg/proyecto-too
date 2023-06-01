import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class BackButton extends Button
{

    private GreenfootSound titleTheme;

    public BackButton(GreenfootSound music, String name){
        super(200, 60, name);
        titleTheme = music;
    }

    public void handleClick()
    {
        titleTheme.stop();
        TitleScreen titleScreen = new TitleScreen();
        Greenfoot.setWorld(titleScreen);
        titleScreen.started();
    }
}
