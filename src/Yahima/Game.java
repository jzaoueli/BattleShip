package Yahima;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Game {
	
	String playField[][] = new String[7][7];
	
	public Game(String[][] playField){
		
		for(int i = 0; i < 7; i++){
			for(int j = 0; j < 7; j++){
				this.playField[i][j] = playField[i][j];
			}
		}
	}
	
	public static void play(Game game) throws IOException{
		
		String input = "";
		int hits = 0;
		int rounds = 0;
		
		InputStreamReader isr = new InputStreamReader(System.in);
	    BufferedReader br = new BufferedReader(isr);
		
		while(hits < 14){
			System.out.println("Gib Deine Schusskoordinaten in Form <Spalte><Zeile> ein:");
			input = br.readLine();

		    if(game.playField[input.charAt(0) - 'a'][input.charAt(1) - '1'] == "1"){
		    	System.out.println("Treffer!");
		    	hits++;
		    }
		    else{
		    	System.out.println("Kein Treffer.");
		    }
		    rounds++;
		}
		System.out.println("Du hast das Spiel nach Abgabe von " + rounds + " Sch�ssen gewonnen!");
	}
}
