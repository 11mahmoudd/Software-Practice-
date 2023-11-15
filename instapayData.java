import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class instapayData{
    public List<Client> instapaylist ;
    instapayData(){
        instapaylist = new ArrayList<>();
        Client client = new Client() ;
        client.setUserName("abdo");
        client.setPassword("abdo123abdo");
        client.setNumber("01113279959");
        client.setType("BankAccount");
        instapaylist.add(client);
        client = new Client() ;
        client.setUserName("boda");
        client.setPassword("boda123boda");
        client.setNumber("01155594934");
        client.setType("E-Wallet");
        instapaylist.add(client);
    }
    boolean checkcorrect(Client user){
        for (Client client : this.instapaylist){
            if (client.getUserName().equals(user.getUserName())){
                if (client.getPassword().equals(user.getPassword())){
                    if (client.getType().equals(user.getType())){
                        return true;
                    }
                }
            }
        }
        return false;
    }
String getnumber(String username){
        for (Client i : instapaylist){
            if (i.getUserName().equals(username)){
                return i.getNumber();
            }
        }
        return null;
}

String getType(String username){
    for (Client i : instapaylist){
        if (i.getUserName().equals(username)){
            return i.getType();
        }
    }
    return null;
}



}