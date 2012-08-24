// Christopher Gonzales
// Project Euler Code


public class Project1 {
	
	public static void main(String[] args){
		int number = 1000;
		int total = 0;
		
		for (int i = 1; i < number; i++ ) {
			if (i % 3 == 0) {
				total +=  i;
			} else if (i % 5 == 0) {
				total += i;
			} else {
				total += 0;
			}
		}
		System.out.print(total);
	}
}