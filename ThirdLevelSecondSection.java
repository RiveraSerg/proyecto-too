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
       
        
        world.addPlatformMove(464, 400, 3, 500);
        
        
        world.addGround(800, 464);
        
        world.addHorizontalEnemy(890, 432, 4);
        
        VerticalEnemy verticalEnemy = new VerticalEnemy(400, 2); 
        world.addObject(verticalEnemy, 275, 260);
        
        VerticalEnemy verticalEnemy1 = new VerticalEnemy(400, 2); 
        world.addObject(verticalEnemy1, 680, 260);
        
        
    }
}
