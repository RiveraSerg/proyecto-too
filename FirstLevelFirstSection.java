import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FirstLevelSectionFirst here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FirstLevelFirstSection extends FirstLevel
{
    private AllWorlds world;

    public FirstLevelFirstSection(AllWorlds world)
    {
        this.world = world;
    }
    
    public void generateSection() {
        world.addWall(64, 364);
        
        world.addGround(640, 464);
        world.addGround(896, 464);
        
        world.addWallVariant(232, 332);
        
        world.addWallVariant(386, 464);
        
        world.addCoin(386,264);
        world.addCoin(232,132);
    }
}
