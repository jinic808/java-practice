package com.jinic.java.practice.part2.mytube.moshApproach;

public class EmailService implements NotificationService {
    @Override
    public void notify(User user) {
        System.out.println("Notifying " + user.getEmail() + "...");
        System.out.println("Done!\n");
    }
}
