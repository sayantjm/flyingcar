package questions.behaviours.impl;

import questions.behaviours.FlyBehaviour;

import static questions.behaviours.utils.UtilConstants.NOT_FLYING;

/**
 * Created by sayantjm on 21/11/20
 * When the fly method is requested, it is returning the sentence NOT_FLYING
 */
public class NotAbleToFly implements FlyBehaviour {
    public String fly() {
        System.out.println("\t".concat(NOT_FLYING));

        return NOT_FLYING;
    }
}
