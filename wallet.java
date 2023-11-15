import java.util.Scanner;

public class wallet implements User{
   private String phonenumber ;
    private String password;
    double balance ;
    Scanner input = new Scanner(System.in);

    public String getPassword() {
        return password;
    }

    @Override
    public String getCardnumber() {
        return null;
    }

    @Override
    public double getbalance() {
        return balance;
    }


    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public void type() {
        System.out.println("--------------------");
        System.out.println("|    E- Wallet     |");
        System.out.println("--------------------");
    }
    @Override
    public String getType() {
        return "E-Wallet";
    }
}
