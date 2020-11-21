package questions.behaviours.impl;

import questions.behaviours.DriveBehaviour;

import static questions.behaviours.utils.UtilConstants.NOT_DRIVING;

/**
 * Created by sayantjm on 21/11/20
 */
public class NotAbleToDrive implements DriveBehaviour {
    public String drive() {
        System.out.println("\t".concat(NOT_DRIVING));

        return NOT_DRIVING;
    }
}
