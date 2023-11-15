import java.util.Random;
import java.util.Scanner;

public class OTP {
    private String otp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789" ;
    Scanner input = new Scanner(System.in);
    public boolean sendOtp() {
        int codeLength = 6;
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < codeLength; i++) {
            int index = random.nextInt(otp.length());
            char randomChar = otp.charAt(index);
            sb.append(randomChar);
        }
        String verificationCode = sb.toString();
        System.out.println("please verify this code : " + verificationCode);
        String str = input.nextLine();
        if (str.equals(verificationCode)){
            return true;
        }
        return false ;
    }
}
