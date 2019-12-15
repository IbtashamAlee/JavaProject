package sample;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Std {
    SimpleStringProperty name;
    SimpleStringProperty C2;


    public Std(String name, String C2) {
        this.name = new SimpleStringProperty(name);
        this.C2 = new SimpleStringProperty(C2);
    }

    public String getName() {
        return name.get();
    }

    public String getC2() {
        return C2.get();
    }

    public StringProperty nameProperty() {
        return name;
    }

    public StringProperty C2Property() {
        return C2;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public SimpleStringProperty c2Property() {
        return C2;
    }

    public void setC2(String c2) {
        this.C2.set(c2);
    }
}
