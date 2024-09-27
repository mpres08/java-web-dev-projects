package org.launchcode;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.
        CD cd1 = new CD("The Rise and Fall of the Midwest Princess", 65,"CD" ,"Chappell Roan");
        DVD dvd1 = new DVD("Ice Age", 150, "DVD", "movie");

        // TODO: Call each CD and DVD method to verify that they work as expected.
        cd1.discDescription();
        cd1.spinDisc();
        dvd1.writeData();
    }
}