package Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsExample {

    public void readFile(String filename) throws FileNotFoundException, IOException{

        FileReader read = new FileReader(filename);
        read.close();

    }

    public static void main(String[] args){
        ThrowsExample th = new ThrowsExample();

        try{
            th.readFile("nonesistent.txt");
        }catch(FileNotFoundException e){
            System.err.println("File not found "+e.getMessage());
        }
        catch(IOException e){
            System.err.println("IOError "+e.getMessage());
        }

    }



}
