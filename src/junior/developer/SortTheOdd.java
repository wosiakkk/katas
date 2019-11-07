package junior.developer;

public class SortTheOdd {
	
	/*
	 * You have an array of numbers. Your task is to sort ascending odd numbers but
	 * even numbers must be on their places.
	 * 
	 * Zero isn't an odd number and you don't need to move it. If you have an empty
	 * array, you need to return it.
	 * 
	 * Example
	 * 
	 * sortArray([5, 3, 2, 8, 1, 4]) == [1, 3, 2, 8, 5, 4]
	 */	
	
	public static void main(String[] args) {
		System.out.println("Vetor inserido: [5, 3, 2, 8, 1, 4]");
		int[] entrada = {5,3,2,8,1,4};
		System.out.println("Saida:");
		int[]saida = sortArray(entrada);
		for(int i = 0; i < saida.length; i++) {
			System.out.println(saida[i] + " - ");
		}
	}

	public static int[] sortArray(int[] array) {
	    int aux;
		if(array.length == 0) {
			return array;
		}else {
			for(int i = 0; i < array.length; i++) {
				for(int b = 0; b< array.length; b++) {
					if(array[i] < array[b]) {
						if(isOdd(array[i]) && isOdd(array[b])) {
							System.out.println("vai trocar "+ array[i]+ " por "+ array[b]);
							aux = array[i];
							array[i] = array[b];
							array[b] = aux;
						}
					}
				}
			}
			return array;
		}
	  }
	
	public static boolean isOdd(int num) {
		if((num % 2)== 0) {
			return false;
		}else {
			return true;
		}
	}
	
}
