import java.io.*;
/**
 * 
 */

/**
 * @author Jonathan Meredith
 *
 */
public class automate {
	public static void main(String[] args) throws IOException{
		String x;
		long min = 0;
	//	long max = 987654321;
	  long max = 9223372036854775807l;
		String filename;
	    filename = "C:\\Users\\Jonathan Meredith\\Desktop\\numbers.txt";
	    PrintWriter outputFile = new PrintWriter(filename);
	    while (min<max) {
	    x = collatz(min);
	    outputFile.println(x);
	    min = min + 1;
		}
	    outputFile.close();
	}
	private static String collatz(long n){
		String d;
		int hops;
		hops = 0;
		long s;
		s = n;
		while (n>1) {
			hops = hops + 1;
			if((n%2)==0) {
	            n=n/2;
		}else {
				 n=(3*n)+1;
	        }
		}
		d = ("The number " + s + " has " + hops + " hops.");
		System.out.println("The number " + s + " has " + hops + " hops.");
		//System.out.println("");
		return d;
	}
}