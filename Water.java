import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Water implements PayBills{
    @Override
    public double bills(String num , BillsData billsData){
        return billsData.get(num , this);
    }

    @Override
    public void paybills(String num , BillsData billsData,User user,Data Data1, Data Data2) {
        if (user.getType().equals("BankAccount")){
            Data1.updateBalance(num , bills(num , billsData) , '-');
            billsData.update(num , this);
        }
        else if (user.getType().equals("E-Wallet")){
            Data2.updateBalance(num , bills(num , billsData) , '-');
            billsData.update(num , this);
        }
    }

    @Override
    public String type() {
        return "Water";
    }


}
