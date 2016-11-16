package model.gameObjects;

import model.gameObjects.GameObject;
import model.strategy.MovementStrategy;
import view.GraphicsDrawer;

/**
 *
 * @author Martin
 */
public class Missile extends GameObject {
    
    private final int angle;
    private final int force;
    private int time;
    private final int startX;
    private final int startY;
    private final MovementStrategy strategy;
            
    public Missile(int x, int y, int angle, int force, MovementStrategy strategy)
    {
        super(x, y);
        this.angle = angle;
        this.force = force;
        this.strategy = strategy;
        this.time = 1;
        this.startX = x;
        this.startY = y;
    }

    public void move(int gravity)
    {
        time++;
        strategy.move(gravity, this);
    }
    
    @Override
    public void accept(GraphicsDrawer d) 
    {
       d.visit(this);
    }

    public int getAngle() 
    {
        return angle;
    }

    public int getForce() 
    {
        return force;
    }   
    
    public int getTime() 
    {
        return time;
    }
     public int getStartX() 
     {
         return startX;
     }
     public int getStartY() 
     {
         return startY;
     }
}
