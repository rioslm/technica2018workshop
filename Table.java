/**
 * A table object.
 * @author Mandy Pearce
 * @version 11.10.18
 */
public class Table{

	private static final int TABLE_SIZE = 8;
	private int emptySeats;
	private String tableID;
	private Team[] teams = new Team[TABLE_SIZE]; // array of teams will be table size / team size

	/**
	 * Table constructor initializes table object to empty.
	*/
	public Table(String tableID){
		this.emptySeats = TABLE_SIZE;
		this.tableID = tableID;
	}
	
	public void setTeam(Team team) {
		//assigns correct amount of teams to a table
		if (emptySeats < team.getSize()) {
			System.out.println("No room at table!!");
		}
		for (int i = 0; i < TABLE_SIZE / team.getSize(); i++) {
			if (teams[i] == null) {
				teams[i] = team;
				break;
			}
		}
		emptySeats -= team.getSize();
	}
	
	public Team[] getTeam() {
		return this.teams;
	}
	
	public int getSize() {
		return TABLE_SIZE;
	}
	
	public String getTableID() {
		return tableID;
	}
	public String toString() {
		return tableID;		
	}

}