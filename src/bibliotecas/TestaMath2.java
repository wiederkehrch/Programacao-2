package bibliotecas;

public class TestaMath2 {

	public static void main(String[] args) {
		
	   // função exp
	      double a = 0.25;
	      System.out.println(Math.exp(a));
	      
	   // função log
	      double b = 123.25;
	      System.out.println(Math.log(b));
	      
	   // função pow
	      double c = 10.0;
	      double d = 2.0;
	      System.out.println(Math.pow(c, d));
	      
	   // função pow
	      double e = 100.0;
	      System.out.println(Math.sqrt(e));
	      
	   // para calcular log de a na base b
	     double f = 6;
	     double g = 8; // base
	     System.out.println(Math.log(f) / Math.log(g)); //utilizando a mudança de base


	}

}
