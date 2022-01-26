package Examples;

public class FindElementTwice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// If Pizza is given twice or more than that in foodlist
		String[] foodList = { "Nachos", "Pizza", "Pasta", "Burger", "Pizza" };
		int counter = 0;

		for (int i = 0; i < foodList.length; i++) {
			if (foodList[i].equals("Pizza")) {
				counter++;
		}
		}
			System.out.println("Pizza is found " + counter + "times");
		
	}

}
