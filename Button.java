import greenfoot.*; 

public abstract class Button extends Actor
{
    private boolean mouseOverButton = false;
    private final int BUTTON_WIDTH;
    private final int BUTTON_HEIGHT;
    private final Font FONT = new Font(true,false,50);
    
    public Button(int width, int height, String text){
        BUTTON_WIDTH = width;
        BUTTON_HEIGHT = height;
        GreenfootImage buttonImage = new GreenfootImage(BUTTON_WIDTH, BUTTON_HEIGHT);
        buttonImage.setFont(FONT);
        buttonImage.setColor(Color.BLACK);
        buttonImage.drawString(text,0,BUTTON_HEIGHT - 10);
        setImage(buttonImage);
    }
    
    public void act()
    {
        checkMouseOverButton();
        handleClick();
    }
    
    private void checkMouseOverButton(){
        int transitionValue = 255;
        if(Greenfoot.mouseMoved(null)){
            mouseOverButton = Greenfoot.mouseMoved(this);
        }
        
        if(mouseOverButton){
            transitionAdjustment(transitionValue/2);
        }else{
            transitionAdjustment(transitionValue);
        }
    }
    
    private void transitionAdjustment(int adjustment){
        GreenfootImage temporalImage = getImage();
        temporalImage.setTransparency(adjustment);
        setImage(temporalImage);
    }
    
    public abstract void handleClick();
}
/*   
    public void checkClick(World world){
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(world);
        }
    }
}
 */
