package k.generator;

import java.io.*;

public class CodeGenerator {
    public static void main(String[] args) throws IOException {

        String generatedStr =
                "package k.base;\n\n" +
                        "public class Field {\n" +
                        "private static String[][] field = new String[][]{\n";


        try (BufferedReader br = new BufferedReader(new FileReader("src/k/model.txt"))) {
            String line;
            String generatedLine;
            for (int i = 0; i < 7; i++) {
                line = br.readLine();
                generatedLine = "{";
                for (int j = 0; j < 7; j++) {
                    generatedLine = generatedLine + "\"" + line.charAt(j) + "\",";
                }
                generatedLine = generatedLine.substring(0, generatedLine.length() - 1) + "},\n";

                generatedStr = generatedStr + generatedLine;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        generatedStr = generatedStr.substring(0, generatedStr.length() - 2) + "\n};\n"
                + "public static String[][] getField(){\n"
                + "return field;\n"
                + "}\n}";

        File file = new File("src/k/generated/Field.java");
        file.createNewFile();
        FileWriter writer = new FileWriter(file);
        writer.write(generatedStr);
        writer.flush();
        writer.close();
    }
}
