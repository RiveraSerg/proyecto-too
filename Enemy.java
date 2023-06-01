import greenfoot.*;

public abstract class Enemy extends Actor {
    private int direction = -2;
    
    public void act() {
        move(direction);
        checkCollision();
        checkWorldBounds(); 
    }
    
    public void checkCollision() {
        if (isTouching(Ground.class) || !isOnPlatform()) {
            direction *= -1;
        }
    }
    
    public boolean isOnPlatform() {
        int y = getY();
        Actor platform = getOneObjectAtOffset(0, getImage().getHeight() / 2, Ground.class);
        return platform != null && y <= platform.getY();
    }
    
    public void checkWorldBounds() {
        int x = getX();
        int y = getY();
        int width = getImage().getWidth();
        int height = getImage().getHeight();
        World world = getWorld();
        
        if (x - width / 2 <= 0) {
            direction = Math.abs(direction); 
        }
        
        if (x + width / 2 >= world.getWidth()) {
            direction = -Math.abs(direction); 
        }
        
        
        if (y - height / 2 <= 0) {
            
        }
        
        if (y + height / 2 >= world.getHeight()) {
           
        }
    }
}


