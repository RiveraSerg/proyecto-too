import greenfoot.*;

public class LivesCounter extends Actor {
    private int lives;

    public LivesCounter(int initialLives) {
        lives = initialLives;
        updateImage();
    }

    public void act() {
     
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int value) {
        lives = value;
        updateImage();
    }

    public void decreaseLives() {
        lives--;
        updateImage();
    }

    private void updateImage() {
        GreenfootImage image = new GreenfootImage(": " + lives, 24, Color.WHITE, new Color(0, 0, 0, 0));
        setImage(image);
    }
}


