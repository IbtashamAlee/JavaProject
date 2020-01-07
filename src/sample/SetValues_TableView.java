package sample;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class SetValues_TableView {
    SimpleStringProperty name;
    SimpleStringProperty C2;


    public SetValues_TableView(String name, String C2) {
        this.name = new SimpleStringProperty(name);
        this.C2 = new SimpleStringProperty(C2);
    }

    public String getName() {
        return name.get();
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public String getC2() {
        return C2.get();
    }

    public void setC2(String c2) {
        this.C2.set(c2);
    }

    public StringProperty nameProperty() {
        return name;
    }

    public StringProperty C2Property() {
        return C2;
    }

    public SimpleStringProperty c2Property() {
        return C2;
    }

    @Override
    public String toString() {
        return "SetValues_TableView{" +
                "name=" + name +
                ", C2=" + C2 +
                '}';
    }
}
