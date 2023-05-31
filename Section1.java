import greenfoot.*;

public class Section1 extends MyWorld {
    private MyWorld world;

    public Section1(MyWorld world) {
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

        world.addCoin(500, 323);
        world.addCoin(532, 323);
        world.addCoin(564, 323);
        world.addCoin(596, 323);
        world.addCoin(628, 323);

        world.addPlatformMove(200, 464, 3, 474);

        MovingPlatform platform = new MovingPlatform(3, 474);
        world.addObject(platform, 230, 464);
    }
}

