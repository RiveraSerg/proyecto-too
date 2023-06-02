import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FirstLevelThirdSection here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ThirdLevelThirdSection extends SecondLevel
{
    private AllWorlds world;

    public ThirdLevelThirdSection(AllWorlds world)
    {
        this.world = world;
    }

    public void generateSection() {
        world.addGround(128, 464);
        world.addGround(384, 464);
        world.addGround(640, 464);
        world.addGround(896, 464);
        
        world.addStar(640, 396);
        
        
        world.addWall(786, 364);
    }
}