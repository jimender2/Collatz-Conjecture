import java.util.Scanner;

/**
 * 
 */

/**
 * @author Jonathan Meredith
 *
 */
public class Collatz {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hops;
		hops = 0;
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a number: ");
		long n = reader.nextLong();
		reader.close();
		while (n>1) {
			hops = hops + 1;
			System.out.print(n + " ");
			if((n%2)==0) {
	            n=n/2;
		}else {
				 n=(3*n)+1;
	        }
		}
		System.out.println(hops + " hops");
	}

}