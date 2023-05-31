import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Record extends Button
{
    public Record(){
        super(200, 60, "Records");
    }
    
    public void handleClick()
    {
        
            Greenfoot.setWorld(new RecordScreen());
        
    }
}
