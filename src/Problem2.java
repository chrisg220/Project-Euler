// Christopher Gonzales
// Project Euler Code Problem #2

// Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
// 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
// By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.

public class Problem2 {
	public static void main(String[] args) {
		int firstTerm = 1;
		int secondTerm = 2;
		int thirdTerm = 3;
		int evenSum = 2;
		int limit = 4000000;
		
		while (thirdTerm < limit) {
			thirdTerm = firstTerm + secondTerm;
			if (thirdTerm % 2 == 0) {
				evenSum += thirdTerm;
			}
			firstTerm = secondTerm;
			secondTerm = thirdTerm;
		}
		System.out.println(evenSum);
	}
}