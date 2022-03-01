//author: Marisa Paone
 
package cs520.hw4;

public class Player {
	
	//initializing variables
	private int number;
	private String name;
	private String position;
	private String year;
	
	//mutator and accessor methods
	public void setNumber(int num) {
		number = num;
	}
	public void setName(String n) {
		name = n;
	}
	public void setPosition(String p) {
		position = p;
	}
	public void setYear(String y) {
		year = y;
	}
	public int getNumber () {
		return number;
	}
	public String getName () {
		return name;
	}
	public String getPosition() {
		return position;
	}
	public String getYear() {
		return year;
	}
	
	//single constructor that accepts string as its argument
	public Player(String name) {
		this.name = name;
	}
		
	public String toString() {
		//this method prints the string with number, name, position and year
		String str = ("#"+ number +": "+name+" ("+position+", "+ year+")");
		//System.out.println(str);
		return str;
		
	}
}

