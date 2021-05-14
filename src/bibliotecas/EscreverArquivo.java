package bibliotecas;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class EscreverArquivo {

	public static void main(String[] args) {
		
				
		try {

			
			OutputStream os = new FileOutputStream("teste3.txt");
					
			OutputStreamWriter osw = new OutputStreamWriter(os);
			
		
			BufferedWriter bw = new BufferedWriter(osw);
			
			bw.write("A turma ADS ama Java");
			
			bw.close();
			osw.close();
			os.close();
			
			System.out.println("Escrita realizada com sucesso");
				

			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
