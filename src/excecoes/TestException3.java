package excecoes;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestException3 {
	
	private static InputStreamReader conn;

//	public static void main(String[] args) {
//		
//		try {
//			
//			//C�digo com v�riasclasses checked
//			
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IllegalAccessException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}finally {
//			conn.close();
//		}

//	}
	
	public static void main(String[] args) throws IOException, IllegalAccessException, FileNotFoundException {
		
		try {
			
			//C�digo com v�riasclasses checked
		} finally {
			conn.close();
		}
	}

}
