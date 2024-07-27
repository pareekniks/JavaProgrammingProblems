package CodingProblems;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) {
		
		try {
			FileWriter fw =new FileWriter("/Users/niks/Desktop/selenium.txt");
			fw.write("Selenium with java");
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
