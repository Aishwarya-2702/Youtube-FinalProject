package com.youtube.video;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VideoRemote extends JpaRepository<Video,Integer> {
    List<Video> findAllByPlaylistId(int playlistId);
}
