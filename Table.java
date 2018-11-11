import java.util.ArrayList;

/**
 * A table object.
 * @author Mandy Pearce
 * @version 11.10.18
 */
public class Table{

	public static int size = 8;
	public int emptySeats;
	public String tableID;
	public ArrayList<Team> teams; // array of teams will be size size

	/**
	 * Table constructor initializes table object to empty.
	*/
	public Table(String tableID){
		this.emptySeats = size;
		this.tableID = tableID;
		this.teams = new ArrayList<Team>();
	}

	/**
	 * This method decreases the empty seat variable by one.
	*/
	private void setFillSeat(){
		this.emptySeats--;
	}

}