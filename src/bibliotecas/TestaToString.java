package bibliotecas;

public class TestaToString {

	public static void main(String[] args) {
		
		Cliente1 c1 = new Cliente1();
		
		
		//ao utilizar a fun��o toString direto:
		//exibe hash
		//uma impress�o sem formata��o
		
		System.out.println(c1.toString());
		System.out.println(c1);
		
		
		Cliente2 c2 = new Cliente2("Java");
		
		//ao criar a fun��o toString na classe:
		//sobrescreve o toString padr�o
		//impress�o ter� a formata��o desejada
		
		System.out.println(c2.toString());
		System.out.println(c2);

	}

}
