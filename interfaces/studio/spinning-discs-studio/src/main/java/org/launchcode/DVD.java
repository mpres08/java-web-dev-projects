package org.launchcode;

public class DVD extends BaseDisc{
    // TODO: Implement your custom interface.
    @Override
    public void spinDisc() {
        System.out.println("Spinning " + getName());
    }

    @Override
    public void writeData() {
        System.out.println("Writing data to " + getName());
    }

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

    public DVD(String name, int capacity, String discType, String contents) {
        super(name, capacity, discType, contents);
    }
}
