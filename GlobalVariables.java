public class GlobalVariables {
    private static GlobalVariables instance;
    private static int score;
    private static int lives = 3;

    private GlobalVariables() {
        
    }

    public static GlobalVariables getInstance() {
        if (instance == null) {
            instance = new GlobalVariables();
        }
        return instance;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int newScore) {
        score = newScore;
    }
    
    public int getLives() {
        return lives;
    }

    public void setLives(int newLives) {
        lives = newLives;
    }
}


