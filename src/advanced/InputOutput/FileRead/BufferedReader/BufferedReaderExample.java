package advanced.InputOutput.FileRead.BufferedReader;

import advanced.InputOutput.InputOutputUtils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {


    public static void main(String[] args) {



        try {
            FileReader fileReader = new FileReader(InputOutputUtils.DATA_FILE_0LOCATION);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;

            do {
                line = bufferedReader.readLine();
                if (line != null)
                System.out.println(line);

            } while (line != null);

            bufferedReader.close();

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
