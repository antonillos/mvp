package org.antonillos.tuenti;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author antonio saco
 * @depends JDK 7
 */
public class Main {

	public static void main(String[] args) throws IOException, URISyntaxException {
		// write your code here

		final GameTable game = new GameTable("games" + File.separator + "basketball.in");

		URL url = Main.class.getResource(game.fileName);
		File file = new File(url.toURI());
		Scanner scr = new Scanner(file).useDelimiter("\\n");
		String line;
		String[] ls;
		scr.next(); // sport:basketball;
		Team team;
		while (scr.hasNextLine()) {
			line = scr.next();
			System.out.println("line: " + line);
			ls = line.split(";");
			game.addStatLine(new Player(ls[1]), new Team(ls[3]),
					new BasketballPosition(ls[4], Integer.valueOf(ls[5]), Integer.valueOf(ls[6]), Integer.valueOf(ls[7])));

		}

		System.out.println("mvp: " + game.mvp());

	}
}