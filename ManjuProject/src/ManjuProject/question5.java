package ManjuProject;

public class question5 {

	public static void main(String[] args) {
		 char ch = '#';  // Change this to test other characters

	        // Check the type of character
	        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
	            System.out.println("Alphabet");
	        } else if (ch >= '0' && ch <= '9') {
	            System.out.println("Digit");
	        } else {
	            System.out.println("Social character");
		}


	}

}
