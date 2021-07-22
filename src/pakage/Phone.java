package pakage;

public class Phone {
    private String number;
    private boolean registration;
    private Network network;

    public Phone(String number) {
        this.number = number;
    }

    public Phone(String number, boolean registration, Network network) {
        this.number = number;
        this.registration = registration;
        this.network = network;
    }

    public Phone() {
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public boolean isRegistration() {
        return registration;
    }

    public void setRegistration(boolean registration) {
        this.registration = registration;
    }

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    public void toValidateNetwork(Network network) {
        registration = network.phoneRegistartion(this);
        this.network = network;
    }

    public void callProceeding(String phoneNumber) {
        if (!registration) {
            System.out.println("The number " + this.getNumber() + " you are calling from is nit validated");
        } else if (!network.toValidatePhoneNumber(phoneNumber)) {
            System.out.println("The number " + phoneNumber + " you are calling to is not validated");
        } else {
            network.call(this, phoneNumber);
        }
    }

    public void incomingCall(String number) {
        System.out.println("Proceeding incoming call from " + number + " to " + this.getNumber());
    }

    public void outcomingCall(String number) {
        System.out.println("Proceeding outcoming call from " + this.getNumber() + " to " + number);
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", registration=" + registration +
                ", network=" + network +
                '}';
    }
}