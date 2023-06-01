import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOverScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOverScreen extends World
{
    private GreenfootSound titleTheme = new GreenfootSound("titleTheme.wav");
   
    public GameOverScreen()
    {    
        super(840, 480, 1, false);
        
        GreenfootImage background = new GreenfootImage("gameOver.jpg"); // Ruta de la imagen de fondo
        background.scale(getWidth(), getHeight());
        setBackground(background);
        
        
        
        Play playButton = new Play(titleTheme, "Try Again", 300, 60);
        addObject(playButton, 720, 432);
        
        BackButton back = new BackButton(titleTheme,"Menu");
        addObject(back, 140, 432);
        
        started();
        titleTheme.setVolume(40);
    }
    
    public void started(){
        titleTheme.playLoop();
    }

    public void stopped(){
        titleTheme.stop();
    }
}
