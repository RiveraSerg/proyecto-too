import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

public class SecondLevel extends AllWorlds
{
    private boolean nextPart = false;
    private ScoreBoard score;
    private LifeCounter lives;
    private int sectionCount;

    public SecondLevel()
    {    
        ScoreBoard score = new ScoreBoard();
        LifeCounter lives = new LifeCounter(3);
        sectionCount = 1;
        addObject(score, 780, 50);
        addObject(lives, 50, 50);
        
        int storedScore = GlobalVariables.getInstance().getScore();
        score.setScore(storedScore);
        int storedLife = GlobalVariables.getInstance().getLives();
        lives.setLife(storedLife);

        GreenfootImage background = new GreenfootImage("gameStartBackground_1.jpg"); // Ruta de la imagen de fondo
        background.scale(getWidth(), getHeight());
        setBackground(background);

        Player player = new Player(2);
        addObject(player, 70, 390);
        addGround(128, 464);
        addGround(384, 464);
        
        Ground ground1 = new Ground();
        addObject(ground1, 640, 464);
        
        FirstEnemy enemy = new FirstEnemy();
        addObject(enemy, ground1.getX(), ground1.getY() - ground1.getImage().getHeight() / 2 - enemy.getImage().getHeight() / 2);
        
        addGround(896, 464);
        
        addCoin(332,432);
        addCoin(364,432);
        addCoin(398,432);
        
        addCoin(632,432);
        addCoin(664,432);
        addCoin(698,432);
        
        addBrick(364,364);
        
        addBrick(564,286);
        addEpicCoin(564, 230);
        
        addWall(786, 364);
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
                FirstLevelFirstSection section1 = new FirstLevelFirstSection(this);
                section1.generateSection();
                break;
            case 2:
                FirstLevelSecondSection section2 = new FirstLevelSecondSection(this);
                section2.generateSection();
                break;
            case 3:
                FirstLevelThirdSection section3 = new FirstLevelThirdSection(this);
                section3.generateSection();
                break;
        }
        sectionCount++;
        nextPart = false;
    }
}
