package com.company;

import java.util.Scanner;

public class UI {
    Scanner keybdINput = new Scanner(System.in);

    public void intro() {
        Intel situation = new Intel();
        System.out.println("Situation analysed... Risk Analysis ready!");
        System.out.println("Print? (Y/N)");
        String userInput = keybdINput.next();
        if (userInput.equalsIgnoreCase("y")) {
            printRiskAnalysis(situation.getSitReport());
        }
    }

    private void colorSevLevel(String sevLevel) {
        switch (sevLevel) {
            case "VERY_LOW" :
            case "LOW" :
                System.out.printf("\u001B[32m %9s \u001B[0m", sevLevel);
                break;
            case "MEDIUM" :
                System.out.printf("\u001B[33m %9s \u001B[0m", sevLevel);
                break;
            case "HIGH" :
            case "VERY_HIGH" :
                System.out.printf("\u001B[31m %9s \u001b[0m", sevLevel);
                break;
        }
    }

    private String setSevLevel(int severity) {
        String literal = "";

        switch (severity) {
            case 1 :
            case 2 :
            case 3 :
            case 4 :
            case 5 :
                literal = "VERY_LOW";
                break;
            case 6 :
            case 8 :
                literal = "LOW";
                break;
            case 9 :
            case 10 :
                literal = "MEDIUM";
                break;
            case 12 :
            case 16 :
                literal = "HIGH";
                break;
            case 20 :
            case 25 :
                literal = "VERY_HIGH";
                break;
        }
        return literal;
    }

    private Concern[] sitReport;
    private Concern concern;
    private int riskRecord = 1;
    private int instanceFactor;
    private int consequence;
    private int severity;
    private String sevLevel;

    public void printRiskAnalysis(Concern[] sitReport) {
        for (int i = 0; i < sitReport.length; i++) {
            if (i >= 21 && i < 23) {
                System.out.println("       Cancer");
            } else if (i == 23) {
                System.out.println("       CANCER!");
            }
            String riskDescription = sitReport[i].getDescription();
            instanceFactor = sitReport[i].getInstanceFactor();
            consequence = sitReport[i].getConsequence();
            severity = sitReport[i].getInstanceFactor() * sitReport[i].getConsequence();
            sevLevel = setSevLevel(severity);
            System.out.printf("# %3d %-38s \t\t %2d \t %2d \t %2d   ", riskRecord, riskDescription, instanceFactor, consequence, severity);
            colorSevLevel(sevLevel);
            System.out.println();
            riskRecord++;
        }
    }
}
