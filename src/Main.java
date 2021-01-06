import javafx.scene.shape.Path;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        File textFile = new File("file.txt");

        try {
            Scanner scanner = new Scanner(textFile);

            int lineNumber = 1;
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                System.out.println("line " + lineNumber + " :" + line);
                lineNumber++;
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
