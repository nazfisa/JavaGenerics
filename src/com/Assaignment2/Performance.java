package com.Assaignment2;

import java.util.ArrayList;

public class Performance<T extends SingerType> {
    private ArrayList<T> performance = new ArrayList<>();

    public void add(T singerType) {
        if (performance.contains(singerType)) {
            System.out.println(singerType.getName() + " already exists.");
        } else {
            performance.add(singerType);
        }
    }

    public void showPerformance() {
        for (T brand : performance) {
            System.out.println(brand.getName() + " " + brand.getAmountOfSong());
        }
    }
}
