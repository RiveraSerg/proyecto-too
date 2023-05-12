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
    
    private int jumpStrength = 15;
    private int fallSpeed = 0;
    
    
    
    public Player(){
        
        setImage("placeholder.png");
    }
    
    public void act(){
        handleKeys();
        move(); 
        applyGravity();
        checkCollisions();
        
    }
    
    public void handleKeys() {
        if(Greenfoot.isKeyDown("a")){
            direction = DIRECTION_LEFT;
        }else if(Greenfoot.isKeyDown("d")){
            direction = DIRECTION_RIGHT;
        }else{
            direction = DIRECTION_NONE;
        }
        
        if(Greenfoot.isKeyDown("space") && onGround()){
            jump();
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
    
    public void applyGravity() {
        if(!onGround()) {
            fallSpeed++;
            setLocation(getX(), getY() + fallSpeed);
        } else {
            fallSpeed = 0;
        }
    
    }
    
    public void jump() {
        fallSpeed = -jumpStrength;
    }
    
    public boolean onGround() {
        int x = getX();
        int y = getY();
        int height = getImage().getHeight();
        
        // Agregamos un valor fijo a la posición y del jugador para buscar en una posición por debajo de él
        int yBelow = y + 32;
        
        // Buscamos un objeto Ground en la posición (x, yBelow)
        Actor ground = getOneObjectAtOffset(0, height/2, Ground.class);
        
        return (ground != null);
    }
    
    public void checkCollisions() {
        if(isTouching(PlatformEnd.class)) {
            fall();
        }
    }
    
    public void fall() {
        Greenfoot.stop();
    }
}
