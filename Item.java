import greenfoot.*;  

public abstract class Item extends Actor
{
    private int points;
    private String soundName;
    
    private GreenfootSound itemSound;
    
    public Item(int points, String soundName) {
       this.points = points; 
       this.soundName = soundName;
       
       itemSound = new GreenfootSound(soundName);
    }
    
    public void act() {
        
    }
    
    public int getPoints() {
        return points;
    }
    
    public GreenfootSound getSound() {
        return itemSound;
    }
}
