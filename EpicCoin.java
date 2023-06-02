import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class EpicCoin extends Item
{
    private GreenfootImage[] animationFrames;
    private int animationFrame;
    private int frameCooldown;
    private int frameCooldownMax;
    
    public EpicCoin(){
        super(350, "coinSound.wav");
        animationFrames = new GreenfootImage[6];
        for(int i=0; i<6; i++){
            animationFrames[i] = new GreenfootImage("coin_frame_" + i + ".png");
        }
        animationFrame=0;
        frameCooldown=0;
        frameCooldownMax=10;
    }
    
    public void act()
    {
        animate();
    }
    
    private void animate(){
       if(frameCooldown==0){
           setImage(animationFrames[animationFrame]);
           animationFrame = (animationFrame+1) % 6;
           frameCooldown = frameCooldownMax;
       }else{
           frameCooldown--;
       }
    }
}
