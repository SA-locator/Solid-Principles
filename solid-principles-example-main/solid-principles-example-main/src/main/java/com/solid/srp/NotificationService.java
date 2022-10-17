package com.solid.srp;

// Notification Service related changes go into this class.

public class NotificationService {
    public void sendOTP(String medium) {
        if (medium.equals("email")) {
            //write email related logic
            //use JavaMailSenderAPI
        }
        if(medium.equals("mobile")){
            //write logic using twilio API
        }
        //More mediums can be added...
    }
}
