package string;


public class Funcoes {
	public static void main(String[] args) {
		
		String original = "abcde FGHIJ ABC abc DEFG    ";
		
		String s01 = original.toLowerCase();   // deixa tudo minusculo
		String s02 = original.toUpperCase();   // deixa tudo maisculo
		String s03 = original.trim();          // elimina espaços 
		String s04 = original.substring(2);    // montar nova string depois da posicao 2
		String s05 = original.substring(2, 9); // montar nova string depois da posicao 2 ate a 9
		String s06 = original.replace("a", "x");  // troca a por x
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		String s = "potato apple lemon";
		
		String[] vect = s.split(" ");
		String w1 = vect[0];
		String w2 = vect[1];
		String w3 = vect[2];
		
		
		
		
		System.out.println("Original: " + original + "-");
		System.out.println(s01);
		System.out.println(s02);
		System.out.println(s03);
		System.out.println(s04);
		System.out.println(s05);
		System.out.println(s06);
		System.out.println(i);
		System.out.println(j);
		System.out.println(w1);
		System.out.println(w2);
		System.out.println(w3);
		
	}

}
