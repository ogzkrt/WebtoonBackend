package com.javakaian.webtoon.controllers;


import com.javakaian.webtoon.models.Webtoon;
import com.javakaian.webtoon.repository.WebtoonRepo;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/add")
    public void addWebtoon(@RequestBody Webtoon webtoon){
        repo.addWebtoon(webtoon);
    }

    @PutMapping("/update")
    public void updateWebtoon(Webtoon webtoon){

    }
}
