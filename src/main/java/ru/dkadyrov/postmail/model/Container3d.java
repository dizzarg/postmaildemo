package ru.dkadyrov.postmail.model;

import java.util.Arrays;

public class Container3d {

    private final int length;
    private final int height;
    private final int weight;

    protected Container3d(int length, int height, int weight) {
        this.length = length;
        this.height = height;
        this.weight = weight;
    }

    public Container3d normalize() {
        int[] sides = {getLength(), getHeight(), getWeight()};
        Arrays.sort(sides);
        return new Container3d(sides[0], sides[1], sides[2]);
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

}
