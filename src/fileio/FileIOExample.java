package fileio;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FileIOExample {
    public static final String ROOT_PATH = "C:\\Users\\82103\\Desktop\\develop";

    public static void main(String[] args) {
        File file = new File(ROOT_PATH + "/test");
        if(!file.exists()) file.mkdir();

        File file1 = new File(ROOT_PATH + "/test/food.txt");
        try{
            if(!file1.exists())file1.createNewFile();
        }catch (Exception e){
            e.printStackTrace();
        }
        Scanner scanner = new Scanner(System.in);
        try(FileWriter fileWriter = new FileWriter(ROOT_PATH + "/test/food.txt")){
            String s =scanner.nextLine();
            fileWriter.write(s);
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
