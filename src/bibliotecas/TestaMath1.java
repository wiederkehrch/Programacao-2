package bibliotecas;

public class TestaMath1 {

	public static void main(String[] args) {
		
		int i = -10;
		System.out.println(i);
		
		int j = Math.abs(i);
		System.out.println(j);
		
		//ou
		
		System.out.println(Math.abs(i));
		
		double d1 = 4.15;
		System.out.println(d1);
		
		//Mostrar até o primeiro número menos significativo
		double d2 = 4.000;
		System.out.println(d2);
		
		double d3 = 4.0001;
		System.out.println(d3);
		
		double d4 = Math.round(d1);
		System.out.println(d4);
		
		//Verificar maior número
		
		double d5 = 4.499999999;
		double d6 = Math.round(d5);
		double d7 = Math.max(d5 , d6);
		System.out.println(d5);
		System.out.println(d6);
		System.out.println(d7);
		
		//Verificar maior número
		
		double d8 = Math.min(d5 , d6);
		System.out.println(d8);
		
		//Funções ceil e floor
		
		System.out.println(Math.ceil(d5));
		double d9 = 4.999999999999;
		System.out.println(Math.floor(d9));

	}

}
