package Examples;

public class ArrayWithForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] areaCodes = { 453, 456, 457, 478, 459, 460 };

		// For Printing Array-will use for loop
		// instead of hardcoding index length-will use areaCodes.length

		System.out.println("Length of an array:" + areaCodes.length);

		for (int i = 0; i < areaCodes.length; i++) {

			// Here instead of printing each areacode with different syso.out
			// we use i-i here refers to index
			System.out.println(areaCodes[i]);

		}

	}

}
