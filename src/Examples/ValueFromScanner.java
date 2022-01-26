package Examples;

import java.util.Scanner;

public class ValueFromScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Taking value from Scanner
		// Taking example of cities
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of cities");
		int i = sc.nextInt();
		String[] citiename = new String[i];
		for (i = 0; i < citiename.length; i++) {
			System.out.println("Enter the " + i + "citiename");
			citiename[i] = sc.next();
		}
		for (i = 0; i < citiename.length; i++) {
			System.out.println(citiename[i]);
		}

	}

}
