//author: Marisa Paone

package cs520.hw4;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;


public class TeamTest {

	public static Player createPlayer(String number, String name, String position, String year) {
		
		//converts number to an int
		int numb = Integer.parseInt(number);
		
		//instantiates player as a variable and passing the name value
		Player player = new Player(name);
		
		//sets the number, position and year to player with mutator methods
		player.setNumber(numb);
		player.setPosition(position);
		player.setYear(year);
	
		return player;
	}
	
	public static void main(String[] args) {
	
		ArrayList<Player> players = new ArrayList<Player>();
		
		Scanner scanner = null;
		
		//reading file
		try {
			File file = new File ("team.txt");
			scanner = new Scanner (file);
		
			//reads five lines from team.txt and passes the first four of five strings to createPlayer()
			while (scanner.hasNextLine()) {
			 
				String number = scanner.nextLine();
				String name = scanner.nextLine();
				String position = scanner.nextLine();
				String year = scanner.nextLine();
			
				//fetches the return value of createPlayer
				Player player = createPlayer(number, name, position, year);
				
				//adds player to arrayList
				players.add(player);
				
				scanner.nextLine();
				//System.out.println ();		
			}
			
			String[] opponents = new String [] {"Villanova", "Stevens Tech", "BC", "Northeastern", "NYU"};
			
			//for loop that sets the team name, opponents name, the date and players and then simulates the game by calling the method simulateGame
			for (int index = 0; index < opponents.length; index++) {
				Game game = new Game();
				game.setTeamName("Marisa's Team");
				game.setOpponentName(opponents[index]);
				game.setDate(10, 20, 1996);
				game.setPlayers(players);
				game.simulateGame();
				
			}
				
			
		} catch (Exception e){
			//catches the exceptions if file isn't found
			e.printStackTrace();
			System.out.print("something went terribly wrong");
		
		} finally {
			
			//closes scanner
			if (scanner != null) {
				scanner.close();		
			}
		}
}
	
}

