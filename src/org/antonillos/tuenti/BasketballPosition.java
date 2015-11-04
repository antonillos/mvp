package org.antonillos.tuenti;

/**
 * Created by antonillo on 11/3/15.
 */
public class BasketballPosition implements Position {

    String name;
    int score;
    int rebounds;
    int assists;

    public BasketballPosition(String name, int score, int rebounds, int assists) {
        this.name = name;
        this.score = score;
        this.rebounds = rebounds;
        this.assists = assists;
    }

    @Override
    public int ratingPoints() {
        int tp;
        switch (name) {
            case "G":
                tp = score * 2 + rebounds * 3 + assists;
                break;
            case "F":
                tp = score * 2 + rebounds * 2 + assists * 2;
                break;
            case "C":
                tp = score * 2 + rebounds + assists * 3;
                break;
            default:
                throw new IllegalArgumentException("invalid or non implemented position: " + name);
        }

        return tp;
    }

}
