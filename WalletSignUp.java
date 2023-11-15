import java.util.Scanner;

public class WalletSignUp implements SignUp {
    OTP otp  ;
    wallet wallet ;
    User user ;
    instapaySignup instapay ;
    Scanner input = new Scanner(System.in);
    @Override
    public void Signup(instapayData instapaydata, Data files, Data files2) {
        otp  = new OTP() ;
        wallet = new wallet();
        instapay = new instapaySignup();
        user = new wallet();
        while (true){
            System.out.print("enter your wallet phone number : ");
            wallet.setPhonenumber( input.nextLine());
            System.out.println();
            System.out.print("enter your password : ");
            wallet.setPassword( input.nextLine());
            System.out.println();
            boolean check2 = files.checkcorrect(wallet);
            if (check2) {
                while (true){
                    boolean check = otp.sendOtp();
                    if (check) {
                        instapay.signup(user ,wallet.getPhonenumber(),instapaydata,files ,files2);
                        break;
                    }
                    else {
                        System.out.println("wrong verification");
                    }
                }
                break;
            }
            else {
                System.out.println("wrong info has submitted please try again ");
            }
        }
    }



}
