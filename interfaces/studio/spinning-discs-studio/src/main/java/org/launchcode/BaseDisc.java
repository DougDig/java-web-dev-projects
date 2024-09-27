package org.launchcode;

public abstract class BaseDisc {
    private  String name;
    private String type;

    @Override
    public String toString() {
        return "BaseDisc{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BaseDisc(String name, String type) {
        this.name = name;
        this.type = type;
    }
}
