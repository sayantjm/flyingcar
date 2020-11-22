package questions;

import questions.behaviours.impl.FlyLikePlane;
import questions.behaviours.impl.NotAbleToDrive;

/**
 * An Aeroplane is a vehicle
 * that can fly
 * but cannot drive
 */
public class Aeroplane extends Vehicle {
    public Aeroplane() {
        driveBehaviour = new NotAbleToDrive();
        flyBehaviour = new FlyLikePlane();
    }
}
