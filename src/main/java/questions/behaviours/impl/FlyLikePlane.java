package questions.behaviours.impl;

import questions.behaviours.FlyBehaviour;

import static questions.behaviours.utils.UtilConstants.FLYING;

/**
 * Created by sayantjm on 21/11/20
 * When the fly method is requested, it is returning the sentence FLYING
 */
public class FlyLikePlane implements FlyBehaviour {
    public String fly() {
        System.out.println("\t".concat(FLYING));

        return FLYING;
    }
}
