package exceptionprictice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {

        String path = "/Users/arslannurlyyev/IdeaProjects/MindtekJavaDevProject/src/main/java/exceptionprictice/data.txt";
        FileReader fileReader =null;
        try {
            fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;

            while((line = bufferedReader.readLine())!= null){
                System.out.println(line);
            }
            bufferedReader.close();

        }catch (FileNotFoundException exception){
            System.out.println("Invalid file path");
        }catch (IOException ioException){
            System.out.println("Error reading file");
        }finally {
            try {
                fileReader.close();
            }catch (IOException exception){
                System.out.println("Failed to close the file");
            }
        }



    }
}