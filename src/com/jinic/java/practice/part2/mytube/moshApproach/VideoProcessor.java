package com.jinic.java.practice.part2.mytube.moshApproach;

public class VideoProcessor {
    public VideoProcessor(VideoEncoder encoder, VideoDatabase database, NotificationService emailService) {
        this.encoder = encoder;
        this.database = database;
        this.emailService = emailService;
    }

    private VideoEncoder encoder;

    private VideoDatabase database;

    private NotificationService emailService;
    public void process(Video video) {
        encoder.encode(video);
        database.store(video);
        emailService.notify(video.getUser());
    }
}

