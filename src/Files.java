import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Files {

    public static String loadFromFile(String fileName){
        String input = "";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String sCurrentLine;

            while ((sCurrentLine = br.readLine()) != null) {
                input += sCurrentLine + "\n";
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return input;
    }
}
