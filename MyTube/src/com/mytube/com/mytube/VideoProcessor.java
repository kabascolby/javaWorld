package com.mytube;

public class VideoProcessor {
    private Encoder encoder;
    private VideoDatabase database;
    private Notification emailService;

    public VideoProcessor(Encoder encoder, VideoDatabase database, Notification emailService) {
        this.encoder = encoder;
        this.database = database;
        this.emailService = emailService;
    }
  
    public void process(Video video) {
        encoder.encode(video);

        database.store(video);

        emailService.sendNotification(video.getUser());
    }

}

