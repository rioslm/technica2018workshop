public class Test{
   
	public static void main(String[] args){
		String name = "Mandy";
		String email = "pearceav@dukes.jmu.edu";
		String phone = "8049828431";
		String teamID= "0";

		Person hacker1 = new Person(name, email, phone, teamID);
		System.out.println("we created a new person!");

		Team team1 = new Team("A3");
		System.out.println("we created a new Team!");
		team1.addMember(hacker1);
	}

}