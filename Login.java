import java.util.List;
import java.util.Scanner;

public class Login {
    Client client ;
    Display display ;
    Scanner input = new Scanner(System.in);
    void login(User user, List<Client> list , instapayData instapaydata  , Data Data1 , Data Data2){
        User user1;
        display = new Display();
        client  = new Client();
        while(true){
            System.out.print("enter your instapay username :");
            client.setUserName(input.nextLine());
            System.out.println();
            System.out.print("enter your instapay password :");
            client.setPassword(input.nextLine());
            System.out.println();
            client.setType(user.getType());
            if (instapaydata.checkcorrect(client)) {
                String num = instapaydata .getnumber(client.getUserName());
                if (user.getType().equals("BankAccount")){
                    user1 = Data1.get(num);
                }

                else {
                    user1 = Data2.get(num);
                }
                display.display(user1 ,instapaydata , Data1 , Data2);
                break;
            }
            else {
                System.out.println("incorrect username or password");
            }
        }

    }

}
