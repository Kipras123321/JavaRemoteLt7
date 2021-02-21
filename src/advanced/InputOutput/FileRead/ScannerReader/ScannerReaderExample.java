package advanced.InputOutput.FileRead.ScannerReader;

import advanced.InputOutput.InputOutputUtils;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ScannerReaderExample {

   public static final String DATA_FILE_0LOCATION = "C:\\SDACodingFundamentals\\src\\advanced\\InputOutput\\Data.txt";

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(new File(InputOutputUtils.DATA_FILE_0LOCATION))) {
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }

        } catch (IOException e) {
            System.out.println("Blogas failo formatas arba failas nebuvo rastas");
            System.out.println(e.getMessage());
        }
    }
}
