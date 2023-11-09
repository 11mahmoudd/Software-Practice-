import java.util.Scanner;

public class wallet implements User{
    Client client ;
    OTP otp  ;
    Scanner input = new Scanner(System.in);
    private String walletacc ;
    @Override
    public void Signup() {
        client = new Client() ;
        otp  = new OTP() ;
        System.out.print("enter your wallet account : ");
        this.walletacc = input.nextLine();
        System.out.println();
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
        System.out.println("Wallet");
    }
}
