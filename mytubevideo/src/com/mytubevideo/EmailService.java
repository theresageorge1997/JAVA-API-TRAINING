package com.mytubevideo;

public class EmailService implements NotificationService {
    public void sendEmail(User user){
        System.out.println("Notifying " + user.getEmail() + "...");
        System.out.println("Done...!");
    }
}
