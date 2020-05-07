package com.mytube;

public class EmailService implements Notification {
    @Override
    public void sendNotification(User user) {
        System.out.println("Notifying " + user.getEmail() + "...");
        System.out.println("Done!\n");
    }
}
