package Yahima;

public class Array {
static String[][] createArray(String s){
String[][] playField = new String[7][7];
int index = 0;
for(int i = 0; i < 7; i++){
for(int j = 0; j < 7; j++){
if(s.charAt(index)== '1'){
playField[i][j] = "1";
}
index++;
}
}
return playField;
}
}