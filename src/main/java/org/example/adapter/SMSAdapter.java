package org.example.adapter;

public class SMSAdapter implements SMSSender {
    private AnotherSMSSender smsSender;
    @Override
    public boolean sendSMS(SMS sms) {
        String dest = sms.getDestination();
        String origin = sms.getOrigin();
        String[] message = new String[]{sms.getMessage()};

        try {
            smsSender.sendSMS(dest, origin, message);
        } catch (SMSException e) {
            return false;
        }

        return true;
    }
}
