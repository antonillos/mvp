package org.antonillos.tuenti;

import java.util.LinkedList;

/**
 * Created by antonillo on 11/3/15.
 */
public class Team implements Comparable<Team> {
	String name;
	LinkedList<Player> players = new LinkedList<>();
	int totalPoints;

	public Team(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Team team = (Team) o;

		return name.equals(team.name);

	}

	@Override
	public int hashCode() {
		return name.hashCode();
	}

	@Override
	public String toString() {
		return "Team{" +
				"name='" + name + '\'' +
				", players=" + players +
				", totalPoints=" + totalPoints +
				'}';
	}

	@Override
	public int compareTo(Team o) {
		if (this.totalPoints == o.totalPoints) {
			return 0;
		} else if (this.totalPoints > o.totalPoints) {
			return 1;
		} else {
			return -1;
		}
	}
}
