import greenfoot.*;

public class LifeCounter extends Actor {
    private int life;

    public LifeCounter(int initialLives) {
        life = initialLives;
        updateImage();
    }

    public void act() {
     
    }

    public int getLife() {
        return life;
    }

    public void setLife(int value) {
        life = value;
        updateImage();
    }

    public void decreaseLife() {
        life--;
        updateImage();
    }

    private void updateImage() {
        GreenfootImage image = new GreenfootImage("life: " + life, 24, Color.WHITE, new Color(0, 0, 0, 0));
        setImage(image);
    }
}


