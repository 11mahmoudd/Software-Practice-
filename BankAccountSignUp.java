import java.util.Scanner;

public class BankAccountSignUp implements SignUp{
    OTP otp ;
    instapaySignup instapay ;
    BankAccount bankAccount ;
    Scanner input = new Scanner(System.in);
    @Override
    public void Signup() {
        otp  = new OTP() ;
        Files files = new BankFiles();
        instapay= new instapaySignup();
        bankAccount = new BankAccount();
        while (true){
            System.out.print("enter your Card number : ");
            String num = input.nextLine();
            if (num.length() == 16) {
                bankAccount.setCardnumber(num);
                System.out.println();
                System.out.print("enter your password : ");
                bankAccount.setPassword( input.nextLine());
                System.out.println();
                System.out.print("enter your phone number : ");
                bankAccount.setNumber( input.nextLine());
                System.out.println();
                boolean check2 =  files.checkcorrect(bankAccount.getCardnumber() , bankAccount.getPassword(), bankAccount.getNumber());
                if (check2) {
                    while (true){
                        boolean check = otp.sendOtp();
                        if (check) {
                            instapay.signup(this,bankAccount.getNumber());
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
            else {
                System.out.println("the Card number should be 16 digits");
            }
        }

    }

    @Override
    public void type() {

        System.out.println("--------------------");
        System.out.println("|    BankAccount   |");
        System.out.println("--------------------");
    }

    @Override
    public String getType() {

        return "BankAccount" ;
    }
}
