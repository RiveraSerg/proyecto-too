
public class RecordDataContainer  
{
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
