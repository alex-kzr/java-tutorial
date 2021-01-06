import javafx.scene.shape.Path;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        File textFile = new File("file.txt");

        ArrayList<String> fileStrings = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(textFile, "UTF-8");

            int lineNumber = 1;

            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                fileStrings.add(line);
                System.out.println("line " + lineNumber + " :" + line);
                lineNumber++;
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            PrintWriter printWriter = new PrintWriter("out.txt", "UTF-8");

            for (int i = 0; i < fileStrings.size(); i++) {
                printWriter.append(fileStrings.get(i)+"\n");
                printWriter.flush();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
