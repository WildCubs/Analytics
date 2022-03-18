package com.company;

import java.util.Random;

public class Concern {
    Random izer = new Random();
    private String description;
    private int instanceFactor = 1 + izer.nextInt(4);
    private int consequence = 1 + izer.nextInt(4);
    private int severity;
    String sevLevel;

    public String getDescription() { return description; }
    public int getInstanceFactor() { return instanceFactor; }
    public int getConsequence() { return consequence; }

    public void setDescription(String description) { this.description = description; }
    public void setInstanceFactor(int instanceFactor) {this.instanceFactor = instanceFactor; }
    public void setConsequence(int consequence) { this.consequence = consequence; }


    public Concern(){ this.description = description; }
    public Concern(String description) {
        this.description = description;
    }
}
