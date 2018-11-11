import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class SeatDriver {
	private static final int TEAM_SIZE = 4;
	public static void main(String[] args) {
		// tables per row
		int TablesPerRow = 5;
		int numTables = 125; // total number of tables
		// createTableIDs(numTables, TablesPerRow);
		// getPeople(args[0]);

		makeTeam(getPeople("/Users/Jenn/Desktop/technica/Technica/People.txt"),
				createTableIDs(numTables, TablesPerRow));
	}

	public static Table[] createTableIDs(int numTables, int TablesPerRow) {
		// array to hold table objects
		Table[] TablesArray = new Table[numTables];

		// Abcs for Table ID
		char abcs[] = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S',
				'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
		char letter = abcs[0]; // current Letter
		int z = 0; // Position in array

		// will not work properly for more than 26*tables per row
		// create tables of Letter and Number
		for (int i = 0; i < numTables; i++) {

			// switch letter every new row
			if (i != 0 && i % TablesPerRow == 0) {
				letter = abcs[++z];
			}

			// sets table to Letter + Number
			TablesArray[i] = new Table(letter + Integer.toString(i % 5 + 1));
		}

		// TESTING
		for (int i = 0; i < numTables; i++) {
			System.out.println(TablesArray[i].toString());
		}
		return TablesArray;
	}

	public static ArrayList<Person> getPeople(String file) {
		ArrayList<Person> peeps = new ArrayList<>();

		try {
			String line = "";
			String[] tabbedLine = null;
			BufferedReader buf = new BufferedReader(new FileReader(file));
			line = buf.readLine();

			// create people objects
			while (line != null) {
				tabbedLine = line.split("\t");
				// name, email, number, teamID

				// create person 1

				peeps.add(new Person(tabbedLine[0], tabbedLine[1], tabbedLine[2], null));

				// create his partners
				// if they don't list 3 partners they get put into the teamless category
				// make people objects for each partner
				/*
				 * if(tabbedLine.length ==6) { for (int i = 3; i < 6; i++) { Person partner } }
				 */
				// see if person 1s parters are in peeps already

				// if they are add person 1 to their team

				// if they arent make a new team that has only person 1 as registerd but the
				// rest listed in the team
				line = buf.readLine();
			}
			buf.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < peeps.size(); i++) {
			System.out.println(peeps.get(i).toString());
		}
		return peeps;
	}

	public static void makeTeam(ArrayList<Person> peeps, Table[] tables) {
		ArrayList<Team> teams = new ArrayList<>();
		//for number of teams
		int table = 0;
		for (int i = 0; i < (peeps.size() / TEAM_SIZE); i++) {
			Team team = new Team(" " + i);
			//gets people from peeps in multiples of 4
			for (int z = i * 4; z < i * 4 + 4; z++) {
				team.addMember(peeps.get(z));
			}
			//Associates 
			team.setTableID(tables[table].tableID);
			//associates the team with the table
			tables[table].setTeam(team);
			teams.add(team);	//adds team to teams arraylist
			System.out.println(table);
			if (i % 2 != 0)
			table++;
		}
		for (Team t: teams) {
			System.out.println(t.toString() + " " + t.getTableID());
		}
		
	}
}
