import java.util.Scanner;

public class instapaySignup {
    Scanner input = new Scanner(System.in);
   Client instapay;
    public void signup(User user,String number , instapayData instapayData , Data files , Data files2) {

        instapay = new Client();
        while (true) {
            System.out.print("enter username : ");
            instapay.setUserName( input.nextLine());
            instapay.setPassword("");
            if (!instapayData.checkcorrect(instapay)){
                System.out.println();
                System.out.print("please enter complex password : ");
                instapay.setPassword(input.nextLine());
                System.out.println();
                instapay.setNumber(number);
                instapay.setType(user.getType());
                instapayData.instapaylist.add(instapay);
                System.out.println();
                System.out.println("no login please :)");
                Login login = new Login();
                login.login(user,instapayData.instapaylist , instapayData, files , files2);
                break;
            }
            else {
                System.out.println("this username has been taken ");
            }
        }
    }
}

