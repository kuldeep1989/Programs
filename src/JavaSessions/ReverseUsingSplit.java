package JavaSessions;

public class ReverseUsingSplit {

	public static void main(String[] args) {

		String name = "Kuldeep Singh Yadav";
		String splitname[] = name.split(" ");
		String Firstword = splitname[0];
		String Secondword = splitname[1];
		String Thirdword = splitname[2];
		
		char revname1[] = Firstword.toCharArray();
		char revname2[] = Secondword.toCharArray();
		char revname3[] = Thirdword.toCharArray();
		
		for (int i = revname1.length-1; i>=0; i--) {
			
			System.out.print(revname1[i]);
			if (i==0) {
				System.out.print(" ");
			}
		}
			
			for (int j = revname2.length-1; j>=0; j--) {
				
				System.out.print(revname2[j]);
				if (j==0) {
					System.out.print(" ");
				}
			}
				
				for (int k = revname3.length-1; k>=0; k--) {
				
					System.out.print(revname3[k]);
					if (k==0) {
						System.out.print(" ");
					}
				}
	}

}
