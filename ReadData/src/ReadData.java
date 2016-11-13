import java.util.*;

public class ReadData {

		public static void main(String[] args) throws Exception {
		
			java.io.File file = new java.io.File("scores.txt");
			Scanner input = new Scanner(file);
			
			while(input.hasNext()) {
				String firstName = input.next();
				System.out.println(firstName);
			}
			input.close();
		}


	}
