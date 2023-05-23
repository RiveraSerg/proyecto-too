import greenfoot.*;

public class HUD extends Actor {
    private int score; 

    public HUD() {
        score = 0;
    }

    public void act() {
        score++;
        setImage(new GreenfootImage("Score: " + score, 24, Color.WHITE, Color.BLACK));
    }
    
    private int getScore(){
        return score;
    }
    
    private int setScore(){
        return score;
    }
 
}







