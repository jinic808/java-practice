package com.jinic.java.practice.part2.mytube;

public class VideoProcessor {
    private Encoder encoder;
    private Database database;
    private ContactService emailService;

    public void process(Video video) {
        encoder.encode(video);

        database.store(video);

        emailService.sendEmail(video.getUser());
    }
}
