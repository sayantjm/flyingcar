package questions;

import questions.behaviours.impl.DriveLikeCar;
import questions.behaviours.impl.FlyLikePlane;

/**
 * Created by sayantjm on 21/11/20
 */
public class FlyingCarModel extends Vehicle {
    public FlyingCarModel() {
        driveBehaviour = new DriveLikeCar();
        flyBehaviour = new FlyLikePlane();
    }
}
