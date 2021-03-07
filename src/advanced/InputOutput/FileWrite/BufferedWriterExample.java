package advanced.InputOutput.FileWrite;

import advanced.InputOutput.InputOutputUtils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {

    public static void main(String[] args) {

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(InputOutputUtils.RESULT_FILE_LOCATION))){
            String text = "Labababa \n siandien sekmadienis ir viskas ok ssdsdds";
            bufferedWriter.write(text);

        } catch (IOException exception) {
            System.out.println("Blogai");
            System.out.println(exception.getMessage());

        }
    }
}
