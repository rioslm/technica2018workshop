/**
 * A person object.
 *
 * @author Mandy Pearce
  *@version 11.10.18
 */
public class Person{
	public String name;
	public String email;
	public String phoneNum;
	public String teamID;
	// partners

	/**
	 * Person constructor initializes the fields of the person object.
	 * @param name the name of the person.
	 * @param email the email of the person.
	 * @param phoneNum the phone number of the person.
	 * @param teamID of person, if no team set to 0
	*/
	public Person(String name, String email, String phoneNum, String teamID){
		this.name = name;
		this.email = email;
		this.phoneNum = phoneNum;
		this.teamID = teamID;
	}

	public void setTeam(String team){
		this.teamID = team;
	}


}