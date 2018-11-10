/**
 * A person object.
 *
 * @author Mandy Pearce
  *@version 11.10.18
 */
public class Person{
	public static String name;
	public static String email;
	public static String phoneNum;
	public static String school;
	public static int teamID;

	/**
	 * Person constructor initializes the fields of the person object.
	 * @param name the name of the person.
	 * @param email the email of the person.
	 * @param phoneNum the phone number of the person.
	 * @param school of the person.
	 * @param teamID of person, if no team set to 0
	*/
	public Person(String name, String email, String phoneNum, String school, int teamID){
		this.name = name;
		this.email = email;
		this.phoneNum = phoneNum;
		this.school = school;
		this.teamID = teamID;
	}
}