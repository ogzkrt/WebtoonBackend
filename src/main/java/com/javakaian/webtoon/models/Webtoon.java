package com.javakaian.webtoon.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class Webtoon {

    private long id;
    private String name;
    private String authorName;
    private Genre genre;
    private String description;
    private int followerNumber;
    private int viewNumber;
    private float rate;
    private Days newEpisodeDay;

    private String tumbnailURL;
    private String backgroudImageURL;




}
