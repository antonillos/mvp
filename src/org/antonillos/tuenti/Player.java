package org.antonillos.tuenti;

import java.util.List;

/**
 * Created by antonillo on 11/3/15.
 */
public class Player implements Comparable<Player> {
    String nickName;

    int ratingScore;

    public Player(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public int compareTo(Player o) {
        if (this.ratingScore == o.ratingScore) {
            return 0;
        } else if (this.ratingScore > o.ratingScore) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Player)) return false;

        Player player = (Player) o;

        return nickName.equals(player.nickName);

    }

    @Override
    public int hashCode() {
        return nickName.hashCode();
    }

    @Override
    public String toString() {
        return "Player{" +
                "nickName='" + nickName + '\'' +
                ", ratingScore=" + ratingScore +
                '}';
    }
}
