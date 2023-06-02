import greenfoot.*;

public class VerticalEnemy extends Enemy {
    private int range;
    private int speed;
    private int direction;

    public VerticalEnemy(int range, int speed) {
        this.range = range;
        this.speed = speed;
        this.direction = 1; // Comienza moviéndose hacia abajo
        setImage("enemyVertical.png");
    }

    public void act() {
        moveVertically();
        checkRange();
    }

    private void moveVertically() {
        setLocation(getX(), getY() + direction * speed);
    }

    private void checkRange() {
        int currentY = getY();

        if (currentY >= range) {
            direction = -1; // Cambia la dirección hacia arriba
        } else if (currentY <= 0) {
            direction = 1; // Cambia la dirección hacia abajo
        }
    }
}










