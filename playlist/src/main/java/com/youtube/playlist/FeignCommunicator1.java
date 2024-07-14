package com.youtube.playlist;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "video-service", url = "http://localhost:8083/video")
public interface FeignCommunicator1 {
    @GetMapping("/byPlaylist/{playlistId}")
    List<Video> getVideoByPlaylistId(@PathVariable("playlistId") int playlistId);
}
