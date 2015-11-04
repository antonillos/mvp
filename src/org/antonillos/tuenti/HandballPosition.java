package org.antonillos.tuenti;

/**
 * Created by antonillo on 11/3/15.
 */
public class HandballPosition implements Position {

    String name;
    int initialPoints;
    int goalsMade;
    int goalsReceived;

    @Override
    public int ratingPoints() {
        int tp;
        switch (name) {
            case "G":
                tp = initialPoints + goalsMade * 5 + goalsReceived * 2;
                break;
            case "F":
                tp = initialPoints + goalsMade * 5 + goalsReceived * 2;
                break;
            default:
                throw new IllegalArgumentException("invalid or non implemented position: " + name);
        }

        return tp;
    }

}
