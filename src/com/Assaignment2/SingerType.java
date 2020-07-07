package com.Assaignment2;

public class SingerType<T> extends Singer implements Comparable<SingerType<T>> {

    private int amountOfSong;

    SingerType(String name, int amountOfSong) {
        super(name);
        this.amountOfSong = amountOfSong;
    }

    public String getName() {
        return super.getName();
    }

    public int getAmountOfSong() {
        return amountOfSong;
    }

    @Override
    public int compareTo(SingerType<T> singerType) {
        if (this.amountOfSong > singerType.amountOfSong) {
            return -1;
        } else if (this.amountOfSong < singerType.amountOfSong)
            return 1;
        else
            return 0;
    }


}
