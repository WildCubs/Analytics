package com.company;

import java.util.Random;

public class Concern {
    Random izer = new Random();
    private String description;
    private int instanceFactor = 1 + izer.nextInt(4);
    private int consequence = 1 + izer.nextInt(4);
    private int severity;
    String sevLevel;

    public void setDescription(String description) { this.description = description; }

    public Concern(){}
    public Concern(String description) {
        this.description = description;
    }
}
