package questions;


/*
    IMPORTANT:
	The aim of this exercise is to showcase your coding skills. Please do not think that we expect you to deliver the minnimun ammount of code required for this exercise to work.
	You are allowed to modify all the provided code. Do not think that provided classes have to remain untouched.
	Things that We take into consideration: Use of design patterns, clean code, testing.

    Background:
    The Aeroplane class already defines a method called "fly" and has an implementation for it.
    The Car class already has an implementation for "drive".

    The Problem:
    Redesign the classes so that we can have a flying car that can both drive and fly and
    so that we can re-use the same "fly" and "drive" implementations that have already been defined. i.e.
    The FlyingCar should drive exactly like a Car drives, without copy-and-pasting the drive method.

 */
public class FlyingCar {
    public static final String CREATE_VEHICLE = "Creating a ";
    public static final String ACTION_DRIVE = "Starting action <drive> for the ";
    public static final String ACTION_FLY = "Starting action <fly> for the ";
    public static final String CAR = "CAR";
    public static final String AEROPLANE = "AEROPLANE";
    public static final String FLYINGCAR = "FLYINGCAR";
    public static final String SEPARATOR = " ====================";

    public static void main(String... args) {
        System.out.println("\n".concat(CREATE_VEHICLE).concat(CAR).concat(SEPARATOR));
        Car car = new Car();
        System.out.println(ACTION_DRIVE.concat(CAR).concat(":"));
        car.drive();
        System.out.println(ACTION_FLY.concat(CAR).concat(":"));
        car.fly();

        System.out.println("\n".concat(CREATE_VEHICLE).concat(AEROPLANE).concat(SEPARATOR));
        Aeroplane aeroplane = new Aeroplane();
        System.out.println(ACTION_DRIVE.concat(AEROPLANE).concat(":"));
        aeroplane.drive();
        System.out.println(ACTION_FLY.concat(AEROPLANE).concat(":"));
        aeroplane.fly();

        System.out.println("\n".concat(CREATE_VEHICLE).concat(FLYINGCAR).concat(SEPARATOR));
        FlyingCarModel flyingCar = new FlyingCarModel();
        System.out.println(ACTION_DRIVE.concat(FLYINGCAR).concat(":"));
        flyingCar.drive();
        System.out.println(ACTION_FLY.concat(FLYINGCAR).concat(":"));
        flyingCar.fly();
    }
}
