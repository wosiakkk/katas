package junior.developer;

public class SumOfDigits {

	/*
	 * In this kata, you must create a digital root function.
	 * 
	 * A digital root is the recursive sum of all the digits in a number. Given n,
	 * take the sum of the digits of n. If that value has more than one digit,
	 * continue reducing in this way until a single-digit number is produced. This
	 * is only applicable to the natural numbers.
	 * 
	 * Here's how it works:
	 * 
	 * digital_root(16) => 1 + 6 => 7
	 * 
	 * digital_root(942) => 9 + 4 + 2 => 15 ... => 1 + 5 => 6
	 */
	
	public static void main(String[] args) {
		
		System.out.println("Numero inserido: 456, resultado esperado 6 pois: 4+5+6=15 - 1+5=6  ");
		System.out.println("Resultado:  " + digital_root(456));
		
	}

	public static int digital_root(int n) {
		char[] digits = String.valueOf(n).toCharArray();
		int sum = 0;
		  
		if(digits.length == 1){
			return Character.getNumericValue(digits[0]);
		}
		for(int i = 0; i < digits.length; i++){
			int intDigit = Character.getNumericValue(digits[i]);
		    sum = sum + intDigit;
		}
		return digital_root(sum);
	 }
}
