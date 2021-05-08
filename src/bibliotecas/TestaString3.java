package bibliotecas;

public class TestaString3 {

	public static void main(String[] args) {
		
		String a = "Java ADS na veia";
		System.out.println(a);
		
		char b = a.charAt(4); // zero based
		System.out.println(b); // quarta posição é um espaço em branco
		
		char c = a.charAt(3);
		System.out.println(c);
		
		//char d = a.charAt(30);
		//System.out.println(d); erro, pois o array tem apenas 16 posições - 0 a 15
		
		int i = a.length(); // non zero based
		System.out.println(i);
		
		

	}

}
