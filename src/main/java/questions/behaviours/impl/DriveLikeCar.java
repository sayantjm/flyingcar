package questions.behaviours.impl;

import questions.behaviours.DriveBehaviour;

import static questions.behaviours.utils.UtilConstants.DRIVING;

/**
 * Created by sayantjm on 21/11/20
 */
public class DriveLikeCar implements DriveBehaviour {
    public String drive() {
        System.out.println("\t".concat(DRIVING));
        return DRIVING;
    }
}
