import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EwalletFiles implements Files{
    @Override
    public boolean checkcorrect(String phone, String password , String str3) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("Ewallet.txt"));
            String currentLine =reader.readLine();
            List<String> words = new ArrayList<>();
            while(currentLine != null) {
                for (int x = 0 ;x < currentLine.length();x++){
                    if (currentLine.contains(phone)){
                        if (currentLine.contains(password)){
                                return true;
                        }
                    }
                    else if (!currentLine.contains(phone)){
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
