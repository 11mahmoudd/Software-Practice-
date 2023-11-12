import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileHandling implements Files{
    boolean checkuser(String username){
        Client client = new Client();
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("users.txt"));
            String currentLine =reader.readLine();
            List<String> words = new ArrayList<>();
            while(currentLine != null) {
                for (int x = 0 ;x < currentLine.length();x++){
                    if (currentLine.contains(username)){
                        return false;
                    }
                    else if (!currentLine.contains(username)){
                        currentLine = reader.readLine();
                        if (currentLine == null) {
                            return true;
                        }
                    }
                }
                currentLine = reader.readLine();
            }

        }catch (IOException e){
            System.out.println("error");
        }
        return true;
    }
    void Save(instapay instapay, SignUp user){
        try {
            FileWriter file = new FileWriter("users.txt" , true);
            file.write(user.getType() + "|" +instapay.getUsername() + "|" +instapay.getPassword() + "|" + instapay.getNumber() + "\n" );
            file.close();
        }
        catch (IOException e){
            System.out.println("error");
        }
    }



    @Override
    public boolean checkcorrect(String username , String password , String str3) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("users.txt"));
            String currentLine =reader.readLine();
            List<String> words = new ArrayList<>();
            while(currentLine != null) {
                for (int x = 0 ;x < currentLine.length();x++){
                    if (currentLine.contains(username)){
                        if (currentLine.contains(password)){
                            return true;
                        }
                    }
                    else if (!currentLine.contains(username)){
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
