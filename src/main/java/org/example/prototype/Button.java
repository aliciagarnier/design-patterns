package org.example.prototype;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
final public class Button implements Cloneable { // take care with cloneable

    private String color;
    private double x;
    private double y;

    @Override
    public Button clone() {
        try {
           return (Button) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
