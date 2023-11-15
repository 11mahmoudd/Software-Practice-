import java.util.List;
import java.util.Scanner;

public class Display {
    Scanner input = new Scanner(System.in);
    Transfer transfer ;
    BillsData billsData ;
    OTP otp  ;
void display(User user ,instapayData fileHandling , Data Data1 , Data Data2) {
    user.type();
    System.out.println();
    option(user,fileHandling, Data1  , Data2 );
}
void option(User user , instapayData fileHandling ,Data Data1  , Data Data2 ){
    otp = new OTP();
    while (true){
        System.out.println("1- Transfer to wallet using the mobile number ");
        System.out.println("2- Transfer to Another instapay account ");
        System.out.println("3- Inquire about his balance ");
        System.out.println("4- Pay bills ");
        System.out.println("5- to exit");
        int choice = input.nextInt();
        if (choice == 1) {
            transfer = new walletTransfer();
            transfer.transfer(user,user,Data1  , Data2 ,false);
        }
        else if (choice == 2) {
            instapayTransfer instapayTransfer = new instapayTransfer();
            instapayTransfer.transfer(user , fileHandling , Data1  , Data2 );
        }
        else if (choice == 3) {
            System.out.println(user.getbalance());
        }
        else if (choice == 4) {
            billsData = new BillsData();
            while (true){
                billsData.print(user.getPhonenumber());
                System.out.println("if you want to pay Water bills press 1");
                System.out.println("if you want to pay Gas bills press 2");
                System.out.println("if you want to pay Electric bills press 3");
                System.out.println("if you want exit press 4");
                int choose = input.nextInt();
                if (choose == 1) {
                    otp.sendOtp();
                    PayBills payBills = new Water() ;
                    payBills.paybills(user.getPhonenumber(),billsData,user,Data1,Data2);
                }
                else if (choose == 2 ){
                    otp.sendOtp();
                    PayBills payBills = new Gas() ;
                    payBills.paybills(user.getPhonenumber(),billsData,user,Data1,Data2);
                }
                else if (choose == 3 ){
                    otp.sendOtp();
                    PayBills payBills = new electric() ;
                    payBills.paybills(user.getPhonenumber(),billsData,user,Data1,Data2);
                }
                else if (choose == 4) {
                    break;
                }
            }

        }
        else if (choice == 5) {
            System.out.println("thank you for using our app ");
            break;
        }
    }
}
}
