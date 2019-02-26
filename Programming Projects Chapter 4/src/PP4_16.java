import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PP4_16 {
    public static void main(String [] args) {
        String fileName = "C:\\Users\\Willi\\Documents\\IntelligProjects\\Programming Projects Chapter 4\\src\\PP4_16.txt";

        String line = null;

        try{
            FileReader fileReader = new FileReader(fileName);

            BufferedReader bufferedReader = new BufferedReader( fileReader );
            while((line = bufferedReader.readLine()) != null)
            {
                System.out.println(line);
            }
            bufferedReader.close();
        }
        catch (FileNotFoundException ex){
            System.out.println( "Unable to open file '" +fileName + "'");
        }
        catch (IOException ex){
            System.out.println("Error reading file '"+ fileName + "'");
        }
    }
}

/*
* Design and implement a program that counts the number of in-
* teger values in a text input file. Produce a table listing the values
* you identify as integers from the input file
*/