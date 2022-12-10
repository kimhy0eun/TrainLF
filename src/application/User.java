package application;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;

public class User {
    private StringProperty train;
    private IntegerProperty date;
    private StringProperty lost;
 
    public User(StringProperty train, IntegerProperty date, StringProperty lost) {
        this.train = train;
        this.date = date;
        this.lost = lost;
    }
 
    public StringProperty trainProperty() {
        return train;
    }
    public IntegerProperty dateProperty() {
        return date;
    }
    public StringProperty lostProperty() {
        return lost;
    }
    
}
