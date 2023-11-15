import java.util.Scanner;

public class walletTransfer implements Transfer{
    OTP otp ;
    Scanner input = new Scanner(System.in);

    @Override
    public void transfer(User user ,User user1,  Data files , Data files2 , boolean c) {
        otp = new OTP();
        String number2 = "";
        if (c){
            number2 = user1.getPhonenumber();
        }
        else {
            System.out.print("please enter the wallet number that you want to transfer to it :");
            number2 = input.nextLine();
        }
        while (true){
            if (user.getType().equals("BankAccount")){
                System.out.println();
                if (files.checkcorrect(user)){
                    while (true){
                        System.out.print("please enter the amount of money that you want to transfer :");
                        int wantedbalance = input.nextInt();
                        double balance = files.getBalance(user.getPhonenumber());
                        if (balance > wantedbalance){
                            System.out.println("if u want to continue transfer ");
                            while (true){
                                boolean check = otp.sendOtp();
                                if (check){
                                    files.updateBalance(user.getPhonenumber(),wantedbalance,'-');
                                    files2.updateBalance(number2 , wantedbalance,'+');
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
                                    files.updateBalance(user.getPhonenumber(),wantedbalance,'-');
                                    files2.updateBalance(number2 , wantedbalance,'+');
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
            else {
                System.out.println();
                if (files2.checkcorrect(user)) {
                    while (true) {
                        System.out.print("please enter the amount of money that you want to transfer :");
                        int wantedbalance = input.nextInt();
                        double balance = files2.getBalance(user.getPhonenumber());
                        if (balance > wantedbalance) {
                            System.out.println("if u want to continue transfer ");
                            while (true) {
                                boolean check = otp.sendOtp();
                                if (check) {
                                    files2.updateBalance(user.getPhonenumber(), wantedbalance, '-');
                                    files2.updateBalance(number2, wantedbalance, '+');
                                    System.out.println("transferred successfully");
                                    break;
                                }
                            }
                            break;
                        } else if (balance == wantedbalance) {
                            System.out.println("if you want to transfer all ur balance");
                            while (true) {
                                boolean check = otp.sendOtp();
                                if (check) {
                                    files2.updateBalance(user.getPhonenumber(), wantedbalance, '-');
                                    files2.updateBalance(number2, wantedbalance, '+');
                                    System.out.println("transferred successfully");
                                    break;
                                }
                            }
                            break;
                        } else {
                            System.out.println("u don't have enough money to transfer that money");
                        }
                    }
                    break;
                }
            }

        }
    }
}
