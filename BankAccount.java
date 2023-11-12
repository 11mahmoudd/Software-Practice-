import java.util.Scanner;

public class BankAccount {
    OTP otp ;
    instapay instapay ;
    private String number ;
    private String Cardnumber ;
    private String password ;
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
        return number;
    }

    public String getPassword() {
        return password;
    }

    public String getCardnumber() {
        return Cardnumber;
    }
}
