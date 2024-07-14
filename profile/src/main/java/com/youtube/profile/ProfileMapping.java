package com.youtube.profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/profile")
public class ProfileMapping {
    @Autowired
    ProfileService service;

    @PostMapping("/")
    public Profile callSave(@RequestBody Profile profile){
        return service.implementSave(profile);
    }

    @GetMapping("/{playlistId}")
    public Profile callOne(@PathVariable("playlistId") int playlistId){
        return service.implementFindByID(playlistId);
    }

    @GetMapping("/")
    public List<Profile> callFetch(){
        return service.implementFindAll();
    }
}
