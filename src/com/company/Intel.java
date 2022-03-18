package com.company;

public class Intel {
    int riskRecord = 1;


    public String getDescription(int riskRecord) {
        String riskDescript = "";

        switch(riskRecord) {
            case 1 :
                riskDescript = "Too many cooks in the kitchen";
                break;
            case 2 :
                riskDescript = "Meat stored beyond expiry date";
                break;
            case 3:
                riskDescript = "World War III";
                break;
            case 4 :
                riskDescript = "Nothing to snack";
                break;
            case 5 :
                riskDescript = "Bites worse thank barking";
                break;
            case 6 :
                riskDescript = "Tomorrow's tense suspension";
                break;
            case 7 :
                riskDescript = "a new moral panic";
                break;
            case 8 :
                riskDescript = "Can't get any parking";
                break;
            case 9 :
                riskDescript = "a Horror Clown invasion";
                break;
            case 10 :
                riskDescript = "Global pandemic";
                break;
            case 11 :
                riskDescript = "Unstable markets";
                break;
            case 12 :
                riskDescript = "Subway Electrocution";
                break;
            case 13 :
                riskDescript = "New York poodle, landing on your head";
                break;
            case 14 :
                riskDescript = "Cancer";
                break;
            case 15 :
                riskDescript = "AIDS";
                break;
            case 16 :
                riskDescript = "Death";
                break;
            case 17 :
                riskDescript = "Inflation";
                break;
            case 18 :
                riskDescript = "Taxes";
                break;
            case 19 :
                riskDescript = "George Bush";
                break;
            case 20 :
                riskDescript = "Hell";
                break;
            case 21 :
                riskDescript = "SATAN!";
                break;
            case 22 :
                riskDescript = "of the face,";
                break;
            case 23 :
                riskDescript = "of the colon,";
                break;
            case 24 :
                riskDescript = "of the wrist, yeah...";
                break;
            case 25 :
                riskDescript = "JOHN DENVER ON COMPACT DISC!!!";
                break;
        }
        return riskDescript;
    }

    public Concern[] getSitReport() {
        Concern[] sitReport = new Concern[25];                      //build array
        for (int i = 0; i < sitReport.length; i++) {                //iterate every element
            Concern concern = new Concern(getDescription(riskRecord));                        //build an element
            sitReport[i] = concern;                                 //amend element to array
            //String description = getDescription(riskRecord);        //extract description from list
            //sitReport[i] = concern.setDescription(description);     //amend description
            riskRecord++;
            }
    return sitReport;                                               //return finished array
    }

}