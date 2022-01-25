package Examples;

public class ArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1st way of declaring array
		String[] food = { "mexican", "italian", "indian", "american" };
		// Access value
		System.out.println(food[2]);
		System.out.println(food[3]);
		// 2nd way of declaring array
		String[] food1 = new String[4];
		// Put value in array
		// If we choose any no.(index) within the length of index,
		// it will not give us error and our result will print as null.
		food1[0] = "chinese";
		food1[1] = "japanese";
		food1[3] = "Turkish";
		System.out.println(food1[3]);

	}

}
