package pakage;

public class Main {
    public static void main(String[] args) {
        Network network = new Network();
        Phone phone = new Phone("+38050225587");
        Phone phone1 = new Phone("+380506498218");

        phone.callProceeding(phone1.getNumber());
        phone1.callProceeding(phone.getNumber());

        phone.toValidateNetwork(network);
        phone.callProceeding(phone1.getNumber());

        phone1.toValidateNetwork(network);
        phone.callProceeding(phone1.getNumber());
    }
}