package com.javakaian.webtoon.repository;

import com.javakaian.webtoon.models.Genre;
import com.javakaian.webtoon.models.NewEpisodeDay;
import com.javakaian.webtoon.models.Webtoon;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class WebtoonRepo {

    private List<Webtoon> webtoons;

    public WebtoonRepo(){

        this.webtoons = new ArrayList<>();

        Webtoon wt = new Webtoon();
        wt.setId(1);
        wt.setName("Tower of God");
        wt.setAuthorName("SIU");
        wt.setDescription("A very high quality webtoon");
        wt.setGenre(Genre.FANTASY);
        wt.setNewEpisodeDay(NewEpisodeDay.MONDAY);
        wt.setRate(9.5f);
        wt.setFollowerNumber(111);
        wt.setViewNumber(2222);
        wt.setTumbnailURL("tubnail.com");
        wt.setBackgroudImageURL("background.com");


    }

    public Webtoon getWebtoon(long id){
        Optional<Webtoon> owt = this.getWebtoons().stream().filter(wt -> wt.getId()==id).findFirst();
        return owt.get();
    }

    public List<Webtoon> getWebtoons() {
        return webtoons;
    }

    public void addWebtoon(Webtoon webtoon){
        this.webtoons.add(webtoon);
    }
}
