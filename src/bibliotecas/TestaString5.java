package bibliotecas;

public class TestaString5 {

	public static void main(String[] args) {
		
		//função isEmpty
		String a = "Java ADS na veia";
		String b = "";
		System.out.println(a.isEmpty());
		System.out.println(b.isEmpty());
		
		// função contains
		System.out.println(a.contains("a"));
		System.out.println(a.contains("j"));
		System.out.println(a.contains("J"));
		
		// função replace
		System.out.println(a.replace("ADS", "Ads"));
		
	}

}
