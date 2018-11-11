/**
 * A table object.
 * @author Mandy Pearce
 * @version 11.10.18
 */
public class Table{

	public static int size = 8;
	public int emptySeats;
	public String tableID;
	public Team[] teams = new Team[size]; // array of teams will be size size

	/**
	 * Table constructor initializes table object to empty.
	*/
	public Table(String tableID){
		this.emptySeats = size;
		this.tableID = tableID;
		//this.teams = ;

	}
	
	public void setTeam(Team team) {
		if (teams[0] == null) {
			teams[0] = team;
		} else {
			teams[1] = team;
		}
	}
	
	public Team[] getTeam() {
		return this.teams;
	}
	public String toString() {
		return tableID;		
	}

}