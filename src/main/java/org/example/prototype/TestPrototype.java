package org.example.prototype;

public class TestPrototype {

    public static void main(String[] args) {
        ButtonRegistry registry = ButtonRegistry.getInstance();
        Button yellow = registry.getButton("YELLOW BUTTON");
    }
}
