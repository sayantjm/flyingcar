package questions;

import questions.behaviours.impl.DriveLikeCar;
import questions.behaviours.impl.NotAbleToFly;

/**
 * An Car is a vehicle
 * that can drive
 * but cannot fly
 */
public class Car extends Vehicle {
    public Car() {
        driveBehaviour = new DriveLikeCar();
        flyBehaviour = new NotAbleToFly();
    }
}
