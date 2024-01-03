package org.example.adapter;

public interface AnotherSMSSender {

    public void sendSMS(String destination, String origin, String[] message) throws SMSException;
}
