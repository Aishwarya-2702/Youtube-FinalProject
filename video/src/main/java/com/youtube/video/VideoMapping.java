package com.youtube.video;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/video")
public class VideoMapping {
    @Autowired
    VideoService service;

    @GetMapping("/byPlaylist/{playlistId}")
    public List<Video> callByPly(@PathVariable("playlistId") int playlistId){
        return service.implementFindPly(playlistId);
    }

    @GetMapping("/{playlistId}")
    public Video fetchOne(@PathVariable("playlistId") int playlistId){
        return service.implementFindById(playlistId);
    }

    @PutMapping("/")
    public Video play(@RequestBody Video video){
        return service.implementSave(video);
    }

    @DeleteMapping("/{id}")
    public String removes(@PathVariable("id") int id){
        service.implementDelete(id);
        return id+" has removed";
    }

    @GetMapping("/")
    public List<Video> viewAll(){
        return service.implementFindAll();
    }

    @PostMapping("/")
    public Video ip(@RequestBody Video video){
        return service.implementSave(video);
    }
}
