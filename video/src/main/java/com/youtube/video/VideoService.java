package com.youtube.video;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoService {
    @Autowired
    VideoRemote remote;

    public List<Video> implementFindPly(int playlistId){
        return remote.findAllByPlaylistId(playlistId);
    }

    public Video implementFindById(int videoId){
        return remote.findById(videoId).orElse(new Video());
    }

    public void implementDelete(int id){
        remote.deleteById(id);
    }

    public List<Video> implementFindAll(){
        return remote.findAll();
    }

    public Video implementSave(Video video){
        return remote.save(video);
    }
}
