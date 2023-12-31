package org.example.prototype;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ButtonRegistry {

    private static ButtonRegistry buttonRegistry;

    private static Map<String, Button> REGISTRY = new HashMap<>();

    static {
        Button yellow = new Button();
        yellow.setColor("Yellow");
        yellow.setX(45.5);
        yellow.setY(100);
        REGISTRY.put("YELLOW BUTTON", yellow);
    }
    public static ButtonRegistry getInstance() {
        if(Objects.isNull(buttonRegistry))
        {
           buttonRegistry = new ButtonRegistry();
           return buttonRegistry;
        }
        return buttonRegistry;
    }

    public Button getButton (String key) {
        return REGISTRY.get(key).clone();
    }

    public void addButton(String key, Button prototype) {
        REGISTRY.put(key, prototype);
    }



}
