package Yahima;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Codegenerator {
	
	public static void main(String[] args) throws IOException {
		createFile();
	}
	
	public static void createFile() throws IOException{
		
	    FileWriter fw = new FileWriter("src/Yahima.Array.java");
	    BufferedWriter bw = new BufferedWriter(fw);

	    bw.write( "public class Yahima.Array {\n"
	    		+ "static String[][] createArray(String s){\n"
	    		+ "String[][] playField = new String[7][7];\n"
	    		+ "int index = 0;\n"
	    		+ "for(int i = 0; i < 7; i++){\n"
	    		+ "for(int j = 0; j < 7; j++){\n"
	    		+ "if(s.charAt(index)== '1'){\n"
	    		+ "playField[i][j] = \"1\";\n"
	    		+ "}\n"
	    		+ "index++;\n"
	    		+ "}\n"
	    		+ "}\n"
	    		+ "return playField;\n"
	    		+ "}\n"
	    		+ "}");

	    bw.close();
	}

}
