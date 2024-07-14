package com.youtube.playlist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/playlist")
public class PlaylistMapping {
    @Autowired
    PlaylistService service;

    @GetMapping("/{videoId}")
    public Playlist callOne(@PathVariable("videoId") int videoId){
        return service.implementFindByID(videoId);
    }

    @PutMapping("/")
    public Playlist songs(@RequestBody Playlist playlist){
        return service.implementSave(playlist);
    }

    @DeleteMapping("/{id}")
    public String remove(@PathVariable("id") int id){
        service.implementDelete(id);
        return id+" has Removed";
    }

    @GetMapping("/")
    public List<Playlist> viewAll(){
        return service.implementFindAll();
    }

    @PostMapping("/")
    public Playlist ip(@RequestBody Playlist playlist){
        return service.implementSave(playlist);
    }
}
