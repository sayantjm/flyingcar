import org.junit.jupiter.api.Test;
import questions.Aeroplane;
import questions.Car;
import questions.FlyingCarModel;
import questions.Vehicle;
import questions.behaviours.impl.FlyLikePlane;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static questions.behaviours.utils.UtilConstants.*;

/**
 * Created by sayantjm on 21/11/20
 */
public class FlyingCarTests {

    private Vehicle vehicle;

    @Test
    public void given_a_Car_when_created_then_isAbleToDrive_and_notAbleToFly() {
        vehicle = new Car();
        assertTrue(vehicle instanceof Car);
        assertEquals(DRIVING, vehicle.drive());
        assertEquals(NOT_FLYING, vehicle.fly());
    }

    @Test
    public void given_a_Car_when_addedFlyingBehaviour_then_isAbleToDrive_and_isAbleToFly() {
        vehicle = new Car();
        vehicle.setFlyBehaviour(new FlyLikePlane());
        assertTrue(vehicle instanceof Car);
        assertEquals(DRIVING, vehicle.drive());
        assertEquals(FLYING, vehicle.fly());
    }

    @Test
    public void given_an_Aeroplane_when_created_then_isAbleToFly_and_notAbleToDrive() {
        vehicle = new Aeroplane();
        assertTrue(vehicle instanceof Aeroplane);
        assertEquals(NOT_DRIVING, vehicle.drive());
        assertEquals(FLYING, vehicle.fly());

    }

    @Test
    public void given_a_FlyingCar_when_created_then_isAbleToDrive_and_isAbleToFly() {
        vehicle = new FlyingCarModel();
        assertTrue(vehicle instanceof FlyingCarModel);
        assertEquals(DRIVING, vehicle.drive());
        assertEquals(FLYING, vehicle.fly());
    }
}
