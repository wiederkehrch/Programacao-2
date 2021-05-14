package bibliotecas;

public class TestaToString {

	public static void main(String[] args) {
		
		Cliente1 c1 = new Cliente1();
		
		
		//ao utilizar a função toString direto:
		//exibe hash
		//uma impressão sem formatação
		
		System.out.println(c1.toString());
		System.out.println(c1);
		
		
		Cliente2 c2 = new Cliente2("Java");
		
		//ao criar a função toString na classe:
		//sobrescreve o toString padrão
		//impressão terá a formatação desejada
		
		System.out.println(c2.toString());
		System.out.println(c2);

	}

}
