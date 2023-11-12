import java.util.Scanner;

public class Register {
    Scanner input = new Scanner(System.in);
    User user ;
    Login login ;
    Register(){
        login = new Login();
        System.out.println("if you want to register using ur bank account press 1 ");
        System.out.println("and if you want to register using ur wallet press 2");
        int n = input.nextInt();
        if (n == 1) {
            user = new BankAccount();
            user.Signup();
            login.login(user);
        }
        else if (n == 2) {
            user = new wallet();
            user.Signup();
            login.login(user);
        }
    }
}
