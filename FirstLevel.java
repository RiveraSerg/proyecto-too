import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FirstLevel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FirstLevel extends World
{

    private boolean nextPart = false;
    private int sectionCount;
    
    private ScoreBoard score;
    private LifeCounter lives;
    
    public FirstLevel()
    {    
        super(840, 480, 1, false);
        
        ScoreBoard score = new ScoreBoard();
        LifeCounter life = new LifeCounter(3);
        
        sectionCount = 1;
        
        addObject(score, 780, 40);
        addObject(lives, 50, 40);
        
        GreenfootImage background = new GreenfootImage("gameStartBackground_1.jpg");
        background.scale(getWidth(), getHeight());
        setBackground(background);
        
        Player player = new Player();
        addObject(player, 70, 390);
        addGround(128, 464);
        addGround(384, 464);
        addGround(640, 464);
        addGround(896, 464);
        addCoin(300,432);
        addCoin(332,432);
        addCoin(364,432);
    }
    
    private void addGround(int x, int y) {
        Ground ground = new Ground();
        addObject(ground, x, y);
    }
    
    private void addCoin(int x, int y) {
        Coin coin = new Coin();
        addObject(coin, x, y);
    }
    
    public void addPlatformMove(int x, int y, int speed, int moveArea) {
        MovingPlatform platform =new MovingPlatform(speed, moveArea); //speed recomendado 2-3, moveArea recomendado 474
        addObject(platform, x, y);
    }
}
