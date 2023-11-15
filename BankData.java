import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BankData implements Data{
    public List<BankAccount> bankAccountList;
        BankData(){
        bankAccountList = new ArrayList<>();
        BankAccount bankAccount = new BankAccount();
        bankAccount.setCardnumber("1231231231231234");
        bankAccount.setPassword("abdo123abdo");
        bankAccount.setNumber("01113279959");
        bankAccount.setBalance(39900);
        bankAccountList.add(bankAccount);
        bankAccount = new BankAccount();
        bankAccount.setCardnumber("4564564564564567");
        bankAccount.setPassword("abdo872003");
        bankAccount.setNumber("01148645479");
        bankAccount.setBalance(56000);
        bankAccountList.add(bankAccount);
    }


    @Override
    public boolean checkcorrect(User user) {
        for (BankAccount bankAccount : this.bankAccountList){
            if (bankAccount.getCardnumber().equals(user.getCardnumber())){
                if (bankAccount.getPassword().equals(user.getPassword())){
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public double getBalance(String number) {
        for (BankAccount i : this.bankAccountList){
            if (i.getPhonenumber().equals(number)){
                return i.getBalance();
            }
        }
        return 0.0;
    }

    @Override
    public void updateBalance(String num, double balance, char c) {
        if (c == '+'){
            for (BankAccount i : this.bankAccountList){
                if (i.getPhonenumber().equals(num)){
                    i.setBalance(balance + i.getBalance());
                }
            }
        } else if (c == '-') {
            for (BankAccount i : this.bankAccountList){
                if (i.getPhonenumber().equals(num)){
                    i.setBalance(i.getBalance()-balance);

                }
            }
        }

    }


    @Override
    public User get(String number) {
            for (BankAccount i : this.bankAccountList){
                if (i.getPhonenumber().equals(number)){
                    return i;
                }
            }
            return bankAccountList.get(0);
    }
}



