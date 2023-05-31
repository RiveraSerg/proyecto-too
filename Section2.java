import greenfoot.*; 

public class Section2 extends MyWorld
{
    private MyWorld world;

    public Section2(MyWorld world) {
        this.world = world;
    }
    
    public void generateSection() {
        world.addGround(128, 464);
        world.addGround(384, 464);
        world.addGround(640, 464);
        world.addGround(896, 464);
        Ground ground2 = new Ground();
        world.addObject(ground2, 568, 355);
        FirstEnemy enemy = new FirstEnemy();
        world.addObject(enemy, ground2.getX(), ground2.getY() - ground2.getImage().getHeight() / 2 - enemy.getImage().getHeight() / 2);

        Ground ground3 = new Ground();
        world.addObject(ground3, 168, 355);
        FirstEnemy enemy1 = new FirstEnemy();
        world.addObject(enemy1, ground3.getX(), ground3.getY() - ground3.getImage().getHeight() / 2 - enemy1.getImage().getHeight() / 2);
        
        world.addCoin(300,423);
        world.addCoin(332,423);
        world.addCoin(364,423);
        world.addCoin(396,423);
        world.addCoin(428,423);
    }
}
