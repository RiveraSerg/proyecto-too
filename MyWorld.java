import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

public class MyWorld extends World
{  
    private boolean nextPart = false;
    private ScoreBoard score;
    private LivesCounter lives;
    private int sectionCount;

    public MyWorld()
    {    
        super(840, 480, 1, false);
        ScoreBoard score = new ScoreBoard();
        LivesCounter lives = new LivesCounter(3);
        sectionCount = 1;
        addObject(score, 780, 50);
        addObject(lives, 50, 50);

        GreenfootImage background = new GreenfootImage("gameStartBackground_1.jpg"); // Ruta de la imagen de fondo
        background.scale(getWidth(), getHeight());
        setBackground(background);

        Player player = new Player();
        addObject(player, 70, 390);
        addGround(128, 455);
        addGround(384, 455);
        addGround(640, 455);
        addGround(896, 455);
    }
    


    public void act(){
        checkRightLimit();
    }

    private void checkRightLimit() {
        if (!nextPart) {
            Player player = getPlayer();

            if (player != null && player.getX() >= getWidth() - player.getImage().getWidth() / 2) {
                generateNewSection();
                player.setLocation(player.getImage().getWidth() / 2, player.getY());
            }
        }
    }

    private Player getPlayer() {
        List<Player> players = getObjects(Player.class);
        if (!players.isEmpty()) {
            return players.get(0);
        }
        return null;
    }

    private void generateNewSection(){
        List<Ground> grounds = getObjects(Ground.class);
        for (Ground ground : grounds) {
            removeObject(ground);
        }

        List<Enemy> enemys = getObjects(Enemy.class);
        for (Enemy enemy : enemys) {
            removeObject(enemy);
        }

        Player player = getPlayer();
        switch (sectionCount) {
            case 1:
                generateSection1(player);
                break;
            case 2:
                generateSection2(player);
                break;
            default:
                generateSection3(player);
                break;
        }
        sectionCount++;
        nextPart = false;
    }

    private void generateSection1(Player player) {
        addGround(128, 455);
        addGround(384, 455);
        addGround(640, 455);
        addGround(896, 455);
        Ground ground2 = new Ground();
        addObject(ground2, 568, 355);
        FirstEnemy enemy = new FirstEnemy();
        addObject(enemy, ground2.getX(), ground2.getY() - ground2.getImage().getHeight() / 2 - enemy.getImage().getHeight() / 2);

        int playerHeight = player.getImage().getHeight();
        int ground2Height = ground2.getImage().getHeight();
    }

    private void generateSection2(Player player) {
        addGround(128, 455);
        addGround(384, 455);
        addGround(640, 455);
        addGround(896, 455);
        Ground ground2 = new Ground();
        addObject(ground2, 568, 355);
        FirstEnemy enemy = new FirstEnemy();
        addObject(enemy, ground2.getX(), ground2.getY() - ground2.getImage().getHeight() / 2 - enemy.getImage().getHeight() / 2);

        Ground ground3 = new Ground();
        addObject(ground3, 168, 355);
        FirstEnemy enemy1 = new FirstEnemy();
        addObject(enemy1, ground3.getX(), ground3.getY() - ground3.getImage().getHeight() / 2 - enemy1.getImage().getHeight() / 2);

        int playerHeight = player.getImage().getHeight();
        int ground2Height = ground2.getImage().getHeight();
    }

    private void generateSection3(Player player) {
        addGround(128, 455);
        addGround(384, 455);
        addGround(640, 455);
        addGround(896, 455);
        Ground ground2 = new Ground();
        addObject(ground2, 568, 355);
        FirstEnemy enemy = new FirstEnemy();
        addObject(enemy, ground2.getX(), ground2.getY() - ground2.getImage().getHeight() / 2 - enemy.getImage().getHeight() / 2);

        int playerHeight = player.getImage().getHeight();
        int ground2Height = ground2.getImage().getHeight();
    }


    private void addGround(int x, int y) {
        Ground ground = new Ground();
        addObject(ground, x, y);
    }
}
