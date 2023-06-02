import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;
import java.io.FileReader;
import java.io.*;
import java.util.Comparator;

public class Records extends World {
    
    private GreenfootSound titleTheme = new GreenfootSound("titleTheme.wav");

    public Records() {
        super(840, 480, 1, false);
        GreenfootImage background = new GreenfootImage("BackgroundForRecords.png"); // Ruta de la imagen de fondo
        background.scale(getWidth(), getHeight());
        setBackground(background);
        
        BackButton Button = new BackButton(titleTheme,"Back");
        addObject(Button, 805, 440);

        // Leer los registros del archivo
        List<RecordData> records = loadRecords();

        // Mostrar los mejores 5 registros
        showTopRecords(records);
    }

    private List<RecordData> loadRecords() {
        List<RecordData> records = new ArrayList<>();

        try {
            // Abrir el archivo para lectura
            FileReader fileReader = new FileReader("records.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                // Separar el nombre y puntaje
                String[] parts = line.split(",");
                String playerName = parts[0];
                int score = Integer.parseInt(parts[1]);

                // Crear el objeto RecordData y agregarlo a la lista
                RecordData record = new RecordData(playerName, score);
                records.add(record);
            }

            // Cerrar el archivo
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Ordenar los registros por puntaje de mayor a menor
        records.sort(new Comparator<RecordData>() {
                @Override
                public int compare(RecordData r1, RecordData r2) {
                    return Integer.compare(r2.getScore(), r1.getScore());
                }
            });

        return records;
    }

    private void showTopRecords(List<RecordData> records) {
        GreenfootImage background = new GreenfootImage("BackgroundForRecords.png");
        background.scale(getWidth(), getHeight());
        setBackground(background);

        int x = 546;
        int y = 160;

        // Mostrar los mejores 5 registros
        for (int i = 0; i < Math.min(records.size(), 5); i++) {
            RecordData record = records.get(i);

            // Crear una instancia de RecordActor y añadirla al mundo
            RecordData recordActor = new RecordData(record.getPlayerName(), record.getScore());
            addObject(recordActor, x, y);

            y += 55;
        }
    }
}
