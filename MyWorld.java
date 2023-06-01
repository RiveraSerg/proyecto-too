import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

public class MyWorld extends World
{  
    private boolean nextPart = false;
    private ScoreBoard score;
    private LifeCounter lives;
    private int sectionCount;

    public MyWorld()
    {    
        super(840, 480, 1, false);
        ScoreBoard score = new ScoreBoard();
        LifeCounter lives = new LifeCounter(3);
        sectionCount = 1;
        addObject(score, 780, 50);
        addObject(lives, 50, 50);

        GreenfootImage background = new GreenfootImage("gameStartBackground_1.jpg"); // Ruta de la imagen de fondo
        background.scale(getWidth(), getHeight());
        setBackground(background);

        Player player = new Player(2);
        addObject(player, 70, 390);
        addGround(128, 464);
        addGround(384, 464);
        addGround(640, 464);
        addGround(896, 464);
        addCoin(300,432);
        addCoin(332,432);
        addCoin(364,432);
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
        
        List<Item> items = getObjects(Item.class);
        for (Item item : items) {
            removeObject(item);
        }

        Player player = getPlayer();
        switch (sectionCount) {
            case 1:
                Section1 section1 = new Section1(this);
                section1.generateSection();
                break;
            case 2:
                Section2 section2 = new Section2(this);
                section2.generateSection();
                break;
            default:
                Section3 section3 = new Section3(this);
                section3.generateSection();
                break;
        }
        sectionCount++;
        nextPart = false;
    }

    public void addGround(int x, int y) {
        Ground ground = new Ground();
        addObject(ground, x, y);
    }
    
    public void addCoin(int x, int y) {
        Coin coin = new Coin();
        addObject(coin, x, y);
    }
    
    public void addPlatformMove(int x, int y, int speed, int moveArea) {
        MovingPlatform platform =new MovingPlatform(speed, moveArea); //speed recomendado 2-3, moveArea recomendado 474
        addObject(platform, x, y);
    }
    
    public void addEpicCoin(int x, int y){
        EpicCoin epicCoin = new EpicCoin();
        addObject(epicCoin, x, y);
    }
}
