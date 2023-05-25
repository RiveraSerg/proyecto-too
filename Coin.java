import greenfoot.*;  

public class Coin extends Item
{
    
    public Coin() {
        super(100, "coinSound.wav");
        setImage("coin.png");
        GreenfootImage myImage = getImage();
        myImage.scale(16,16);
    }
    
    public void act()
    {
        
    }
}
