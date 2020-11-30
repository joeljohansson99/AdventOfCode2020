
import solutions.*;

public class Main {
	
	static public void main(String[] args) {
		Day day = new Day1();
		String answer = day.answer();
		if (answer != null) {
			System.out.println(answer);
		} else {
			System.out.println("\nNull value recieved");
		}
	}
}
