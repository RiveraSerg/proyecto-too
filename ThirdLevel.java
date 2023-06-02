import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

public class ThirdLevel extends AllWorlds
{
    private boolean nextPart = false;
    private ScoreBoard score;
    private LifeCounter lives;
    private int sectionCount;

    public ThirdLevel()
    {    
        ScoreBoard score = new ScoreBoard();
        LifeCounter lives = new LifeCounter(3);
        sectionCount = 1;
        addObject(score, 760, 50);
        addObject(lives, 50, 50);
        
        score.setScore(GlobalVariables.getInstance().getScore());
        lives.setLife(GlobalVariables.getInstance().getLives());

        GreenfootImage background = new GreenfootImage("gameStartBackground_1.jpg"); // Ruta de la imagen de fondo
        background.scale(getWidth(), getHeight());
        setBackground(background);

        Player player = new Player(3, GlobalVariables.getInstance().getScore());
        addObject(player, 70, 390);
        addGround(128, 464);
        addGround(384, 464);
        addGround(640, 464);
        addGround(896, 464);
        
        addWall(800,264);
        addWall(800,464);
        
        addBrick(164, 364);
        
        addBrick(364, 264);
        
        addBrick(564, 164);
        
        addHorizontalEnemy(890, 432, 4);
        addHorizontalEnemy(1090, 326, 4);
        addHorizontalEnemy(1290, 226, 4);
        addHorizontalEnemy(1490, 126, 4);
        
        addCoin(536,432);
        addCoin(568,432);
        addCoin(600,432);
        addCoin(632,432);
        addCoin(664,432);
        addCoin(698,432);
    }
    
    public void generateNewSection(){
        List<Ground> grounds = getObjects(Ground.class);
        for (Ground ground : grounds) {
            removeObject(ground);
        }

        List<Enemy> enemys = getObjects(Enemy.class);
        for (Enemy enemy : enemys) {
            removeObject(enemy);
        }
        
        List<Item> items = getObjects(Item.class);
        for (Item item : items) {
            removeObject(item);
        }
    
        Player player = getPlayer();
        switch (sectionCount) {
            case 1:
                ThirdLevelFirstSection sectionFirst = new ThirdLevelFirstSection(this);
                sectionFirst.generateSection();
                break;
            case 2:
                ThirdLevelSecondSection section2 = new ThirdLevelSecondSection(this);
                section2.generateSection();
                break;
            case 3:
                ThirdLevelThirdSection section3 = new ThirdLevelThirdSection(this);
                section3.generateSection();
                break;
        }
        sectionCount++;
        nextPart = false;
    }
}
