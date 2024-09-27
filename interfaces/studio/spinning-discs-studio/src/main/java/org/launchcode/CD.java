package org.launchcode;

public class CD extends BaseDisc implements Rewrittable{
    // TODO: Implement your custom interface.
    @Override
    public void spinDisc() {
        System.out.println("The " + getName() + " is spinning");
    }

    @Override
    public void writeData() {
        System.out.println("Writing data to " + getName());
    }

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

    public CD(String name, int capacity, String discType, String contents) {
        super(name, capacity, discType, contents);
    }
}
