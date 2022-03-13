package Miscelanous;

public class MobilePhone implements Interface {
    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Mobile phone powered up!");
    }

    @Override
    public void dial(int phoneNumber) {
        if (isOn) {
            System.out.println("Now ringing" + phoneNumber + " om mobile phone");
        } else {
            System.out.println("Mobile phone is off");
        }
    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Answering to mobile phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (myNumber == phoneNumber && isOn) {
            isRinging = true;
            System.out.println("Melody play");
        } else {
            isRinging = false;
            System.out.println("Mobile phone not on or number different");
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return false;
    }
}