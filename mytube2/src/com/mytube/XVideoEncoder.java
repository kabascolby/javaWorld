package com.mytube;

public class XVideoEncoder implements VideoEncode {
    @Override
    public void encode(Video video) {
        System.out.println("Encoding video...");
        System.out.println("Done!\n");
    }
}
