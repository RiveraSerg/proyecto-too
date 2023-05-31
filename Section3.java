import greenfoot.*;  
public class Section3 extends MyWorld
{
    private MyWorld world;

    public Section3(MyWorld world) {
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
    }
}
