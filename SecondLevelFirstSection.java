import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SecondLevelFirstSection here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SecondLevelFirstSection extends SecondLevel
{

    private AllWorlds world;

    public SecondLevelFirstSection(AllWorlds world)
    {
        this.world = world;
    }

    public void generateSection() {
        world.addWall(40,464);
        world.addWall(40,264);
        
        world.addGround(440, 464);
        world.addGround(640, 464);
        world.addGround(896, 464);
        
        world.addEpicCoin(640, 400);
        
        world.addGround(510, 264);
        world.addGround(640, 264);
        world.addGround(896, 264);
        
        world.addWall(880,410);

        WallVariant wall = new WallVariant();
        world.addObject(wall, 232, 332);

        VerticalEnemy verticalEnemy = new VerticalEnemy(400, 2); 
        world.addObject(verticalEnemy, 300, 300); 
        
        world.addBrick(400, 356);
        
        
    }
}
