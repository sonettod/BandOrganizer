package com.example.bandorganizer.models;

import java.util.List;

public class Band {
    //Band Attribute
    private String bandname;
    private BandTyp bandtyp;

    private List<User> mitglieder;

    //Konstruktor
    public Band(String bandname, BandTyp bandtyp, List<User> mitglieder){

    }

    public Band(){

    }
    //Getter Methoden für Band-Attribute
    public String getBandname() {return bandname;}
    //public enum getBandtyp(){return bandtyp;}
    public List<User> getMitglieder(){return mitglieder;}

    //Setter Methoden für Band-Attribute
    public void setbandname(String bandname){this.bandname = bandname;}
    //public enum setBandtyp(){this.bandtyp = bandtyp;}
    public void setMitglieder(List<User> mitglieder){this.mitglieder = mitglieder;}


}
