package advanced.InputOutput.FileRead.BufferedReader;

import advanced.InputOutput.InputOutputUtils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample2OutoClose {


    public static void main(String[] args) {



        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(InputOutputUtils.DATA_FILE_0LOCATION))){


            String line = bufferedReader.readLine();

           while ( line != null) {
               System.out.println(line);
               line = bufferedReader.readLine();
           }

            // System.out.println(bufferedReader.readLine());

        }   catch (FileNotFoundException ex) {
            System.out.println("Nerastas failas: " + InputOutputUtils.DATA_FILE_0LOCATION);
            System.out.println(ex.getMessage());
        }   catch (IOException ex) {
            System.out.println("Blogas failo formatas");
            System.out.println(ex.getMessage());

        }



    }
}
