package questions;

import questions.behaviours.impl.FlyLikePlane;
import questions.behaviours.impl.NotAbleToDrive;

public class Aeroplane extends Vehicle {
    public Aeroplane() {
        driveBehaviour = new NotAbleToDrive();
        flyBehaviour = new FlyLikePlane();
    }
}
