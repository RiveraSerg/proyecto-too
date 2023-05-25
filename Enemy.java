import greenfoot.*;


public abstract class Enemy extends Actor
{
    private int direction = -2;
    
    public void act() {
        move(direction);
        checkCollision();
    }
    
    private void checkCollision() {
        if (isTouching(Ground.class) || !isOnPlatform()) {
            direction *= -1;
        }
    }
    
    private boolean isOnPlatform() {
        int y = getY();
        Actor platform = getOneObjectAtOffset(0, getImage().getHeight() / 2, Ground.class);
        return platform != null && y <= platform.getY();
    }
}


