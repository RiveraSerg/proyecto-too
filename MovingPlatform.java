import greenfoot.*; 

public class MovingPlatform extends Ground
{
    private int speed;
    private int initialY; 
    private int range; 
    
    public MovingPlatform(int speed, int range) {
        this.speed = speed;
        this.range = range;
    }
    
    public void addedToWorld(World world) {
        initialY = getY(); 
    }
    
    public void act() {
        setLocation(getX(), getY() - speed); // Movimiento hacia arriba
        
        if (getY() <= initialY - range) {
            setLocation(getX(), initialY + range); // Reposicionamiento abajo
        }
    }
}


