import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FirstLevelThirdSection here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ThirdLevelSecondSection extends ThirdLevel
{
    private AllWorlds world;

    public ThirdLevelSecondSection(AllWorlds world)
    {
        this.world = world;
    }

    public void generateSection() {
        world.addGround(128, 464);
        world.addWallVariant(232, 532);
       
        
        world.addPlatformMove(464, 400, 4, 500);
        
        
        world.addGround(800, 464);
        
        world.addHorizontalEnemy(990, 432, 4);
        
        
        
        VerticalEnemy verticalEnemy1 = new VerticalEnemy(400, 2); 
        world.addObject(verticalEnemy1, 680, 260);
        
        
    }
}
