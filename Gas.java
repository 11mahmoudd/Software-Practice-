import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gas implements Bills {
    Scanner input = new Scanner(System.in);

    @Override
    public int bills(String num) {

        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("Gas.txt"));
            String currentLine = reader.readLine();
            while (currentLine != null) {

                if (currentLine.contains(num)) {
                    int currentbalance = Integer.parseInt(reader.readLine());
                    return currentbalance;
                }
                currentLine = reader.readLine();
            }
        } catch (IOException e) {
            System.out.println();
        }
        return 0;
    }

    @Override
    public void paybills(String num) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("Gas.txt"));
            String currentLine = reader.readLine();
            List<String> words = new ArrayList<>();
            while (currentLine != null) {
                words.add(currentLine);
                if (currentLine.contains(num)) {
                    words.add("0");
                }
                currentLine = reader.readLine();
            }
            FileWriter file = new FileWriter("Gas.txt");
            PrintWriter file2 = new PrintWriter(file);
            file2.flush();
            for (String i : words) {
                file.write(i + "\n");
            }
            file.close();
        } catch (IOException e) {
            System.out.println("error");
        }
    }
}

