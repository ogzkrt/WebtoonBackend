package com.javakaian.webtoon.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Episode {

    private long id;
    private int number;
    private String name;


    private String releaseDate;
    private int numberOfLikes;

    private String thumbnailURL;
    private List<String> imageUrls;
}
