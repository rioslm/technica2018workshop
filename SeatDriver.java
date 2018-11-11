
public class SeatDriver {

	public static void main(String[] args) {
		//tables per row
		int TablesPerRow = 5;
		int numTables = 125;
				
		String[] TablesArray = new String[numTables];
		
		//Abcs for naming

		char abcs[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		char letter = abcs[0];
		int z = 0;

		//will not work properly for more than 26*tables per row
		//create tables of Letter and Number
		for (int i = 0; i < numTables; i++) {
			
			//switch letter every new row
			if (i != 0 && i % TablesPerRow == 0) {
				letter = abcs[++z];
			}
			
			//sets table to Letter + Number
			TablesArray[i] = letter + Integer.toString(i + 1);
			
			
		}
		for (int i = 0; i < numTables; i++) {
			System.out.println(TablesArray[i]);
		}
	}
}
