import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Record extends Button
{
    
    private GreenfootSound titleTheme;

    public Record(GreenfootSound music){
        super(200, 60, "Records");
        titleTheme = music;
    }
    
    public void handleClick()
    {
            titleTheme.stop();
            Greenfoot.setWorld(new RecordScreen());
        
    }
}
