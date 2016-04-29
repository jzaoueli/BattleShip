package yahima;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ControllerCodegenerator {
	
	public static String[][] createPlayField() throws IOException{

		String s = readFile();
		String[][] newPlayField = Array.createArray(s);

		return newPlayField;
	}
	
	public static String readFile() throws IOException{
		
		String read = "";
		String output = "";
	    FileReader fr = null;
	    
		fr = new FileReader("src/model.txt");
		BufferedReader br = new BufferedReader(fr);
		
		read = br.readLine();
	    while( read != null )
	    {
	    	output += read;
	    	read = br.readLine(); 
	    }
	    
		br.close();
		return output;
	}
	
	public static void main(String[] args) throws IOException {
		
		Game game = new Game(createPlayField());
		Game.play(game);
	}
}