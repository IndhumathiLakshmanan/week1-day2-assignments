package week1.day2.assignments.mandatory;

public class Palindrome {

	public static void main(String[] args) {
		String name1 = "madam";
				String name2 = "";
				for (int i = name1.length()-1 ; i>=0; i--) {
				name2 = name2 +name1.charAt(i);
				}
				if(name1.equals(name2)) {
					System.out.println("It is Palindrome");}
					else
					{
						System.out.println("This is not an palindrome");
							}
				}
	}
	
	


