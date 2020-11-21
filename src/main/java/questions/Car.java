package questions;

import questions.behaviours.impl.DriveLikeCar;
import questions.behaviours.impl.NotAbleToFly;

public class Car extends Vehicle {
    public Car() {
        driveBehaviour = new DriveLikeCar();
        flyBehaviour = new NotAbleToFly();
    }
}
