
public class Challange {

	public static void main(String[] args) {
		/*
		 * make a new method that Start with 2 int arrays, a and b, each length
		 * 2. Consider the sum of the values in each array. Return the array
		 * which has the largest sum. In event of a tie, return a.
		 */
		
		 int[] test = { 1, 2 };
		 int[] test2 = { 3, 4 };
		 biggerTwo(test, test2);

	}// psvm

	public static int[] biggerTwo(int[] a, int[] b) {
		// Get sum of a
		int sumA = a[0];
		int sumA1 = a[1];
		int x = (sumA + sumA1);
		// System.out.println(x);
		// return x;

		// Get sum of b
		int sumB = b[0];
		int sumB1 = b[1];
		int y = (sumB + sumB1);

		/* Compare which is larger sum and return larger sum. If a tie then
		return a. */
		if(x>=y) {
			return a; 
		}else  { 
			
			return b;	
		}//if/else statement close

		
	}// biggerTwo method close

}// class
