package junior.developer;

public class DisemvowelTrolls {

	/*
	 * Trolls are attacking your comment section!
	 * 
	 * A common way to deal with this situation is to remove all of the vowels from
	 * the trolls' comments, neutralizing the threat.
	 * 
	 * Your task is to write a function that takes a string and return a new string
	 * with all vowels removed.
	 * 
	 * For example, the string "This website is for losers LOL!" would become
	 * "Ths wbst s fr lsrs LL!".
	 * 
	 * Note: for this kata y isn't considered a vowel.
	 */
	
	public static void main(String[] args) {
		
		String frase = "Teste de retirada de vogais";
		System.out.println("Frase original: "+ frase);
		System.out.println("Frase após a retirada das vogais: " +disemvowel(frase));
	
	}

	 public static String disemvowel(String str) {
	        String[] vowels = new String[]{"A","a","E","e","I","i","O","o","U","u"};
	        for(int i = 0; i < vowels.length; i++){
	          str = str.replace(vowels[i],"");
	        }
	        return str;
	    }
	
}
