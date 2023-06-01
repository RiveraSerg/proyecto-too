import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FirstLevelSecondSection here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FirstLevelSecondSection extends FirstLevel
{
private AllWorlds world;

    public FirstLevelSecondSection(AllWorlds world)
    {
        this.world = world;
    }
    
    public void generateSection() {
        world.addGround(128, 464);
        world.addGround(384, 464);
        world.addGround(640, 464);
        world.addGround(896, 464);
        
        world.addGround(128, 186);
        
        world.addBrick(560, 364);
        
        
        Brick brick1 = new Brick();
        
        FirstEnemy enemy = new FirstEnemy();
        world.addObject(brick1, 360, 294);
        world.addBrick(294,294);
        world.addObject(enemy, brick1.getX(), brick1.getY() - brick1.getImage().getHeight() / 2 - enemy.getImage().getHeight() / 2);

        
        world.addBrick(360, 100);
        
        
        world.addWall(786, 316);
        world.addGround(640, 164);
        world.addGround(896, 164);
        
        world.addCoin(386,264);
        world.addCoin(232,132);
    }
}
