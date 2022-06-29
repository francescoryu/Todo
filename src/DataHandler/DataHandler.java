package DataHandler;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DataHandler {


    public static void writeFile(String input) {
        try {
            FileWriter myWriter = new FileWriter("C:\\Users\\Francesco Ryu\\Desktop\\Todo\\src\\data.txt");
        myWriter.write(input);
            myWriter.close();
        } catch (IOException e) {
            System.out.println("ERROR");
            e.printStackTrace();
        }
    }
}
