package com.youtube.playlist;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlaylistRemote extends JpaRepository<Playlist,Integer> {

}
