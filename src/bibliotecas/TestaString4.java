package bibliotecas;

public class TestaString4 {

	public static void main(String[] args) {
		
		// fun��o substring
		String a = "isolante";
		System.out.println(a.substring(1, 4));
		
		// fun��o trim
		String b = "   Java ADS na veia   ";
		System.out.println(b);
		System.out.println(b.trim());
		
		// fun��o indexOf
		String c = "Java ADS na veia";
		System.out.println(c.indexOf("S"));
		System.out.println(c.indexOf("v", 3));
		System.out.println(c.indexOf("na"));
		System.out.println(c.indexOf("ADS", 0));
		
		// fun��o lastIndexOf
		System.out.println(c.lastIndexOf("v"));
		System.out.println(c.lastIndexOf("v", 11));
		

	}

}
