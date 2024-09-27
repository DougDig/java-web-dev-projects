package org.launchcode;

public class LP extends BaseDisc{
    String alblum;

    public String getAlblum() {
        return alblum;
    }

    public void setAlblum(String alblum) {
        this.alblum = alblum;
    }

    public LP(String name, String type) {
        super(name, type);
    }

    @Override
    public String toString() {
        return "LP{" +
                "alblum='" + alblum + '\'' +
                '}';
    }
}
