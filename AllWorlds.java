import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;


public class AllWorlds extends World
{
    private boolean nextPart = false;

    public AllWorlds()
    {    
        super(840, 480, 1, false);
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

    public Player getPlayer() {
        List<Player> players = getObjects(Player.class);
        if (!players.isEmpty()) {
            return players.get(0);
        }
        return null;
    }

    public void generateNewSection(){
    
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
    
    public void addBrick(int x, int y) {
        Brick brick = new Brick();
        addObject(brick, x, y);
    }
    
    public void addWall(int x, int y) {
        Wall wall = new Wall();
        addObject(wall, x, y);
    }
    
    public void addWallVariant(int x, int y) {
        WallVariant wall = new WallVariant();
        addObject(wall, x, y);
    }
    
    public void addStar(int x, int y) {
        EndLevel star = new EndLevel();
        addObject(star, x, y);
    }
}
