package com.jinic.java.practice.part2.mytube;

public class VideoEncoder implements Encoder {
    @Override
    public void encode(Video video) {
        System.out.println("Encoding video...");
        System.out.println("Done!\n");
    }
}
