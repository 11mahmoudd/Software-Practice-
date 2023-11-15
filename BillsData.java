import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BillsData {
    public Map<String , List<Bills>> billslist ;
    public List<Bills> List;
    private Bills bills;
    BillsData(){
        billslist = new HashMap<>();
        List = new ArrayList<>();
        PayBills water = new Water();
        PayBills Gas = new Gas();
        PayBills electric = new electric();
        bills = new Bills();
        bills.setBillAmount(100);
        bills.setPayBills(water);
        List.add(bills);
        bills = new Bills();
        bills.setPayBills(Gas);
        bills.setBillAmount(50);
        List.add(bills);
        bills = new Bills();
        bills.setPayBills(electric);
        bills.setBillAmount(150);
        List.add(bills);
        billslist.put("01113279959", List);
        List = new ArrayList<>();
        bills = new Bills();
        bills.setBillAmount(200);
        bills.setPayBills(water);
        List.add(bills);
        bills = new Bills();
        bills.setPayBills(Gas);
        bills.setBillAmount(250);
        List.add(bills);
        bills = new Bills();
        bills.setPayBills(electric);
        bills.setBillAmount(350);
        List.add(bills);
        billslist.put("01155594934",List);
        List = new ArrayList<>();
        bills = new Bills();
        bills.setBillAmount(50);
        bills.setPayBills(water);
        List.add(bills);
        bills = new Bills();
        bills.setPayBills(Gas);
        bills.setBillAmount(20);
        List.add(bills);
        bills = new Bills();
        bills.setPayBills(electric);
        bills.setBillAmount(30);
        List.add(bills);
        billslist.put("01148645479",List);
        List = new ArrayList<>();
        bills = new Bills();
        bills.setBillAmount(400);
        bills.setPayBills(water);
        List.add(bills);
        bills = new Bills();
        bills.setPayBills(Gas);
        bills.setBillAmount(250);
        List.add(bills);
        bills = new Bills();
        bills.setPayBills(electric);
        bills.setBillAmount(75);
        List.add(bills);
        billslist.put("01116451566",List);
    }
     void print(String number){
        if (this.billslist.get(number) == null){
            System.out.println("you dont have bills yet ");
        }
        else {
            for (Bills bills1 : this.billslist.get(number)){
                System.out.println("you have " + bills1.getBillAmount() + " for " + bills1.payBills.type());
            }
        }

    }
    double get (String number , PayBills payBills2){
        for (Bills bills1 : this.billslist.get(number)){
            if (bills1.payBills.type().equals(payBills2.type())){
                return bills1.getBillAmount();
            }
        }
        return 0.0;
    }
    void update(String number , PayBills payBills2){
        for (Bills bills1 : this.billslist.get(number)){
            if (bills1.payBills.type().equals(payBills2.type())){
                System.out.println("Receipt : You have payed " + bills1.getBillAmount() + " for " + bills1.payBills.type() +" bill");
                bills1.setBillAmount(0);
            }
        }
    }
}
