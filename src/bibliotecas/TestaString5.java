package bibliotecas;

public class TestaString5 {

	public static void main(String[] args) {
		
		//fun��o isEmpty
		String a = "Java ADS na veia";
		String b = "";
		System.out.println(a.isEmpty());
		System.out.println(b.isEmpty());
		
		// fun��o contains
		System.out.println(a.contains("a"));
		System.out.println(a.contains("j"));
		System.out.println(a.contains("J"));
		
		// fun��o replace
		System.out.println(a.replace("ADS", "Ads"));
		
	}

}
