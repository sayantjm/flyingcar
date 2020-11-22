package questions;

import questions.behaviours.DriveBehaviour;
import questions.behaviours.FlyBehaviour;

/**
 * Created by sayantjm on 21/11/20
 * Abstract class for creating a Vehicle
 * The Vehicle can have two different behaviours
 *   - Drive
 *   - Fly
 *   Both can be set at runtime
 */
public abstract class Vehicle {
    FlyBehaviour flyBehaviour;
    DriveBehaviour driveBehaviour;

    public Vehicle() {
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {this.flyBehaviour = flyBehaviour;}
    public void setDriveBehaviour(DriveBehaviour driveBehaviour) {this.driveBehaviour = driveBehaviour;}

    public String fly() { return flyBehaviour.fly();}
    public String drive() { return driveBehaviour.drive();}
}
