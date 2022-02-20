package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;
    private List<Music> list;

    public void getList() {
        for(Music music : list){
            System.out.println(music.getSong());
        }
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }
    private Music music1;
    private Music music2;


    public MusicPlayer(@Qualifier("rockMusic") Music music1,
                       @Qualifier("classicalMusic") Music music2,
                       List<Music> list) {
        this.music1 = music1;
        this.music2 = music2;
        this.list = list;
    }

    public String playMusic() {
        return "Playing: " + music1.getSong() + ", " + music2.getSong();
    }
}