import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

public class MyWorld extends World
{  
    private boolean nextPart = false;
    
    public MyWorld()
    {    
        super(840, 480, 1, false);
        
        GreenfootImage background = new GreenfootImage("gameStartBackground_1.jpg"); // Ruta de la imagen de fondo
        background.scale(getWidth(), getHeight());
        setBackground(background);
        
        Player player = new Player();
        addObject(player, 50, 390);
        Ground ground1 = new Ground();
        addObject(ground1, 270, 455);
        Ground ground2 = new Ground();
        addObject(ground2, 568, 455);
    }
    
    public void act(){
        checkRightLimit();
    }
    
    public void checkRightLimit(){ //checkRightToGenerateNextPart
        if(!nextPart){
            Player player = getPlayer();
            
            if(player != null && player.getX() >= getWidth()-1){
                generateNextPart();//player.getImage().getWidth()/2
                player.setLocation(10, player.getY());
                
                nextPart = true;
            }
        }
    }
    
    private Player getPlayer() {
        List<Player> players = getObjects(Player.class);
        if (!players.isEmpty()) {
            return players.get(0);
        }
        return null;
    }
    
    private void generateNextPart(){
        Player player = getPlayer();
        Ground ground1 = new Ground();
        addObject(ground1, 270, 455);
        Ground ground2 = new Ground();
        addObject(ground2, 568, 255);
        
        //player.setLocation(10, player.getY());
            
        nextPart = false;
    }
}
