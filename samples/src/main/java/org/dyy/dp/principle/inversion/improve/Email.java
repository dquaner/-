package org.dyy.dp.principle.inversion.improve;

public class Email implements IReceiver {
    @Override
    public String getInfo() {
        return "E-mail Info: Hello world!";
    }
}
