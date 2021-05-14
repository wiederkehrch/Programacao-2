package bibliotecas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LerStringTeclado {

	public static void main(String[] args) {
		
		System.out.println("Digite uma mensagem: ");
		
		//InputStream: classe que sabe capturar um byte
		//nesse caso, recebendo-o da entrada padrão do system
		
		//System.in por receber a informação do teclado
		
		InputStream is = System.in;
		
		//transformar 0 e 1 em um nível mais elevado
		//recebe um byte e o transforma em char
		//InputStreamReader só sabe ler um caracter por vez
		
		InputStreamReader isr = new InputStreamReader(is);
		
		//br recebe vários char
		//vai armazená-los em um buffer
		//transformando-os em uma String
		
		BufferedReader br = new BufferedReader(isr);
		
		String s;
		
		try {
			
			//readLine só consegue ler uma única linha
			
			s = br.readLine();
			
			System.out.println("Você digitou a mensagem: " + s);

			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
