import greenfoot.*;

public class HorizontalEnemy extends Enemy {
    private int speed;

    public HorizontalEnemy(int speed) {
        this.speed = speed;
        setImage("bullet.png");
    }

    public void act() {
        moveHorizontally();
        checkEdge();
    }

    private void moveHorizontally() {
        setLocation(getX() - speed, getY()); // Cambio de signo para moverse hacia la izquierda
    }

    private void checkEdge() {
        int worldWidth = getWorld().getWidth();

        if (getX() <= 0) {
            setLocation(worldWidth, getY()); // Aparece en el límite derecho
        }
    }
}


