public class Display {
void display(User user) {
    user.type();
    option();
}
void option(){
    System.out.println("1- Transfer to wallet using the mobile number ");
    System.out.println("2- Transfer to Another instapay account ");
    System.out.println("3- Inquire about his balance ");
    System.out.println("4- Pay bills ");
}
}
