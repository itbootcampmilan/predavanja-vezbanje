package p28_12_2021;

public class Zadatak1 {

	public static void main(String[] args) {
		int[] niz = {1, 2,34,45,65,76,3};
		print(niz);
	}
	
	public static void print(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
	}

}
