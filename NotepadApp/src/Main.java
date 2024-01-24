import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Notepad Uygulamasına Hoş Geldiniz!");
        try {

            FileReader fReader = new FileReader("notlar.txt");
            BufferedReader buffRead = new BufferedReader(fReader);
            String okunanMetin = buffRead.readLine();
            buffRead.close();
            fReader.close();
            if (okunanMetin==null){
                System.out.println("Notepad boş");
            }else {
                System.out.println("En son kaydedilen metin: " + okunanMetin);
            }

            Scanner scanner = new Scanner(System.in);
            System.out.println("Bir metin girin: ");
            String metin = scanner.nextLine();


            FileWriter fWriter = new FileWriter("notlar.txt");
            PrintWriter pWriter = new PrintWriter(fWriter);
            pWriter.println(metin);
            pWriter.close();
            fWriter.close();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}