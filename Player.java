import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 */
public class Player extends Actor
{
    
    private static final int OFFSET = 5;
    
    private static final int DIRECTION_NONE = 0;
    private static final int DIRECTION_RIGHT = 1;
    private static final int DIRECTION_LEFT = 2;
    
    private int direction = DIRECTION_NONE;
    
    private int verticalSpeed = 0;
    private int acceleration = 1;
    private int jumpStrength = -15;
    
    private int leftlimit = 5;
    

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
            if(getX() > leftlimit){
                direction = DIRECTION_LEFT;
            }
            else{
                direction = DIRECTION_NONE;
            }
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
    /*
    public void checkRightLimit(){
        int worldWidth = getWorld().getWidth();
        if (getX() >= worldWidth) {
            setLocation(50, 390);
        }
        //else if (getX() < 0) {
         //   setLocation(worldWidth - 1, getY());
        //}
    }
     */
    
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