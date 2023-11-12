import java.util.Scanner;

public class Login {
    Client client ;
    Display display ;
    Scanner input = new Scanner(System.in);
    void login(User user){
        display = new Display();
        System.out.print("enter your instapay username :");
        String username = input.nextLine();
        System.out.println();
        System.out.print("enter your instapay password :");
        String password = input.nextLine();
        System.out.println();
        if (checkCorrect(username , password)) {
        }
        display.display(user);
    }
    boolean checkCorrect(String username , String password) {
        return false;
    }
}
