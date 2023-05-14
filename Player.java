import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 */
public class Player extends Actor
{
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private static final int OFFSET = 5;
    
    private static final int DIRECTION_NONE = 0;
    private static final int DIRECTION_RIGHT = 1;
    private static final int DIRECTION_LEFT = 2;
    
    private int direction = DIRECTION_NONE;
    
    private int verticalSpeed = 0;
    private int acceleration = 1;
    private int jumpStrength = -15;
    
    

    public Player(){
        setImage("placeholder.png");
    }
    
    public void act(){
        handleKeys();
        move();
        checkFall();
    }
    
    public void handleKeys() {
        if(Greenfoot.isKeyDown("a")){
            direction = DIRECTION_LEFT;
        }else if(Greenfoot.isKeyDown("d")){
            direction = DIRECTION_RIGHT;
        }else{
            direction = DIRECTION_NONE;
        }
        
        if(Greenfoot.isKeyDown("space") && (onGround())){
            verticalSpeed = jumpStrength;
            fall();
        }
    }
    
    public void move() {
        switch(direction){
            case DIRECTION_RIGHT:
                setLocation(getX() + OFFSET, getY());
                break;
            case DIRECTION_LEFT:
                setLocation(getX() - OFFSET, getY());
                break;
        }
    }
    
    private void fall() {
        setLocation(getX(), getY() + verticalSpeed);
        verticalSpeed = verticalSpeed + acceleration; 
    }
    
    public boolean onGround(){
       Actor under = getOneObjectAtOffset(0, getImage().getHeight()/2, Ground.class);
       return under != null;
    }
    
    public void checkFall(){
        if(onGround() == false){
            fall();
        }
    }
}