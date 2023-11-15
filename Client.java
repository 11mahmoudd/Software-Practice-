import java.io.File;

public class Client {
    private String number ;
    private String userName;
    private String Password;
    private String type ;

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    public void setPassword(String password) {
        Password = password;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getNumber() {
        return number;
    }
    public String getPassword() {
        return Password;
    }
    public String getUserName() {
        return userName;
    }

}
