import java.io.IOException;

public class Controller {
	
	public static String[][] createPlayField(){
		
		String[][] newPlayField = new String[7][7];
		
		String[] ship02 = new String[]{"a2", "a3"};
		String[] ship03 = new String[]{"c1", "d1", "e1"};
		String[] ship04 = new String[]{"d4", "d5", "d6", "d7"};
		String[] ship05 = new String[]{"c2", "d2", "e2", "f2", "g2"};
		
		for(int i = 0; i < 2; i++){
			newPlayField[ship02[i].charAt(0) - 'a'][ship02[i].charAt(1) - '1'] = "1";
		}

		for(int i = 0; i < 3; i++){
			newPlayField[ship03[i].charAt(0) - 'a'][ship03[i].charAt(1) - '1'] = "1";
		}

		for(int i = 0; i < 4; i++){
			newPlayField[ship04[i].charAt(0) - 'a'][ship04[i].charAt(1) - '1'] = "1";
		}

		for(int i = 0; i < 5; i++){
			newPlayField[ship05[i].charAt(0) - 'a'][ship05[i].charAt(1) - '1'] = "1";
		}
		
		return newPlayField;
	}
	
	public static void main(String[] args) throws IOException {
		
		Game game = new Game(createPlayField());
		Game.play(game);
	}
}
