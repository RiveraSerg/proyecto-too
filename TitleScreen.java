import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScreen extends World
{
    private GreenfootSound titleTheme = new GreenfootSound("titleTheme.mp3");
    
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        super(840, 480, 1, false);
        Play playButton = new Play();
        addObject(playButton, 420, 210);
        Control controlButton = new Control();
        addObject(controlButton, 220, 410);
        Record recordButton = new Record();
        addObject(recordButton, 620, 410);
        prepare();
    }
    
    private void prepare(){
        titleTheme.setVolume(40);
        
        GreenfootImage background = new GreenfootImage("backgroundImageBRW.jpg"); // Ruta de la imagen de fondo
        background.scale(getWidth(), getHeight());
        setBackground(background);
        
        GreenfootImage logo = new GreenfootImage("logo_placeholder.png");
        Picture logoPicture = new Picture(logo);
        GreenfootImage image = logoPicture.getImage();
        
        int newWidth = 200;
        int newHeight = 100; 
        
        image.scale(newWidth, newHeight);
        addObject(logoPicture, getWidth()/2, 100);
    }
    
    public void started(){
        titleTheme.play();
    }
    
    public void stopped(){
        titleTheme.stop();
    }
}
