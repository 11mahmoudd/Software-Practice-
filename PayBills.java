import java.io.File;

public interface PayBills {
    double bills(String num , BillsData billsData);
    void paybills(String num , BillsData billsData ,User user, Data Data1, Data Data2);
String type();
}
