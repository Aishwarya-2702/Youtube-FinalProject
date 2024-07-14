package com.youtube.playlist;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Video {
    private int videoId;
    private String title;
    private String duration;
    private String uploadedBy;
    private String views;
    private String dateOfUpload;
    private int playlistId;
}
