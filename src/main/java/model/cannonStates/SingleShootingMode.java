package model.cannonStates;

import java.util.ArrayList;
import model.factory.ObjectsFactory;
import model.gameObjects.Cannon;
import model.gameObjects.Missile;

/**
 *
 * @author Martin
 */
public class SingleShootingMode implements CannonState{

    @Override
    public ArrayList<Missile> shoot(ObjectsFactory factory, Cannon cannon)
    {
        ArrayList<Missile> missiles = new ArrayList<Missile>();
        missiles.add(factory.createMissile(cannon.getX(), cannon.getY(), 
                cannon.getForce(), cannon.getAngle()));
        return missiles;
    }

}
