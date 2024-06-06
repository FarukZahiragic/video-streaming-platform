package com.springbootexample.ex1;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Video service class for retrieving Video record information
 *
 * @author Faruk Zahiragic
 */

@Service
public class VideoService {
    private List<Video> videos = List.of(
            new Video("Spring Boot tutorial"),
            new Video("Coding tutorial"),
            new Video("Web development course")
    );

    public List<Video> getVideos() {
        return videos;
    }

    public Video create(Video newVideo) {
        List<Video> extend = new ArrayList<Video>(videos);
        extend.add(newVideo);
        videos = List.copyOf(extend);
        return newVideo;
    }
}
