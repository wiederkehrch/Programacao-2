package bibliotecas;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LerArquivo {

	public static void main(String[] args) {
		
				
		try {

			//não receberá mais a entrada por teclado
			InputStream is = new FileInputStream("teste2.txt");
					
			InputStreamReader isr = new InputStreamReader(is);
			
		
			BufferedReader br = new BufferedReader(isr);
			
			String s;
			
			s = br.readLine();
			
			
				while (s != null) {
					
					System.out.println(s);
					s = br.readLine();
				}
				
			br.close();
			isr.close();
			is.close();

			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
