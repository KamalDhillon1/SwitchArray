package Examples;

import java.util.Scanner;

public class PopulateAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Taking example for food
		// Populate(adding value in array)
		// Creating array to store 4 food names
		String[] food = new String[4];
     //Reading value from console and then storing it at index(i)
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < food.length; i++) {
			System.out.println("Enter food name");
			food[i] = sc.next();
		}
		// printing food array
		for (int i = 0; i < food.length; i++) {
			System.out.println(food[i]);
		}
	}

}
