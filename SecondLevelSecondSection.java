import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SecondLevelFirstSection here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SecondLevelSecondSection extends SecondLevel
{

    private AllWorlds world;

    public SecondLevelSecondSection(AllWorlds world)
    {
        this.world = world;
    }

    public void generateSection() {
        world.addGround(80, 264);
        
        world.addPlatformMove(432, 264, 3, 300);
        VerticalEnemy verticalEnemy = new VerticalEnemy(400, 2); 
        world.addObject(verticalEnemy, 270, 260);
        
        world.addPlatformMove(564, 264, 3, 300);
        
        world.addGround(896, 464);
        
        world.addCoin(400,400);
        world.addCoin(432,400);
        world.addCoin(464,400);
    }
}