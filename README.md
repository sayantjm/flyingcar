## Background 
The Aeroplane class already defines a method called "fly" and has an implementation for it.
The Car class already has an implementation for "drive".
   
## The problem  
Redesign the classes so that we can have a flying car that can both drive and fly and so that we can re-use the same "fly" and "drive" implementations that have already been defined. i.e.

The FlyingCar should drive exactly like a Car drives, without copy-and-pasting the drive method.

## Solution
Used the Strategy Design Pattern.

For this case we have created two interfaces for the Drive and Fly behaviours. Additionally two different implementations have been created for each of them:
1. DriveLikeCar and NotAbleToDrive: For behaviours of driving or not able to drive. 
2. FlyLikePlane and NotAbleToFly: For behaviours of flying or not able to fly.

An abstract class Vehicle has been created which identifies all type of vehicle which can have the two behaviours, Drive or Fly.

Now, each concret vehicle, FlyingCarModel as an example, can extend the Vehicle class and specify the behaviours for this vehicle. For FlyingCarModel they will be both, Drive and Fly.

