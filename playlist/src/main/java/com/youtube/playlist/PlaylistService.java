package com.youtube.playlist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaylistService {
    @Autowired
    PlaylistRemote remote;

    @Autowired
    FeignCommunicator1 communicator1;

    public Playlist implementFindByID(int id){
        Playlist obj = remote.findById(id).orElse(new Playlist());
        if (obj != null){
            obj.setMyVideos(communicator1.getVideoByPlaylistId(obj.getPlaylistId()));
        }
        return obj;
    }

    public Playlist implementFindById(int playlistID){
        return remote.findById(playlistID).orElse(new Playlist());
    }

    public void implementDelete(int id){
        remote.deleteById(id);
    }

    public List<Playlist> implementFindAll(){
        return remote.findAll();
    }

    public Playlist implementSave(Playlist playlist){
        return remote.save(playlist);
    }
}
