package com.javakaian.webtoon.controllers;


import com.javakaian.webtoon.models.Webtoon;
import com.javakaian.webtoon.repository.WebtoonRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WebtoonController {

    public WebtoonRepo repo;

    public WebtoonController(WebtoonRepo repo){
        this.repo = repo;
    }

    @GetMapping("/all")
    public List<Webtoon> getAll(){
        return repo.getWebtoons();
    }

}
