import java.util.ArrayList;

public class Team{
	private String ID;
	private ArrayList<Person> members;
	private String tableId;
	private static final int TEAM_SIZE = 4;

	/**
	 * Team constructor initializes the fields of the team object.
	 * @param name the name of the team.
	 * @param members array is the list of people on the team
	*/
	public Team(String ID){
		this.ID = ID;
		members = new ArrayList<Person>();
	}

	public Team(String ID, Person member1, Person member2, Person member3, Person member4){
		this(ID);
		members.add(member1);
		members.add(member2);
		members.add(member3);
		members.add(member4);
	}

	public void addMember(Person newMember){
		if(members.size() < TEAM_SIZE){
			members.add(newMember);
			newMember.setTeam(this.ID);
		}
		else
			System.err.println("Only 4 members allowed in a team, there are already 4 members in this team.");
	}
	
	public void setTableID(String id) {
		this.tableId = id;
	}
	
	public String getTableID() {
		return this.tableId;
	}
	
	public ArrayList<Person> getMembers() {
		return members;
	}
	
	public int getSize() {
		return TEAM_SIZE;
	}
	
	public String toString() {
		String s = this.tableId + "\t" + this.ID;
		
		for (Person p: members) {
			s += "\t" + p.getName();
		}
		return s;
	}
}
