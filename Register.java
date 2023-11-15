import java.util.Scanner;

public class Register {
    Scanner input = new Scanner(System.in);
    SignUp signUp ;
    Register(instapayData instapaydata,Data data1 , Data data2){
        System.out.println("if you want to register using ur bank account press 1 ");
        System.out.println("and if you want to register using ur wallet press 2");
        int n = input.nextInt();
        if (n == 1) {
            signUp = new BankAccountSignUp();
            signUp.Signup(instapaydata,data1,data2);
        }
        else if (n == 2) {

            signUp = new WalletSignUp();
            signUp.Signup(instapaydata,data1,data2);
        }
    }
}
