package bibliotecas;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LerCharTeclado {

	public static void main(String[] args) {
		
		System.out.println("Digite um �nica tecla: ");
		
		//InputStream: classe que sabe capturar um byte
		//nesse caso, recebendo-o da entrada padr�o do system
		
		//System.in por receber a informa��o do teclado
		
		InputStream is = System.in;
		
		//transformar 0 e 1 em um n�vel mais elevado
		//recebe um byte e o transforma em char
		//InputStreamReader s� sabe ler um caracter por vez
		
		InputStreamReader isr = new InputStreamReader(is);
		
		char c;
		
		try {
			c = (char) isr.read();
			
			System.out.println("Voc� digitou a tecla: " + c);

			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
