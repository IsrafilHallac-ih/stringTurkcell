package stringTurkcell;

public class Main {

	public static void main(String[] args) {
		String word="Merhaba Yazýlým";
		
		System.out.println(word);
		System.out.println(word.concat(word));
		System.out.println(word.charAt(3));
		System.out.println(word.length());
		System.out.println(word.replace("a", "e"));
		System.out.println(word.startsWith("l"));
		System.out.println(word.substring(3));
		System.out.println(word.toLowerCase());
		System.out.println(word.toUpperCase());
		System.out.println(word.trim());
		System.out.println(word.codePointBefore(2));

	}

}
