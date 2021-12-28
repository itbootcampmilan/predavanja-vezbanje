package p28_12_2021;

public class HelperMethods {

	public static void main(String[] args) {
		int[] niz = {1, 2,34,45,65,76,3};
//		print(niz);
		printReverse(niz);
	}
	
	public static void print(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
	}
	
	public static void printReverse(int[] array) {
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i] + ", ");
		}
	}

}
