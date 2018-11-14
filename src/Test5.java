import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test5 {
	public static void main(String[] ags) throws IOException{
		
		/*FileInputStream in = null;
		FileOutputStream out = null;*/
		
		FileReader inputStream = null;
		FileWriter outputStream = null;
		
		
		try {
		    /*in = new FileInputStream("input.txt");
			out = new FileOutputStream("ouput.txt");*/
			inputStream = new FileReader("input.txt");
			outputStream = new FileWriter("ouput.txt");
			int c;
			
			while((c = inputStream.read()) != -1) {
				outputStream.write(c);
			}
		}finally {
			if(inputStream != null) {
				inputStream.close();
			}
			if(outputStream != null) {
				outputStream.close();
			}
		}
	}
}
