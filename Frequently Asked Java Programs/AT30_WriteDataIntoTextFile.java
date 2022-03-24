//Program 30: How To Write Data Into Text File

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AT30_WriteDataIntoTextFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileWriter fw = new FileWriter("E:\\abc.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("Hello  ");
		bw.write('A');	
		bw.close();
		
		System.out.println("Finished !!!!!!");
	}

}
