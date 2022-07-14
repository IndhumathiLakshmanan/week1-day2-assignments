package week1.day2.assignments.mandatory;


public class RemoveDuplicates {

	public static void main(String[] args) {

		String text = "We learn java basics as part of java sessions in java week1";
		int count = 0;
		String[] first = text.split(" ");
		String[] newStr = new String[first.length];
		for (int i = 0; i < first.length; i++) {
			for (int j = i+1; j < first.length; j++) {
				if (first[i].equalsIgnoreCase(first[j])) {
					count++;
					if (count>1) {
						first[i] = "";
					}
				}
			}
			newStr[i] = first[i];
			System.out.print(newStr[i]+" ");
		}
	}

}