import java.util.Scanner;

public class instapayTransfer {

    Transfer transfer;
    Scanner input = new Scanner(System.in);

    public void transfer(User user , instapayData fileHandling , Data files , Data files2) {
        if (user.getType().equals("BankAccount")){
          System.out.print("please enter the username of the one that you want transfer to :");
          String username2 = input.nextLine();
          if (fileHandling.getType(username2).equals("BankAccount")){
              transfer = new BankTransfer();
              User user1 = files.get(fileHandling.getnumber(username2));
              transfer.transfer(user,user1,files , files2,true);
          }
          else if (fileHandling.getType(username2).equals("E-Wallet")){
              User user1 = files2.get(fileHandling.getnumber(username2));
              transfer = new walletTransfer();
              transfer.transfer(user,user1,files,files2,true);
          }
          }
         else if (user.getType().equals( "E-Wallet")){
             while (true){
                 System.out.print("please enter the username of the one that you want transfer to :");
                 String username2 = input.nextLine();
                 if (fileHandling.getType(username2).equals("BankAccount")){
                     System.out.println("you cannot transfer to bank account");
                 }
                 else {
                     User user1 = files2.get(fileHandling.getnumber(username2));
                    transfer = new walletTransfer();
                    transfer.transfer(user,user1,files,files2,true);
                     break;
                 }
             }
         }
    }
}

