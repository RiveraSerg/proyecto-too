import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FirstLevelThirdSection here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ThirdLevelFirstSection extends ThirdLevel
{
    private AllWorlds world;

    public ThirdLevelFirstSection(AllWorlds world)
    {
        this.world = world;
    }

    public void generateSection() {
        world.addWall(60,264);
        world.addWall(60,464);
        
        world.addGround(232,120);
        world.addGround(432,120);
        world.addGround(532,120);
        
        world.addGround(432,280);
        world.addGround(632,280);
        world.addGround(732,280);
        
        world.addGround(128, 464);
        world.addGround(384, 464);
        world.addGround(640, 464);
        world.addGround(896, 464);
        
        world.addEpicCoin(164, 194);

        
        world.addWall(890,134);
        world.addWall(890,184);
        
        world.addHorizontalEnemy(890, 432, 4);

        world.addHorizontalEnemy(890, 226, 4);
    }
}
