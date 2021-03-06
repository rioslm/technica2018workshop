import java.util.ArrayList;

/**
 * A team object.
 *
 * @author Mandy Pearce
  *@version 11.10.18
 */
public class Team{
	public static String ID;
	public static ArrayList<Person> members;

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
		if(members.size() <4){
			members.add(newMember);
			newMember.setTeam(this.ID);
		}
		else
			System.err.println("Only 4 members allowed in a team, there are already 4 members in this team.");
	}
}