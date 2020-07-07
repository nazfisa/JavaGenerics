package com.Assaignment2;

public class Main {
    public static void main(String[] args) {
        SingerType<Singer> islamicSinger = new SingerType<>("Iqbal",10);
        SingerType<Singer> classicSinger = new SingerType<>("Balam",11);
        SingerType<Singer> baulSinger = new SingerType<>("faul",12);
        Performance<SingerType> performance = new Performance<>();
        performance.add(islamicSinger);
        performance.add(classicSinger);
        performance.add(baulSinger);

        performance.showPerformance();

    }
}
