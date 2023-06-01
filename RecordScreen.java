import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RecordScreen extends World
{
    private List<Player> players;
    private List<RecordDataContainer> records;
    
    private GreenfootSound titleTheme = new GreenfootSound("titleTheme.wav");

    public RecordScreen()
    {    
        super(840, 480, 1, false);
        GreenfootImage background = new GreenfootImage("BackgroundForRecords.png"); // Ruta de la imagen de fondo
        background.scale(getWidth(), getHeight());
        setBackground(background);

        BackButton Button = new BackButton(titleTheme,"Back");
        addObject(Button, 805, 440);

        records = readRecordsFromFile();
        //showPlayerScore();
        players = new ArrayList<>();
    }
    /*
    private void showPlayerScore() {
        UserInfo playerInfo = UserInfo.getMyInfo();
        showText("       Player                           Score", getWidth() - 400, getHeight() - (int) (getHeight() * 0.6));
    
        if (playerInfo != null) {
            int y = getHeight() - (int) (getHeight() * 0.6);
            List<UserInfo> topScores = playerInfo.getTop(10);
            
            int maxRecords=0;
            try {
                maxRecords = Math.min(records.size(), 5);
                for (int j = 0; j < maxRecords; j++) {
                    RecordDataContainer record = records.get(j);
                    String text = record.getPlayerName() + "\t\t" + record.getScore();
                    showText(text, getWidth() - 400, y + (j + 1) * 20);
                }
            } catch (IndexOutOfBoundsException e) {
                String playerName = "_ _ _ _ _ _";
                int score = 0;
                String text = playerName + "                      " + score;
                showText(text, getWidth() - 400, getHeight() - (int) (getHeight() * 0.6) + (maxRecords + 1) * 20);
            }
    
            for (int i = 0; i < 5; i++) {
                String playerName = "_ _ _ _ _ _";
                int score = 0;
    
                String text = playerName + "                      " + score;
                showText(text, getWidth() - 400, getHeight() - (int) (getHeight() * 0.6) + (i + 1) * 20);
            }
        } else {
            showText("No Access", getWidth() / 2, getHeight() / 2);
        }
    }
    */

    private List<RecordDataContainer> readRecordsFromFile() {
        List<RecordDataContainer> records = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("records.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    String playerName = parts[0];
                    int score = Integer.parseInt(parts[1]);
                    RecordDataContainer record = new RecordDataContainer(playerName, score);
                    records.add(record);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return records;
    }
    
    public void saveRecord(RecordDataContainer record) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("records.txt", true))) {
            String line = record.getPlayerName() + "," + record.getScore();
            writer.write(line);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
