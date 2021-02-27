package com.mytube;

public class Main {

    public static void main(String[] args) {
        var video = new Video("birthday.mp4", "Jennifer's birthday",new User("john@domain.com"));
        // video.setFileName("birthday.mp4");
        // video.setTitle("Jennifer's birthday");
        // video.setUser(new User("john@domain.com"));

        var processor = new VideoProcessor(new xVideoEncoder(),
                                            new VideoDatabase(),
                                            n ew EmailService()
                                        );
        processor.process(video);
    }
} 
