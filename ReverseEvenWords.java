package week1.day2.assignments.mandatory;

public class ReverseEvenWords {

	public static void main(String[] args) {

		String str = "I am a software tester";
		
		String[] first = str.split(" ");
		
	for (int i = 0; i <first.length; i++) 
		{
		    if(i%2==0)
		    {
		    	char[] temp = first[i].toCharArray();
		    	
		    	for (int j = temp.length-1 ; j>=0; j--) 
		    	{
					System.out.print(temp[j]);
				}
		    	System.out.print(" ");
		    	
		    }
		    else
		    {
		    	System.out.print(first[i]);
		    	System.out.print(" ");
		    	
		    }
			
		}

	}

}