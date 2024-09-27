package org.launchcode;

public abstract class BaseDisc {
    private String name;
    private int capacity;
    private String discType;
    private String contents;

    public BaseDisc(String name, int capacity, String discType, String contents) {
        this.name = name;
        this.capacity = capacity;
        this.discType = discType;
        this.contents = contents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public void discDescription() {
        System.out.println("This " + discType + " is named " + name + ", has a capacity of " + capacity + ", and " +
                        "contains " + contents);
    }

    // TODO: Implement your custom interface.
    public abstract void spinDisc();

    public abstract void writeData();
}
