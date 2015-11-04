package org.antonillos.tuenti;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by antonillo on 11/3/15.
 */
public class GameTable {
    String fileName;
    List<Team> teams = new ArrayList<>(2);

    public GameTable(String fileName) {
        this.fileName = fileName;
    }

    Team winner() {
        // TODO calculate more scored points from each team
        return null;
    }

    Player mvp() {
        // TODO
        Collections.sort(teams);
        System.out.println(Arrays.toString(teams.toArray()));
        return null;
    }

    // calculate rating points every stat line
    public void addStatLine(Player player, Team team, Position position) {
        final Team currentTeam;
        if (teams.contains(team)) {
            currentTeam = teams.get(teams.indexOf(team));
        } else {
            teams.add(team);
            currentTeam = team;
        }

        // update or add ratingScore
        if (currentTeam.players.contains(player)) {
            currentTeam.players.get(currentTeam.players.indexOf(player)).ratingScore += position.ratingPoints();
        } else {
            // add player to a team
            player.ratingScore = position.ratingPoints();
            currentTeam.players.add(player);
        }
    }
}
