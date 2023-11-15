import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WalletData implements Data{
    public List<wallet> walletList = new ArrayList<>();
    WalletData(){
        wallet wallet = new wallet();
        wallet.setPhonenumber("01155594934");
        wallet.setPassword("boda123boda");
        wallet.setBalance(41000);
        walletList.add(wallet);
        wallet = new wallet();
        wallet.setPhonenumber("01116451566");
        wallet.setPassword("ta7yamasr");
        wallet.setBalance(43000);
        walletList.add(wallet);
    }
    @Override
    public boolean checkcorrect(User wallet) {
        for (wallet wallet1 : this.walletList){
            if (wallet1.getPhonenumber().equals(wallet.getPhonenumber())){
                if (wallet1.getPassword().equals(wallet.getPassword())){
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public double getBalance(String number) {
        for (wallet i : this.walletList){
            if (i.getPhonenumber().equals(number)){
                return i.getBalance();
            }
        }
        return 0.0;
    }

    @Override
    public void updateBalance(String num , double balance ,char c) {
        if (c == '+'){
            for (wallet i : this.walletList){
                if (i.getPhonenumber().equals(num)){
                    i.setBalance(balance + i.getBalance());
                }
            }
        } else if (c == '-') {
            for (wallet i : this.walletList){
                if (i.getPhonenumber().equals(num)){
                    i.setBalance(balance - i.getBalance());
                }
            }
        }
    }

    @Override
    public User get(String number) {
        for (wallet i : walletList){
            if (i.getPhonenumber().equals(number)){
                return i;
            }
        }
        return null ;
    }
}
