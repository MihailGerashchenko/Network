package pakage;

import java.util.Arrays;

public class Network {

    private Phone[] registeredPhoneNumbers = new Phone[10];

    public Network() {
        this.registeredPhoneNumbers = registeredPhoneNumbers;
    }

    public Phone[] getRegisteredPhoneNumbers() {
        return registeredPhoneNumbers;
    }

    public void setRegisteredPhoneNumbers(Phone[] registeredPhoneNumbers) {
        this.registeredPhoneNumbers = registeredPhoneNumbers;
    }

    public boolean phoneRegistartion(Phone phone) {
        for (int i = 0; i < registeredPhoneNumbers.length; i++) {
            if (registeredPhoneNumbers[i] == null) {
                registeredPhoneNumbers[i] = phone;
                return true;
            }
        }
        return false;
    }

    public Phone getPhoneByNumber(String string) {
        for (int i = 0; i < registeredPhoneNumbers.length; i++) {
            if (registeredPhoneNumbers[i].getNumber().equals(string)) {
                return registeredPhoneNumbers[i];
            }
        }
        System.out.println("The nubmer " + string + " is not initialized");
        return null;
    }

    public boolean toValidatePhoneNumber(String string) {
        for (int i = 0; i < registeredPhoneNumbers.length; i++) {
            if (registeredPhoneNumbers[i] != null && registeredPhoneNumbers[i].getNumber().equals(string)) {
                return true;
            }
        }
        return false;
    }

    public void call(Phone outcomingPhone, String incomingPhone) {
        getPhoneByNumber(incomingPhone).incomingCall(outcomingPhone.getNumber());
    }

    @Override
    public String toString() {
        return "Network{" +
                "registeredPhoneNumbers=" + Arrays.toString(registeredPhoneNumbers) +
                '}';
    }
}


