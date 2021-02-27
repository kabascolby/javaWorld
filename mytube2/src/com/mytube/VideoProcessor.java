package com.mytube;

public class VideoProcessor {
    private VideoEncode encoder;
    private Database database;
    private Notifications notifications;
    
    public VideoProcessor(XVideoEncoder encoder, Database database, Notifications notifications) {
        this.encoder = encoder;
        this.database = database;
        this.notifications = notifications;
    }
    public void process(Video video) {
                
        encoder.encode(video);
        database.store(video);
        notifications.sendEmail(video.getUser());
    }

}

