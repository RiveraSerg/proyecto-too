import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Record here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Record extends Button
{
    public Record(){
        GreenfootImage recordButton = new GreenfootImage(200, 60);
        Font adjustFont = new Font(true,false,50);
        
        recordButton.setFont(adjustFont);
        recordButton.setColor(Color.BLACK);
        
        recordButton.drawString("Records",0,50);
        setImage(recordButton);
    }
    
    public void act()
    {
        checkMouseOverButton();
        checkClick(new RecordScreen());
    }
}
