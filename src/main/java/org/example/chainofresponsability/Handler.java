package org.example.chainofresponsability;

public interface Handler {


    public void setNext (Handler handler);

    public void handle(Object request);
}
