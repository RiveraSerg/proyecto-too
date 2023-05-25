import greenfoot.*; 

public class ScoreBoard extends Actor {
    private int score;

    public ScoreBoard() {
        score = 0;
        setImage(new GreenfootImage("Score: " + score, 24, Color.WHITE, new Color(0, 0, 0, 0)));
    }

    public void act() {
        score++;
        setImage(new GreenfootImage("Score: " + score, 24, Color.WHITE, new Color(0, 0, 0, 0)));
    }

    public void addToScore(int points) {
        score += points;
    }

    public int getScore() {
        return score;
    }
}

