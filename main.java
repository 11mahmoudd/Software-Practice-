import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        instapayData instapaydata = new instapayData();
        System.out.println("if you want to register press 1");
        System.out.println("if you want to login press 2 ") ;
        Scanner input = new Scanner(System.in);
        Data data1 = new BankData();
        Data data2 = new WalletData();

        int choice = input.nextInt();
        if (choice == 1) {
            Register register = new Register(instapaydata,data1,data2);
        }
        else if (choice == 2) {
            System.out.println("if you want to login using BankAccount press 1");
            System.out.println("if you want to login using wallet press 2");

            int choose = input.nextInt();
            if (choose == 1) {
                User bankAccount = new BankAccount();
                Login login = new Login();
                login.login(bankAccount,instapaydata.instapaylist,instapaydata ,data1,data2);
            }
            else if (choose == 2) {
                User wallet = new wallet();
                Login login = new Login();
                login.login(wallet,instapaydata.instapaylist,instapaydata , data1,data2);
            }
        }
    }
    }


