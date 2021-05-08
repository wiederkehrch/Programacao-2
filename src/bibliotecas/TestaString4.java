package bibliotecas;

public class TestaString4 {

	public static void main(String[] args) {
		
		// função substring
		String a = "isolante";
		System.out.println(a.substring(1, 4));
		
		// função trim
		String b = "   Java ADS na veia   ";
		System.out.println(b);
		System.out.println(b.trim());
		
		// função indexOf
		String c = "Java ADS na veia";
		System.out.println(c.indexOf("S"));
		System.out.println(c.indexOf("v", 3));
		System.out.println(c.indexOf("na"));
		System.out.println(c.indexOf("ADS", 0));
		
		// função lastIndexOf
		System.out.println(c.lastIndexOf("v"));
		System.out.println(c.lastIndexOf("v", 11));
		

	}

}
