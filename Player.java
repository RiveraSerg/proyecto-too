import greenfoot.*;

public class Player extends Actor
{
    private static final int OFFSET = 5;
    private static final int DIRECTION_NONE = 0;
    private static final int DIRECTION_RIGHT = 1;
    private static final int DIRECTION_LEFT = 2;
    private static final int JUMP_STRENGTH = -15;
    
    private int direction = DIRECTION_NONE;
    private int verticalSpeed = 0;
    private int acceleration = 1;
    private int leftLimit = 5;
    private boolean isJumping = false;

    public Player()
    {
        setImage("frog.png");
    }

    public void act()
    {
        handleKeys();
        move();
        checkFall();
        checkCollision();
        checkEnemyCollision();
        checkItemCollision();
    }

    private void handleKeys()
    {
        if (Greenfoot.isKeyDown("a"))
        {
            if (getX() > leftLimit)
            {
                direction = DIRECTION_LEFT;
            }
            else
            {
                direction = DIRECTION_NONE;
            }
        }
        else if (Greenfoot.isKeyDown("d"))
        {
            direction = DIRECTION_RIGHT;
        }
        else
        {
            direction = DIRECTION_NONE;
        }

        if (Greenfoot.isKeyDown("space") && onGround() && !isJumping)
        {
            jump();
        }
    }

    private void jump()
    {
        verticalSpeed = JUMP_STRENGTH;
        fall();
        isJumping = true;
    }

    private void move()
    {
        switch (direction)
        {
            case DIRECTION_RIGHT:
                setLocation(getX() + OFFSET, getY());
                break;
            case DIRECTION_LEFT:
                setLocation(getX() - OFFSET, getY());
                break;
        }
    }

    private void fall()
    {
        setLocation(getX(), getY() + verticalSpeed);
        verticalSpeed = verticalSpeed + acceleration;
    }

    private boolean onGround()
    {
        Actor under = getOneObjectAtOffset(0, getImage().getHeight() / 2, Ground.class);
        return under != null;
    }

    private void checkFall()
    {
        if (onGround())
        {
            isJumping = false;
        }
        else
        {
            fall();
        }
    }

    private void checkCollision()
    {
        Actor groundBelow = getOneObjectAtOffset(0, getImage().getHeight() / 2, Ground.class);
        if (groundBelow != null)
        {
            int newY = groundBelow.getY() - (groundBelow.getImage().getHeight() + getImage().getHeight()) / 2;
            setLocation(getX(), newY);
            verticalSpeed = 0;
            isJumping = false;
        }

        Actor groundAbove = getOneObjectAtOffset(0, -(getImage().getHeight() / 2), Ground.class);
        if (groundAbove != null)
        {
            int newY = groundAbove.getY() + (groundAbove.getImage().getHeight() + getImage().getHeight()) / 2;
            setLocation(getX(), newY);
            verticalSpeed = 0;
        }

        Actor groundLeft = getOneObjectAtOffset(-OFFSET, 0, Ground.class);
        if (groundLeft != null)
        {
            int newX = groundLeft.getX() + (groundLeft.getImage().getWidth() + getImage().getWidth()) / 2;
            setLocation(newX, getY());
        }

        Actor groundRight = getOneObjectAtOffset(OFFSET, 0, Ground.class);
        if (groundRight != null)
        {
            int newX = groundRight.getX() - (groundRight.getImage().getWidth() + getImage().getWidth()) / 2;
            setLocation(newX, getY());
        }
    }

    private void checkEnemyCollision()
    {
        Actor enemy = getOneIntersectingObject(Enemy.class);
        if (enemy != null)
        {
            Greenfoot.setWorld(new MyWorld());
        }
    }

    private void checkItemCollision()
    {
        Item item = (Item) getOneIntersectingObject(Item.class);
        if (item != null)
        {
            getWorld().removeObject(item);

            ScoreBoard scoreboard = (ScoreBoard) getWorld().getObjects(ScoreBoard.class).get(0);
            scoreboard.addToScore(item.getPoints());

            GreenfootSound sound = item.getSound();

            if (sound != null)
            {
                sound.play();
            }
        }
    }
    
    
}