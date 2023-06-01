/**
 * Write a description of class RecordDataContainer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RecordDataContainer  
{
    // instance variables - replace the example below with your own
    private String playerName;
    private int score;

    public RecordDataContainer(String playerName, int score)
    {
        this.playerName = playerName;
        this.score = score;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getScore() {
        return score;
    }
}
