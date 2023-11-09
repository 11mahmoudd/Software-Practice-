import java.util.Scanner;

public class BankAccount implements User {
    Client client ;
    OTP otp ;
    private String account ;
    Scanner input = new Scanner(System.in);
    @Override
    public void Signup() {
        client = new Client() ;
        otp  = new OTP() ;
        System.out.print("enter your bank account : ");
        this.account = input.nextLine();
        System.out.print("enter your phone number : ");
        client.setNumber(input.nextLine());
        System.out.println();
        boolean check = otp.sendOtp();
        if (check) {
            while (true) {
                System.out.print("enter username : ");
                String username = input.nextLine();
                if (client.checkUser(username)){
                    client.setUserName(input.nextLine());
                    System.out.println();
                    System.out.print("please enter complex password : ");
                    client.setPassword(input.nextLine());
                    System.out.println();
                    client.Save();
                    break;
                }
                else {
                    System.out.println("this username has been taken ");
                }
            }
        }

    }

    @Override
    public void type() {
        System.out.println("BankAccount");
    }
}
