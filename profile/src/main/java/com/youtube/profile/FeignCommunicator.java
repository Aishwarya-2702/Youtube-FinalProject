package com.youtube.profile;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "Feign-Interceptor",url = "http://localhost:8082/playlist")
public interface FeignCommunicator {
    @GetMapping("/byProfile/{profileId}")
    List<Playlist> callPlaylists(@PathVariable("profileId") int profileId);
}
