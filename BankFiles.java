import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BankFiles implements Files{

    @Override
    public boolean checkcorrect(String Cardnumber, String password, String number) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("BankAccount.txt"));
            String currentLine =reader.readLine();
            List<String> words = new ArrayList<>();
            while(currentLine != null) {
                for (int x = 0 ;x < currentLine.length();x++){
                    if (currentLine.contains(Cardnumber)){
                        if (currentLine.contains(password)){
                            if (currentLine.contains(number)){
                                return true;
                            }
                        }
                    }
                    else if (!currentLine.contains(Cardnumber)){
                        currentLine = reader.readLine();
                        if (currentLine == null) {
                            return false;
                        }
                    }
                }
                currentLine = reader.readLine();
            }

        }catch (IOException e){
            System.out.println("error");
        }
        return false ;
    }
}
