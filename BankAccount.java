import java.util.Scanner;

public class BankAccount implements User {
    private String number ;
    private String Cardnumber ;
    private String password ;
    double balance ;
    Scanner input = new Scanner(System.in);

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setCardnumber(String cardnumber) {
       this.Cardnumber = cardnumber;
    }

    public String getNumber() {
        return this.number;
    }

    public String getPassword() {
        return this.password;
    }

    public String getCardnumber() {
        return this.Cardnumber;
    }

    @Override
    public double getbalance() {
        return balance;
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
        System.out.println("|    BankAccount   |");
        System.out.println("--------------------");
    }
    @Override
    public String getType() {

        return "BankAccount" ;
    }

    @Override
    public String getPhonenumber() {
        return number;
    }


}
