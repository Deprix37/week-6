import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class Main {
    public static void main(String[] args) {


        try {
            FileReader file = new FileReader("numbers.txt");
            BufferedReader buffFile = new BufferedReader(file);
            String text;
            int result = 0;
            while ((text = buffFile.readLine()) != null){
                result = result + Integer.parseInt(text);
            }
            System.out.println(result);
            file.close();
            buffFile.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}