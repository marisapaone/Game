//author: Marisa Paone
package cs520.hw4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Game {

	private int month;
	private int day;
	private int year;
	private String teamName;
	private String opponentName;
	List<Player> players = new ArrayList<Player>(); 
	
	//mutator and accessor methods
	public void setMonth(int m) {
		this.month = m;
	}
	public void setDay(int d) {
		this.day = d;
	}
	public void setYear(int y) {
		this.year = y;
	}
	public void setTeamName(String t) {
		this.teamName = t;
	}
	public void setOpponentName(String o) {
		this.opponentName = o;
	}
	public void setPlayers(ArrayList<Player> p) {
		this.players = p;
	}
	
	
	public int getMonth() {
		return month;
	}
	public int getDay() {
		return day;
	}
	public int getYear() {
		return year;
	}
	public String getTeamName() {
		return teamName;
	}
	public String getOpponentName() {
		return opponentName;
	}
	public List<Player> getPlayers(){
		return players;
	}
	
	//sets date
	public void setDate(int month, int day, int year) {
		this.month = month;
		this.day = day;
		this.year = year;		
	}
	//simulate game method that prints out the first line for each of the 5 games and prints players and their points scored
	public void simulateGame() {
		System.out.printf("Game played on %d/%d/%d vs. %s%n", this.month, this.day, this.year, this.opponentName);
	
		int teamPoints = 0;
		//loop to run through each element of players arraylist, generates a random in 0-10 and adds it to teamsPoints
		for (Player element : this.players) {
			Random rand = new Random();
			int points = rand.nextInt(11);
			teamPoints += points;
			System.out.printf(element.toString() + " scored %d points%n", points);
			
		}
		//Generates opponents points and prints final score with both teams points
		int opponentPoints = (int) (Math.random()*100);
		System.out.println("Final score: " + teamName + " " + teamPoints + ", " + opponentName + " " + opponentPoints);
		System.out.println();
		
	}
	

}
