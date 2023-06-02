import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

public class RecordData extends Actor
{
    private String playerName;
    private int score;

    public RecordData(String playerName, int score)
    {
        this.playerName = playerName;
        this.score = score;
        
        GreenfootImage image = new GreenfootImage(playerName + ": " + score, 48, Color.WHITE, null);
        setImage(image);
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getScore() {
        return score;
    }
}
