import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gas implements PayBills{
    Scanner input = new Scanner(System.in);

    @Override
    public double bills(String num , BillsData billsData) {

        return billsData.get(num , this);
    }

    @Override
    public void paybills(String num , BillsData billsData,User user, Data Data1, Data Data2) {
        if (user.getType().equals("BankAccount")){
            Data1.updateBalance(num , bills(num , billsData) , '-');
            billsData.update(num , this);
        }
        else if (user.getType().equals("E-Wallet")){
            Data1.updateBalance(num , bills(num , billsData) , '-');
            billsData.update(num , this);
        }
    }

    @Override
    public String type() {
        return "Gas";
    }
}

