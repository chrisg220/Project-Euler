// Christopher Gonzales
// Project Euler Code Problem #1

public class Problem1 {
	
	public static void main(String[] args){
		int number = 1000;
		int total = 0;
		
		for (int i = 1; i < number; i++ ) {
			if (i % 3 == 0) {
				total +=  i;
			} else if (i % 5 == 0) {
				total += i;
			}
		}
		System.out.print(total);
	}
}