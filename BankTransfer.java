import java.util.Scanner;

public class BankTransfer implements Transfer{
    OTP otp ;
    Scanner input = new Scanner(System.in);


    @Override
    public void transfer(String number , Files files) {
        otp = new OTP();
        while (true){
            System.out.print("please enter the phone number that you want to transfer to it :");
            String number2 = input.nextLine();
            System.out.println();
            if (files.checknumber(number2)){
                while (true){
                    System.out.print("please enter the amount of money that you want to transfer :");
                    int wantedbalance = input.nextInt();
                    int balance = files.getBalance(number);
                    if (balance > wantedbalance){
                        System.out.println("if u want to continue transfer ");
                        while (true){
                            boolean check = otp.sendOtp();
                            if (check){
                                files.subtractBalance(number,wantedbalance);
                                files.updateBalance(number2 , wantedbalance);
                                System.out.println("transferred successfully");
                                break;
                            }
                        }
                        break;
                    }
                    else if (balance == wantedbalance) {
                        System.out.println("if you want to transfer all ur balance");
                        while (true){
                            boolean check = otp.sendOtp();
                            if (check){
                                files.updateBalance(number2 , wantedbalance);
                                System.out.println("transferred successfully");
                                break;
                            }
                        }
                        break;
                    }
                    else {
                        System.out.println("u don't have enough money to transfer that money");
                    }
                }
                break;
            }
        }
    }
}
