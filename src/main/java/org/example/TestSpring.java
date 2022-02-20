package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );




        MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
        musicPlayer.getList();
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());


        ClassicalMusic classicalMusic = context.getBean("classicalMusic",ClassicalMusic.class);
        ClassicalMusic classicalMusic1 = context.getBean("classicalMusic",ClassicalMusic.class);
        classicalMusic.doMyInit();
        System.out.println(classicalMusic1 == classicalMusic);
        classicalMusic.doMyDestroy();

        context.close();

    }
}

